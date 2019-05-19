package br.com.fiap.bean;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;
import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import br.com.fiap.Avaliacao;
import br.com.fiap.model.Questao;

@Stateless(mappedName = "avaliacao/questoes")
public class QuestaoBean extends UnicastRemoteObject implements Avaliacao{
	
	@PersistenceContext(unitName="avaliacao")
	EntityManager em;

	private List<Questao> questoes = new ArrayList<Questao>();
	private static final long serialVersionUID = 1L;
	
	public QuestaoBean() throws RemoteException {
		super();
	}

	public List obterQuestoes(int codigoAvaliacao) {
		em.createQuery("from Chamado ch where ch.descricao=:descricao");
		em.setParameter("descricao", "nonono").getResultList();
		return null;
	}

	public void removerEJB() {
		// TODO Auto-generated method stub
		
	}

}
