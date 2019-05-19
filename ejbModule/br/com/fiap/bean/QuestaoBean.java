package br.com.fiap.bean;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;
import java.util.List;

import javax.ejb.Stateless;

import br.com.fiap.Avaliacao;
import br.com.fiap.model.Questao;

@Stateless(mappedName = "avaliacao/questoes")
public class QuestaoBean extends UnicastRemoteObject implements Avaliacao{

	private List<Questao> questoes = new ArrayList<Questao>();
	private static final long serialVersionUID = 1L;
	
	public QuestaoBean() throws RemoteException {
		super();
	}

	public List obterQuestoes(int codigoAvaliacao) {
		// TODO Auto-generated method stub
		return null;
	}

	public void removerEJB() {
		// TODO Auto-generated method stub
		
	}

}
