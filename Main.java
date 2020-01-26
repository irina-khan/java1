public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat("Murzik", 50, false);
        Cat cat1 = new Cat("Bars", 30, false);
        Cat cat2 = new Cat("Katy", 40, false);
        Plate plate = new Plate(100);
        plate.info();
        cat.eat(plate);
        cat1.eat(plate);
        cat2.eat(plate);
        plate.info();
        int catNum = 3;
        Cat[] catArr = new Cat[catNum];
        catArr[0] = cat;
        catArr[1] = cat1;
        catArr[2] = cat2;
        for (int i = 0; i < catNum; i++) {
            if (catArr[i].getAppetite() > plate.getFood()) {
                System.out.println("Not enough food! Add food - " + catArr[i].getName() + " is still hungry.");
            } else {
                plate.info();
                catArr[i].setIsFull();
            }

        }
        System.out.println();

    }
}

