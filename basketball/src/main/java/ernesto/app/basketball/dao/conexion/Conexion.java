
package ernesto.app.basketball.dao.conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Conexion {
    public Connection conn;
    public PreparedStatement pst;
    public ResultSet rs;
    
    public void conectar() throws SQLException{
        conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/basketball", "own_basketball", "welcome1");
    }
}
