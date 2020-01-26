public class Cat extends Animal{
    public Cat(String name){
        this.name = name;
    }

    @Override
    public void run() {
        super.run();
        int maxDistanceRun = 200;
        double distanceRun = Math.round(Math.random()*maxDistanceRun);
        System.out.println("Cat " + name + " run " + distanceRun + " m");
    }


    @Override
    public void swim() {
        super.swim();
        int maxDistanceSwim = 0;
        double distanceSwim = Math.round(Math.random()*maxDistanceSwim);
        System.out.println("Cats cannot swim! " + name + " swam " + distanceSwim + " m");
    }

    @Override
    public void jump() {
        super.jump();
        int maxHeightJump = 200;
        double heightJump = Math.round(Math.random()*maxHeightJump);
        System.out.println("Cat " + name + " jumped " + heightJump + " cm");
    }


}
