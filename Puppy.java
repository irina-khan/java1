public class Puppy extends Dog{
    public Puppy(String name){
        super(name);
    }
    @Override
    public void run() {
        super.run();
        int maxDistanceRun = 300;
        double distanceRun = Math.round(Math.random()*maxDistanceRun);
        System.out.println("Puppy " + name + " run " + distanceRun + " m");
    }


    @Override
    public void swim() {
        super.swim();
        int maxDistanceSwim = 50;
        double distanceSwim = Math.round(Math.random()*maxDistanceSwim);
        System.out.println("Puppy " + name + " swam " + distanceSwim + " m");
    }


    @Override
    public void jump() {
        super.jump();
        int maxHeightJump = 30;
        double heightJump = Math.round(Math.random()*maxHeightJump);
        System.out.println("Puppy " + name + " jumped " + heightJump + " cm");
    }
}
