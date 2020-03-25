import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ChildRepository {

    private Connection con;

    public ChildRepository() {
        MySQLConnection msc = new MySQLConnection();
        this.con = msc.create();
    }

    public void createChild(String childFirstName, String childLastName, String childBirth, String location)throws SQLException {
        String sql ="INSERT INTO Children_Table(childFirstName, childLastName, childBirth, location)"+"VALUES (?,?,?,?)";
        PreparedStatement preparedStatement = con.prepareStatement(sql);
        preparedStatement.setString(1,childFirstName);
        preparedStatement.setString(2,childLastName);
        preparedStatement.setString(3,childBirth);
        preparedStatement.setString(4,location);
        preparedStatement.execute();
        preparedStatement.close();
    }
}
