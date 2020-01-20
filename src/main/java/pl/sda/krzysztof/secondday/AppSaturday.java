package pl.sda.krzysztof.secondday;

public class AppSaturday {

    public static void main(String[] args) {

        PseudocodeExerciseImpl pseudocodeExercise = new PseudocodeExerciseImpl();
        int[] arrOne = {11, 9, 49484, 2, 9999999, 86, 0, -83};
        int highestNumberFromArray = pseudocodeExercise.highestValue(arrOne);
        System.out.println("Highest number from given array is: " + highestNumberFromArray);

        boolean isAllEvenResult = pseudocodeExercise.isAllEven(new int[]{30, -90, 88, 393836});
        System.out.println("Are all even: " + isAllEvenResult);
        isAllEvenResult = pseudocodeExercise.isAllEven(new int[]{12, 12, 11, 4444});
        System.out.println("Are all even: " + isAllEvenResult);

        int sumOfPositiveNumbers = pseudocodeExercise.sumOnlyPositiveNumbers(new int[]{-32, 1, 0, 2, -3232});
        System.out.println("Sum of positive numbers is: " + sumOfPositiveNumbers);

        int factorialToCalculate = 12;
        System.out.println("factorial of " + factorialToCalculate + " is: "
                + FactorialCalculator.calculate(12));

        int resultOne = GreatestCommonDivisor.iterativeFindAsc(55, 15);
        int resultTwo = GreatestCommonDivisor.iterativeFindDesc(55, 15);
        int resultThree = GreatestCommonDivisor.recursiveEuclid(55, 15);
        System.out.println("iterative results: " + resultOne + " | " + resultTwo
                + " | recursive result: " + resultThree);
    }
}
