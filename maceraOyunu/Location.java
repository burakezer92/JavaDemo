package maceraOyunu;

public abstract class Location {
    public Player player;
    private String name;
    Location(Player player,String name){
        this.player=player;
        this.name=name;
    }
    public boolean onLocation(){
        System.out.println("sdasdasd");
        return true;
    }
}
