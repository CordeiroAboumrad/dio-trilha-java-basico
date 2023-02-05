import java.text.MessageFormat;
public class TiposVariaveis {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        byte idade = 33;
        short ano = 2023;
        int cep = 20000123;
        long cpf = 18976532452l;
        final float PI = 3.14f;
        double salario = 12500.50;

        System.out.println(salario);

        short numeroCurto = 1;
        int numeroNormal = numeroCurto;
        short numeroCurto2 = (short) numeroCurto;
        System.out.println(numeroCurto2);
        System.out.println(PI);

        final String BR = "Brasil";
        int anoFabricacao = 2023;
        boolean simNao = true;

        int numero = 5;
        System.out.println(-numero);

        anoFabricacao = 2020;
        System.out.println(anoFabricacao);
        
        System.out.println(MessageFormat.format("Hello, {0}!", BR));



        // Operadores
        numero = 8;
        numero += 2;
        System.out.println(numero);
        System.out.println(numero);

        boolean booleano = false;
        System.out.println(!booleano);

        // Operadores Ternários
        int a = 5;
        int b = 6;

        String comparisonResult = a == b ? "verdadeiro" : "falso";
        System.out.println(comparisonResult);

        // Operadores Relacionais
        String nomeUm = "Jean";
        String nomeDois = "Jean";
        String nomeTres = new String("jean");

        System.out.println(nomeUm == nomeDois);
        System.out.println(nomeUm == nomeTres);
        System.out.println(nomeUm.equals(nomeTres));
        System.out.println(nomeUm.equalsIgnoreCase(nomeTres));

        // Operadores Lógicos
        boolean opLog = false || true;
        System.out.println(opLog);
    }
}
