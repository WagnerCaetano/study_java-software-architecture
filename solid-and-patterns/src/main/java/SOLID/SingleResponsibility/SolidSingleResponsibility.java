package SOLID.SingleResponsibility;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class SolidSingleResponsibility {

    public static final int THRESHOLD = 5;

    public static void main(String[] args) {
        System.out.println("Welcome to the Application!");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter 5 valid integers in the range [0, 10]");

        List<Integer> nums = readNumbers(scanner);

        scanner.close();

        displayContent(nums);
    }

    private static void displayContent(List<Integer> nums) {
        Collections.sort(nums);
        for(int num : nums)
            System.out.print(num+" ");
    }

    private static List<Integer> readNumbers(Scanner scanner) {
        List<Integer> nums = new ArrayList<>();
        while(nums.size() < THRESHOLD) {
            String s = scanner.nextLine();
            Integer num = validateInteger(s);
            if (num == null) continue;
            nums.add(num);
        }
        return nums;
    }

    private static Integer validateInteger(String s) {
        try {
            Integer.parseInt(s);
        } catch (NumberFormatException nfe) {
            System.out.println("Invalid! Try again!");
            return null;
        }
        int num = Integer.parseInt(s);
        if(rangeValidate(num)) {
            System.out.println("Invalid range! Try again!");
            return null;
        }
        return num;
    }

    private static boolean rangeValidate(int num) {
        return !(num >= 0 && num <= 10);
    }
}

/*

* * * * * * * * * * * * * * * * * * * * * * * * * * * *
*   Single Responsibility Principle - Original Code   *
* * * * * * * * * * * * * * * * * * * * * * * * * * * *

public static final int THRESHOLD = 5;

public static void main(String[] args) {

        System.out.println("Welcome to the Application!");

        Scanner scanner = new Scanner(System.in);

        List<Integer> nums = new ArrayList<>();

        System.out.println("Enter 5 valid integers in the range [0, 10]");

        while(nums.size() < THRESHOLD) {

            String s = scanner.nextLine();

            try {
                Integer.parseInt(s);
            } catch (NumberFormatException nfe) {
                System.out.println("Invalid! Try again!");
                continue;
            }

            int num = Integer.parseInt(s);

            if(num<0 || num > 10) {
                System.out.println("Invalid range! Try again!");
                continue;
            }

            nums.add(num);
        }

        scanner.close();

        Collections.sort(nums);

        for(int num : nums)
            System.out.print(num+" ");
    }
*/
