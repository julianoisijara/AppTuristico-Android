package com.example.android.appturiscoriodejaneiro;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;


public class EsportesFragment extends Fragment {


    public EsportesFragment() {

    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.locais_list, container, false);

        final ArrayList<Locais> locais = new ArrayList<Locais>();
        locais.add(new Locais(R.string.item_esportes1, R.string.item_esportes2,
                R.drawable.esp_maracana));
        locais.add(new Locais(R.string.item_esportes3, R.string.item_esportes4,
                R.drawable.esp_estadio_limpico_jh));
        locais.add(new Locais(R.string.item_esportes5, R.string.item_esportes6,
                R.drawable.esp_aterro_do_flamengo));
        locais.add(new Locais(R.string.item_esportes7, R.string.item_esportes8,
                R.drawable.esp_maracananzinho));
        locais.add(new Locais(R.string.item_esportes9, R.string.item_esportes10,
                R.drawable.esp_trilha_dois_irmaos));
        locais.add(new Locais(R.string.item_esportes11, R.string.item_esportes12,
                R.drawable.esp_stand_up));
        locais.add(new Locais(R.string.item_esportes13, R.string.item_esportes14,
                R.drawable.esp_futvolei));

        LocaisAdapter adapter = new LocaisAdapter(getActivity(), locais, R.color.category_esportes);

        ListView listView =  rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);

        return rootView;
    }

}
