package ex1;
import java.util.Scanner;
public class FabricaLampada {
    public static Scanner digite = new Scanner(System.in);
    public static int escolhaDoUsuario;
    public static String interagirComUsuario(){
        System.out.println("Você deseja criar qual tipo de lâmpada?");
        System.out.println("1-Incandescente | 2-Fluorescente");
        escolhaDoUsuario = digite.nextInt();
        return construir(escolhaDoUsuario);
    }
    public static String construir(int escolhaDoUsuario){
        switch (escolhaDoUsuario){
            case 1:
                return "Lâmpada incandescente criada";

            case 2:
                return "Lâmpada fluorescente criada";

            default:
                if (escolhaDoUsuario != 1 && escolhaDoUsuario !=2){
                    System.out.println("Opção Inválida");
                    System.exit(0);
            }
                return "Opção inválida";
        }
    }
    public static void interagirComLampada(){
        System.out.println("Você deseja:");
        System.out.println("1-Ligar lâmpada | 2-Desligar lâmpada | 3-Sair");
        switch (digite.nextInt()){
            case 1:
                if(escolhaDoUsuario==1){
                    Incandescente lamapadaIncandescente = new Incandescente();
                    System.out.println(lamapadaIncandescente.ligar());
                }
                else if (escolhaDoUsuario==2){
                    Fluorescente lampadaFluorescente = new Fluorescente();
                    System.out.println(lampadaFluorescente.ligar());
                }
                break;

            case 2:
                if(escolhaDoUsuario==1){
                    Incandescente lamapadaIncandescente = new Incandescente();
                    System.out.println(lamapadaIncandescente.desligar());
                }
                else if (escolhaDoUsuario==2){
                    Fluorescente lampadaFluorescente = new Fluorescente();
                    System.out.println(lampadaFluorescente.desligar());
                }
                break;

            case 3:
                System.exit(0);

            default:
                System.out.println("Opção inválida");
                System.exit(0);
        }
    }
}