package application;

import db.DB;
import db.DbException;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {
    public static void main(String[] args) {

        // DEMO: Recuperar dados de uma tabela

       Connection conn = null;

       /* System.out.println("✅ Conectado!");
        DB.closeConnection(); */

        // consulta sql
        Statement st = null;
        // resultado
        ResultSet rs = null;


        try {
            conn = DB.getConnection();

            // para instanciar o statement
            st = conn.createStatement();

            rs = st.executeQuery("select *from department");

            while (rs.next()){
                System.out.println(rs.getInt("Id") + ", " +
                        rs.getString("Name"));
            }

        } catch (SQLException e) {
            e.printStackTrace();
            // imprimir o StackTrace com as mensagens de erro
        }


        // é importante fechar os recursos para evitar vazamentos de memória

        finally {
            DB.closeResultSet(rs); // fechar o resultSet
            DB.closeStatement(st); // fechar o statement
            DB.closeConnection();
            System.out.println("\n✅ Conexão fechada!");
        }




    }
}
