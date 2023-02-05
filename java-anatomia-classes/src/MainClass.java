
public class MainClass {
    public static void main(String[] args) throws Exception {
        
        String resultado = BoletimEstudantil.aprovaReprova(9.5);

        System.out.println(resultado);

        String primeiroNome = "Jean";
        String segundoNome = "Aboumrad";

        String nome = nomeCompleto(primeiroNome, segundoNome);
        System.out.println(nome);
    }

    public static String nomeCompleto(String primeiroNome, String segundoNome) {

        return primeiroNome.concat(" ").concat(segundoNome);
    
    }

}
