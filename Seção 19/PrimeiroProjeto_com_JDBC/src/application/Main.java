package application;

import db.DB;
import db.DbException;

import java.sql.Connection;

public class Main {
    public static void main(String[] args) {
       Connection conn = DB.getConnection();
        System.out.println("✅ Conectado!");
        DB.closeConnection();

      /*  try {
            Connection conn = DB.getConnection();
            System.out.println("✅ Conectado!");
            DB.closeConnection();
        } catch (DbException e) {
            e.printStackTrace();
        }

*/

    }
}
