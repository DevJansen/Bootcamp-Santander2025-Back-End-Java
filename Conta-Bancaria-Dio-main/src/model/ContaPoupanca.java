package model;

public class ContaPoupanca extends Conta{

    private double percentual = 2.5;
    private double rendimento;


    public void aplicarRendimento(){
        double saldo = retornarSaldo();
        rendimento = saldo * (percentual / 100);
        depositar(rendimento);
    }
    public double valorRendimento(){
        return rendimento;
    }

    public void extratoDeposito(){
        System.out.println("----- extrato do deposito -----");
        System.out.println("Nome: " + getNomeCliente());
        System.out.println("Numero Agencia: " + getNumeroAgencia());
        System.out.println("Numero da Conta: " + getNumeroConta());
        System.out.printf("Valor depositado: R$%.2f%n", (retornarSaldo() - rendimento));
        System.out.printf("Valor do rendimento: R$%.2f%n", rendimento);
        System.out.printf("Saldo atual: R$%.2f%n", retornarSaldo());
        System.out.println("-------------------------------");
    }

}
