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
public class PraiasFragment  extends android.support.v4.app.Fragment {


    public PraiasFragment() {
        // Required empty public constructor
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
        locais.add(new Locais(R.string.item_praias1, R.string.item_praias2,
                R.drawable.pra_arraial_praia));
        locais.add(new Locais(R.string.item_praias3, R.string.item_praias4,
                R.drawable.pra_praia_reserva));
        locais.add(new Locais(R.string.item_praias5, R.string.item_praias6,
                R.drawable.pra_praia_vermelha));
        locais.add(new Locais(R.string.item_praias7, R.string.item_praias8,
                R.drawable.pra_praia_sono));
        locais.add(new Locais(R.string.item_praias9, R.string.item_praias10,
                R.drawable.pra_praia_leblon));
        locais.add(new Locais(R.string.item_praias11, R.string.item_praias12,
                R.drawable.pra_praia_forno));
        locais.add(new Locais(R.string.item_praias13, R.string.item_praias14,
                R.drawable.pra_praia_forte));

        LocaisAdapter adapter = new LocaisAdapter(getActivity(), locais, R.color.category_praias);

        ListView listView =  rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);

        return rootView;
    }

}