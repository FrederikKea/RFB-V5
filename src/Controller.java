import java.sql.SQLException;
import java.util.Scanner;

public class Controller {

    ChildService cs = new ChildService();

    public void createChild() throws SQLException {
        //Child child = new Child();
        Scanner sc = new Scanner(System.in);

        System.out.println("Fornavn på barn: ");
        String firstName = sc.nextLine();
        //child.setChildFirstName(firstName);

        System.out.println("Efternavn på barn");
        String lastName = sc.nextLine();
        //child.setChildFirstName(lastName);

        System.out.println("Fødselsdag på barn");
        String birth = sc.nextLine();
        //child.setChildFirstName(birth);

        System.out.println("Stue på barn");
        String location = sc.nextLine();
        //child.setChildFirstName(location);
        Child child = new Child(firstName,lastName,birth,location);
        cs.createChild(child);
    }
}

/*
    Lagde kun den sidste value ind i db som var location, som kom til at ligge på childFirstName i db;
    Derfor lavede jeg en nye contructer med de input som skulle ligges ind.
    public void createChild() throws SQLException {
        Child child = new Child();
        Scanner sc = new Scanner(System.in);

        System.out.println("Fornavn på barn: ");
        String firstName = sc.nextLine();
        child.setChildFirstName(firstName);

        System.out.println("Efternavn på barn");
        String lastName = sc.nextLine();
        child.setChildFirstName(lastName);

        System.out.println("Fødselsdag på barn");
        String birth = sc.nextLine();
        child.setChildFirstName(birth);

        System.out.println("Stue på barn");
        String location = sc.nextLine();
        child.setChildFirstName(location);

        cs.createChild(child);
    }
*/