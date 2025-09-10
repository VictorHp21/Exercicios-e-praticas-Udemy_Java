package application;

import db.DB;
import db.DbException;

import java.sql.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {
    public static void main(String[] args) {

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        Connection conn = null;

        Statement st = null;
        ResultSet rs = null;
        PreparedStatement ps = null;

        // conexão
        try {
           conn = DB.getConnection();
            System.out.println("✅ Conectado!");

            //  inserindo dados na tabela alunos



            ps = conn.prepareStatement("INSERT INTO alunos (nome, data_nascimento) VALUES (?, ?)",
                    Statement.RETURN_GENERATED_KEYS);

            ps.setString(1, "Luana");
            ps.setDate(2, new java.sql.Date(sdf.parse("12/12/1995").getTime()));
            ps.addBatch();

            ps.setString(1, "Paulo");
            ps.setDate(2, new java.sql.Date(sdf.parse("11/02/2002").getTime()));
            ps.addBatch();

            ps.setString(1, "Edgar");
            ps.setDate(2, new java.sql.Date(sdf.parse("11/05/2007").getTime()));
            ps.addBatch();

            System.out.println("\n");
            System.out.println("✅ Alunos inseridos!\n");

            int[] linhasAfetadas = ps.executeBatch();

            // chaves geradas
            try (ResultSet rsch = ps.getGeneratedKeys()){
                while (rsch.next()){
                    System.out.println("✅ Matricula: " + rsch.getInt(1));
                }
            }

            System.out.println("Número de linhas inseridas: " + linhasAfetadas.length);


            // update para inserir salarios na tabela professores

            ps = conn.prepareStatement("UPDATE professores SET salario = ? WHERE codigo_professor = ?");

            ps.setDouble(1, 2000.00);
            ps.setInt(2, 5);
            ps.addBatch();

            ps.setDouble(1, 2500.00);
            ps.setInt(2, 6);
            ps.addBatch();

            ps.executeBatch();


            // delete para excluir aluno

            ps = conn.prepareStatement("DELETE FROM alunos WHERE matricula = ?");
            ps.setInt(1, 6);
            ps.executeUpdate();



            // consulta tabela alunos


            System.out.println("\n");
            System.out.println("Consulta tabela alunos: ");

            st = conn.createStatement();
            rs = st.executeQuery("SELECT * FROM alunos");

            while (rs.next()){
                Date data = rs.getDate("data_nascimento");
                System.out.println(rs.getInt("matricula") +
                        ", " + rs.getString("nome")
                + ", " + sdf.format(data));
            }

            System.out.println("\n");
            System.out.println("Consulta tabela aulas: ");

            rs = st.executeQuery("SELECT * FROM aulas");

            while (rs.next()){
                Date data = rs.getDate("Data_aula");
                System.out.println(rs.getString("Nome_Professor") +
                        ", " + rs.getString("Disciplina") +
                        ", " + rs.getInt("Número_da_aula") +
                        ", " + sdf.format(data));
            }

            System.out.println("\n");
            System.out.println("Consulta tabela professores: ");

            rs = st.executeQuery("SELECT * FROM professores");

            while (rs.next()){
                System.out.println(rs.getInt("codigo_professor") +
                        ", " +
                        rs.getString("nome")+
                                ", " +
                        rs.getInt("codigo_disciplina_ministrada") +
                                ", " + "R$ " +
                        rs.getDouble("salario")
                        );

            }








        } catch (DbException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            throw new DbException(e.getMessage());
        } catch (ParseException e) {
            throw new DbException(e.getMessage());
        } finally {


            // fechando conexão

            if (ps != null){
                try {
                    ps.close();
                } catch (SQLException e) {
                    throw new DbException(e.getMessage());
                }
            }

            DB.closeResultSet(rs);
            DB.closeStatement(st);
            DB.closeConnection();

            System.out.println("\nFechando conexão...");

            System.out.println("✅ Conexão fechada!");
        }







    }
}
