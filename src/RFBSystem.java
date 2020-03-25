import java.sql.SQLException;
import java.util.Scanner;

public class RFBSystem {

    public static void main(String[] args) throws SQLException {
        boolean isRunning = true;
        Controller controller = new Controller();


        while(isRunning) {


            System.out.println("\n 1. Opret barn \n 2. Read csv file \n 3. " +
                    "Se kurser \n 4. Administrer studerende \n 5. Afslut");

            Scanner sc = new Scanner(System.in);
            int menuChoice = sc.nextInt();

            //Start menuen
            switch(menuChoice) {
                case 1:
                    System.out.println("hey");
                    controller.createChild();
                    break;
                case 2:

                    break;
                case 3:

                    break;
                case 4:

                    break;
                case 5:
                    isRunning = false;
                    break;
                default:
                    System.out.println("Der skete en fejl.");
                    isRunning = false;
                    break;
            }
        }
    }
}