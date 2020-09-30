public class MyMain {

    // Reverses an array
    public static int[] reverse(int[] arr) {
        int[] goooba = new int[arr.length];
        for (int k=0; k < arr.length; k++){
            goooba[k] = arr[arr.length - 1 -k];
        }
        return goooba;
    }

    // Finds the second largest number in an array
    public static int secondLargest(int[] arr) {
        int ynk, qwe;
        if(arr[0] > arr [1]){
            ynk = arr[0];
            qwe = arr[1];
        }
        else {
            ynk = arr[1];
            qwe = arr[0];
        
        }
        for (int k = 2; k < arr.length; k++){
            if ((arr[k] <= ynk) && arr[k] > qwe){
                qwe = arr[k];
            }
            if (arr[k] > ynk){
                qwe = ynk;
                ynk = arr[k];
            }
        }

        
        return qwe;
    }

    // Checks to see if an array contains a geometric series
    public static boolean isGeometric(int[] arr) {
        double[] goba = new double[arr.length-1];
        for (int k = 0; k < arr.length - 1; k++){
            goba[k] = Double.valueOf(arr[k+1])/Double.valueOf(arr[k]);

        }
        int tuo = 0;
        for (int k = 1; k < goba.length; k++){
            if (goba[k] == goba[k-1]){
                tuo +=1;
            }
        }
        if (tuo == goba.length - 1){
            return true;
        }
        else {
            return false;
        }
        
    }


    public static void main(String[] args) {
        System.out.println(reverse(null));
        System.out.println(secondLargest(null));
        System.out.println(isGeometric(null));
        



    }
}
