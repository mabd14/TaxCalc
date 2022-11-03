import java.util.Scanner;
public class TaxCalc {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your income? ");
        double salary = scanner.nextDouble();

        //write your code here to calculate the tax of the variable salary, make sure you try multiple values
//         to test your work

        if(salary > 50_000) {
            double bracket1 = 0.05* 15_000;
//            System.out.println("Bracket 1: " + bracket1);
            double bracket2 = 0.2 * 20_000;
//            System.out.println("Bracket 2: " + bracket2);
            double topBracket = salary - 50_000;
//            System.out.println("topBracket is: " + topBracket);
            double bracket3 = topBracket * 0.4;
//            System.out.println("Bracket 3: " + bracket3);
            double tax = bracket1 + bracket2 + bracket3;
            System.out.printf("£" + "%.2f", tax);
        }
        else if(salary > 30_000 & salary <= 50_000){
            double bracket1 = 0.05 * 15_000;
            double topBracket = salary - 30_000;
//            System.out.println(topBracket);
            double bracket2 = 0.2 * topBracket;
            double tax = bracket1 + bracket2;
            System.out.printf("£" + "%.2f", tax);
        }
        else if(salary > 15_000 & salary <= 30_000) {
            double topBracket = salary - 15_000;
            double tax = 0.05 * topBracket;
            System.out.printf("£" + "%.2f", tax);
        }
        else if(salary <= 15_000) {
            System.out.println("£0.00");
        }


    }

}




