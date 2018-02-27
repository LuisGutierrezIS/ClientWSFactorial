package clientwsfactorial;

import java.util.Scanner;


public class ClientWSFactorial {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("Escribe un número para calcular el factorial: ");
        int h=scan.nextInt();
        System.out.println(operation(h));        
    }

    private static Integer operation(int n) {
        wsfactorial.WSFactorial_Service service = new wsfactorial.WSFactorial_Service();
        wsfactorial.WSFactorial port = service.getWSFactorialPort();
        return port.operation(n);
    }
    
}
