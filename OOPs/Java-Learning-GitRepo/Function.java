import java.util.Scanner;

public class Function {

    public int add(int a, int b){
        return a + b;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first number");
        int a = sc.nextInt();
        System.out.println("Enter the second number");
        int b = sc.nextInt();

        Function f = new Function();
        int sum = f.add(a, b);
        System.out.println("The sum is: " + sum);
    }
}
