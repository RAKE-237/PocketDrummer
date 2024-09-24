package com.example.pocketdrummer;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import java.util.ArrayList;
import java.util.List;

public class SecondFragment extends Fragment {

    private List<Item> itemList;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_second, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        ListView listView = view.findViewById(R.id.listView);

        itemList = new ArrayList<>();
        itemList.add(new Item(getString(R.string.item1), R.drawable.chimbal, getString(R.string.description1)));
        itemList.add(new Item(getString(R.string.item2), R.drawable.pratoataque, getString(R.string.description2)));
        itemList.add(new Item(getString(R.string.item3), R.drawable.pratoconducao, getString(R.string.description3)));
        itemList.add(new Item(getString(R.string.item4), R.drawable.caixa, getString(R.string.description4)));
        itemList.add(new Item(getString(R.string.item5), R.drawable.bumbo, getString(R.string.description5)));
        itemList.add(new Item(getString(R.string.item6), R.drawable.tom1e2, getString(R.string.description6)));
        itemList.add(new Item(getString(R.string.item7), R.drawable.tom1e2, getString(R.string.description7)));
        itemList.add(new Item(getString(R.string.item8), R.drawable.surdo, getString(R.string.description8)));

        Adaptador adapter = new Adaptador(requireContext(), itemList);
        listView.setAdapter(adapter);
    }
}
