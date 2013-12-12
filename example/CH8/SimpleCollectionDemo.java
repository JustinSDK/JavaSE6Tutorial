public class SimpleCollectionDemo { 
    public static void main(String[] args) { 
        SimpleCollection simpleCollection = 
                            new SimpleCollection(); 
 
        simpleCollection.add(new Foo1("一號 Foo1")); 
        simpleCollection.add(new Foo2("一號 Foo2")); 
 
        Foo1 f1 = (Foo1) simpleCollection.get(0); 
        f1.showName();
 
        Foo2 f2 = (Foo2) simpleCollection.get(1); 
        f2.showName();
    } 
}