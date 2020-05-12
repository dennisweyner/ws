/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package brokeralunos;

import java.util.LinkedList;
import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.swing.JOptionPane;



/**
 *
 * @author dennis
 */



public class BrokerAlunos {
    
    @WebMethod (operationName="RetornaUmAluno")
    @WebResult (name="UmAluno")
    public Aluno getUmAluno() {
        Aluno aluno = new Aluno();
        aluno.setId(1);
        aluno.setNome("Antonio");
        aluno.setMedia(7);
        aluno.setFaltas(10);
        return aluno;
    }
    
        @WebMethod (operationName="RetornaListaAluno")
        @WebResult (name="ListaAluno")
    public List<Aluno> getListAluno() {
        List<Aluno> listaAlunos = new LinkedList();
        Aluno aluno1 = new Aluno();
        aluno1.setId(1);
        aluno1.setNome("Antonio");
        aluno1.setMedia(7);
        aluno1.setFaltas(10);
        
        Aluno aluno2 = new Aluno();
        aluno2.setId(2);
        aluno2.setNome("Maria");
        aluno2.setMedia(8);
        aluno2.setFaltas(12);
        
        listaAlunos.add(aluno1);
        listaAlunos.add(aluno2);
        
        return listaAlunos;
    }
    
        @WebMethod (operationName="RetornaSituacaoAluno")
        @WebResult (name="Situacao")
    public String getSituacao(@WebParam(name="idAluno") int idAluno){    
        return null;        
    }catch (NullPointerException){
        JOptionPane.showMessageDialog(null, "NetDevices list is null - No devices saved", "Saving NetDevices", JOptionPane.INFORMATION_MESSAGE);
    }
}
