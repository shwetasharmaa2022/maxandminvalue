public class FindMaxAndMinValue {
    public static void main(String[] args) {


        int a[] = {50, 100, 40, 20, 60};
        int max = a[0];
        for (int i = 1; i < a.length; i++) {
            if (a[i] > max) {
                max = a[i];
            }
        }
        System.out.println("max value is: " + max);


        int b[] = {50, 100, 40, 20, 60};
        int min = b[0];
        for (int i = 1; i < b.length; i++) {
            if (b[i] < min) {
                min = a[i];

            }
        }
        System.out.println("min value in array : " + min);
    }}