import java.util.Scanner;

public class Main {

    public static void taskA() {

        Scanner input = new Scanner(System.in);
        int count = input.nextInt();

        int[] tanks = new int[count];
        for (int i = 0; i < count; i++) {
            tanks[i] = input.nextInt();
        }
        boolean asc = true;
        for (int i = 1; i < tanks.length; i++) {
            if (tanks[i] < tanks[i-1]) {
                asc = false;
                break;
            }
        }
        if (asc) {
            System.out.println(tanks[tanks.length-1] - tanks[0]);
        } else {
            System.out.println(-1);
        }
    }

    public static void taskB() {

    }

    public static void main(String[] args) {
        taskA();
    }
}
