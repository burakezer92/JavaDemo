package VeritabaniBaglantisi;

import java.sql.*;

public class VeriTabaniVeriGunc {
    public static final String vt_url="jdbc:postgresql://localhost/dvdrental";
    public static final String vt_user="postgres";
    public static final String vt_pw="burak";

    public static void main(String[] args) {
        String sqlsorgu="UPDATE category SET name='degismis' WHERE category_id=1;";
        try{
            Connection baglanti6 = DriverManager.getConnection(vt_url,vt_user,vt_pw);
            Statement st = baglanti6.createStatement();
            st.executeUpdate(sqlsorgu);
            st.close();
        }catch (SQLException e){
            System.out.println(e.getMessage());
        }


    }
}
