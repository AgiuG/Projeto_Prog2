/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package concessionaria.model.dao;

import concessionaria.model.bean.DadosVenda;
import java.util.ArrayList;


public interface IDadosVendaDAO {
    public ArrayList<DadosVenda> mostrarVendas();
    
}
