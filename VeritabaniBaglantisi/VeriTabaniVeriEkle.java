package VeritabaniBaglantisi;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class VeriTabaniVeriEkle {
    public static final String vt_url="jdbc:postgresql://localhost/dvdrental";
    public static final String vt_user="postgres";
    public static final String vt_pw="burak";

    public static void main(String[] args) {
        Connection baglanti4 = null;
        String eklenenveri = "INSERT INTO category(name, last_update) VALUES ('Burak', '2023-02-15 09:46:27')";//insert sorgusu
        try{
            baglanti4 = DriverManager.getConnection(vt_url,vt_user,vt_pw);//bağlantı
            Statement st = baglanti4.createStatement();//statement oluşmalı hepsinde
            st.executeUpdate(eklenenveri);//veri ekleme
        }catch (SQLException e){
            System.out.println(e.getMessage());
        }
    }
}
