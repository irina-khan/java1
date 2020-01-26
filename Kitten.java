public class Kitten extends Cat {

  public Kitten(String name){
      super(name);
  }
    @Override
    public void run() {
        super.run();
        int maxDistanceRun = 120;
        double distanceRun = Math.round(Math.random()*maxDistanceRun);
        System.out.println("Kitten " + name + " run " + distanceRun + " m");
    }

    @Override
    public void jump() {
        super.jump();
        int maxHeightJump = 100;
        double heightJump = Math.round(Math.random()*maxHeightJump);
        System.out.println("Kitten " + name + " jumped " + heightJump + " cm");
    }

}
