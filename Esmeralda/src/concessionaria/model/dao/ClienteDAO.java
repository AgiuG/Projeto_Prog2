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

import concessionaria.model.bean.Cliente;
import javax.swing.JOptionPane;


public class ClienteDAO implements IClienteDAO {

    
    private Connection con = null;

    
    public ClienteDAO() {
        con = BancoConnection.getConnection();
    }

    @Override
    public void addCliente(Cliente c) {

        String sql = "INSERT INTO pessoa (cpf, rg, idade, nome) VALUES (?, ?, ?, ?)";

        try {
            con = BancoConnection.getConnection();
            
            PreparedStatement stmt = con.prepareStatement(sql);

            
            stmt.setString(1, c.getCpf());

           
            stmt.setString(2, c.getRg());
            stmt.setInt(3, c.getIdade());
            stmt.setString(4, c.getNome());

            
            stmt.execute();
            JOptionPane.showMessageDialog(null,"Cliente cadastrado no Banco de Dados", "AVISO", JOptionPane.DEFAULT_OPTION);
            //System.out.println("\nPessoa Adicionada no Banco de Dados\n");

           
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro ao cadastrar", "ERRO", JOptionPane.DEFAULT_OPTION);
            //System.out.println("Erro: " + ex);
        } finally {
            BancoConnection.closeConnection(con);
        }
    }

    @Override
    public ArrayList<Cliente> mostrarClientes() {

       
        List<Cliente> retorno = new ArrayList<>();

        
        String sql = "SELECT * FROM pessoa";

        try {
            con = BancoConnection.getConnection();
            
            PreparedStatement stmt = con.prepareStatement(sql);

            
            try (ResultSet rs = stmt.executeQuery()) {
                while (rs.next()) {
                    
                    
                    Cliente c = new Cliente();
                    
                    c.setCpf(rs.getString("cpf"));
                    c.setRg(rs.getString("rg"));
                    c.setIdade(rs.getInt("idade"));
                    c.setNome(rs.getString("nome"));
                    
                    retorno.add(c);
                   
                }
            }
            
            return (ArrayList<Cliente>) retorno;

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro ao listar", "ERRO", JOptionPane.DEFAULT_OPTION);
            //System.out.println("Erro: " + ex);
            return null;
        } finally {
            BancoConnection.closeConnection(con);
        }
    }

    @Override
    public void deletarCliente(String cpf) {

       
        String sql0 = "DELETE FROM venda WHERE id_pessoa = ?";
        String sql = "DELETE FROM pessoa WHERE cpf = ?";

        try {
            con = BancoConnection.getConnection();

            
            PreparedStatement stmt1 = con.prepareStatement(sql0);
            
            stmt1.setString(1, cpf);
            stmt1.executeUpdate();

            
            PreparedStatement stmt = con.prepareStatement(sql);
            
            stmt.setString(1, cpf);
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null,"Dados do Cliente deletados no Banco de Dados", "AVISO", JOptionPane.DEFAULT_OPTION);
            //System.out.println("\nCliente Deletada do Banco de Dados\n");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro ao deletar", "ERRO", JOptionPane.DEFAULT_OPTION);
            //System.out.println("Erro: " + ex);
        } finally {
            BancoConnection.closeConnection(con);
        }
    }

    @Override
    public Cliente acharCliente(String cpf) {

        Cliente c = new Cliente();
        String sql = "SELECT * FROM pessoa WHERE cpf = ?";

        try {
            con = BancoConnection.getConnection();
            PreparedStatement stmt = con.prepareStatement(sql);
           
            stmt.setString(1, cpf);
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                             
                c.setCpf(rs.getString("cpf"));
                c.setRg(rs.getString("rg"));
                c.setIdade(rs.getInt("idade"));
                c.setNome(rs.getString("nome"));
            }
            return c;

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro ao procurar", "ERRO", JOptionPane.DEFAULT_OPTION);
            //System.out.println("Erro: " + ex);
            return null;
        } finally {
            BancoConnection.closeConnection(con);
        }
    }

    @Override
    public void alterarCliente(String cpf, String nome, int idade) {

        String sql = "UPDATE pessoa SET nome = ?, idade = ? WHERE cpf = ?";

        try {
            con = BancoConnection.getConnection();
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, nome);
            stmt.setInt(2, idade);
            stmt.setString(3, cpf);
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null,"Dados do Cliente editados no Banco de Dados", "AVISO", JOptionPane.DEFAULT_OPTION);
            //System.out.println("\nCliente Editada no Banco de Dados\n");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro ao alterar dados", "ERRO", JOptionPane.DEFAULT_OPTION);
            //System.out.println("Erro: " + ex);
        } finally {
            BancoConnection.closeConnection(con);
        }
    }

    @Override
    public void quantidadeCarros(String cpf) {

        String sql = "SELECT v.id_venda, p.cpf || ' - ' || p.nome as COMPRADOR, c.numero_chassi || ' - ' || c.nome as carro, c.valor, v.data_venda  FROM venda as v, pessoa as p, carro as c where p.cpf = ? and c.numero_chassi = v.id_carro";

        try {
            con = BancoConnection.getConnection();
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, cpf);
            try (ResultSet rs = stmt.executeQuery()
            //System.out.println("\nTodas os carros:\n");
            ) {
                while (rs.next()) {
                    //System.out.println("Carro: " + rs.getString("carro"));
                }
                //System.out.print("\n");
            }
        } catch (SQLException ex) {
            //System.out.println("Erro: " + ex);
        } finally {
            BancoConnection.closeConnection(con);
        }
    }

}
