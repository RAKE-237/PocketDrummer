package com.example.pocketdrummer;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

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
        itemList.add(new Item(getString(R.string.chimbal), R.drawable.chimbal, getString(R.string.descriptionchimbal)));
        itemList.add(new Item(getString(R.string.pratoataque), R.drawable.pratoataque, getString(R.string.descriptionpratoataque)));
        itemList.add(new Item(getString(R.string.pratoconducao), R.drawable.pratoconducao, getString(R.string.descriptionpratoconducao)));
        itemList.add(new Item(getString(R.string.caixa), R.drawable.caixa, getString(R.string.descriptioncaixa)));
        itemList.add(new Item(getString(R.string.bumbo), R.drawable.bumbo, getString(R.string.descriptionbumbo)));
        itemList.add(new Item(getString(R.string.tom1), R.drawable.tom1e2, getString(R.string.descriptiontom1)));
        itemList.add(new Item(getString(R.string.tom2), R.drawable.tom1e2, getString(R.string.descriptiontom2)));
        itemList.add(new Item(getString(R.string.surdo), R.drawable.surdo, getString(R.string.descriptionsurdo)));

        AdaptadorSecond adapter = new AdaptadorSecond(requireContext(), itemList);
        listView.setAdapter(adapter);
    }
}
