/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import static com.sun.org.apache.xalan.internal.lib.ExsltDatetime.date;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;
import model.quanlyxe;

/**
 *
 * @author Admin
 */
public class docghi {

    public void ghixe(ArrayList <quanlyxe> list){
        try (PrintWriter pw = new PrintWriter(new File("data.dat"))){
            for(quanlyxe s: list){
                pw.println(s.getBienso());
                pw.println(s.getTenchuxe());
                pw.println(s.getMauxe());
                pw.println(s.getLoaixe());
                pw.println(s.getNgaygui());
                pw.println(s.getDate());        
            }
        } catch (Exception e) {
            System.out.println("got an exception!");
        }
    }
        
    public ArrayList docxe(){
        ArrayList<quanlyxe> list = new ArrayList<>();
        try(Scanner sc = new Scanner(new File("data.dat"))) {
            while(sc.hasNext()){
                quanlyxe s = new quanlyxe();
                s.setBienso(sc.nextLine());
                s.setTenchuxe(sc.nextLine());
                s.setMauxe(sc.nextLine());
                s.setLoaixe(sc.nextLine());
                s.setNgaygui(sc.nextLine());
                s.setDate(sc.nextLine());
                
                list.add(s);
            }
        } catch (Exception e) {
            System.out.println("got an exception!");
        }
        return list;
    }

}
