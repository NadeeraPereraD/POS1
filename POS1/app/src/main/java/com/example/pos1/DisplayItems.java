package com.example.pos1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.widget.TextView;

import com.example.pos1.data.model.ItemRow;
import com.example.pos1.data.model.ItemTableDAO;
import com.example.pos1.data.model.MyRoomDatabase;

import java.util.ArrayList;
import java.util.List;

public class DisplayItems extends AppCompatActivity {

    public TextView title = null;
    ItemTableDAO dbDAO=null;
    List<ItemRow> list =new ArrayList<ItemRow>();
    RecyclerAdaptor adapter = null;

    private Handler updateUIHandler =  new Handler()
    {
        @Override
        public void handleMessage(Message msg) {
            // Means the message is sent from child thread.
            if(msg.what == 1)
            {
                // Update ui in main thread.
                loadItems();
            }
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_items);

        title = (TextView)findViewById(R.id.title_display);

        String titlename = getIntent().getStringExtra("title");

        CharSequence cs = titlename;
        title.setText(cs);
        dbDAO =MyRoomDatabase.getDatabase(getApplicationContext()).itemTableDao();

        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        adapter = new RecyclerAdaptor(list);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(adapter);

        new Thread(() -> {
            ItemRow item1 = new ItemRow("1","AAAAA","tank top");
            dbDAO.insert(item1);
            ItemRow item2 = new ItemRow("2","BBBBB","tank top");
            dbDAO.insert(item2);
            ItemRow item3 = new ItemRow("3","AAAAA","tank top");
            dbDAO.insert(item3);
            ItemRow item4 = new ItemRow("4","BBBBB","tank top");
            dbDAO.insert(item4);
            ItemRow item5 = new ItemRow("5","AAAAA","tank top");
            dbDAO.insert(item5);
            ItemRow item6 = new ItemRow("6","BBBBB","tank top");
            dbDAO.insert(item6);
            ItemRow item7 = new ItemRow("7","BBBBB","tank top");
            dbDAO.insert(item7);
            list = dbDAO.getItemsByCategory(titlename);
            Message message = new Message();
            message.what = 1;
            // Send message to main thread Handler.
            updateUIHandler.sendMessage(message);
        }).start();

        //loadItems();
    }
    void loadItems()
    {
        adapter.addData(list);
        adapter.notifyDataSetChanged();
    }
}