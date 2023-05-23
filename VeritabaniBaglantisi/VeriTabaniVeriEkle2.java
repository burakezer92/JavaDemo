package VeritabaniBaglantisi;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class VeriTabaniVeriEkle2 {
    public static String url = "jdbc:postgresql://localhost/dvdrental";
    public static String user = "postgres";
    public static String pw ="burak";

    public static void main(String[] args) {

        String sqlekle = "INSERT INTO category(name) VALUES (?)";
        Connection baglanti5 = null;
        try{
            baglanti5 = DriverManager.getConnection(url,user,pw);
            PreparedStatement prst = baglanti5.prepareStatement(sqlekle);
            prst.setString(1,"prst");
            prst.executeUpdate();
            prst.close();
        }catch (SQLException e){
            System.out.println(e.getMessage());
        }
    }
}
