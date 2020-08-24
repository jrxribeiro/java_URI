import java.util.Scanner;
public class Exercicio3{
    public static void mains(String args[]){
        Scanner teclado;
        teclado = new Scanner(System.in);

        float a;
        int b;
        float valorkw;
        float valoraPagar;
        float valorcomDesconto;

        System.out.println("Digite o valor do salário minimo");
        a = teclado.nextFloat();
        System.out.println("quantos kw foram gastos?");
        b = teclado.nextInt();

        valorkw  ((a/7) /100);
        valoraPagar  valorkw *b;
        valorcomDesconto = valoraPagar * (90f /100);

        //Saida
        System.out.println("o valor em reais de cada Kw é " + valorkw);
        System.out.println("o valor em reais a ser pago " + valoraPagar);
        System.out.println("o novo valor a ser pago com desconto de 10% é" + valorcomdesconto);
    }

}