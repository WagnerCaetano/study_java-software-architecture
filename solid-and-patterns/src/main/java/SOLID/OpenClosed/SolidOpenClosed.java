package SOLID.OpenClosed;

public class SolidOpenClosed {

    public static void main(String[] args) {
        SortingProcessor.execute(new MergeSort());

        SortingProcessor.execute(new InsertionSort());

        SortingProcessor.execute(new SelectionSort());
    }
}