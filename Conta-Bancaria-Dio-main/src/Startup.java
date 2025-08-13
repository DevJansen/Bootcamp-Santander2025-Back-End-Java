import model.ContaCorrente;
import model.ContaPoupanca;

import java.util.Scanner;

public class Startup {
    public static void main(String[] args) {

        System.out.println("***** Banco Digital Dio *****");
        System.out.println(" ");

        Scanner sc = new Scanner(System.in);

        System.out.println("Depositar       (opção 1)");
        System.out.println("Sacar           (opção 2)");
        System.out.println("Transferir      (opção 3)");
        int menu = sc.nextInt();

        if(menu == 1){
            System.out.println("--- Tipo de Conta ---");
            System.out.println("1 - Conta poupança");
            System.out.println("2 - Conta Corrente");
            int tipoConta = sc.nextInt();
            sc.nextLine();

            if(tipoConta == 1){
                ContaPoupanca cp = new ContaPoupanca();

                System.out.print("Digite o seu nome: ");
                String nome = sc.nextLine();
                cp.informaNomeCliente(nome);
                System.out.print("digite a sua agência: ");
                int numeroAgencia = sc.nextInt();
                cp.informeNumeroAgencia(numeroAgencia);
                System.out.print("digite a sua conta: ");
                int numeroConta = sc.nextInt();
                cp.informaNumeroConta(numeroConta);
                System.out.print("digite o valor do depósito: ");
                double valor = sc.nextDouble();
                cp.depositar(valor);
                System.out.println(" ");
                cp.aplicarRendimento();
                cp.extratoDeposito();
                return;
            } else if (tipoConta == 2) {
                ContaCorrente cc = new ContaCorrente();

                System.out.print("Digite o seu nome: ");
                String nome = sc.nextLine();
                cc.informaNomeCliente(nome);
                System.out.print("digite a sua agência: ");
                int numeroAgencia = sc.nextInt();
                cc.informeNumeroAgencia(numeroAgencia);
                System.out.print("digite a sua conta: ");
                int numeroConta = sc.nextInt();
                cc.informaNumeroConta(numeroConta);
                System.out.print("digite o valor do depósito: ");
                double valor = sc.nextDouble();
                cc.depositar(valor);
                System.out.println(" ");
                cc.extratoDeposito();
                return;
            }else {
                System.out.println(" ");
                System.out.println("Opção digitada não existe!");
            }


        } else if (menu == 2) {
            sc.nextLine();
            ContaCorrente cc1 = new ContaCorrente();
            System.out.print("Digite o seu nome: ");
            String nome = sc.nextLine();
            cc1.informaNomeCliente(nome);
            System.out.print("Digite a sua agência: ");
            int numeroAgencia = sc.nextInt();
            cc1.informeNumeroAgencia(numeroAgencia);
            System.out.print("digite a sua conta: ");
            int numeroConta = sc.nextInt();
            cc1.informaNumeroConta(numeroConta);
            System.out.println(" ");
            cc1.depositar(250);
            System.out.printf("Seu saldo é R$%.2f%n", cc1.retornarSaldo());
            System.out.print("digite o valor do saque: ");
            double valor = sc.nextDouble();
            cc1.sacar(valor);
            return;

        } else if (menu == 3) {

            sc.nextLine();
            ContaCorrente cc1 = new ContaCorrente();
            System.out.print("Digite o seu nome: ");
            String nome = sc.nextLine();
            cc1.informaNomeCliente(nome);
            System.out.print("Digite a sua agência: ");
            int numeroAgencia = sc.nextInt();
            cc1.informeNumeroAgencia(numeroAgencia);
            System.out.print("digite a sua conta: ");
            int numeroConta = sc.nextInt();
            cc1.informaNumeroConta(numeroConta);
            cc1.depositar(250);
            System.out.print("digite a agência para a transferência: ");
            int agenTrans = sc.nextInt();
            cc1.setAgenciaTransferencia(agenTrans);
            System.out.print("digite a conta para a transferência: ");
            int contaTrans = sc.nextInt();
            cc1.setContaTransferencia(contaTrans);
            System.out.printf("Seu saldo é R$%.2f%n", cc1.retornarSaldo());
            System.out.print("digite o valor da transferência: ");
            double valor = sc.nextDouble();
            cc1.sacar(valor);
            return;

        }else {
            System.out.println(" ");
            System.out.println("Opção digitada não existe!");
        }

        sc.close();
    }
}