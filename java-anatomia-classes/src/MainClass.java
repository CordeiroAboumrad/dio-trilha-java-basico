import java.text.MessageFormat;

public class MainClass {
    public static void main(String[] args) throws Exception {
        int ano = 2021;
        final String BR = "Brasil";
        String primeiroNome = "Jean";
        String segundoNome = "Aboumrad";
        int anoFabricacao = 2023;
        boolean simNao = true;

        anoFabricacao = 2020;
        System.out.println(anoFabricacao);
        
        System.out.println(MessageFormat.format("Hello, {0}!", BR));

        String nome = nomeCompleto(primeiroNome, segundoNome);
        System.out.println(nome);
        String resultado = BoletimEstudantil.aprovaReprova(9.5);

        System.out.println(resultado);
    }

    public static String nomeCompleto(String primeiroNome, String segundoNome) {

        return primeiroNome.concat(" ").concat(segundoNome);
    
    }

}
