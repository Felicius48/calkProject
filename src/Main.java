import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.println("Введите число 1: ");
        double value1 = scn.nextDouble();
        System.out.println("Введите число 2: ");
        double value2 = scn.nextDouble();
        System.out.println("Введите оператор действия: + - * /");
        String oper = scn.next();

        double res = 0;
        switch (oper){
            case "+":
                res = value1 + value2;
                break;
            case "-":
                res = value1 - value2;
                break;
            case "*":
                res = value1 * value2;
                break;
            case "/":
                res = value1 / value2;
                break;
        }
        System.out.println(res);
    }
}


