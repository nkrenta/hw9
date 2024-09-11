import java.util.Arrays;

public class Lesson {
    public static void main(String[] args) {

        int[] weights = {90, 91, 93, 92, 85, 87, 88, 89, 0, 0, 0, 0};
        int[] weightsCopy = {90, 91, 93, 92, 85, 87, 88, 89, 0, 0, 0, 0};

        boolean arrayAreEqual = true;
        arrayAreEqual = weights.length == weightsCopy.length;
        if (arrayAreEqual) {
            for (int i = 0; i < weights.length; i++) {
                if (weights[i] != weightsCopy[i]) {
                    arrayAreEqual = false;
                }
            }
        }
        if (arrayAreEqual) {
            System.out.println("Arrays are the same!");
        } else {
            System.out.println("Arrays are different!");
            System.out.println("weightsCopy: " + Arrays.toString(weightsCopy));
        }

        int maxWeight = -1;
        for (final int current : weights) {
            if (current > maxWeight) {
                maxWeight = current;
            }
        }
        System.out.println(maxWeight);

        for (int i = 0; i < weights.length - 1 && weights[i + 1] != 0; i++) {
            System.out.println(weights[i + 1] - weights[i]);
        }

    }
}