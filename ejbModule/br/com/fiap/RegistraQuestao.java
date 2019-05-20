package br.com.fiap;

import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;

import javax.naming.InitialContext;

public class RegistraQuestao {

	public static void main(String[] args) throws Exception {
		System.setProperty("java.rmi.server.hostname","127.0.0.1");
		LocateRegistry.createRegistry(1099);
		Naming.rebind("avaliacao", new QuestaoBean());
		System.out.println("Questao registrada"); 

	}
}
