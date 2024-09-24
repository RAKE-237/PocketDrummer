package com.example.pocketdrummer;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.GridView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import java.util.ArrayList;
import java.util.List;

public class ThirdFragment extends Fragment {

    private List<Item> itemList;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_third, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        GridView gridView = view.findViewById(R.id.gridView);

        itemList = new ArrayList<>();
        itemList.add(new Item("Chimbal", R.drawable.chimbal, R.raw.chimbal));
        itemList.add(new Item("Prato de Ataque", R.drawable.pratoataque, R.raw.pratoataque));
        itemList.add(new Item("Prato de Condução", R.drawable.pratoconducao, R.raw.pratoconducao));
        itemList.add(new Item("Caixa", R.drawable.caixa, R.raw.caixa));
        itemList.add(new Item("Bumbo", R.drawable.bumbo, R.raw.bumbo));
        itemList.add(new Item("Tom 1", R.drawable.tom1e2, R.raw.tom1));
        itemList.add(new Item("Tom 2", R.drawable.tom1e2, R.raw.tom2));
        itemList.add(new Item("Surdo", R.drawable.surdo, R.raw.surdo));

        AdaptadorThird adapter = new AdaptadorThird(requireContext(), itemList);
        gridView.setAdapter(adapter);

        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                MediaPlayer mediaPlayer = MediaPlayer.create(requireContext(), itemList.get(position).getSoundResource());
                mediaPlayer.start();
                mediaPlayer.setOnCompletionListener(mp -> mp.release());
            }
        });
    }
}
