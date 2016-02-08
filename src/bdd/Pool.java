package bdd;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import bdd.Database;

public class Pool {
    
    private static List<Connection> connections;
    
    public Pool() throws SQLException {
        connections = new ArrayList<Connection>();
        initializeConnectionPool();
    }
    
    private void initializeConnectionPool() throws SQLException {
        //Until the pool not full, add connection
        while(!connectionPoolIsFull()) {
            connections.add((Connection) Database.getConnection());
        }
    }
    
     private synchronized boolean connectionPoolIsFull() {
        final int maxPoolSize = 10;
        return !(connections.size() < maxPoolSize);
    }


    public static synchronized Connection getConnectionFromPool() {
        if(connections.size() > 0) {
            Connection connection = (Connection) connections.get(0);
            connections.remove(0);
            return connection;
        }
        return null;
    }

    public static synchronized void returnConnectionToPool(Connection connection) {
        connections.add(connection);
    }
}
