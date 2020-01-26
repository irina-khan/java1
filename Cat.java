public class Cat {
   private String name;
   private int appetite;
   private boolean isFull;
public Cat(String name, int appetite, boolean isFull){
    this.name = name;
    this.appetite = appetite;
    this.isFull = isFull;
}
public void eat(Plate p){
    p.decreaseFood(appetite);
}
    public int getAppetite(){
        return appetite;
    }
    public String getName(){
        return name;
    }

    public boolean setIsFull() {
        return isFull = true;
    }
}
