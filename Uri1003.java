import java.util.Scanner;
public class Uri1003{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        
        int A, B, SOMA;

        System.out.print("Valor A = ");
        A = teclado.nextInt();
        System.out.println("valor B = ");
        B = teclado.nextInt();

        SOMA = A + B;

        System.out.println("SOMA = " + SOMA);
    }
}