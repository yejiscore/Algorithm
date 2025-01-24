import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int countA = 0;
        
        for (int i = 0; i < 3; i++) {
            String symptoms = sc.next();
            int temperature = sc.nextInt();
            
            if (symptoms.equals("Y") && temperature >= 37) {
                countA++;
            }
        }
        
        if (countA >= 2) {
            System.out.println("E");
        } else {
            System.out.println("N");
        }
    }
}
