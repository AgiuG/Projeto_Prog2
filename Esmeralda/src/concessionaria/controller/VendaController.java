/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package concessionaria.controller;

import concessionaria.model.bean.Carro;
import concessionaria.model.bean.Cliente;
import concessionaria.model.bean.Venda;
import concessionaria.model.dao.CarroDAO;
import concessionaria.model.dao.ClienteDAO;
import concessionaria.model.dao.VendaDAO;


public class VendaController {
    
    public VendaController(){
        
    }
    
    public void realizarVenda(String cpf, int chassi){
        ClienteDAO pdao = new ClienteDAO();
        Cliente p = pdao.acharCliente(cpf);

        CarroDAO cdao = new CarroDAO();
        Carro c = cdao.acharCarro(chassi);

        Venda v = new Venda(p, c);
        
        VendaDAO vdao = new VendaDAO();
	vdao.addVenda(v);
        
    }
    
}
