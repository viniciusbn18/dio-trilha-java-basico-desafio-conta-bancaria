import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        String agencia, nomeCliente;
        int numeroDaConta;
        double saldo;

        System.out.println("Por favor digite seu nome.");
        nomeCliente = sc.nextLine();

        System.out.println("Por favor, digite o número de sua Agência Bancária, com dígito separado por '-'.");
        agencia = sc.nextLine();

        System.out.println("Porfavor, diigte o número da sua conta.");
        numeroDaConta = sc.nextInt();

        System.out.println("Por favor, digite seu saldo.");
        saldo = sc.nextDouble();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco. Sua agência é "
                + agencia + " , conta " + numeroDaConta + " e seu saldo de R$ " + saldo + " já está disponível!");
    }
}
