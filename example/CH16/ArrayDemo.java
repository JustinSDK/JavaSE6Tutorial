package onlyfun.caterpillar;

public class ArrayDemo {
    public static void main(String[] args) {
        short[] sArr = new short[5];
        int[] iArr = new int[5];
        long[] lArr = new long[5];
        float[] fArr = new float[5];
        double[] dArr = new double[5];
        byte[] bArr = new byte[5];
        boolean[] zArr = new boolean[5];
        String[] strArr = new String[5];

        System.out.println("short 陣列類別：" + sArr.getClass());
        System.out.println("int 陣列類別：" + iArr.getClass());
        System.out.println("long 陣列類別：" + lArr.getClass());
        System.out.println("float 陣列類別：" + fArr.getClass());
        System.out.println("double 陣列類別：" + dArr.getClass());
        System.out.println("byte 陣列類別：" + bArr.getClass());
        System.out.println("boolean 陣列類別：" + zArr.getClass());
        System.out.println("String 陣列類別：" + strArr.getClass());
    }
}