public class bubleSort {
    public static void main(String[] args) {
        int[] test = new int[5];
        for(int i = 0; i < test.length; i++) {
            test[i] = (int) (Math.random() * 10);
            System.out.print(test[i] + " ");
        }

        bubleSort(test);

        System.out.println();
        for(int i = 0; i < test.length; i++) {
            System.out.print(test[i] + " ");
        }
    }
    public static int[] bubleSort(int test[]) {
        int length = test.length;
        while(length != 0) {
            int maxElement = 0;
            for(int i = 1; i < length; i++) {
                if(test[i - 1] > test[i]){
                    int temp = test[i - 1];
                    test[i - 1] = test[i];
                    test[i] = temp;
                    maxElement = i;
                }
            }
            length = maxElement;
        }
        return test;
    }
}
