package br.com.fiap.bean;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;
import java.util.List;

import javax.ejb.Remote;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import br.com.fiap.Avaliacao;
import br.com.fiap.model.Questao;

@Stateless(mappedName = "avaliacao")
@Remote(Avaliacao.class)
public class QuestaoBean extends UnicastRemoteObject implements Avaliacao {

	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("avaliacao");
	EntityManager em = entityManagerFactory.createEntityManager();

	private List<Questao> questoes = new ArrayList<Questao>();
	private static final long serialVersionUID = 1L;

	public QuestaoBean() throws RemoteException {
		super();
	}

	public List obterQuestoes(int codigoAvaliacao) throws RemoteException {

		Query query = em.createQuery("SELECT q FROM Questao q");
		return query.getResultList();
	}

	public void removerEJB() throws RemoteException {
		// TODO Auto-generated method stub

	}

}
