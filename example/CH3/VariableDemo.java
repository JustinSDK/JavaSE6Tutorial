public class VariableDemo { 
    public static void main(String[] args) { 
        int ageOfStudent = 5;
        double scoreOfStudent = 80.0; 
        char levelOfStudent = 'B'; 

        System.out.println("年級\t 得分\t 等級"); 
        System.out.printf("%4d\t %4.1f\t %4c", 
            ageOfStudent, scoreOfStudent, levelOfStudent); 
    } 
}