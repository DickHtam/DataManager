import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBController {

    MySqlConnection mySqlConnection;
    Statement statement;
    ResultSet resultSet;

    public DBController() {

    }

    public MySqlConnection getMySqlConnection() {
        return mySqlConnection;
    }

    public void setMySqlConnection(MySqlConnection mySqlConnection) {
        this.mySqlConnection = mySqlConnection;
    }

    public Statement getStatement() {
        return statement;
    }

    public void setStatement(Statement statement) {
        this.statement = statement;
    }

    public ResultSet getResultSet() {
        return resultSet;
    }

    public void setResultSet(ResultSet resultSet) {
        this.resultSet = resultSet;
    }


    public void executeQuery(String query){
        try {
            this.resultSet = this.statement.executeQuery(query);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

}

