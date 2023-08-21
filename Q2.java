import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type the message: ");
        String message = scanner.nextLine();
        scanner.close();

        String sentiment = analyzingSentiment(message);
        System.out.println("Expressed with the feeling: " + sentiment);
    }
    public static String analyzingSentiment(String message) {
        if (message.trim().isEmpty() || message.matches("^[\\s]*(:-\\)|:\\))$")) {
            return "neutro";
        }

        int Happy = countEmoticons(message, ":-)", ":)");
        int Sad = countEmoticons(message, ":-(", ":(");

        if (Happy > Sad) {
            return "glad";
        } else if (Sad > Happy) {
            return "upset";
        } else {
            return "neutral";
        }
    }

    public static int countEmoticons(String message, String... emoticons) {
        int count = 0;
        for (String emoticon : emoticons) {
            int index = message.indexOf(emoticon);
            while (index != -1) {
                count++;
                index = message.indexOf(emoticon, index + 1);
            }
        }
        return count;
    }
}
