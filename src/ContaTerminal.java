import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        String agencia, nomeCliente;
        int numeroDaConta;
        double saldo;

        System.out.println("Por favor, digite o número de sua Agência Bancária, com dígito separado por '-'.");
        agencia = sc.nextLine();

        System.out.println("Porfavor, diigte o número da sua conta.");
        numeroDaConta = sc.nextInt();

        System.out.println("Por favor, digite seu saldo.");
        saldo = sc.nextDouble();

    }
}
