public class TwoDimArray3 {
    public static void main(String[] args) {
        int arr[][]; 
 
        arr = new int[2][]; 
        arr[0] = new int[3]; 
        arr[1] = new int[5]; 
 
        for(int i = 0; i < arr.length; i++) { 
            for(int j = 0; j < arr[i].length; j++) 
                arr[i][j] = j + 1; 
        } 
 
        for(int i = 0; i < arr.length; i++) { 
            for(int j = 0; j < arr[i].length; j++) 
                System.out.print(arr[i][j] + " "); 
            System.out.println(); 
        } 
    }
}