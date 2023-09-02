import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

    public static void task1() {
        // task 1
        System.out.println("task 1");
        int[] arr = generateRandomArray();
        int sum = 0;
        for (int salary : arr) {
            sum += salary;
        }
        System.out.println("Сумма трат за месяц составила " + sum + " рублей.");
    }

    public static void task2() {
        // task 2
        System.out.println("task 2");
        int[] arr = generateRandomArray();
        int max = arr[0];
        int min = arr[0];
        for (int salary : arr) {
            if (salary > max) {
                max = salary;
            }
        }
        for (int salary : arr) {
            if (salary < min) {
                min = salary;
            }
        }
        System.out.println("Минимальная сумма трат за день составила " + max + " рублей. Максимальная сумма трат за " +
                "день составила " + min + " рублей.");
    }

    public static void task3() {
        // task 3
        System.out.println("task 3");
        int[] arr = generateRandomArray();
        int sum = 0;
        int days = 30;
        double mid = 0;
        for (int salary : arr) {
            sum += salary;
            mid = sum / days;
        }
        System.out.println("Средняя сумма трат за месяц составила " + mid + " рублей.");
    }

    public static void task4() {
        // task 4
        System.out.println("task 4");
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        char size = (char) reverseFullName.length;
        for (int i = 0; i < size / 2; i++) {
            char temp = reverseFullName[i];
            reverseFullName[i] = reverseFullName[size - 1 - i];
            reverseFullName[size - 1 - i] = temp;
        }
        for (int i = 0; i < reverseFullName.length; i++) {
            System.out.print(reverseFullName[i]);
        }
    }
}
