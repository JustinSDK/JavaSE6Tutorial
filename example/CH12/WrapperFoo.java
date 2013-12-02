public class WrapperFoo<T> {
    private GenericFoo<T> foo;
    
    public void setFoo(GenericFoo<T> foo) {
        this.foo = foo;
    }
 
    public GenericFoo<T> getFoo() {
        return foo;
    }
}