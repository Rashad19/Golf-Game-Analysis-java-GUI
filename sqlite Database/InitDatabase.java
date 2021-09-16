

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.SQLException;


public class InitDatabase {


  public static void createNewDatabase() {


    try{
      Class.forName("org.sqlite.JDBC");
      Connection conn = DriverManager.getConnection("jdbc:sqlite:golfstats.db");
      if (conn != null) {
        DatabaseMetaData meta = conn.getMetaData();
        System.out.println("The driver name is " + meta.getDriverName());
        System.out.println("A new database has been created.");
      }

    } catch (Exception e) {
      System.out.println(e.getMessage());
    }
  }

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    createNewDatabase();
  }
}