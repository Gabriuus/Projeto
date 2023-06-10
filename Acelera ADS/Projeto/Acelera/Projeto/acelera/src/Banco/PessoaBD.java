package Banco;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList; 

import Dados.Pessoa;

public class PessoaBD {
    
    Connection connection = null;

    public boolean inserirPessoa(Pessoa pessoa) 
    {
        System.out.println("Inserir Pessoa");
       
        //connection = Conexao.getInstance().getConnection();
        connection = (Connection) Conexao.getInstance();
        
        System.out.println("Conectado e pronto para inserir");
        Statement stmt = null;
        try 
        {
            stmt = connection.createStatement();

            String sql = "INSERT INTO pets(nome,sobrenome,telefone,email,senha,cpf) "
            		   + "VALUES ('"+ pessoa.getNome() + "','" + pessoa.getSobrenome() + "', '" 
            		   + pessoa.getTelefone() + "', '" + pessoa.getEmail() + "')" + pessoa.getCpf() + "')" + pessoa.getNascimento() + "')";
            System.out.println("SQL: " + sql);
            stmt.executeUpdate(sql);
            
            return true;
        }
        catch (SQLException e)
        {
            System.out.println(e.getMessage());
            return false;
        }
        finally
    {
            try 
            {
                stmt.close();
                connection.close();
            }
            catch (SQLException e)
            {
                System.out.println("Erro ao desconectar" + e.getMessage());
            }
        }
    } 
}
        