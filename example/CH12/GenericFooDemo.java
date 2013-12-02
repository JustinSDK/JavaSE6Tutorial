public class GenericFooDemo {
    public static void main(String[] args) {
        GenericFoo<Boolean> foo1 = new GenericFoo<Boolean>();
        GenericFoo<Integer> foo2 = new GenericFoo<Integer>();
 
        foo1.setFoo(new Boolean(true));
        Boolean b = foo1.getFoo();
        System.out.println(b);

        foo2.setFoo(new Integer(10));
        Integer i = foo2.getFoo();
        System.out.println(i);
    }
}