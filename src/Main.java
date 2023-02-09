public class Main {
        public static void main(String[] args) {
            System.out.println("Hello world!");
            task1(); // Первое задание
            task2(); // Второе задание
            task3(); // Третье задание
            task4(); // Четвертое задание
            task5(); // Пятое задание
            task6(); // Шестое задание

        }


        static void task1() {
            int Number = 40;
            if (Number <= 9) {
                System.out.println();
                System.out.println("Наше число однозначное");
            } else if (Number <= 99) {
                System.out.println();
                System.out.println("Наше число двухзначное");
            } else if (Number <= 100) {
                System.out.println();
                System.out.println("Наше число трехзначное");
            } else if (Number >= 1000) {
                System.out.println();
                System.out.println("Наше число больше трех значного");
            }

        }

        static void task2() {
            int a = 5;
            int b = 8;
            int c = 7;
            if (a + b > c || a + c > b || c + b > a) {
                System.out.println();
                System.out.println("Наш треугольник существует");
            } else {
                System.out.println();
                System.out.println("Нашего треугольника не существует");
            }
        }

        static void task3() {
            int a = 0;
            if (a <= -1) {
                System.out.println();
                System.out.println(2 - a);
            } else if (a >= 1) {
                System.out.println();
                System.out.println(1 + a);
            } else if (a == 0) {
                System.out.println();
                System.out.println(10 + a);
            }
        }

        static void task4() {

            int a = 89;
            int b = 0;
            int c = -1;
            int d = 1;
            int e = 0;
            if (a >= 1) {
                a = d;
            } else {
                a = e;
            }
            if (b >= 1) {
                b = d;
            } else {
                b = e;
            }
            if (c >= 1) {
                c = d;
            } else {
                c = e;
            }
            if (a + b + c == 3) {
                System.out.println();
                System.out.println("У нас три положительных числа");
            } else if (a + b + c == 2) {
                System.out.println();
                System.out.println("У нас два положительных числа");
            } else if (a + b + c == 1) {
                System.out.println();
                System.out.println("У нас одно положительное число");
            } else if (a + b + c == 0) {
                System.out.println();
                System.out.println("У нас нет положительных чисел");
            }
        }

        static void task5() {
            int a = 89;
            int b = 0;
            int c = 1;
            int d = 1;
            int e = 0;
            if (a >= 1) {
                a = d;
            } else {
                a = e;
            }
            if (b >= 1) {
                b = d;
            } else {
                b = e;
            }
            if (c >= 1) {
                c = d;
            } else {
                c = e;
            }
            if (a + b + c == 3) {
                System.out.println();
                System.out.println("У нас три положительных числа");
                System.out.println("У нас нет отрицательных чисел");
            } else if (a + b + c == 2) {
                System.out.println();
                System.out.println("У нас два положительных числа");
                System.out.println("У нас одно отрицательное число");
            } else if (a + b + c == 1) {
                System.out.println();
                System.out.println("У нас одно положительное число");
                System.out.println("У нас два отрицательных чисела");
            } else if (a + b + c < 0) {
                System.out.println();
                System.out.println("У нас нет положительных чисел");
                System.out.println("У нас три отрицательных чисела");
            }
        }

        static void task6() {
            int a = 3;
            int b = 29;
            if (a > b) {
                System.out.println();
                System.out.println("Первое число больше " +  a);
            } else {
                System.out.println();
                System.out.println("Второе число больше " +  b);
            }
        }}