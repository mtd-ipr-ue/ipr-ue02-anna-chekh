import libraries.In;
import libraries.Out;

public class ue02_3 {
    public static void main(String[] args) {
        Out.println("Please, state the x-coordinate");
        double x = In.readDouble();

        Out.println("Please, state the y-coordinate");
        double y = In.readDouble();

        if (isWithinGreen(x, y, 4))
            Out.println("This point is within the green area");
        else
            Out.println("This point is outside the green area");
    }

    private static boolean isWithinGreen(double x, double y, double radius) {
        double distance = Math.sqrt((x * x) + (y * y));
        boolean coordinatesLowerThanRadius = x <= radius && y <= radius;
        boolean coordinatesHigherThanZero = x >= 0 && y >= 0;
        return distance >= radius && coordinatesLowerThanRadius && coordinatesHigherThanZero;
    }
}
