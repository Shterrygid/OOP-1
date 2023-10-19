import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите текст:");
        String text = scanner.nextLine();
        String[] sentences = text.split("[.!?]\\s*");

        for (String sentence : sentences) {
            int vowelsCount = 0;
            int consonantsCount = 0;
            for (char c : sentence.toCharArray()) {
                if (Character.isLetter(c)) {
                    if ("AEIOUaeiou".indexOf(c) != -1) {
                        vowelsCount++;
                    } else {
                        consonantsCount++;
                    }
                }
            }
            System.out.println("В предложении \"" + sentence + "\" больше " +
                    (vowelsCount > consonantsCount ? "гласных" : "согласных"));
        }
    }
}