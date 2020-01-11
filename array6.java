import java.util.*;

public class array6 {
    public static void main(String[]args) {

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

        int[] array6 = {arr0, arr1, arr2, arr3, arr4, arr5};

        System.out.println(Arrays.toString(array6));

        for(int i=0;i<array6.length;i++){
            if(arr0 == arr1 + arr2 + arr3 + arr4 + arr5){
                System.out.println("[" + arr0  + " || " + arr1 + ", "  + arr2 + ", "  + arr3 + ", "  + arr4 + ", "  + arr5 + "] -> true");
                break;
            } else if(arr0 + arr1 == arr2 + arr3 + arr4 + arr5){
                System.out.println("[" + arr0 + ", "  + arr1 + " || " + arr2 + ", "  + arr3 + ", "  + arr4 + ", "  + arr5 + "] -> true");
                break;
            } else if(arr0 + arr1 + arr2 == arr3 + arr4 + arr5){
                System.out.println("[" + arr0 + ", "  + arr1 + ", "  + arr2 + " || " + arr3 + ", "  + arr4 + ", "  + arr5 + "] -> true");
                break;
            } else if(arr0 + arr1 + arr2 + arr3 == arr4 + arr5){
                System.out.println("[" + arr0 + ", "  + arr1 + ", "  + arr2 + ", "  + arr3 + " || " + arr4 + ", "  + arr5 + "] -> true");
                break;
            } else if(arr0 + arr1 + arr2 + arr3 + arr4 == arr5){
                System.out.println("[" + arr0 + ", "  + arr1 + ", "  + arr2 + ", "  + arr3 + ", "  + arr4 + " || " + arr5 + "] -> true");
                break;
            } else{
                System.out.println("false");
            }
        }

    }
}


