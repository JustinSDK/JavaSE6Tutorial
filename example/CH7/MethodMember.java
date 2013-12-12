public class MethodMember {
    public static void main(String[] args) {
        MethodDemo methodDemo = new MethodDemo();
        
        methodDemo.scopeDemo(); // 對data field不會有影響
        System.out.println(methodDemo.getData());

        methodDemo.setData(100); // 對data field不會有影響
        System.out.println(methodDemo.getData());
    }
}

class MethodDemo {
    private int data = 10;

    public void scopeDemo() {
        int data = 100;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        data = data; // 這樣寫是沒用的
        // 寫下面這個才有用
        // this.data = data;
    }
}
