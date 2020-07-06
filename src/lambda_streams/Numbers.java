package lambda_streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Numbers {
    static List<Integer> nums = Arrays.asList(10, 100, 1000, 5, 50, 500, 3, 30, 300, 7, 70, 700, 1, 10, 100, 25, 250, 2500);

    public static void main(String[] args) {
        //Part I :complete the static class methods that have been set up in this Numbers class java file.  Use streams to compute the results wheever possible.
        System.out.println(nums);


        //Part II - refactor all of the class methods to accept lambda expressions. You can put the lambda functions directly inside the method calls, or defined them first, then pass them into the methods. give them the same names as the static methods, but add the word 'lambda' in front of every lambda function:

        // lambadOdd = nums.forEach(Numbers::isOdd);
        /* e.g.

        added(() -> {});

        OR

        lambdaAdd = () -> {};
        added(lambdaAdd);

        isOdd(() -> {});

        OR

        lambdaOdd = () -> {};
        isOdd(lambdaOdd);
        etc...

        */

    }

    private static List<Integer> lambaOdd(List<Integer> items) {
        return items.stream().filter(Numbers::isOdd).collect(Collectors.toList());
    }

    static boolean isOdd(int i) {
        return nums.get(i) % 2 == 1;
    }


    private static List<Integer> lambaEven(List<Integer> items) {
        return items.stream().filter(Numbers::isEven).collect(Collectors.toList());
    }

    static boolean isEven(int i) {
        return nums.get(i) % 2 == 0;
    }


    private static List<Integer> lambaPrime(List<Integer> items) {
        return items.stream().filter(Numbers::isPrime).collect(Collectors.toList());
    }

    static boolean isPrime(int i) {
        if (i <= 1)
            return false;
        for (int j = 2; j < i; j++)
            if (i % j == 0)
                return false;
        return true;
    }

    private static int lambaAdded(List<Integer> items) {
        return items.stream().reduce(1, Integer::sum);
    }

    static int lambdasubtracted(List<Integer> items) {
        return  nums.stream().reduce(nums.get(0), (a, b) -> a - b);
    }

    private static int lambdaMultiply(List<Integer> items) {
        return items.stream().reduce(1, (a, b) -> a * b);
    }

    static int lambdaDivided() {
        return  nums.stream().reduce(nums.get(0), (a, b) -> a / b);
    }

    private static Integer lambdafindMax(List<Integer> items) {
        return items.stream().max(Integer::compare).get();
    }


    private static Integer lambdafindMin(List<Integer> items) {
        return items.stream().min(Integer::compare).get();
    }

    static int compare(int i, int j) {
        Stream<Integer> stream = Arrays.asList(nums.get(i), nums.get(j)).stream();
        stream.forEach((Integer element) -> {
        });
        return 0;
    }

    private static void lambdaAddToList(List<Integer> items, int target) {
        //items.forEach(items::target);
    }
    static int append(int n) {
        List<Integer> addedNums = new ArrayList<Integer>(nums);
        addedNums.add(n);
        return n;
    }

}
