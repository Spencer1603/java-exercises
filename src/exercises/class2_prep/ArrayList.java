package exercises.class2_prep;

public class ArrayList {
    public static int sumArray (int[] array) {
        int evenSum = 0;
        for (int i = 0; i < array.length; i++){
           if (array[i] % 2 == 0){
               evenSum += array[i];
           }
        }
        return evenSum;
    }
    public static void main(String[] args) {
        //sum should be 30
        int[] a1 = {1,2,3,4,5,6,7,8,9,10};
        // sum should be 14
        int[] a2 = {2,7,9,6,3,0,1,5,2,4};

        int result = sumArray(a1);
        System.out.println(result);

        System.out.println(sumArray(a2));
    }
}
