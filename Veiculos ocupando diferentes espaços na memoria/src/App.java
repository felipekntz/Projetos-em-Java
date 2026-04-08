
import java.util.Scanner;

public class App {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        Veiculos hb20 = new Veiculos();
        Veiculos vectra = new Veiculos();

        System.out.println("Insira o modelo do vectra:");
        vectra.modelo = sc.nextLine();
        System.out.println("Escreva a marca:");
        vectra.marca = sc.nextLine();
        System.out.println("a velocidade");
        vectra.velocidade = sc.nextInt();

        System.out.println("Agora insira o modelo do HB20:");
        hb20.modelo = sc.next();
        System.out.println("insira a marca:");
        hb20.marca = sc.next();
        System.out.println("agora a velocidade");
        hb20.velocidade = sc.nextInt();

        System.out.println("Vectra da marca " + vectra.marca + " modelo " + vectra.modelo + " chega até " + vectra.velocidade + " Km/h.");

        System.out.println("HB20 da marca " + hb20.marca + " modelo " + hb20.modelo + " chega até " + hb20.velocidade + " Km/h.");

        sc.close();

    }
}
