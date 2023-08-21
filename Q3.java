import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int testCalculator = 1;

        while (true) {
            int m = scanner.nextInt();
            if (m == 0) {
                break;
            }

            scanner.nextLine();

            String expression = scanner.next();

            int result = 0;
            int currentOperand = 0;
            char lastOperator = '+';

            for (int i = 0; i < expression.length(); i++){
                char currentChar = expression.charAt(i);

                if(currentChar == '+' || currentChar == '-') {
                    if(lastOperator == '+') {
                        result += currentOperand;
                    } else {
                        result -= currentOperand;
                    }
                    currentOperand = 0;
                    lastOperator = currentChar;
                } else {
                    currentOperand = currentOperand * 10 + Character.getNumericValue(currentChar);

                }
            }

            if (lastOperator == '+') {
                result += currentOperand;
            } else {
                result -= currentOperand;
            }

            System.out.println("Test" + testCalculator++);
            System.out.println(result);
            System.out.println();

        }
    }
}