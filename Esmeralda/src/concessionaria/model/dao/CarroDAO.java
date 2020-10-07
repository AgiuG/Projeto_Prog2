/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package concessionaria.model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import concessionaria.model.bean.Carro;
import javax.swing.JOptionPane;


public class CarroDAO implements ICarroDAO{

   
    private Connection con = null;

    
    public CarroDAO() {
        con = BancoConnection.getConnection();
    }

   
    @Override
    public void addCarro(Carro c) {
       

        String sql = "INSERT INTO carro (numero_chassi, nome, cor, ano, potencia, valor) VALUES (?, ?, ?, ?, ?, ?)";

        try {
            con = BancoConnection.getConnection();
            
            PreparedStatement stmt = con.prepareStatement(sql);

            
            stmt.setInt(1, c.getNumeroChassi());

           
            stmt.setString(2, c.getNome());
            stmt.setString(3, c.getCor());
            stmt.setInt(4, c.getAno());
            stmt.setInt(5, c.getPotenciaCv());
            stmt.setDouble(6, c.getValor());

           
            stmt.execute();
            JOptionPane.showMessageDialog(null,"Carro adicionado no Banco de Dados", "AVISO", JOptionPane.DEFAULT_OPTION);
            //System.out.println("\nCarro Adicionado no Banco de Dados\n");

           
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro ao cadastrar carro", "ERRO", JOptionPane.DEFAULT_OPTION);
            //System.out.println("Erro: " + ex);
        } finally {
            BancoConnection.closeConnection(con);
        }

    }

    
    @Override
    public ArrayList<Carro> mostrarCarros() {

        
        List<Carro> retorno = new ArrayList<>();

        
        String sql = "SELECT * FROM carro";
        //Listar apenas os carros disponivel para venda sem listar os que já foram vendidos.
        //String sql1 = "SELECT * from carro EXCEPT SELECT c.numero_chassi, c.nome, c.cor, c.ano, c.potencia, c.valor FROM carro as c, venda as v where v.id_carro_fk = c.numero_chassi";

        try {
            con = BancoConnection.getConnection();
            
            PreparedStatement stmt = con.prepareStatement(sql);

            
            try ( 
            
                    ResultSet rs = stmt.executeQuery()) {
                
                while (rs.next()) {
                    
                    
                    Carro c = new Carro();
                    
                    c.setNumeroChassi(rs.getInt("numero_chassi"));
                    c.setNome(rs.getString("nome"));
                    c.setCor(rs.getString("cor"));
                    c.setAno(rs.getInt("ano"));
                    c.setPotenciaCv(rs.getInt("potencia"));
                    c.setValor(rs.getDouble("valor"));
                    
                    retorno.add(c);
                    
                }
            }
            
            return (ArrayList<Carro>) retorno;

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro ao listar carros", "ERRO", JOptionPane.DEFAULT_OPTION);
            //System.out.println("Erro: " + ex);
            return null;
        } finally {
            BancoConnection.closeConnection(con);
        }
    }

    
    @Override
    public void deletarCarro(int chassi) {

       
        String sql1 = "DELETE FROM carro WHERE numero_chassi = ?";
        String sql2 = "DELETE FROM venda WHERE id_carro = ?";

        try {
            con = BancoConnection.getConnection();
            
            PreparedStatement stmt2 = con.prepareStatement(sql2);
            
            stmt2.setInt(1, chassi);
            stmt2.executeUpdate();

            
            PreparedStatement stmt1 = con.prepareStatement(sql1);
           
            stmt1.setInt(1, chassi);
            stmt1.executeUpdate();
            JOptionPane.showMessageDialog(null,"Carro deletado do Banco de Dados", "AVISO", JOptionPane.DEFAULT_OPTION);
            //System.out.println("\nCarro Deletado do Banco de Dados\n");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro ao deletar carro", "ERRO", JOptionPane.DEFAULT_OPTION);
           // System.out.println("Erro: " + ex);
        } finally {
            BancoConnection.closeConnection(con);
        }

    }

    
    @Override
    public Carro acharCarro(int chassi) {

        Carro c = new Carro();
        String sql = "SELECT * FROM carro WHERE numero_chassi = ?";

        try {
            con = BancoConnection.getConnection();
            PreparedStatement stmt = con.prepareStatement(sql);
            
            stmt.setInt(1, chassi);
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                            
                c.setNumeroChassi(rs.getInt("numero_chassi"));
                c.setNome(rs.getString("nome"));
                c.setCor(rs.getString("cor"));
                c.setAno(rs.getInt("ano"));
                c.setPotenciaCv(rs.getInt("potencia"));
                c.setValor(rs.getDouble("valor"));
            }
            return c;

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro ao procurar carro", "ERRO", JOptionPane.DEFAULT_OPTION);
            //System.out.println("Erro: " + ex);
            return null;
        } finally {
            BancoConnection.closeConnection(con);
        }
    }

    
    @Override
    public void alterarCarro(int chassi, String nome, String cor, int ano, int potencia, double valor) {

        String sql = "UPDATE carro SET nome = ?, cor = ?, ano = ?, potencia = ?, valor = ? WHERE numero_chassi = ?";

        try {
            con = BancoConnection.getConnection();
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, nome);
            stmt.setString(2, cor);
            stmt.setInt(3, ano);
            stmt.setInt(4, potencia);
            stmt.setDouble(5, valor);
            stmt.setInt(6, chassi);
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null,"Dados do Carro editado no Banco de Dados", "AVISO", JOptionPane.DEFAULT_OPTION);
            //System.out.println("\nCarro Editado no Banco de Dados\n");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro ao alterar dados", "ERRO", JOptionPane.DEFAULT_OPTION);
            //System.out.println("Erro: " + ex);
        } finally {
            BancoConnection.closeConnection(con);
        }
    }

}
