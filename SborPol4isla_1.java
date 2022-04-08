import java.util.Scanner;
public class SborPol4isla_1 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Въведете първо положително число до 100");
        int myNum1 = input.nextInt();

        System.out.println("Въведете второ положително число до 100");
        int myNum2 = input.nextInt();

        if (myNum1 < 0 || myNum2 < 0) {
            System.out.println("Числата трябва да са > 0 !!!");
        } else if (myNum1 >= 100 || myNum2 >=100) {
            System.out.println("Числата трябва да са до 100 !!!");
        } else {        {
            int result = myNum1 + myNum2;
            System.out.println("Сбора е: " + result);
        }

        }
    }
}

