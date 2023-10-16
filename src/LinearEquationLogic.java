import java.util.Scanner;

public class LinearEquationLogic {
    private LinearEquation line;
    private Scanner myScanner;


    public LinearEquationLogic() {
        line = null; // will initialize from user input
        myScanner = new Scanner(System.in);
    }


    // method that gets called which starts the program
    public void start() {
        getLineInfo();

    }


    // private helper method
    private void getLineInfo() {
        System.out.print("Enter coordinate 1: ");
        String cord1 = myScanner.nextLine();
        System.out.print("Enter coordinate 2: ");
        String cord2 = myScanner.nextLine();

        int x1 = Integer.parseInt(cord1.substring(1,cord1.indexOf(",")));
        int x2 = Integer.parseInt(cord2.substring(1,cord2.indexOf(",")));
        int y1 = Integer.parseInt(cord1.substring(cord1.indexOf(",") + 2, cord1.indexOf(")")));
        int y2 = Integer.parseInt(cord2.substring(cord2.indexOf(",") + 2, cord2.indexOf(")")));

        // initialize student instance variable
        line = new LinearEquation(x1, x2, y1, y2);
        System.out.print(line.lineInfo());

        System.out.print("Enter a value for x: ");
        double x = myScanner.nextDouble();
        myScanner.nextLine();
        System.out.println("\nThe point on this line is " + line.coordinateForX(x));
        System.out.println("\nWould you like to enter another pair of coordinates? y/n: ");
        String option = myScanner.nextLine();
        while (option.equals("y")) {
            System.out.print("Enter a value for x: ");
            x = myScanner.nextDouble();
            myScanner.nextLine();
            System.out.println("\nThe point on this line is " + line.coordinateForX(x));
            System.out.println("\nWould you like to enter another pair of coordinates? y/n: ");
            option = myScanner.nextLine();
        }
    }


}
