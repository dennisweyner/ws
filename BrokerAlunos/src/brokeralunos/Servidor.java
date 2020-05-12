/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package brokeralunos;

import javax.xml.ws.Endpoint;

/**
 *
 * @author dennis
 */
public class Servidor {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       BrokerAlunos broker = new BrokerAlunos();
       String url = "http://localhost:8080/brokeralunos";
        System.out.println("Broker rodando em:"+ url);
        Endpoint.publish(url, broker);
    }
}
