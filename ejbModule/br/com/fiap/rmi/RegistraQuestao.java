package br.com.fiap.rmi;

import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;

import javax.naming.InitialContext;

import br.com.fiap.bean.QuestaoBean;

public class RegistraQuestao {

	public static void main(String[] args) throws Exception {
		System.setProperty("java.rmi.server.hostname","127.0.0.1");
		LocateRegistry.createRegistry(1099);
		Naming.rebind("avaliacao", new QuestaoBean());
		System.out.println("Questao registrada"); 

	}
}
