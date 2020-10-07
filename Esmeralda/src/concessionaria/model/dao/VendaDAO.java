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

import concessionaria.model.bean.Venda;
import javax.swing.JOptionPane;

public class VendaDAO implements IVendaDAO {

    private Connection con = null;

    public VendaDAO() {
        con = BancoConnection.getConnection();
    }

    @Override
    public void addVenda(Venda v) {
        String sql = "INSERT INTO venda (id_venda, data_venda, id_pessoa, id_carro) VALUES (DEFAULT, ?, ?, ?)";

        try {
            con = BancoConnection.getConnection();
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, v.getDataVenda());
            stmt.setString(2, v.getCliente().getCpf());
            stmt.setInt(3, v.getCarro().getNumeroChassi());
            stmt.execute();
            JOptionPane.showMessageDialog(null,"Venda cadastrada no Banco de Dados", "AVISO", JOptionPane.DEFAULT_OPTION);
            //System.out.println("\nVenda Adicionada no Banco de Dados\n");

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro ao cadastrar no Banco de Dados", "ERRO", JOptionPane.DEFAULT_OPTION);
            //System.out.println("Erro: " + ex);
        } finally {
            BancoConnection.closeConnection(con);
        }
    }

    @Override
    public void mostrarVendas() {

        String sql = "SELECT v.id_venda, p.cpf || ' - ' || p.nome as COMPRADOR, "
                + "c.numero_chassi || ' - ' || c.nome as carro, c.valor, v.data_venda  FROM venda as v, "
                + "pessoa as p, carro as c where p.cpf = v.id_pessoa and c.numero_chassi = v.id_carro";

        try {
            con = BancoConnection.getConnection();
            PreparedStatement stmt = con.prepareStatement(sql);
            try (ResultSet rs = stmt.executeQuery()) {
                System.out.println("\nTodas as Vendas\n");

                while (rs.next()) {
                    System.out.println("Numero da venda: " + rs.getInt("id_venda"));
                    System.out.println("Comprador: " + rs.getString("comprador"));
                    System.out.println("Carro: " + rs.getString("carro"));
                    System.out.println("Valor: " + rs.getDouble("valor"));
                    System.out.println("Data da venda: " + rs.getString("data_venda"));
                    System.out.print("\n");
                }
            }
        } catch (SQLException ex) {
            System.out.println("Erro: " + ex);
        } finally {
            BancoConnection.closeConnection(con);
        }
    }

    @Override
    public void mostrarVendasRealizadas() {
        String sql = "SELECT * FROM venda";

        try {
            con = BancoConnection.getConnection();

            PreparedStatement stmt = con.prepareStatement(sql);

            try (ResultSet rs = stmt.executeQuery()) {
                while (rs.next()) {
                    Venda venda = new Venda();
                }
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro ao listar", "ERRO", JOptionPane.DEFAULT_OPTION);
        } finally {
            BancoConnection.closeConnection(con);
        }
    }

}
