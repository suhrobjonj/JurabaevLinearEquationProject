public class LinearEquation {
    private int x1;
    private int x2;
    private int y1;
    private int y2;
    private double slope;
    private double yInt;

    public LinearEquation(int x1, int x2, int y1, int y2) {
        this.x1 = x1;
        this.x2 = x2;
        this.y1 = y1;
        this.y2 = y2;
        slope = 0.0;
        yInt = 0;
    }

    public double distance() {
        return Math.round((Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2))) * 100) / 100.0;
    }

    public double slope() {
        return (double) (y2 - y1) / (x2 - x1);
    }

    public double yIntercept() {
        return Math.round((y2 + slope() * -x2) * 100) / 100.0;
    }

    public String equation() {

        return "y = " + (y2 - y1) + "/" + (x2 - x1) + "x + " + yIntercept();
    }

    public String coordinateForX(double x) {
        return "(" + x + ", " + (slope() * x + yIntercept()) + ")";
    }

    public String lineInfo() {
        String info = "\nThe two points are: (" + x1 + ", " + y1 +") and (" + x2 + ", " + y2 + ")";
        info += "\nThe equation of the line between these points is: " + equation();
        info += "\nThe slope of this line is: " + slope();
        info += "\nThe y-intercept of this line is: " + yIntercept();
        info += "\nThe distance between thse points is " + distance() + ("\n");

        return info + "\n";
    }

}
