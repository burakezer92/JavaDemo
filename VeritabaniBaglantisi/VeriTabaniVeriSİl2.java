package VeritabaniBaglantisi;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class VeriTabaniVeriSİl2 {
    public static final String vt_url="jdbc:postgresql://localhost/dvdrental";
    public static final String vt_user="postgres";
    public static final String vt_pw="burak";

    public static void main(String[] args) {
        String sql = "DELETE FROM language WHERE language_id=?;";
        try {
            Connection baglanti9 = DriverManager.getConnection(vt_url,vt_user,vt_pw);
            PreparedStatement prst = baglanti9.prepareStatement(sql);
            prst.setInt(1,5);
            prst.executeUpdate();
            prst.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }
}
