package MayinTarlasi;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class MayinTarlasi {



    static void mayinDoseme(int satir,int sutun){
        char [][] tarla = new char[satir][sutun];
        for(int i=0;i<satir;i++){
            for(int j=0;j<sutun;j++){
                tarla[i][j]='*';
            }
        }

        Random mayinyeri = new Random();
        for(int i=0;i<satir*sutun/4;i++){
            int a = mayinyeri.nextInt(satir);
            int b = mayinyeri.nextInt(sutun);
            tarla[a][b]='M';
        }
        System.out.println("Mayın Haritası");
        for(int i=0;i<satir;i++){
            for(int j=0;j<sutun;j++){
                System.out.print(tarla[i][j]);

            }
            System.out.println();
        }
        System.out.println();
        for(int i=0;i<satir;i++){
            for(int j=0;j<sutun;j++){
                if(tarla[i][j]=='M'){
                    System.out.print('*');
                }else {
                    System.out.print(tarla[i][j]);
                }

            }
            System.out.println();
        }
        boolean isMayinabas=false;
        do{
            Scanner girdi = new Scanner(System.in);
            System.out.print("Satır parametresi:");
            int a = girdi.nextInt();
            System.out.print("Sütun parametresi:");
            int b = girdi.nextInt();
            int sayac =48;



            try{
                if (tarla[a][b]=='M'){
                    System.out.println("Mayına bastınız.");
                    for(int i=0;i<satir;i++){
                        for(int j=0;j<sutun;j++){
                                System.out.print(tarla[i][j]);

                        }
                        System.out.println();
                    }
                    isMayinabas = true;
                }
            }catch (Exception e){
                System.out.println("Hatalı parametre girdiniz.");
                continue;
            }
            for(int i=a-1;i<a+2;i++){
                for(int j=b-1;j<b+2;j++){
                    try{
                        if(tarla[i][j]=='M'){
                            sayac ++;
                        }
                    }catch (Exception e){
                        continue;
                    }

                }
            }
            tarla[a][b]=(char)sayac;
            if(!isMayinabas){
                for(int i=0;i<satir;i++){
                    for(int j=0;j<sutun;j++){
                        if(tarla[i][j]=='M'){
                            System.out.print('*');
                        }else {
                            System.out.print(tarla[i][j]);
                        }

                    }
                    System.out.println();
                }
            }
            boolean kontrol= false;
            for(int i=0;i<satir;i++){
                for(int j=0;j<sutun;j++){
                    if(tarla[i][j]=='*'){
                        kontrol=true;

                    }else {
                        kontrol=false;
                    }

                }
            }
            if (!kontrol){
                System.out.println("Oyunu kazandınız");
                break;
            }

        }while (!isMayinabas);


    }



}
