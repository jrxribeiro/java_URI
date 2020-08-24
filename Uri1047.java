import java.util.Scanner;
public class Uri1047{
    public static void main (String args[]){
        Scanner teclado = new Scanner(System.in);
        int hI, mI, hF, mF, dI, dF, dur, durH, durM;

        hI = teclado.nextInt();
        mI = teclado.nextInt();
        hF = teclado.nextInt();
        mF = teclado.nextInt();

        //vou converter as horas iniciais e finais para a unidade "minutos"
        dI = hI * 60 + mI;
        dF = hF * 60 + mF;
        // o raciocínio segue exatament o mesmo do exercício 1046
        dur = dF - dI;

        if (dur <= 0){
            dur = dur + 24*60; // somo 24h na unidade que estou trabalhando (no caso, minutos)
        }
        durH = dur/60;
        durM = dur%60;
        System.out.println("O JOGO DUROU "+durH+" HORA(S) E "+durM+" MINUTO(S)");

    }
} 