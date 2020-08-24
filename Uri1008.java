import java.util.Scanner;
public class Uri1008{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        int nfuncional, horasTrabalhadas;
        float valorHora, salario;

        nfuncional = teclado.nextInt();
        horasTrabalhadas = teclado.nextInt();
        valorHora = teclado.nextFloat();

        salario = horasTrabalhadas * valorHora;

        //Saida

        System.out.println("NUMBER = " +nfuncional);
        System.out.printf("SALARY = U$ %.2f\n", salario);
    }

}