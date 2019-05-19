package br.com.fiap.bean;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;
import java.util.List;

import javax.ejb.Remote;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import br.com.fiap.Avaliacao;
import br.com.fiap.model.Questao;
import br.com.fiap.model.Resposta;

@Stateless(mappedName = "avaliacao")
@Remote(Avaliacao.class)
public class QuestaoBean extends UnicastRemoteObject implements Avaliacao{
	
	@PersistenceContext(unitName="avaliacao")
	EntityManager em;

	private List<Questao> questoes = new ArrayList<Questao>();
	private static final long serialVersionUID = 1L;
	
	public QuestaoBean() throws RemoteException {
		super();
	}

	public List obterQuestoes(int codigoAvaliacao) throws RemoteException {
		
		System.out.println("metodo obter");
//		em.createQuery("select q from questao where codigo=:codigoAvaliacao");
//		System.out.println(((Query) em).setParameter("codigoAvaliacao", codigoAvaliacao).getResultList().size());
//		return ((Query) em).setParameter("codigoAvaliacao", codigoAvaliacao).getResultList();
		
		Questao q = new Questao();
		q.setCodigoAvaliacao(1);
		q.setDescricao("questao1");
		q.setId(1);
		
		Resposta r = new Resposta();
		r.setDescricao("resposta1");
		r.setId(1);
		r.setQuestao(q);
		
		q.setRespostaSelecionada(r);
		
		Questao q2 = new Questao();
		q2.setCodigoAvaliacao(2);
		q2.setDescricao("questao2");
		q2.setId(2);
		
		Resposta r2 = new Resposta();
		r2.setDescricao("resposta12");
		r2.setId(2);
		r2.setQuestao(q);
		
		q2.setRespostaSelecionada(r2);

		
		List<Questao> l = new ArrayList<Questao>();
		l.add(q);
		l.add(q2);
		return l;
		
	}

	public void removerEJB() throws RemoteException {
		// TODO Auto-generated method stub
		
	}


	

}
