package dio.springboot.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class SistemaMensagem implements CommandLineRunner {
	@Autowired
	private Remetente remetente;
	
	@Value("${testName: Jean}")
	private String testName;
	
	@Override
	public void run(String... args) throws Exception {
		System.out.println("Mensagem enviada por: " + remetente.getNome()
				+ "\nEmail: " + remetente.getEmail()
				+ "\nTelefones de contato: " + remetente.getTelefones());
		System.out.println("Seu cadastro foi aprovado.");
		System.out.println("Teste nome: " + testName);
	}
}
