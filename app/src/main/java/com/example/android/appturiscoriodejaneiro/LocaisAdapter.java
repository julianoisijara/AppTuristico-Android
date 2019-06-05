package com.example.android.appturiscoriodejaneiro;

import android.content.Context;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;

public class LocaisAdapter extends ArrayAdapter<Locais> {

    private int mColorResourceId;



    public LocaisAdapter(Context context, ArrayList<Locais> locais, int colorResourceId) {
        super(context, 0, locais);
        mColorResourceId = colorResourceId;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        Locais currentLocais = getItem(position);

        TextView tituloTextView = listItemView.findViewById(R.id.titulo_text_view);

        tituloTextView.setText(currentLocais.getTituloId());

        TextView descricaoviewTextView = listItemView.findViewById(R.id.descricao_text_view);

        descricaoviewTextView.setText(currentLocais.getDescricaoId());

        ImageView imageView = listItemView.findViewById(R.id.image);
        if (currentLocais.hasImage()) {
            imageView.setImageResource(currentLocais.getImageResourceId());
            imageView.setVisibility(View.VISIBLE);
        } else {
            imageView.setVisibility(View.GONE);
        }

        View textContainer = listItemView.findViewById(R.id.text_container);
        int color = ContextCompat.getColor(getContext(), mColorResourceId);
        textContainer.setBackgroundColor(color);

        return listItemView;
    }

}
