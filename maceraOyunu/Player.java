package maceraOyunu;

import java.util.Scanner;

public class Player {
    private int damage;
    private int healt;
    private int money;
    private String name;
    Player(String name){
        this.name=name;
    }
    private Scanner input=new Scanner(System.in);

    public void selectChar(){
        GameChar[] charlist = {new Samurai(),new Archer(),new Knight()};
        for(GameChar gameChar:charlist){
            System.out.println("Id:"+gameChar.getId()+"\t Karakter Adı:" + gameChar.getName()+"\t Hasar:"+gameChar.getDamage()+"\tSağlık:"+gameChar.getHealth()+"\tPara"+gameChar.getMoney());
        }
        System.out.print("Bir karakter seçiniz:");
        int selectChar = input.nextInt();
        switch (selectChar){
            case 1:
                initPlayer(charlist[0]);
                break;
            case 2:
                initPlayer(charlist[1]);
                break;
            case 3:
                initPlayer(charlist[2]);
                break;
        }

    }
    public void initPlayer(GameChar gameChar){
        this.setDamage(gameChar.getDamage());
        this.setHealt(gameChar.getHealth());
        this.setMoney(gameChar.getMoney());
        this.setName(gameChar.getName());
        System.out.println("Seçilen Karakter:"+ this.getName());
    }

    public int getDamage(){
        return this.damage;
    }
    public void setDamage(int damage){
        this.damage=damage;
    }

    public int getHealt() {
        return healt;
    }

    public void setHealt(int healt) {
        this.healt = healt;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
