import java.util.Scanner;
public class Uri1007{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        int a;
        int b;
        int c;
        int d;
        int DIFERENCA;

        a = teclado.nextInt();
        b = teclado.nextInt();
        c = teclado.nextInt();
        d = teclado.nextInt();

        DIFERENCA = (a * b - c * d);

        System.out.println("DIFERENCA = " +DIFERENCA);

    }
        
}
    