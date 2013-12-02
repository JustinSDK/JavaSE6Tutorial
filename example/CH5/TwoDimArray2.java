public class TwoDimArray2 {
    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3}, 
                       {4, 5, 6}};

        int[][] arr1 = new int[][] {{1, 2, 3}, 
                                    {4, 5, 6}};

        int[] foo = arr[0];

        for(int i = 0; i < foo.length; i++) {
            System.out.print(foo[i] + " ");
        }
        System.out.println();

        foo = arr[1];

        for(int i = 0; i < foo.length; i++) {
            System.out.print(foo[i] + " ");
        }
        System.out.println();
    }
}