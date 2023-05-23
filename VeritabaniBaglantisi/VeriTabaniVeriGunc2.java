package VeritabaniBaglantisi;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class VeriTabaniVeriGunc2 {
    public static final String vt_url="jdbc:postgresql://localhost/dvdrental";
    public static final String vt_user="postgres";
    public static final String vt_pw="burak";

    public static void main(String[] args) {
        String sql = "UPDATE category SET name=? WHERE category_id=?";
        try {
            Connection baglanti7 = DriverManager.getConnection(vt_url,vt_user,vt_pw);
            PreparedStatement prst = baglanti7.prepareStatement(sql);
            prst.setString(1,"Burak");
            prst.setInt(2,3);
            prst.executeUpdate();
            prst.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }
}
