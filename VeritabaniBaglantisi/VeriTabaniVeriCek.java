package VeritabaniBaglantisi;

import java.sql.*;

public class VeriTabaniVeriCek {
    public static final String vt_url="jdbc:postgresql://localhost/dvdrental";
    public static final String vt_user="postgres";
    public static final String vt_pw="burak";

    public static void main(String[] args) {
        Connection baglanti3 = null;
        Statement st = null;
        String sqlsorgu = "SELECT * FROM category";
        try{
            baglanti3 = DriverManager.getConnection(vt_url,vt_user,vt_pw);//bağlantı kuruldu
            st = baglanti3.createStatement();//bağlantı üzerinden statement oluşturulmalı veri çekmek için
            //Tip1 st = baglanti3.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
            ResultSet data = st.executeQuery(sqlsorgu);//Sorguladığımız veriler result set şeklinde döndü biz onu bir result set değişkenine attık
            data.next();//itr mantığı
            data.next();
            //data.first();//sistem izin vermez çalıştırılması isteniyorsa Tip 1 gibi ayarlanmalı
            //data.last();//Tip 1
            //data.absolute(10);//Tip 1
            System.out.println(data.getString("name"));
            while (data.next()){
                System.out.print(data.getInt("category_id"));
                System.out.print("\t");
                System.out.print(data.getString("name"));
                System.out.print("\t");
                System.out.println(data.getString("last_update"));
            }
        }catch (SQLException e){
            System.out.println(e.getMessage());
        }
    }
}
