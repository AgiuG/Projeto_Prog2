/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package concessionaria.model.bean;

public class Venda {

    private Cliente cliente;
    private Carro carro;
    private String dataVenda;
    
    public Venda(){
        
    }

    public Venda(Cliente c, Carro carro) {
        this.cliente = c;
        this.carro = carro;
        this.dataVenda = java.time.LocalDate.now().toString();
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
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
        return "Venda{" + "cliente=" + cliente + ", carro=" + carro + ", dataVenda=" + dataVenda + '}';
    }

}
