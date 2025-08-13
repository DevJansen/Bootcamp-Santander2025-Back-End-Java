package model;

public class Conta {

    private int numeroAgencia;
    private int numeroConta;
    private String nomeCliente;
    private double saldoAtual;
    private int agenciaTransferencia;
    private int contaTransferencia;

    public void informeNumeroAgencia(int numeroAgencia){
        this.numeroAgencia = numeroAgencia;
    }

    public void informaNumeroConta(int numeroConta){
        this.numeroConta = numeroConta;
    }

    public  void informaNomeCliente(String nomeCliente){
        this.nomeCliente = nomeCliente;
    }

    public void depositar(double valorDeposito){
        this.saldoAtual += valorDeposito;
    }

    public double retornarSaldo(){
        return  this.saldoAtual;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public int getNumeroAgencia() {
        return numeroAgencia;
    }

    public int getAgenciaTransferencia() {
        return agenciaTransferencia;
    }

    public int getContaTransferencia() {
        return contaTransferencia;
    }

    public void setAgenciaTransferencia(int agenciaTransferencia) {
        this.agenciaTransferencia = agenciaTransferencia;
    }

    public void setContaTransferencia(int contaTransferencia) {
        this.contaTransferencia = contaTransferencia;
    }

    public void sacar(double valorSaque){
        if (this.saldoAtual < valorSaque){
            System.out.println("Saldo Insuficiente!");
            return;
        }
        this.saldoAtual -= valorSaque;
        System.out.println(" ");
        System.out.println("----- extrato do deposito -----");
        System.out.println("Nome: " + getNomeCliente());
        System.out.println("Numero Agencia: " + getNumeroAgencia());
        System.out.println("Numero da Conta: " + getNumeroConta());
        System.out.printf("Valor do saque: R$%.2f%n", valorSaque);
        System.out.printf("Saldo atual: R$%.2f%n", retornarSaldo());
        System.out.println("-------------------------------");
    }

    public void transferencia(double valorTransferencia){
        if (this.saldoAtual <= valorTransferencia){
            System.out.println("Saldo Insuficiente!");
            return;
        }
        this.saldoAtual -= valorTransferencia;
        System.out.println(" ");
        System.out.println("----- extrato do deposito -----");
        System.out.println("Nome: " + getNomeCliente());
        System.out.println("Numero Agência: " + getNumeroAgencia());
        System.out.println("Numero da Conta: " + getNumeroConta());
        System.out.printf("Valor do transferência: R$%.2f%n", valorTransferencia);
        System.out.println("Transferido para a agência: " + getAgenciaTransferencia());
        System.out.println("Transferido para a conta: " + getContaTransferencia());
        System.out.printf("Saldo atual: R$%.2f%n", retornarSaldo());
        System.out.println("-------------------------------");
    }
}
