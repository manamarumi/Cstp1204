import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter the number : ");
        int num = scanner.nextInt();

        try {
            String result = factorial(num);
            System.out.println(result);
        } catch (NegativeException e) {
            System.out.println(e.getMessage());
        }
    }

    public static String factorial(int num) throws NegativeException {
        String result = "";        
        if (num < 0) {
            throw new NegativeException("Please enter positive number.");
        } else {
            for (int i = num; i >= 1; i--) {
                if (i == 1)
                    result += String.valueOf(i);                
                else
                    result += String.valueOf(i) + " * ";
            }
        }
        return result;
    }
}