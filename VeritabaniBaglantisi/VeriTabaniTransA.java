package VeritabaniBaglantisi;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class VeriTabaniTransA {
    public static String url = "jdbc:postgresql://localhost/dvdrental";
    public static String username = "postgres";
    public static String password= "burak";

    public static void main(String[] args) {
        Connection baglanti10 = null;
        try{
            baglanti10=DriverManager.getConnection(url,username,password);
            PreparedStatement pst = baglanti10.prepareStatement("INSERT INTO language(name)VALUES (?);");
            baglanti10.setAutoCommit(false);//kod parçasında hata varsa hiçbir kodu çalıştırmaz böylece yarım çalışmaz
            pst.setString(1,"Indian");
            pst.executeUpdate();
            if(true){
                throw new SQLException();//hata verdik
            }
            pst.setString(1,"Greek");
            pst.executeUpdate();
            baglanti10.commit();//kod hatasız olursa çalışır
        }catch (SQLException e){
            try{
                if(baglanti10!=null){
                    baglanti10.rollback();//hata verdiğinde tüm yapılan yarım işlem geri alınır
                }
            }catch (SQLException ex){
                System.out.println(ex.getMessage());
            }
            System.out.println(e.getMessage());
        }
    }
}
