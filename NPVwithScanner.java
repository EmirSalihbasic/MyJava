package MyPackage;


import java.util.Scanner;

public class NPV {

    public static void main(String[]args){
        int I = 0;
        System.out.println("What is the initial Investment of the project? ");
        Scanner scanner = new Scanner(System.in);
        I = scanner.nextInt();

        int CF1 = 0;
        System.out.println("What is the first cash flow? ");
        CF1 = scanner.nextInt();

        int CF2 = 0;
        System.out.println("What is the second cash flow? ");
        CF2 = scanner.nextInt();

        int CF3 = 0;
        System.out.println("What is the third cash flow? ");
        CF3 = scanner.nextInt();

        int CF4 = 0;
        System.out.println("What is the fourth cash flow? ");
        CF4 = scanner.nextInt();


        int r = 0;
        System.out.println("What is the interest rate? (Write as an integer) ");
        r = scanner.nextInt();

        scanner.close();

        double NPV = -I + CF1/(1+r/100) + CF2/(1+r)*(1+r/100) + CF3/(1+r/100)*(1+r/100)*(1+r/100) + CF4/(1+r/100)*(1+r/100)*(1+r/100)*(1+r/100);
        System.out.println("NPV: " + NPV);




    }
}
