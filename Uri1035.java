import java.util.Scanner;
/*
Leia 4 valores inteiros A, B, C e D. A seguir,
se B for maior do que C (1) e
se D for maior do que A (2) e
a soma de C com D for maior que a soma de A e B (3) e
se C e D, ambos, forem positivos (4) e 
se a variável A for par (5)

escrever a mensagem "Valores aceitos", senão escrever "Valores nao aceitos"
*/

public class Uri1035{
    public static void main(String arg[]){
        Scanner teclado = new Scanner(System.in);
        int A,B,C,D;

        A = teclado.nextInt();
        B = teclado.nextInt();
        C = teclado.nextInt();
        D = teclado.nextInt();

        if ( (B > C) && (D > A) && (C + D > A + B) && (C>0 && D>0) && (A%2 == 0) ){
            System.out.println("Valores aceitos");
        }
        else{
            System.out.println("Valores nao aceitos");
        }
    }
}