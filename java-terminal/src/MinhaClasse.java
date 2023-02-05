import java.text.MessageFormat;
import java.util.Scanner;
import java.util.Locale;

public class MinhaClasse {
    public static void main(String[] args) throws Exception {
        System.out.println("Olá, estou sendo executado pelo terminal!");

        String nome = args[0];
        String sobrenome = args[1];
        int idade = Integer.valueOf(args[2]);
        double altura = Double.valueOf(args[3]);

        System.out.println(MessageFormat.format("Olá, me chamo {0} {1}, tenho {2} anos e {3} de altura.", nome, sobrenome, idade, altura));

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        System.out.println("Digite seu nome:");
        nome = scanner.nextLine();

        System.out.println("Digite a sua idade:");
        idade = scanner.nextInt();

        System.out.println(MessageFormat.format("O seu nome é {0} e sua idade é {1} anos.", nome, idade));

    }
}
