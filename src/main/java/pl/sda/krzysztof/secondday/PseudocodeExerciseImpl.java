package pl.sda.krzysztof.secondday;

public class PseudocodeExerciseImpl {

    public int highestValue(int[] arr) {
        int highest = arr[0];
        for (int i : arr) {
            if (i > highest) {
                highest = i;
            }
        }
        return highest;
    }

    public boolean isAllEven(int[] arr) {
        for (int number : arr) {
            if (number % 2 != 0) {
                return false;
            }
        }
        return true;
    }

    public int sumOnlyPositiveNumbers(int[] arr) {
        int result = 0;
        for (int a : arr) {
            if (a > 0) {
                result += a;
            }
        }
        return result;
    }
}
