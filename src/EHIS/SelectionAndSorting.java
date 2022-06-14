package EHIS;

public class SelectionAndSorting {
    public static void main(String[] args) {
        int[] array = {64, 33, 77, 22, 4, -12};

        for (int i : array) {
            System.out.println(i);
        }
    }
}
//
//        selectionOfArray(array);
//        for (int i: array){
//            System.out.println(i+" ");
//        }
//    }
//
//    private static void selectionOfArray(int[] array) {
//        for (int i=0; i< array.length-1; i++) {
//            int indexNumber = i;
//            for (int j=i+1; j< array.length; j++) {
//
//                if(array[j] < array[indexNumber]){
//                    indexNumber = j;
//                }
//            }
//            int smallest =array[indexNumber];
//            array[indexNumber] = array[i];
//            array[i] = smallest;
//        }
//    }
//
    // }
