import java.util.*;

public class array7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите 1-ый элемент массива");
        int arr0 = scanner.nextInt();
        System.out.println("Введите 2-ый элемент массива");
        int arr1 = scanner.nextInt();
        System.out.println("Введите 3-ый элемент массива");
        int arr2 = scanner.nextInt();
        System.out.println("Введите 4-ый элемент массива");
        int arr3 = scanner.nextInt();
        System.out.println("Введите 5-ый элемент массива");
        int arr4 = scanner.nextInt();
        System.out.println("Введите 6-ый элемент массива");
        int arr5 = scanner.nextInt();

        int[] array7 = {arr0, arr1, arr2, arr3, arr4, arr5};
        System.out.println(Arrays.toString(array7));

        System.out.println("Введите число n, на которое будут сдвинуты элементы массива");
        int n = scanner.nextInt();

        if(n>=0){
            for(int i=n; i > 0; i--){
               int lastArr = array7[array7.length-1];
               for(int j=0; j < array7.length; j++){
                   int currArr = array7[j];
                   array7[j] = lastArr;
                   lastArr = currArr;

               }
            }
        } else if(n<0){
            for(int i = n; i < 0; i++) {
                int firstArr = array7[0];
                for (int j = array7.length - 1; j >=0; j--) {
                    int currArr = array7[j];
                    array7[j] = firstArr;
                    firstArr = currArr;
                }
            }
        }

        System.out.println(Arrays.toString(array7));
    }
}