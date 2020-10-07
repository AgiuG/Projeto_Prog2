/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package concessionaria.controller;

import concessionaria.model.bean.Cliente;
import concessionaria.model.dao.ClienteDAO;


public class ClienteController {
    
   
    
    public ClienteController(){
        
    }
    
    public void adicionarCliente(String nome, String cpf, String rg, int idade){
        
        Cliente c = new Cliente();       
        c.setNome(nome);
        
        c.setCpf(cpf);
        
        c.setRg(rg);
        
        c.setIdade(idade);
        
        ClienteDAO cdao = new ClienteDAO();
        cdao.addCliente(c);
        
    }
    
    public void atualizarCliente(String cpf, String nome, int idade){
         ClienteDAO cdao = new ClienteDAO();
         cdao.alterarCliente(cpf, nome, idade);
    }
    
    public void removerCliente(String cpf){
        ClienteDAO cdao = new ClienteDAO();
        cdao.deletarCliente(cpf);
    }
    
    public void listarClientes(){
        
    }
    
    
}
