import java.util.Scanner;
public class Tabuada {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite um valor inteiro entre 1 e 10: ");
        int valor = entrada.nextInt();

        if (valor < 1 || valor > 10) {
            System.out.println("Valor inválido.");
        } else {
            System.out.println("Tabuada do " + valor + ":");

            for (int i = 1; i <= 10; i++) {
                int resultado = valor * i;
                System.out.println(valor + " x " + i + " = " + resultado);
            }
        }
        entrada.close();
    }
}
