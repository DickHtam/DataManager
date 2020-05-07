import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MySqlConnection {

    private Connection connection;
    private final String URL = "jdbc:mysql://localhost:3306/";
    private final String TIME_ZONE_CONFIG = "?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
    private String dbname = "mysqlTestConection";
    private String user = "laroma";
    private String password = "Laroma23";

    public MySqlConnection(){
        setConnection();
    }

    public void setConnection(){
        try {
            this.connection = DriverManager.getConnection(URL + this.dbname + TIME_ZONE_CONFIG, this.user, this.password);
        } catch (SQLException throwables) {
            System.out.println("Didn't connect with default options");

            throwables.printStackTrace();
        }
    }
    public void setConnection(String dbname, String user, String password) {
        try {
            this.connection = DriverManager.getConnection(URL + dbname, user, password);
        } catch (SQLException throwables) {
            System.out.println("Didn't connect to " + dbname + " user: " +  user);
            throwables.printStackTrace();
        }
    }

    public String getDbname() {
        return dbname;
    }

    public void setDbname(String dbname) {
        this.dbname = dbname;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public void setPassword(String password) {
        this.password = password;
    }


    public Connection getConnection() {
        return connection;
    }

    public String getUrl() {
        return URL;
    }

    public String getUser() {
        return user;
    }

    public String getPassword() {
        return password;
    }

    public void closeMySqlConnection(){
        try {
            this.connection.close();
        } catch (SQLException throwables) {
            System.out.println("Connection didn't close.");
            throwables.printStackTrace();
        }
    }





}
