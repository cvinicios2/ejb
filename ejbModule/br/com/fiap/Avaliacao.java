package br.com.fiap;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

public interface Avaliacao extends Remote {

   List obterQuestoes(int codigoAvaliacao) throws RemoteException;
   void removerEJB() throws RemoteException;
}
