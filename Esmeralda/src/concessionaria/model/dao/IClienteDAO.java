/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package concessionaria.model.dao;

import concessionaria.model.bean.Cliente;
import java.util.ArrayList;


public interface IClienteDAO {
    
    public void addCliente(Cliente p);
    public ArrayList<Cliente> mostrarClientes();
    public void deletarCliente(String cpf);
    public Cliente acharCliente(String cpf);
    public void alterarCliente(String cpf, String nome, int idade);
    public void quantidadeCarros(String cpf);
    
}
