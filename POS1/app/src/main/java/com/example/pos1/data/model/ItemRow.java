package com.example.pos1.data.model;

import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "Item_Table")

public class ItemRow {
    @PrimaryKey
    @NonNull
    @ColumnInfo(name = "id")
    private String id;
    @NonNull
    @ColumnInfo(name = "itemName")
    private String itemName;
    @NonNull
    @ColumnInfo(name = "catogary")
    private  String catogary;


    public ItemRow(@NonNull String id, @NonNull String itemName, @NonNull String catogary)
    {
        this.id = id;
        this.itemName = itemName;
        this.catogary = catogary;
    }

    public String getId(){return this.id;}
    public String getItemName(){return this.itemName;}
    public String getCatogary(){return this.catogary;}


    public String getItem()
    {
        return this.itemName;
    }
}
