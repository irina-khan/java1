import java.util.*;

public class array1 {
    public static void main(String[] args) {

        int[] array1 = {1, 0, 1, 0, 0, 1, 0, 1, 1, 0};

        for (int i = 0; i < array1.length; i++) {

            if (array1[i] == 0) {
                array1[i] = 1;
                } else {
                    array1[i]  = 0;
                }
            }
        System.out.println(Arrays.toString(array1));
        }

    }