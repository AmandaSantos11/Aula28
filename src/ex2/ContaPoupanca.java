package ex2;
public class ContaPoupanca extends Conta implements CalculoDeTributos{
    @Override
    public double calculoTributo() {
        return 0;
    }
}