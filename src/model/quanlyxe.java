/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
import java.util.Date;
import java.sql.Time;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Vector;

/**
 *
 * @author Admin
 */
public class quanlyxe implements Serializable, giaotiep{
    

    private String bienso;
    private String tenchuxe;
    private String mauxe;
    private String ngaygui;
    private String loaixe;
    
//    java.util.Date date = new java.util.Date();
    String pattern = "MM/dd/yy HH:mm";

DateFormat df = new SimpleDateFormat(pattern);
Date today = Calendar.getInstance().getTime();        
String date = df.format(today);

    public quanlyxe() {
    }

    public String getBienso() {
        return bienso;
    }

    public void setBienso(String bienso) {
        this.bienso = bienso;
    }

    public String getTenchuxe() {
        return tenchuxe;
    }

    public void setTenchuxe(String tenchuxe) {
        this.tenchuxe = tenchuxe;
    }

    public String getMauxe() {
        return mauxe;
    }

    public void setMauxe(String mauxe) {
        this.mauxe = mauxe;
    }

    public String getNgaygui() {
        return ngaygui;
    }

    public void setNgaygui(String ngaygui) {
        this.ngaygui = ngaygui;
    }

    public String getLoaixe() {
        return loaixe;
    }

    public void setLoaixe(String loaixe) {
        this.loaixe = loaixe;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    

    @Override
    public Object[] toObject() {
        return new Object[]{
        this.getBienso(), this.getTenchuxe(), this.getMauxe(),this.getLoaixe(), this.getNgaygui(), this.getDate()
    };
}
}