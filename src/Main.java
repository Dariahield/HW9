import java.text.DecimalFormat;
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
        int[] arr = generateRandomArray();
        System.out.print(Arrays.toString(arr) + " ");
        System.out.println();
        int sum = 0;
        for (int element : arr) {
            sum += element;
        }
        System.out.println("«Сумма трат за месяц составила " + sum + " рублей»");
    }

    public static void task2() {
        int[] arr = generateRandomArray();
        System.out.println();

        int maxArr = 0;
        int minArr = 200000;
        for (int i = 0; i < arr.length; i++) {
            final int arr1 = arr[i];
            if (arr1 > maxArr) {
                maxArr = arr1;
            } else if (arr1 < minArr) {
                minArr = arr1;

            }
        }
        System.out.println("«Минимальная сумма трат за день составила " + minArr + " рублей. Максимальная сумма " +
                "трат за день составила " + maxArr + " рублей». ");
    }


    public static void task3() {
        int[] arr = generateRandomArray();
        System.out.println();
        int sum = 0;
        for (int element : arr) {
            sum += element;
        }

        System.out.println("«Средняя сумма трат за месяц составила " + sum / (double) arr.length + " рублей».");
    }

    public static void task4() {
        int[] arr = generateRandomArray();
        System.out.println();
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int h = reverseFullName.length - 1; h >= 0; h--) {

            System.out.print(reverseFullName[h] + " ");
        }
    }
}