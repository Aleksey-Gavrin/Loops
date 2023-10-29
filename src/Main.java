public class Main {
    public static void main(String[] args) {
        System.out.println();
        System.out.println("Результат выполнения задания 1:");
        task1();
        System.out.println();
        System.out.println("Результат выполнения задания 2:");
        task2();
    }

//  Задание 1
//  Необходимо пройти циклом по числам от 1 до 30 включительно и, если число делится на 3 без остатка, вывести ping,
//  а если число делится на 5 без остатка, вывести pong.
//  Если число делится без остатка и на 3, и на 5, необходимо вывести ping pong.
//  Допускается наличие пустых строк в выводе.

    public static void task1() {
        for (int i = 1; i <= 30 ; i++) {
            System.out.print(i + ":");
            if (i % 3 == 0) {
                System.out.print(" ping");
            }
            if (i % 5 == 0) {
                System.out.println(" pong");
                continue;
            }
            System.out.println();
        }

    }
//  Задание 2
//  Вывести первые 10 чисел последовательности Фибоначчи. Последовательность строится по следующему правилу:
//  – Каждое следующее число равняется сумме двух предыдущих.
//  Дано: две целочисленные переменные, первая равна 0, вторая равна 1.
//  Эти два числа — первые числа последовательности. Следующие восемь нужно вычислить и вывести.
//  Должно получиться следующее:
//  0 1 1 2 3 5 8 13 21 34

    public static void task2() {
        int a = 0, b = 1, c;
        System.out.print(a + " ");
        System.out.print(b + " ");
        for (int i = 3; i <= 10 ; i++) {
            c = a + b;
            System.out.print(c + " ");
            a = b;
            b = c;
        }
    }

}