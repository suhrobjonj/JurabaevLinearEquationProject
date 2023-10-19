public class LinearEquation {
    private int x1;
    private int x2;
    private int y1;
    private int y2;

    public LinearEquation(int x1, int x2, int y1, int y2) {
        this.x1 = x1;
        this.x2 = x2;
        this.y1 = y1;
        this.y2 = y2;

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
        String equation = "y = ";
        if (slope() == 0) {
            return  equation + yIntercept();
        }

        if (slope() % 1 == 0) {
            if ((int) slope() == 1) {
                if (slope() < 0) {
                    equation += "-x ";
                } else {
                    equation += "x ";
                }
            } else {
                equation += (int) slope() + "x ";
            }

        } else {
            if (slope() < 0 && (y2 - y1) > 0) {
                equation += "-" + (y2 - y1) + Math.abs(x2 - x1) + "x ";
            } else {
                equation += (y2 - y1) + "/" + (x2 - x1) + "x ";
            }
        }
        if (yIntercept() > 0) {
            equation += "+ ";
        } else {
            equation += "- ";
        }

        return  equation + Math.abs(yIntercept());

    }

    public String coordinateForX(double x) {
        return "(" + x + ", " + (slope() * x + yIntercept()) + ")";
    }

    public String lineInfo() {
        if (x1 == x2) {
            return "\nThese points are on a vertical line: x = " + x1 + "\n";
        }
        String info = "\nThe two points are: (" + x1 + ", " + y1 +") and (" + x2 + ", " + y2 + ")";
        info += "\nThe equation of the line between these points is: " + equation();
        info += "\nThe slope of this line is: " + slope();
        info += "\nThe y-intercept of this line is: " + yIntercept();
        info += "\nThe distance between these points is " + distance() + ("\n");

        return info + "\n";
    }

}
