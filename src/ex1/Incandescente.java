package ex1;
public class Incandescente implements Lampada{
    @Override
    public String ligar() {
        return "A lâmpada está ligada";
    }
    @Override
    public String desligar() {
        return "A lâmpada está desligada";
    }
}