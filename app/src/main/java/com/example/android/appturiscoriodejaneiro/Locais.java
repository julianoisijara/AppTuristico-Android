package com.example.android.appturiscoriodejaneiro;

public class Locais {

    private static final int NO_IMAGE_PROVIDED = -1;
    private int mTituloId;
    private int mDescricaoId;
    private int mImageResourceId = NO_IMAGE_PROVIDED;




    public Locais(int tituloId, int descricaoId, int imageResourceId) {
        mTituloId = tituloId;
        mDescricaoId = descricaoId;
        mImageResourceId = imageResourceId;
    }

    public int getTituloId() {
        return mTituloId;
    }

    public int getDescricaoId() {
        return mDescricaoId;
    }

    public int getImageResourceId() {
        return mImageResourceId;
    }

    public boolean hasImage() {
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }
}
