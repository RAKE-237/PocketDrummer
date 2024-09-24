package com.example.pocketdrummer;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.List;

public class AdaptadorSecond extends BaseAdapter {
    private Context context;
    private List<Item> itemList;

    public AdaptadorSecond(Context context, List<Item> itemList) {
        this.context = context;
        this.itemList = itemList;
    }

    @Override
    public int getCount() {
        return itemList.size();
    }

    @Override
    public Object getItem(int position) {
        return itemList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            convertView = LayoutInflater.from(context).inflate(R.layout.list_item, parent, false);
        }

        Item currentItem = (Item) getItem(position);

        TextView itemName = convertView.findViewById(R.id.item_name);
        ImageView itemIcon = convertView.findViewById(R.id.item_icon);
        TextView itemDescription = convertView.findViewById(R.id.item_description);

        itemName.setText(currentItem.getName());
        itemIcon.setImageResource(currentItem.getIconResource());

        convertView.setOnClickListener(v -> {
            itemDescription.setText(currentItem.getDescription());
            itemDescription.setVisibility(itemDescription.getVisibility() == View.VISIBLE ? View.GONE : View.VISIBLE);
        });

        return convertView;
    }

}