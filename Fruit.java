import java.util.Scanner;

public class Fruit extends Apple{
    public static void main(String[] args) {
        Fruit f = new Fruit();
        Apple a = new Apple();
        Mango m = new Mango();
        Scanner sc = new Scanner(System.in);

        int basket = 0;

        while (true) {
            System.out.println("1. Add a fruit");
            System.out.println("2. Exit");
            int choice1 = sc.nextInt();

            switch (choice1) {
                case 1:
                    System.out.println("Hi!!! Which fruit do you have (apple/mango)?");
                    String choice = sc.next();
                    if (choice.equals("apple")) {
                        a.apple();
                    } else if (choice.equals("mango")) {
                        m.mango();
                    } else {
                        System.out.println("Invalid choice.");
                    }
                    break;

                case 2:
                    System.out.println("Exit");
                    sc.close();
                    System.exit(0);
                    break;

                default:
                    System.out.println("Invalid choice.");
            }

            basket = a.a + m.b;
            System.out.println("The fruits in the basket are: " + basket);
        }
    }
}

class Apple extends Mango{
    int a = 0;

    public void apple() {
        a++;
        System.out.println("Thank you for your apple");
    }
}

class Mango {
    int b = 0;

    public void mango() {
        b++;
        System.out.println("Thank you for your mango");
    }
}
