package simushark;

public class EatByChomp implements EatBehavior{
    @Override
    public void eat() {
        System.out.println("CHOMP CHOMP!");
    }
}
