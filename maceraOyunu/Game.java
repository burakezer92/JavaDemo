package maceraOyunu;

import java.util.Scanner;

public class Game {
    private Scanner input = new Scanner(System.in);
    public void start(){
        System.out.print("İsminizi giriniz:");
        String playerName = input.nextLine();
        Player player = new Player(playerName);
        System.out.println("Sevgili "+player.getName() + " Macera oyununa hoşgeldin");
        player.selectChar();

    }
}
