package db;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection; // tem que ser do sql
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DB {

    // criar metodo para carregar as propriedades
    private static Properties loadProperties() {
        try (FileInputStream fs = new FileInputStream("db.properties")) {
            Properties props = new Properties();
            props.load(fs);
            return props;
        } catch (IOException e) {
            throw new DbException(e.getMessage());

        }

    }


    // metodo para conectar com o banco de dados
    private static Connection conn = null;

    public static Connection getConnection(){
        if (conn == null) {
            try {
                Properties props = loadProperties();
                String url = props.getProperty("dburl"); // pq esta definido no db.properties
                // para obter a conexao
                conn = DriverManager.getConnection(url, props);

            } catch (SQLException e) {
                throw new DbException(e.getMessage());
            }

        }
        return conn;
    }


    // metodo para fechar a conexao

    public static void closeConnection(){
        if (conn != null) {
            try{
                conn.close();
            } catch (SQLException e) {
                throw new DbException(e.getMessage());
            }

        }
    }



}
