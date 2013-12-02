package onlyfun.caterpillar;

public class ClassDemo2 { 
    public static void main(String[] args) { 
        System.out.println(boolean.class); 
        System.out.println(void.class); 

        int[] iarr = new int[10];
        System.out.println(iarr.getClass().toString());

        double[] darr = new double[10];
        System.out.println(darr.getClass().toString());
    } 
}