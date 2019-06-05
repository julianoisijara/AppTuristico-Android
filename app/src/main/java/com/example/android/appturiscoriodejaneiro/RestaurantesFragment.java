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
public class RestaurantesFragment extends android.support.v4.app.Fragment {


    public RestaurantesFragment() {
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
        locais.add(new Locais(R.string.item_restaurantes1, R.string.item_restaurantes2,
                R.drawable.res_giuseppe_restaurante));
        locais.add(new Locais(R.string.item_restaurantes3, R.string.item_restaurantes4,
                R.drawable.res_armazem));
        locais.add(new Locais(R.string.item_restaurantes5, R.string.item_restaurantes6,
                R.drawable.res_org));
        locais.add(new Locais(R.string.item_restaurantes7, R.string.item_restaurantes8,
                R.drawable.res_emile));
        locais.add(new Locais(R.string.item_restaurantes9, R.string.item_restaurantes10,
                R.drawable.res_bistro));
        locais.add(new Locais(R.string.item_restaurantes11, R.string.item_restaurantes12,
                R.drawable.res_rayz));
        locais.add(new Locais(R.string.item_restaurantes13, R.string.item_restaurantes14,
                R.drawable.res_galeto));

        LocaisAdapter adapter = new LocaisAdapter(getActivity(), locais, R.color.category_restaurantes);

        ListView listView =  rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);

        return rootView;
    }

}