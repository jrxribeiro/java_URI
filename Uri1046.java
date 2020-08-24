import java.util.Scanner;
public class Uri1046{
    public static void main (String args[]){
        Scanner teclado = new Scanner (System.in);
        int hI,hF,dJogo;

        hI = teclado.nextInt();
        hF = teclado.nextInt();

        dJogo = hF - hI;
        if (dJogo <= 0){
               DJogo =  DuracaoJogo + 24;
            }
System.out.println("O JOGO DUROU " + DuracaoJogo + " HORA(S)");
    }
}