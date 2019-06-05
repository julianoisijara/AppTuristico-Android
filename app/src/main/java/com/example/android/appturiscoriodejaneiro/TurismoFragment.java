package com.example.android.appturiscoriodejaneiro;


import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class TurismoFragment extends android.support.v4.app.Fragment {


    public TurismoFragment() {

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
        locais.add(new Locais(R.string.item_turismo1, R.string.item_turismo2,
                R.drawable.tur_paodeacucar));
        locais.add(new Locais(R.string.item_turismo3, R.string.item_turismo4,
                R.drawable.tur_sambodromo));
        locais.add(new Locais(R.string.item_turismo5, R.string.item_turismo6,
                R.drawable.tur_pedra_bonita));
        locais.add(new Locais(R.string.item_turismo7, R.string.item_turismo8,
                R.drawable.tur_museu_amanha));
        locais.add(new Locais(R.string.item_turismo9, R.string.item_turismo10,
                R.drawable.tur_arcos_lapa));
        locais.add(new Locais(R.string.item_turismo11, R.string.item_turismo12,
                R.drawable.tur_cristoredentor));
        locais.add(new Locais(R.string.item_turismo13, R.string.item_turismo14,
                R.drawable.tur_lagoa_rodrigo));

        LocaisAdapter adapter = new LocaisAdapter(getActivity(), locais, R.color.category_turismo);

        ListView listView =  rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);

        return rootView;
    }

}



