public class AutoBoxDemo {
    public static void main(String[] args) {
        Integer data1 = 10;
        Integer data2 = 20;
        
        // 轉為double值再除以3
        System.out.println(data1.doubleValue() / 3);

        // 進行兩個值的比較
        System.out.println(data1.compareTo(data2));
    }
}