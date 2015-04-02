package DiamondExercises;
import Helpers.ExercisesHelper;

/**
 * Created by David on 4/2/2015.
 */
public class IsoscelesTriangle {
    public static void main(String[] args) {
        int n = ExercisesHelper.getFirstCommandLineArgAsInt(args);
        if (n < 0) {
            return;
        }

        PrintShapes.printIsoscelesTriangle(n);
    }
}
