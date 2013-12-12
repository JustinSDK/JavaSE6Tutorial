public class CommandLineArg2 { 
    public static void main(String[] args) { 
        System.out.print("讀入的引數: "); 
        for(String arg : args)
            System.out.print(arg + " "); 
        System.out.println(); 
    } 
}