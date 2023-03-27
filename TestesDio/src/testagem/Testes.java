package testagem;

import java.util.Scanner; 

public class Testes {
	public static void main(String[] args) {

		Scanner leitor = new Scanner(System.in);
        String ingredientes = leitor.next();
        leitor.close();
        String listaIngredientes[] = new String[3];
        
        // TODO: Crie a condição necessária para formatar e printar o texto da maneira pedida na saída
        listaIngredientes = ingredientes.split(";", 4);
        System.out.println(String.join(" ", listaIngredientes[0], listaIngredientes[1], listaIngredientes[2], listaIngredientes[3]));
		        
	}
}
