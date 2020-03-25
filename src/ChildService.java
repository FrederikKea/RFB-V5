import java.sql.SQLException;

public class ChildService {
    ChildRepository cr = new ChildRepository();

    public void createChild(Child child) throws SQLException {
        cr.createChild(child.getChildFirstName(),child.getChildLastName(),child.getChildBirth(),child.getLocation());
    }

}
