package com.example.pos1.data.model;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;

import java.util.List;

@Dao
public interface ItemTableDAO {
    // allowing the insert of the same word multiple times by passing a
    // conflict resolution strategy
    @Insert(onConflict = OnConflictStrategy.IGNORE)
    void insert(ItemRow item);

    @Query("DELETE FROM Item_Table")
    void deleteAll();

    @Query("SELECT * FROM Item_Table")
    List<ItemRow> getItems();

    @Query("SELECT * FROM Item_Table WHERE catogary =:cat")
    List<ItemRow> getItemsByCategory(String cat);

}
