public class Main {

    public static void main(String[] args) {

        int[] array = new int[]{ 4,9,11,2,1,5,12,3,2,22,10 };

        System.out.println("OLD ARRAY: ");

        for (int item:array) {
            System.out.print(item + " ");
        }

        int[] sortedArray = Sorter.sort(array);

        System.out.println();

        System.out.println("NEW ARRAY: ");

        for (int item:sortedArray) {
            System.out.print(item + " ");
        }

    }
}
