import java.util.Scanner;

public class calculadora {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        double numero1, numero2, resultado;
        char operacao;

        System.out.println("Digite o primeiro número:");
        numero1 = teclado.nextDouble();

        System.out.println("Digite qual será a operação: adição (+), subtração (-), multiplicação (*) ou divisão (/)");
        operacao = teclado.next().charAt(0);

        System.out.println("Digite o segundo número:");
        numero2 = teclado.nextDouble();

        switch (operacao) {
            case '+': resultado = numero1 + numero2;
            System.out.print("\nO resultado da adição é: " + resultado);
            break;

            case '-': resultado = numero1 - numero2;
            System.out.print("\nO resultado da subtração é: " + resultado);
            break;

            case '*': resultado = numero1 * numero2;
            System.out.print("\nO resultado da multiplicação é: " + resultado);
            break;

            case '/': 
            if (numero2 != 0) {
                resultado = numero1 / numero2;
                System.out.print("\nO resultado da divisão é: " + resultado);
            } else {
                System.out.println("O segundo número de uma divisão (divisor) não pode ser 0!");
            }
            break;

            default: 
            System.out.print("Digite apenas +, -, * ou / para realizar o cálculo.");
        }
        
        teclado.close();

    }
}