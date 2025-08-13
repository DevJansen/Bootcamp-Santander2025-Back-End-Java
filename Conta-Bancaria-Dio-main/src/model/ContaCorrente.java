package model;

public class ContaCorrente extends Conta{

    private boolean cartaoDeCredito = false;
    private double limiteCartaoCredito;

    public void extratoDeposito(){
        System.out.println("----- extrato do deposito -----");
        System.out.println("Nome: " + getNomeCliente());
        System.out.println("Numero Agencia: " + getNumeroAgencia());
        System.out.println("Numero da Conta: " + getNumeroConta());
        System.out.printf("Valor depositado: R$%.2f%n", retornarSaldo());
        System.out.printf("Saldo atual: R$%.2f%n", retornarSaldo());
        System.out.println("-------------------------------");
    }

}
