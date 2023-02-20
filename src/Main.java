import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final int x = 10;
        final int y = 30;
        final int z = 50;
        Scanner in = new Scanner(System.in);

        System.out.print("Введите размер массива:   ");
        int sz = in.nextInt();

        System.out.println("Введите целочисленные данные массива:");
        int[] arr = new int[sz];
        for (int i = 0; i < sz; ++i) {
            System.out.print("array[" + i + "] = ");
            arr[i] = in.nextInt();
            if (x == arr[i] || y == arr[i] || z == arr[i]) {
                System.out.println("  Данное значение имеется в константах");
            }
        }
    }
}