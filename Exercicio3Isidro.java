import java.util.Scanner;
public class Exercicio3Isidro{
    public stati coid main(String args{}){
        Scanner teclado = new Scanner(System.in);

        float salMinimo;
        float consumoKw;
        float valor1Kw;
        float valorconta;
        float valorDesconto;

    //entrada
    System.out.println("Digite o valor do slario Minimo");
    salMinimo = teclado.nextFloat();
    System.out.println("Digite o consumo em Kw da residencia");
    consumoKw = teclado.nextFloat();

    // processamento - determinar o valor de 1Kw e o valor da conta
    valor1Kw = salMinimo / 700.0f;
    valorConta = valor1Kw * consumoKw;
    valorDesconto = valorConta * 0.9;

    // saída no formato R$
    System.out.printf("Valor de 1 Kw R$ %.2f\n", valor1Kw);
    system.out.printf("Valor bruto   R$ %.2f\n", valorConta);
    system.out.printf("Valor c/ desc R$ %.2f\n", valorDesconto)

    }

}