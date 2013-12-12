public class SafeArrayDemo { 
    public static void main(String[] args) { 
        // 預設10個元素 
        SafeArray arr1 = new SafeArray();  
         // 指定配置 5 個元素 
        SafeArray arr2 = new SafeArray(5);
 
        for(int i = 0; i < arr1.getLength(); i++) 
            arr1.setElement(i, (i+1)*10);

        for(int i = 0; i < arr2.getLength(); i++) 
            arr2.setElement(i, (i+1)*10);

        System.out.print("arr1: ");
        arr1.showElement();

        System.out.print("\narr2: ");
        arr2.showElement();
    }
}