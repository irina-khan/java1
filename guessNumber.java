import java.util.*;
public class guessNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int attempt = 1;
        do { int range = 9;
            int number = (int)(Math.random() * (range));
            System.out.println("���� ������ ������� �����.\n" + "�������� ����� �� 0 �� " + range);
            int attemptsNumber = 3;

            for(int i=0; i < attemptsNumber;i++){
                int input_number = scanner.nextInt();
                if(input_number==number){
                    System.out.println("�� �������");
                    break;
                } else if(input_number > number){
                    System.out.println("���������� ����� ������. � ��� �������� " + (attemptsNumber - i-1) + " �������");
                } else {
                    System.out.println("���������� ����� ������. � ��� �������� " + (attemptsNumber - i-1) + " �������");
                }
            }

            System.out.println("��������� ���� ��� ���? 1 � �� / 0 � ���");
             attempt = scanner.nextInt();

        } while(attempt == 1);
        scanner.close();
            }
        }






