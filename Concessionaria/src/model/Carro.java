
package model;

public class Carro {

    private int numeroChassi;
    private String nome;
    private String cor;
    private int ano;
    private int potenciaCv;
    private double valor;

    public Carro() {
    }

    public Carro(int numero_chassi, String nome, String cor, int ano, int potenciaCv, double valor) {
        this.numeroChassi = numero_chassi;
        this.nome = nome;
        this.cor = cor;
        this.ano = ano;
        this.potenciaCv = potenciaCv;
        this.valor = valor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getNumeroChassi() {
        return numeroChassi;
    }

    public void setNumeroChassi(int numero_chassi) {
        this.numeroChassi = numero_chassi;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public int getPotenciaCv() {
        return potenciaCv;
    }

    public void setPotenciaCv(int potencia_cv) {
        this.potenciaCv = potencia_cv;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "Carro{" + "numeroChassi=" + numeroChassi + ", nome=" + nome + ", cor=" + cor + ", ano=" + ano + ", potenciaCv=" + potenciaCv + ", valor=" + valor + '}';
    }

}
