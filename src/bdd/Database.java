package bdd;
import java.sql.*;

/** Représente la base de données videos. Fournit une connexion à
 * cette base (via <code>getConnection()</code>.
 *
 * @author plasse
 */
public class Database {

  protected static final String DRIVER_NAME = "oracle.jdbc.OracleDriver";
  protected static final String URL = "jdbc:oracle:thin:@//localhost:1521/orcl";
  
  protected static final String USER = "pds";
  protected static final String PASSWORD = "tony";

  public enum SortOrder { ASC, DESC; }

  static {
    // Chargement du pilote
    // Ne doit avoir lieu qu'une seule fois
    try {
      Class.forName(DRIVER_NAME).newInstance();
      System.out.println("*** Driver loaded.");
    }
    catch (ClassNotFoundException e) {
      System.err.println("*** ERROR: Driver " + DRIVER_NAME + " not found");
    }
    catch (InstantiationException e) {
      System.err.println("*** ERROR: Impossible to create an instance of " + DRIVER_NAME);
      System.err.println(e.getMessage());
    }
    catch (IllegalAccessException e) {
      System.err.println("*** ERROR: Impossible to create an instance of " + DRIVER_NAME);
      System.err.println(e.getMessage());
    }
  }

  /** Fournit une connexion à la base de données.
   * Ne fait pas appel à un pool de connexion, même si
   * cela est envisageable plus tard
   * (ne changerait rien à l'appel de la méthode)
   * @throws java.sql.SQLException
   */
  public static Connection getConnection() throws SQLException {
    return DriverManager.getConnection(URL, USER, PASSWORD);
  }

}
