package com.example.pocketdrummer;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class Adaptador extends ArrayAdapter<Item> {

    public Adaptador(Context context, List<Item> items) {
        super(context, 0, items);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        Item item = getItem(position);

        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }

        ImageView icon = convertView.findViewById(R.id.icon);
        TextView itemName = convertView.findViewById(R.id.item_name);
        TextView itemDescription = convertView.findViewById(R.id.item_description);

        icon.setImageResource(item.getIconResource());
        itemName.setText(item.getName());
        itemDescription.setText(item.getDescription());

        convertView.setOnClickListener(v -> {
            if (itemDescription.getVisibility() == View.GONE) {
                itemDescription.setVisibility(View.VISIBLE);
            } else {
                itemDescription.setVisibility(View.GONE);
            }
        });

        return convertView;
    }
}
