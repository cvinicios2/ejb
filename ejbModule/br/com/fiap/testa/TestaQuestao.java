package br.com.fiap.testa;


import java.rmi.Naming;
import java.util.List;

import br.com.fiap.Avaliacao;
import br.com.fiap.model.Questao;
import br.com.fiap.model.Resposta;


public class TestaQuestao {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) throws Exception {
		
		Avaliacao avaliacao = (Avaliacao) Naming.lookup("rmi://127.0.0.1:1099/avaliacao");

		
		List<Questao> lista = avaliacao.obterQuestoes(2);
		for (Questao questao : lista) {
			System.out.println(questao.getDescricao());
			List<Resposta> respostas = (List<Resposta>) questao.getRespostas();
			for (Resposta resp : respostas) {
				System.out.println(resp.getDescricao());
			}
		}
		
		}

}
