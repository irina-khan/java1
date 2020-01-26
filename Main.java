import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Bars");
        Dog dog1 = new Dog("Bold");
        Kitten kitten1 = new Kitten("Katti");
        Puppy puppy1 = new Puppy("Doggy");

      Scanner scanner = new Scanner(System.in);
        System.out.println("Input action (jump , swim or run)");
         String input = scanner.nextLine();

         switch (input){
             case("jump"):
                 cat1.jump();
                 dog1.jump();
                 kitten1.jump();
                 puppy1.jump();
                 break;
             case("swim"):
                 cat1.swim();
                 dog1.swim();
                 kitten1.swim();
                 puppy1.swim();
                 break;
             case("run"):
                 cat1.run();
                 dog1.run();
                 kitten1.run();
                 puppy1.run();
                 break;
         }

    }
}
