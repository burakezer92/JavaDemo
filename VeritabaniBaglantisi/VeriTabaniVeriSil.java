package VeritabaniBaglantisi;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class VeriTabaniVeriSil {
    public static final String vt_url="jdbc:postgresql://localhost/dvdrental";
    public static final String vt_user="postgres";
    public static final String vt_pw="burak";

    public static void main(String[] args) {
        String sql23 = "DELETE FROM language WHERE language_id=6;";

        Connection baglanti8 = null;
        try {
            baglanti8 = DriverManager.getConnection(vt_url,vt_user,vt_pw);
            Statement st = baglanti8.createStatement();
            st.executeUpdate(sql23);
            st.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }


    }
}
