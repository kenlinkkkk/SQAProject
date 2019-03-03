/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mysql;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.jdbc.PreparedStatement;

import java.sql.Connection;
/**;
 *
 * @author macos
 */
public class ConnectionSQL {
   private static Connection conn;
    /**
     *
     * @return
     * @throws SQLException
     */
    public static Connection instance() throws SQLException {
     String dbClass = "com.mysql.jdbc.Driver";
     String dbUrl ="jdbc:mysql://localhost:3306/dbclpm";

    try { 
        Class.forName(dbClass); 
        conn = (Connection) DriverManager.getConnection (dbUrl, "root", ""); 
    }catch(ClassNotFoundException e) {
        e.printStackTrace();
    }catch(SQLException e1) {
        e1.printStackTrace();
    }
    return conn;
  }
  
  public ResultSet excuteQuery(String query){
    try {
    	PreparedStatement pStatement = (PreparedStatement) conn.prepareStatement(query);
        ResultSet rs = pStatement.executeQuery(query);
         return rs;

    }catch(SQLException e) {
        e.printStackTrace();
           
    }
     return null;
  }
}
