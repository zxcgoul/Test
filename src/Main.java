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
        } else if (operation == '+') {
            float e = a + b;
            System.out.println("Ответ " + e);
        } else System.out.println("Неверная операция");
    }
}
/* для результатов я использовал отдельные переменные (кроме умножения), так как
если я выводил System.out.println("Ответ " + a+b) то программа ругалась :/
Не нашёл более лучшего способа, чем просто немного увеличить программу на 3 строчки =) 111111
 */