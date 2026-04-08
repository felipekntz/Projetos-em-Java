
import java.util.Scanner;

public class App{
    public static void main(String[] args) throws Exception {

        // scanner
        Scanner sc = new Scanner(System.in);
        // criando classe(Aluno), objeto(a1), e instanciando eles(new Aluno)
        Aluno a1 = new Aluno();

        //Atribuição de valores
        System.out.println("Escreva o nome do aluno");
        a1.nome = sc.nextLine();
        System.out.println("Insira a cidade do aluno");
        a1.cidade = sc.nextLine();
        System.out.println("Agora digite a idade");
        a1.idade = sc.nextInt();

        //saida de dados no terminal
        System.out.println(a1.nome+" tem "+a1.idade+" anos e mora em " +a1.cidade+".");

    }
}
