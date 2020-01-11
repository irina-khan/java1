import java.util.*;
public class array5{
    public static void main(String[] args) {
        int range = 10;                             //Генерируем случайные числа от 0 до 10
        int arr0 = (int)(Math.random() * range);
        int arr1 = (int)(Math.random() * range);
        int arr2 = (int)(Math.random() * range);
        int arr3 = (int)(Math.random() * range);
        int arr4 = (int)(Math.random() * range);
        int arr5 = (int)(Math.random() * range);
        int arr6 = (int)(Math.random() * range);
        int arr7 = (int)(Math.random() * range);
        int arr8 = (int)(Math.random() * range);
        int arr9 = (int)(Math.random() * range);

        int[] array5 = {arr0, arr1, arr2, arr3, arr4, arr5, arr6, arr7, arr8, arr9};

                System.out.println(Arrays.toString(array5));   //Выводим массив

        int maxArr = array5[0];
        int maxIndex = 0;
        int minArr = array5[0];
        int minIndex = 0;


            for(int i=0;i<array5.length;i++){
              if(maxArr < array5[i]){
                  maxArr = array5[i];
                  maxIndex = i;
          }
        }
                 System.out.println("Максимальное значение массива - " +  maxArr);
                 System.out.println("Индекс максимального значения массива - " +  maxIndex);

            for(int j=0;j<array5.length;j++){
                if(minArr > array5[j]){
                    minArr = array5[j];
                    minIndex = j;
            }
        }
                    System.out.println("Минимальное значение массива - " +  minArr);
                    System.out.println("Индекс минимального значения массива - " +  minIndex);
    }
}