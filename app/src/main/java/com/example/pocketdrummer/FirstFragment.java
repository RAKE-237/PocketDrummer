package com.example.pocketdrummer;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

public class FirstFragment extends Fragment {

    private int selectedPosition = -1; // Para armazenar a posição selecionada

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_first, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        Spinner selecao = view.findViewById(R.id.selecao);
        Button navigateButton = view.findViewById(R.id.navigate_button); // Referência ao botão

        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(requireContext(),
                R.array.spinner_options, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        selecao.setAdapter(adapter);

        selecao.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                selectedPosition = position; // Armazena a posição selecionada
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                selectedPosition = -1; // Reseta a posição se nada for selecionado
            }
        });

        navigateButton.setOnClickListener(v -> {
            if (selectedPosition != -1) {
                switch (selectedPosition) {
                    case 0:
                        Navigation.findNavController(view).navigate(R.id.action_FirstFragment_to_SecondFragment);
                        break;
                    case 1:
                        Navigation.findNavController(view).navigate(R.id.action_FirstFragment_to_thirdFragment);
                        break;
                }
            }
        });
    }
}