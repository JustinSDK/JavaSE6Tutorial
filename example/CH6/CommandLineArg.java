public class CommandLineArg { 
    public static void main(String[] args) { 
        System.out.print("讀入的引數: "); 
        for(int i = 0; i < args.length; i++)
            System.out.print(args[i] + " "); 
        System.out.println(); 
    } 
}