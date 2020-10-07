/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package concessionaria.model.dao;


import concessionaria.model.bean.Carro;
import java.util.ArrayList;


public interface ICarroDAO {
    public void addCarro(Carro c);
    public ArrayList<Carro> mostrarCarros();
    public void deletarCarro(int chassi);
    public Carro acharCarro(int chassi);
    public void alterarCarro(int chassi, String nome, String cor, int ano, int potencia, double valor);

    
}
