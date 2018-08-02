package simushark;

public class GreateWhiteShark extends Shark implements EatBehavior, BreachBehavior {

    public void eat(){
        System.out.println("Great White Shark eat");
    }
    public void breach(){
        System.out.println("Great White Shark breach");
    }

}
