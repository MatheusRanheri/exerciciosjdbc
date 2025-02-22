import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoDB {

    private static Connection con = null;

    private static final String JDBC_DRIVER = "org.h2.Driver";
    private static final String DB_URL = "jdbc:h2:tcp://localhost/~/exemplo-jdbc";

    //  Database credentials
    private static final String USER = "matheus";
    private static final String PASS = "";


    private ConexaoDB() throws SQLException, ClassNotFoundException
    {
        registraDriver();
        createConnection();
    }

    private void registraDriver() throws ClassNotFoundException
    {
        Class.forName(JDBC_DRIVER);
    }

    private void createConnection() throws SQLException
    {
        con = DriverManager.getConnection(DB_URL,USER,PASS);
    }

    public static Connection getConexao()throws ClassNotFoundException,SQLException
    {
        if(con==null)
        {
            new ConexaoDB();
        }
        return con;
    }
}
