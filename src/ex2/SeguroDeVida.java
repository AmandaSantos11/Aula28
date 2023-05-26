package ex2;
public class SeguroDeVida extends Conta implements CalculoDeTributos{
    @Override
    public double calculoTributo() {
        return 42;
    }
}