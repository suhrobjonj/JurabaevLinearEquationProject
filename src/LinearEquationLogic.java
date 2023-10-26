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
        newLine();
        System.out.print("\nWould you like to enter another pair of coordinates? y/n: ");
        String option = myScanner.nextLine();

        while (option.equals("y")) {
            newLine();
            System.out.print("\nWould you like to enter another pair of coordinates? y/n: ");
            option = myScanner.nextLine();
            }

            System.out.println("Thank you for using the slope calculator, goodbye!");

    }

    private void newLine() {
        System.out.print("Enter coordinate 1: ");
        String point1 = myScanner.nextLine();
        System.out.print("Enter coordinate 2: ");
        String point2 = myScanner.nextLine();

        int x1 = parseX(point1);
        int x2 = parseX(point2);
        int y1 = parseY(point1);
        int y2 = parseY(point2);

        // initialize student instance variable
        line = new LinearEquation(x1, x2, y1, y2);
        System.out.print(line.lineInfo());

        if (x1 != x2) {
            System.out.print("Enter a value for x: ");
            double x = myScanner.nextDouble();
            System.out.println("\nThe point on this line is " + line.coordinateForX(x));
            myScanner.nextLine();
        }
    }

    private int parseX(String point) {
        return Integer.parseInt(point.substring(1,point.indexOf(",")));
    }

    private int parseY(String point) {
        return Integer.parseInt(point.substring(point.indexOf(",") + 2, point.indexOf(")")));
    }


}
