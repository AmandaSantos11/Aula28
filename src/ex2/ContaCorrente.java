package ex2;
public class ContaCorrente extends Conta implements CalculoDeTributos{
    @Override
    public double calculoTributo() {
        return (saldo*0.01);
    }
}