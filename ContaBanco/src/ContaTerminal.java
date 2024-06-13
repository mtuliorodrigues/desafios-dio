import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Por favor digite o número da conta: ");
        int conta = scan.nextInt();
        System.out.print("Por favor digite o número da Agência: ");
        String agencia = scan.next();
        System.out.print("Por favor digite o nome do cliente: ");
        String nomeCliente = scan.next();
        System.out.print("Por favor digite o saldo inicial: ");
        double saldo = scan.nextDouble();
        System.out.printf("Olá [".concat(nomeCliente + "], ") + "obrigado por criar uma conta em nosso banco, sua agência é [" + agencia + "], conta [" + conta + "] e seu saldo [" + saldo + "] já está disponível.");

    }
}