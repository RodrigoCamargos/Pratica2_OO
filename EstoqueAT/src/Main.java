import java.util.Scanner;
import br.com.newton.Estoque;

public class Main {
    public static void main(String[] args) {

        Estoque estoque = new Estoque();
        Scanner ler = new Scanner(System.in);
        int qtdAtual=1000;
        int qtdMinima = 50;


        System.out.println("Informe a quantidade do produto a ser baixado: ");
        int qtde = ler.nextInt();

        if (qtde > qtdAtual) {
            System.out.println("Estoque Insuficiente: ");

        } else
            qtdAtual = (qtdAtual - qtde);

        System.out.println("Estoque restante: " + qtdAtual);

        if (qtdAtual <= qtdMinima)
            System.out.println("Favor repor o estoque");



    }
}