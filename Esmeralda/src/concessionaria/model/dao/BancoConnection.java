package concessionaria.model.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class BancoConnection {

    //Classe responsavel de abrir e fechar conexão do banco.
    private static final String DRIVER = "com.mysql.cj.jdbc.Driver";

    //ENDERECO:PORTA/NOME_BANCO
    private static final String URL = "jdbc:mysql://localhost:3306/concessionaria";

    //Usuario e senha do banco definido quando cria o banco.
    private static final String USER = "root";
    private static final String PASS = "";

    //Abre conexão com o banco.
    public static Connection getConnection() {
        try {
            Class.forName(DRIVER);
            return DriverManager.getConnection(URL, USER, PASS);
        } catch (ClassNotFoundException | SQLException ex) {
            JOptionPane.showMessageDialog(null,"Falha ao conectar com Banco de Dados", "ERRO", JOptionPane.DEFAULT_OPTION);
            //System.err.println("Erro: " + ex);
            return null;
        }
        //System.err.println("Erro: " + ex);
        
    }

    //Fecha conexão com o banco.
    public static void closeConnection(Connection con) {
        if (con != null) {
            try {
                con.close();
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null,"Falha ao fechar conexão com Banco de Dados", "ERRO", JOptionPane.DEFAULT_OPTION);
                //System.err.println("Erro: " + ex);
            }
        }
    }

}
