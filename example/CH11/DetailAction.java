public enum DetailAction {
    TURN_LEFT, TURN_RIGHT, SHOOT;
 
    public String getDescription() {
        switch(this.ordinal()) {
            case 0:
                return "向左轉";
            case 1:
                return "向右轉";
            case 2:
                return "射擊";
            default:
                return null;
        }
    }
}