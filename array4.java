import java.util.*;
public class array4 {
    public static void main(String[] args) {
        int[][] array4 = new int[8][8];
        for (int i = 0; i < array4.length; i++) {
            for (int j = 0; j < array4.length; j++) {
                if (i == j) {
                    array4[i][j] = 1;
                }
            }
        }
        for (int i = 0; i <= array4[0].length; i++) {
        }
        System.out.println();
        for (int i = 0; i < array4.length; i++) {
            for (int j = 0; j < array4[i].length; j++) {
                System.out.print(array4[i][j] + " ");
            }
            System.out.println();
        }
    }
}