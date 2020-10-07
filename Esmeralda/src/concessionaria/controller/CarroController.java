/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package concessionaria.controller;

import concessionaria.model.bean.Carro;
import concessionaria.model.dao.CarroDAO;


public class CarroController {   
    
    
    public CarroController(){
        
    }
    
    public void addCarro(String nome, String cor, int numeroChassi, int potencia, int ano, double valor ){
        Carro c = new Carro();
        c.setNome(nome);
        c.setCor(cor);
        c.setNumeroChassi(numeroChassi);
        c.setPotenciaCv(potencia);
        c.setAno(ano);
        c.setValor(valor);
        
        CarroDAO cdao = new CarroDAO();
        cdao.addCarro(c);
    }
    
    public void mostrarCarro(){
        CarroDAO cdao = new CarroDAO();
        cdao.mostrarCarros();
    }
    
    public void atualizarCarro(String nome, String cor, int numeroChassi, int potencia, int ano, double valor){     
        
        CarroDAO cdao = new CarroDAO();
        cdao.alterarCarro(ano, nome, cor, ano, potencia, valor);
    }
    
    public void removerCarro(int chassi){
        CarroDAO cdao = new CarroDAO();
        cdao.deletarCarro(chassi);
    }
    
}
