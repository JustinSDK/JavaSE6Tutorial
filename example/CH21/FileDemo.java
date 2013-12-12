package onlyfun.caterpillar;

import java.io.File;

public class FileDemo {
    public static void main(String[] args) {
        File[] roots = File.listRoots();
        for(File root : roots) {
            System.out.printf("%s 總容量 %d，可用容量 %d %n", 
               root.getPath(), root.getTotalSpace(), root.getUsableSpace());
        }
    }
}