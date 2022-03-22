package com.example.pos1;

import android.content.ClipData;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.example.pos1.data.model.ItemRow;

import java.util.List;

public class RecyclerAdaptor  extends RecyclerView.Adapter<RecyclerAdaptor.ItemViewHolder>{
    private List<ItemRow> listdata;

    // RecyclerView recyclerView;
    public RecyclerAdaptor(List<ItemRow>  listdata) {
        this.listdata = listdata;
    }
    public void  addData(List<ItemRow>  listdata)
    {
        this.listdata = listdata;
    }
    @Override
    public ItemViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View listItem= layoutInflater.inflate(R.layout.recycler_view_item, parent, false);
        ItemViewHolder viewHolder = new ItemViewHolder(listItem);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ItemViewHolder holder, int position) {
        final ItemRow myListData = listdata.get(position);
        holder.itemName.setText(myListData.getItemName());

    }


    @Override
    public int getItemCount() {
        return listdata.size();
    }
    static class ItemViewHolder extends RecyclerView.ViewHolder {
        private final TextView itemName;

        private ItemViewHolder(View itemView) {
            super(itemView);
            itemName = itemView.findViewById(R.id.item_name);
        }

        public void bind(String text) {
            itemName.setText(text);
        }

        static ItemViewHolder create(ViewGroup parent) {
            View view = LayoutInflater.from(parent.getContext())
                    .inflate(R.layout.recycler_view_item, parent, false);
            return new ItemViewHolder(view);
        }
    }
}
