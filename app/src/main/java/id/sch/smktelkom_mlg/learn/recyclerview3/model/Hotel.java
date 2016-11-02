package id.sch.smktelkom_mlg.learn.recyclerview3.model;

/**
 * Created by Vistapram on 2016-11-02.
 */

import android.graphics.drawable.Drawable;

public class Hotel {
    public String judul;
    public String deskripsi;
    public Drawable foto;
    public Hotel(String judul, String deskripsi, Drawable foto)
    {
        this.judul = judul;
        this.deskripsi = deskripsi;
        this.foto = foto;
    }
}
