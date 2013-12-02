public class GenericFoo<T> {
    private T foo;
 
    public void setFoo(T foo) {
        this.foo = foo;
    }
 
    public T getFoo() {
        return foo;
    }
}