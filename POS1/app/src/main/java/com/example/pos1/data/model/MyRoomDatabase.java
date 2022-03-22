package com.example.pos1.data.model;

import android.content.Context;

import androidx.annotation.NonNull;
import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;
import androidx.sqlite.db.SupportSQLiteDatabase;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

@Database(entities = {ItemRow.class}, version = 1, exportSchema = false)
public abstract class MyRoomDatabase extends RoomDatabase {

    public abstract ItemTableDAO itemTableDao();

    private static volatile MyRoomDatabase INSTANCE;
    private static final int NUMBER_OF_THREADS = 4;
    static final ExecutorService databaseWriteExecutor =
            Executors.newFixedThreadPool(NUMBER_OF_THREADS);

    private static RoomDatabase.Callback sRoomDatabaseCallback = new RoomDatabase.Callback() {
        @Override
        public void onCreate(@NonNull SupportSQLiteDatabase db) {
            super.onCreate(db);

            // If you want to keep data through app restarts,
            // comment out the following block
            databaseWriteExecutor.execute(() -> {
                // Populate the database in the background.
                // If you want to start with more words, just add them.
                ItemTableDAO dao = INSTANCE.itemTableDao();
                //dao.deleteAll();

                ItemRow item1 = new ItemRow("1","AAAAA","tank top");
                dao.insert(item1);
                ItemRow item2 = new ItemRow("2","BBBBB","tank top");
                dao.insert(item2);
            });
        }
    };

    public static MyRoomDatabase  getDatabase(final Context context) {
        if (INSTANCE == null) {
            synchronized (MyRoomDatabase.class) {
                if (INSTANCE == null) {
                    INSTANCE = Room.databaseBuilder(context.getApplicationContext(),
                            MyRoomDatabase.class, "word_database").addCallback(sRoomDatabaseCallback)
                            .build();
                }
            }
        }
        return INSTANCE;
    }
}
