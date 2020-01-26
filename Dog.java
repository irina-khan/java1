public class Dog extends Animal {
    public Dog(String name){
        this.name = name;
    }


    @Override
    public void run() {
        super.run();
        int maxDistanceRun = 500;
        double distanceRun = Math.round(Math.random()*maxDistanceRun);
        System.out.println("Dog " + name + " run " + distanceRun + " m");
    }


    @Override
    public void swim() {
        super.swim();
        int maxDistanceSwim = 10;
        double distanceSwim = Math.round(Math.random()*maxDistanceSwim);
        System.out.println("Dog " + name + " swam " + distanceSwim + " m");
    }


    @Override
    public void jump() {
        super.jump();
        int maxHeightJump = 50;
        double heightJump = Math.round(Math.random()*maxHeightJump);
        System.out.println("Dog " + name + " jumped " + heightJump + " cm");
    }


}
