import java.util.Scanner;
import br.com.newton.Rendimento;

import javax.management.relation.RelationNotification;

public class  main {
    public static void main(String[] args) {

        Rendimento rendimento = new Rendimento();
        Scanner  ler = new Scanner(System.in);

        double juros  = 1;

        System.out.print("Digite o valor de investimento: ");
        double investimento = ler.nextDouble();

        System.out.print("Digite o tempo: ");
        double tempo = ler.nextDouble();

        double lucro = (investimento+(investimento*(tempo/100)*juros));
        System.out.println("Total do rendimento: " + lucro + "R$");
    }
}
