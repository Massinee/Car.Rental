/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dados;

import classes.Clientes;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author maria
 */
public class ClientesDados {
    
    public static List<Clientes> lstClientes= new ArrayList();
    
    public static Clientes buscarClientesPeloCpfOuCnpjExato(String cpfOuCnpj, List<Clientes> lstClientes){
        
        for (Clientes cli : lstClientes){
            if(cli.getCPFcnpj().equals(cpfOuCnpj)){
                return cli;
            }
        }
        return null;
    }
    
    public static List<Clientes> buscarClienteParcial(String busca, List<Clientes> lstClientes, boolean caseSensitive){
        List<Clientes> clientesTemp = new ArrayList();
        
        for(Clientes cli : lstClientes){
            
            if(caseSensitive){
                
                if(cli.getNome().trim().contains(busca.trim()) || cli.getCPFcnpj().replace(".", "").replace("-", "").replace("/", "").contains(busca.replace(".", "").replace("-", "").replace("/", ""))){
                    clientesTemp.add(cli);
                }
            }else{
                
                if(cli.getNome().replace(" ", "").trim().toLowerCase().contains(busca.toLowerCase().replace(" ", "").trim()) || cli.getCPFcnpj().replace(".", "").replace("-", "").replace("/", "").contains(busca.replace(".", "").replace("-", "").replace("/", ""))){
                    clientesTemp.add(cli);
                }
            }
        }
        return clientesTemp;
    }
}
