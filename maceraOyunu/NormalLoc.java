package maceraOyunu;

public abstract class NormalLoc extends Location {
    public NormalLoc(Player player, String name) {
        super(player, name);
    }
    @Override
    public boolean onLocation() {
        System.out.println("normal");
        return true;
    }
}
