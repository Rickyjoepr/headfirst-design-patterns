package simushark;

public class Shark{

    EatBehavior eatBehavior;
    BreachBehavior breachbehavior;

    public void eat(){
        eatBehavior.eat();
    }
    public void breach(){
        breachbehavior.breach();
    }

    public void swim(){
        System.out.println("Swim");
    }

    public void display(){
    System.out.println("Display");
    }



    //More shark methods
}
