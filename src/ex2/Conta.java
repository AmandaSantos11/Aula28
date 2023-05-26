package ex2;
public class Conta {
    protected static double saldo;
    public Conta (){ //4 construtor
        this.saldo = 1200;
    }
    public void mostrarInformacoes(){   //7 switch case
        System.out.println("Informações da conta");
        System.out.println("Nome: Astolfo Afonso Souza"+"\n"+"Cpf: 482.904.451-09"+"\n"+"Agência: 4567"+"\n"+"Conta: 89231-2"+"\n"+"Saldo: R$"+saldo+"\n"+"----------------------");
        System.out.println("Será debitado os seguintes valores de cada bens: ");
        ContaPoupanca contaPoupanca = new ContaPoupanca();
        double tributoContaPoupanca = contaPoupanca.calculoTributo();
        System.out.println("Conta poupança: R$"+tributoContaPoupanca);
        ContaCorrente contaCorrente = new ContaCorrente();
        double tributoContaCorrente = contaCorrente.calculoTributo();
        System.out.println("Conta corrente: R$"+tributoContaCorrente);
        SeguroDeVida seguroDeVida = new SeguroDeVida();
        double tributoSeguroDeVida = seguroDeVida.calculoTributo();
        System.out.println("Seguro de vida: R$"+tributoSeguroDeVida+"\n"+"----------------------");
        System.out.println("Saldo atual: R$"+(saldo-tributoContaPoupanca-tributoContaCorrente-tributoSeguroDeVida));
        }
    }