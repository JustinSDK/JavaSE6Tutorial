public class FileFilter { 
    public static void main(String[] args) { 
        String[] filenames = {"caterpillar.jpg", "cater.gif", 
                 "bush.jpg", "wuwu.jpg", "clockman.gif"};

        System.out.print("過濾出jpg檔案: "); 

        for(int i = 0; i < filenames.length; i++) {
            if(filenames[i].endsWith("jpg")) {
                System.out.print(filenames[i] + " "); 
            }
        }
        System.out.println(""); 
    } 
} 