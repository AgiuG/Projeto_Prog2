/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

public class Venda {

    private Cliente cliente;
    private Carro carro;
    private String dataVenda;
    
    public Venda() {
    	
    }

    public Venda(Cliente cliente, Carro c) {
        this.cliente = cliente;
        this.carro = c;
        this.dataVenda = java.time.LocalDate.now().toString();
    }

    public Cliente getPessoa() {
        return cliente;
    }

    public void setPessoa(Cliente pessoa) {
        this.cliente = pessoa;
    }

    public Carro getCarro() {
        return carro;
    }

    public void setCarro(Carro carro) {
        this.carro = carro;
    }

    public String getDataVenda() {
        return dataVenda;
    }

    public void setDataVenda(String dataVenda) {
        this.dataVenda = dataVenda;
    }

    @Override
    public String toString() {
        return "Venda{" + "pessoa=" + cliente + ", carro=" + carro + ", dataVenda=" + dataVenda + '}';
    }

}
