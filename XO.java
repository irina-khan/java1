import java.util.*;
public class XO {
    public static int size = 5;
    public static int dotsToWin = 4;  // не удалось использовать, в проверке на победу - "магические числа"(( ИИ так и не заработал ((
    public static final char dotEmpty = '.';
    public static final char dotX = 'X';
    public static final char dotO = 'O';
    public static char[][] map;
    public static Scanner scan = new Scanner(System.in);
    public static Random rand = new Random();

    public static void main(String[] args) {
        initMap();
        printMap();
        while (true) {
            humanTurn();
            printMap();
            if (checkWin(dotX)) {
                System.out.println("Победил человек");
                break;
            }
            if (isMapFull()) {
                System.out.println("Ничья");
                break;
            }
            aiTurn();
            printMap();
            if (checkWin(dotO)) {
                System.out.println("Победил Искуственный Интеллект");
                break;
            }
            if (isMapFull()) {
                System.out.println("Ничья");
                break;
            }
        }
        System.out.println("Игра закончена");
    }

    public static boolean checkWin(char symb) {

        for(int y = 0; (y+3) < size; y++) {
          for (int x = 0; (x+3) < size ; x++) {
            for (int i = 0; (i+1) < size; i++) {
               if (map[x][y +i] == symb && map[x + 1][y +i] == symb && map[x + 2][y +i] == symb && map[x + 3][y +i] == symb
                 || map[x +i][y] == symb && map[x +i][y + 1] == symb && map[x +i][y + 2] == symb && map[x +i][y + 3] == symb
                 || map[x][y] == symb && map[x + 1][y + 1] == symb && map[x + 2][y + 2] == symb && map[x + 3][y + 3] == symb)
                     return true;
                }
            }
        }

        return false;
    }

    public static boolean isMapFull() {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (map[i][j] == dotEmpty) return false;
            }
        }
        return true;
    }

    public static void aiTurn() {
        int x, y;
        for (int i = 0; i< size*size; i++){
//            char[][] checkMap = new char[size][size];
        do {
            x = rand.nextInt(size);
            y = rand.nextInt(size);
        } while (!isCellValid(x, y));
   //         map[y][x] = checkMap[y][x];
        if (checkWin(dotX)){
            map[y][x] = dotO;
            break;
        }
                    }
        do {
            x = rand.nextInt(size);
            y = rand.nextInt(size);
        } while (!isCellValid(x, y));
        System.out.println("Компьютер походил в точку " + (x + 1) + " " + (y + 1));
        map[y][x] = dotO;
    }

    public static void humanTurn() {
        int x, y;
        do {
            System.out.println("Введите координаты в формате X Y");
            x = scan.nextInt() - 1;
            y = scan.nextInt() - 1;
        } while (!isCellValid(x, y)); // while(isCellValid(x, y) == false)
        map[y][x] = dotX;
    }

    public static boolean isCellValid(int x, int y) {
        if (x < 0 || x >= size || y < 0 || y >= size) return false;
        if (map[y][x] == dotEmpty) return true;
        return false;
    }

    public static void initMap() {
        map = new char[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                map[i][j] = dotEmpty;
            }
        }
    }

    public static void printMap() {
        for (int i = 0; i <= size; i++) {
            System.out.print(i + "   ");
        }
        System.out.println();
        for (int i = 0; i < size; i++) {
            System.out.print((i + 1) + " | ");
            for (int j = 0; j < size; j++) {
                System.out.print(map[i][j] + " | ");
            }
            System.out.println();
        }
    }
}
