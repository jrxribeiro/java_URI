import java.util.Scanner;
public class Uri1074{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        int X;
        int N;

        N= teclado.nextInt();
        for (int cont=1; cont <=N; cont ++){

        X = teclado.nextInt();

        if (X == 0 )
        System.out.println("NULL");

        if (( X %2== 0 ) && ( X > 0 ))
        System.out.println("EVEN POSITIVE");

        if (( X %2== 1 ) && ( X > 0 ))
        System.out.println("ODD POSITIVE");

        if (( X %2== -1 ) && ( X < 0))
        System.out.println("EVEN NEGATIVE");

        if (( X %2== -1 ) && ( X < 0 ))
        System.out.println("ODD NEGATIVE");
        }
    }
}