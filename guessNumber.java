import java.util.*;
public class guessNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int attempt = 1;
        do { int range = 9;
            int number = (int)(Math.random() * (range));
            System.out.println("Ваша задача угадать число.\n" + "Угадайте число от 0 до " + range);
            int attemptsNumber = 3;

            for(int i=0; i < attemptsNumber;i++){
                int input_number = scanner.nextInt();
                if(input_number==number){
                    System.out.println("Вы угадали");
                    break;
                } else if(input_number > number){
                    System.out.println("Загаданное число меньше. У вас осталось " + (attemptsNumber - i-1) + " попыток");
                } else {
                    System.out.println("Загаданное число больше. У вас осталось " + (attemptsNumber - i-1) + " попыток");
                }
            }

            System.out.println("Повторить игру еще раз? 1 – да / 0 – нет");
             attempt = scanner.nextInt();

        } while(attempt == 1);
        scanner.close();
            }
        }






