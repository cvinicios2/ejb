package br.com.fiap.rmi;

import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;
import br.com.fiap.bean.QuestaoBean;

public class RegistraQuestao {

	public static void main(String[] args) throws Exception {
		LocateRegistry.createRegistry(1090);
		Naming.rebind("avaliacao/questoes", new QuestaoBean());
		System.out.println("Questao registrada"); 
	}
}
