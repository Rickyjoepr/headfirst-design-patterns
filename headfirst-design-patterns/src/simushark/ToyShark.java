package simushark;

public class ToyShark extends Shark{

    //ToySharks do not eat, so override the eat method
   public ToyShark(){
       eatBehavior = new EatByChomp();
   }

   //Programming to an interface
   public void eat(){
       eatBehavior.eat();
   }
}
