import java.util.Scanner;

public class ExchangeMoney {
    public static void main(String[] args) {
        Double vnd,usd;
        final double RATE = 23000;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your money in VND!");
        vnd = scanner.nextDouble();
        usd = vnd/RATE;

        System.out.println("Your money in USD: " + usd);
    }
}
