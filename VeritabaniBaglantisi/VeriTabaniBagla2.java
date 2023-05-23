package VeritabaniBaglantisi;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class VeriTabaniBagla2 {
    public static final String vt_url="jdbc:postgresql://localhost/dvdrental";
    public static final String vt_user="postgres";
    public static final String vt_pw="burak";

    public static void main(String[] args) {
        Connection baglanti2 = null;
        try{
            baglanti2 = DriverManager.getConnection(vt_url,vt_user,vt_pw);//kolay ve daha güzel yöntem
            System.out.println("Veritabanına Bağlandı.");
        }catch (SQLException e){
            System.out.println("Bağlantı hatası" + "\t" + e.getMessage());
        }

    }
}
