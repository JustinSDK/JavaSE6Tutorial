public enum DetailAction3 implements IDescription {
    TURN_LEFT("向左轉"), TURN_RIGHT("向右轉"), SHOOT("射擊");
 
    private String description;
 
    // 不公開的建構方法
    private DetailAction3(String description) {
        this.description = description;
    }
 
    public String getDescription() {
        return description;
    }
}