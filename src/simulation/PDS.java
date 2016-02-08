package simulation;

import ihm.*;
import bdd.Database;
import java.sql.SQLException;

public class PDS {

    public static void main(String[] args) throws SQLException {
        Database db = new Database();
        db.getConnection();
        new Simulation();
    }
    
}
