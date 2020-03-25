public class Child {
    private int children_ID;
    private String childFirstName;
    private String childLastName;
    private String childBirth;
    private String location;

    public Child() {
    }

    public Child(String childFirstName, String childLastName, String childBirth, String location) {
        this.childFirstName = childFirstName;
        this.childLastName = childLastName;
        this.childBirth = childBirth;
        this.location = location;
    }

    public int getChildren_ID() {
        return children_ID;
    }

    public void setChildren_ID(int children_ID) {
        this.children_ID = children_ID;
    }

    public String getChildFirstName() {
        return childFirstName;
    }

    public void setChildFirstName(String childFirstName) {
        this.childFirstName = childFirstName;
    }

    public String getChildLastName() {
        return childLastName;
    }

    public void setChildLastName(String childLastName) {
        this.childLastName = childLastName;
    }

    public String getChildBirth() {
        return childBirth;
    }

    public void setChildBirth(String childBirth) {
        this.childBirth = childBirth;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
