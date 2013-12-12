public class ExtendDemo { 
    public static void main(String[] args) {
        Chicken chicken1 = new Chicken("小克", "紅色小雞冠");
        Chicken chicken2 = new Chicken();
 
        System.out.printf("小雞1 - 名稱 %s, 雞冠是 %s。 \n", 
            chicken1.getName(), chicken1.getCrest());
        chicken1.wu();

        System.out.printf("小雞2 - 名稱 %s, 雞冠是 %s。 \n", 
            chicken2.getName(), chicken2.getCrest());
        chicken2.wu();
    } 
}