import java.util.*;
public class guessWord {
    public static void main(String[] args) {
        String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot", "cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea", "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};

        System.out.println(Arrays.toString(words));
        int index = new Random().nextInt(words.length);
        System.out.println("����� ����� �� ������ ���� ���� ��������?");
        Scanner scanner = new Scanner(System.in);
        String wordInput = scanner.nextLine();
        while (true) {
            if (wordInput.equalsIgnoreCase(words[index])) {
                System.out.println("�� �������");
                break;
            } else {
                char[] answer = {'#','#','#','#','#','#','#','#','#','#','#','#','#','#','#'};
                for (int i = 0; i < answer.length && i < wordInput.length() &&  i < words[index].length(); i++) {
                    char letterInput = wordInput.charAt(i);
                    char letterWord = words[index].charAt(i);
                        if (letterInput == letterWord) {
                            answer[i] = letterInput;
                        }
                    }System.out.println(Arrays.toString(answer).replace("[","").replace(",","").replace("]","").replace(" ",""));
                }
                System.out.println("�� �� �������");
                System.out.println("����� ����� �� ������ ���� ���� ��������?");
                wordInput = scanner.nextLine();
                }
        scanner.close();
        }
    }
