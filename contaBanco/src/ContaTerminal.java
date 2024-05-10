import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        int numeroConta;
        String agencia, nomeCliente;
        double saldoBancario;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite seu nome");
        nomeCliente = scanner.nextLine();
        System.out.println("Digite o número da conta");
        numeroConta = scanner.nextInt();
        System.out.println("Digite o número da agência");
        agencia = scanner.next();
        System.out.println("Digite o saldo da conta");
        saldoBancario = scanner.nextDouble();
        System.out.println("Olá " + nomeCliente + " obrigado por criar uma conta em nosso banco, sua agência é "+ agencia + ", conta " + numeroConta+  " e seu saldo "+ saldoBancario + " já está disponível para saque");
        scanner.close();
    }
}
