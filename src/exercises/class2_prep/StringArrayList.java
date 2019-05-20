package exercises.class2_prep;

public class StringArrayList {

    public static String[] countLetter (String[] array) {

        int len = array.length;
        String[] newArray = new String[len];
        int c = 0;
        for (int i = 0; i < len; i++) {
            if (array[i].length() == 5) {
                newArray[c] += array[i];
                c += 1;
            }
        }
        return newArray;
    }

    public static void main (String[]args) {
        //output should be "Apple, Onion"
        String[] a1 = {"Potato", "Apple", "Banana", "Orange", "Onion"};
        // output should be "Juice, Water"
        String[] a2 = {"Coffee", "Tea", "Juice", "Milk", "Water"};

        String[] result1 = countLetter(a1);
        for (int i = 0; i < result1.length; i++) {
            if (result1[i] != null) {
                System.out.println(result1[i]);
            }
        }

        String[] result2 = countLetter(a2);
        for (int i = 0; i < result2.length; i++) {
            if (result2[i] != null) {
                System.out.println(result2[i]);
            }
        }
    }
}