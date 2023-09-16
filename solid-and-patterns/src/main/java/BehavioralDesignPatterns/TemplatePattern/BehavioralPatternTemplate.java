package BehavioralDesignPatterns.TemplatePattern;

public class BehavioralPatternTemplate {

    public static void main(String[] args) {

        int[] nums = {1, 5, 3, -2, 10, 12, 8, 6, 5};

        Algorithm sorting = new SelectionSort(nums);
        sorting.sort();
    }
}