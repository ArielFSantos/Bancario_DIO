package bancario_dio;

import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Por favor, digite o numero da Agencia: ");
        String agencia = scanner.nextLine();

        System.out.print("Por favor, digite o numero da Conta: ");
        int numero = scanner.nextInt();
        scanner.nextLine(); 

        System.out.print("Por favor, digite o nome do Cliente: ");
        String nomeCliente = scanner.nextLine();

        System.out.print("Por favor, digite o saldo da Conta: ");
        double saldo = scanner.nextDouble();

        
        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agncia é " + agencia
                + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.");

        scanner.close();
    }
}
