import java.util.*;  //Для вывода массива на печать
public class array2 {
    public static void main(String[] args) {
        int[] array2 = new int[8]; //Создаем пустой массив из 8 элементов

        for (int i=0;i< array2.length;i++){
        if(i>0){
            array2[i]= (array2[i-1]+3);  //Увеличим на 3 каждый последующий элемент
        }
        }
        System.out.println(Arrays.toString(array2));
}}