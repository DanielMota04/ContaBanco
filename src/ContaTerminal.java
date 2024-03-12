import java.util.Scanner;
public class ContaTerminal {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int numero;
        String agencia;
        String nomeCliente;
        double saldo;

        System.out.println("Bem vindo ao nosso banco!\n");

        System.out.println("Por favor, digite o número da agência:");
        numero = leitor.nextInt();
        System.out.println("Por favor, digite o seu saldo:");
        saldo = leitor.nextDouble();
        System.out.println("Por favor, digite a sua agência:");
        agencia = leitor.next();
        System.out.println("Por favor, digite seu nome:");
        nomeCliente = leitor.next();

        System.out.println("Olá , " + nomeCliente +
                "! obrigado por criar uma conta em nosso banco! " +
                "Sua agência é " + agencia + ", conta " + numero +
                " e seu saldo " + saldo + " já está disponível para saque");

    }
}