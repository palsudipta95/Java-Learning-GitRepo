import java.util.Scanner;

public class Inputs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an  Integer: ");
        int n = sc.nextInt();
        System.out.println("Integer Value: "+ n);

        System.out.print("Enter an Long Integer: ");
        long l = sc.nextLong();
        System.out.println("Long Value: "+ l);

        System.out.print("Enter an Float: ");
        float f = sc.nextFloat();
        System.out.println("Float Value: "+ f);

        System.out.print("Enter an Double: ");
        double d = sc.nextDouble();
        System.out.println("Double Value: "+ d);

        System.out.print("Enter an Character: ");
        char c = sc.next().charAt(0);
        System.out.println("Character Value: "+ c);

        System.out.print("Enter an Boolean: ");
        boolean b = sc.nextBoolean();
        System.out.println("Boolean Value: "+ b);

        System.out.println("Enter a String: ");
        String str = sc.next();
        System.out.println("String Value: " + str);

        System.out.println("Enter a Line: ");
        sc.nextLine();
        String line = sc.nextLine();
        System.out.println("You entered: " + line);

        sc.close();
    }
}
