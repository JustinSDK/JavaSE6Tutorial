package onlyfun.caterpillar;

public class ProxyDemo {
    public static void main(String[] args) {
        LogHandler handler  = new LogHandler(); 
        IHello speaker = new HelloSpeaker();

        // 代理speaker的物件
        IHello speakerProxy = 
                 (IHello) handler.bind(speaker);

        speakerProxy.hello("Justin");        
    }
}