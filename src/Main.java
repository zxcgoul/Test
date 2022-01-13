import java.util.Scanner;

class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число");
        float a = scanner.nextInt();
        System.out.println("Введите знак операции");
        char operation = scanner.next().charAt(0);
        System.out.println("Введите второе число");
        float b = scanner.nextInt();
        if (operation == '*') {
            System.out.println("Ответ " + a * b);
        } else if (operation == '/') {
            float c = a / b;
            System.out.println("Ответ " + c);
        } else if (operation == '-') {
            float d = a - b;
            System.out.println("Ответ " + d);
        } else System.out.println("Неверная операция");
    }
}
/* Операции: * - умножение; - - вычитание; / - деление */