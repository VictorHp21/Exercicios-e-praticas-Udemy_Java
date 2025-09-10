package application;

import db.DB;
import db.DbException;

import java.sql.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Main {
    public static void main(String[] args) {

        // DEMO: Inserir dados

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        Connection conn = null;

        PreparedStatement st = null;

        // inserção simples
        try {
            conn = DB.getConnection();

            /*
            st = conn.prepareStatement("" +
                    "INSERT INTO seller" +
                    "(Name, Email, BirthDate, BaseSalary, DepartmentId)" +
                    "VALUES" +
                    "(?, ?, ?, ?, ?)",
                    Statement.RETURN_GENERATED_KEYS); // ? = placeholders

            st.setString(1, "Hector"); // 1 = primeiro placeholder
            st.setString(2, "hector@gmail.com"); // 2 = segundo placeholder
            st.setDate(3, new java.sql.Date(sdf.parse("21/05/1990").getTime())); // 3 = terceiro placeholder
            st.setDouble(4, 4000.00); // 4 = quarto placeholder e assim por diante
            st.setInt(5, 2);

          */

            st = conn.prepareStatement("insert into department (Name) " +
                    "values ('D1'), ('D2')",
                    Statement.RETURN_GENERATED_KEYS);
            // inserindo mais de uma linha
            // 2 departamentos


            int rowsAffected = st.executeUpdate();

           if (rowsAffected > 0) {
               ResultSet rs = st.getGeneratedKeys();
               while (rs.next()){
                   int id = rs.getInt(1);
                   System.out.println("Done! Id: " + id);
               }
           } else {
               System.out.println("Error! No rows affected!");
           }

        } catch (SQLException e) {
            e.printStackTrace();
        } /* catch (ParseException e){
            e.printStackTrace();
        } */
        finally {
            DB.closeStatement(st);
            DB.closeConnection();
        }






    }
}
