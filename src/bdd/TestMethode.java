
package bdd;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class TestMethode {
   
    public void ajouterFonction(int id, String title) throws SQLException{
        Connection db = Database.getConnection();
        String req = "INSERT INTO FUNCTIONS(ID_FUNCTIONS, TITLE) VALUES (?, ?)";
        PreparedStatement ordre = db.prepareStatement(req);
        ordre.setInt(1, id);
        ordre.setString(2, title);
        ordre.executeUpdate();
        ordre.close();
        db.close();
    }
    
    public List<String> selectFonction(int id) throws SQLException{
        List<String> lfonction = new ArrayList<String>();
        Connection db = Database.getConnection();
        Statement ordre = db.createStatement();
        String req = "SELECT id_functions, title FROM FUNCTIONS WHERE id_functions = " + id;
        ResultSet rs = ordre.executeQuery(req);
        while (rs.next()) {
            String fonction;
            fonction = rs.getString("title");
            fonction += rs.getString("id_functions");
            lfonction.add(fonction); }
        rs.close();
        ordre.close(); 
        db.close();
        System.out.println(lfonction);
        return lfonction;
    }
}
