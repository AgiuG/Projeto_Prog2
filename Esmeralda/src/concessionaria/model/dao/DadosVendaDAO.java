/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package concessionaria.model.dao;

import concessionaria.model.bean.DadosVenda;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class DadosVendaDAO implements IDadosVendaDAO {

    private Connection con = null;

    public DadosVendaDAO() {
        con = BancoConnection.getConnection();
    }

    @Override
    public ArrayList<DadosVenda> mostrarVendas() {
        List<DadosVenda> retorno = new ArrayList<>();

        String sql = "SELECT v.id_venda, p.cpf || ' - ' || p.nome as COMPRADOR, "
                + "c.numero_chassi || ' - ' || c.nome as carro, c.valor, v.data_venda  FROM venda as v, "
                + "pessoa as p, carro as c where p.cpf = v.id_pessoa and c.numero_chassi = v.id_carro";

        try {
            con = BancoConnection.getConnection();

            PreparedStatement stmt = con.prepareStatement(sql);

            try (ResultSet rs = stmt.executeQuery()) {
                while (rs.next()) {

                    DadosVenda dv = new DadosVenda();

                    dv.setId(rs.getInt("id_venda"));
                    dv.setComprador(rs.getString("comprador"));
                    dv.setCarro(rs.getString("carro"));
                    dv.setValor(rs.getDouble("valor"));
                    dv.setData(rs.getString("data_venda"));

                    retorno.add(dv);

                }
            }

            return (ArrayList<DadosVenda>) retorno;

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao listar", "ERRO", JOptionPane.DEFAULT_OPTION);
            //System.out.println("Erro: " + ex);
            return null;
        } finally {
            BancoConnection.closeConnection(con);
        }

    }

}
