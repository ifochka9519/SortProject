public class Sorter {

    public static int[] sort (int[] array){

        boolean isSorted = false;
        int value;
        while(!isSorted) {
            isSorted = true;
            for (int i = 0; i < array.length-1; i++) {
                if(array[i] > array[i+1]){
                    isSorted = false;

                    value = array[i];
                    array[i] = array[i+1];
                    array[i+1] = value;
                }
            }
        }
        return array;
    }
}
