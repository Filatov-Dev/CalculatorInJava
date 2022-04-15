import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        int numOne = in.nextInt();
        System.out.print("Введите второе число: ");
        int numTwo = in.nextInt();
        System.out.print("Введите действие (+,-,/,*): ");
        String sign = in.next();
        int result = calc(numOne, numTwo, sign);
        System.out.printf("Ваш результат равен: %d", result);
    }
    static int calc(int a, int b, String c) {
        int result = 0;
        switch (c) {
            case "+":
                result = a+b;
                break;
            case "-":
                result = a-b;
                break;
            case "/":
                result = a/b;
                break;
            case "*":
                result = a*b;
                break;
        }
        return  result;
    }
}
