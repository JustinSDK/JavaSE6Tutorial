package onlyfun.caterpillar;

import java.util.*;

public class CommandUtilDemo {
    public static void main(String[] args) throws Exception {
        Map<String, String> request = 
                  new HashMap<String, String>();
        request.put("name", "caterpillar");
        request.put("score", "90");
        Object obj = CommandUtil.getCommand(request, args[0]);
        System.out.println(obj);
    }
}