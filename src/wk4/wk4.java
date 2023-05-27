package wk4;

import java.util.Arrays;

public class wk4 {

    public static void main(String[] args) {

        int[] ages = {3, 9, 23, 64, 2, 8, 28, 93};
        int result = ages[ages.length - 1] - ages[0];
        System.out.println("Result: " + result);

        int newAge = 45;
        int[] updatedAges = Arrays.copyOf(ages, ages.length + 1);
        updatedAges[ages.length] = newAge;

        int sum = 0;
        for (int i = 0; i < updatedAges.length; i++) {
            sum += updatedAges[i];
        }
        double average = (double) sum / updatedAges.length;
        System.out.println("Average age: " + average);

        String[] names = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};

        int totalLetters = 0;
        for (String name : names) {
            totalLetters += name.length();
        }
        double averageLetters = (double) totalLetters / names.length;
        System.out.println("Average letters per name: " + averageLetters);

        String allNames = "";
        for (String name : names) {
            allNames += name + " ";
        }
        System.out.println("All names: " + allNames.trim());

        int lastElement = ages[ages.length - 1];
        System.out.println("Last element of ages array: " + lastElement);

        int firstElement = ages[0];
        System.out.println("First element of ages array: " + firstElement);

        int[] nameLengths = new int[names.length];
        for (int i = 0; i < names.length; i++) {
            nameLengths[i] = names[i].length();
        }

        int sumOfNameLengths = 0;
        for (int length : nameLengths) {
            sumOfNameLengths += length;
        }
        System.out.println("Sum of name lengths: " + sumOfNameLengths);

        String concatenatedWord = repeatWord("Hello", 3);
        System.out.println("Concatenated word: " + concatenatedWord);

        String fullName = createFullName("John", "Doe");
        System.out.println("Full name: " + fullName);

        int[] numbers = {50, 30, 20, 5};
        boolean sumGreaterThan100 = isSumGreaterThan100(numbers);
        System.out.println("Sum greater than 100? " + sumGreaterThan100);

        double[] values = {4.5, 6.8, 2.1, 9.7, 5.2};
        double averageValue = calculateAverage(values);
        System.out.println("Average value: " + averageValue);
    }

    private static double calculateAverage(double[] values) {
        double sum = 0;
        for (double value : values) {
            sum += value;
        }
        return sum / values.length;
    }

    private static boolean isSumGreaterThan100(int[] numbers) {
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        return sum > 100;
    }

    private static String createFullName(String firstName, String lastName) {
        return firstName + " " + lastName;
    }

    private static String repeatWord(String word, int n) {
		return word;
    }
}
