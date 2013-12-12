public class Chicken extends Bird { // 擴充Bird類別
    private String crest; // 新增私有成員，雞冠描述

    public Chicken() {
        super();
    }

    // 定義建構方法
    public Chicken(String name, String crest) {
        super(name);
        this.crest = crest;
    }

    // 新增方法
    public void setCrest(String crest) {
        this.crest = crest;
    }

    public String getCrest() {
        return crest;
    }

    public void wu() {
       System.out.println("咕咕叫…");
    }
}