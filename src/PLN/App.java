package PLN;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Introduce un número mayor que 0: ");

        Scanner scanner = new Scanner(System.in);

        long n = scanner.nextLong();
        scanner.close();

        PLN pln = new PLN(n);

        if (n< 0){
            System.out.println("Número erroneo, introduce un número mayor que 0");
    
        }
        else{
            pln.Pln(n);
        }
    }
}
