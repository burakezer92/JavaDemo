package VeritabaniBaglantisi;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class VeriTabaniBagla {
    public static void main(String[] args) {
        Connection baglanti = null;
        String url ="jdbc:postgresql://localhost/dvdrental?user=postgres&password=burak";//eski yöntem
        try{
            baglanti = DriverManager.getConnection(url);
            System.out.println("Veritabanına Bağlandı.");
        }catch (SQLException e){
            System.out.println("Bağlantı hatası" + "\t" + e.getMessage());
        }
    }
}
