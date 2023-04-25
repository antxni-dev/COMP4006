package fourline;

import java.util.Scanner;
        
/**
 *
 * @author Dr Ian Bayley
 */
public class C2 {

    private static C1 f7;
    private static boolean f8 = false;
    
    private static void m14() {
        String[] v20=new String[2];
        char[] v21=new char[2];
        
        Scanner v22 = new Scanner(System.in);
        for (int v23 = 1; v23<=2 ; v23++) {
            System.out.printf("Player %d name: ", v23);
            v20[v23-1] = v22.nextLine();
            
            String v24;
            boolean v25;
            do {
                System.out.printf("Player %d symbol: ", v23);
                v24 = v22.nextLine();
                v25=v24.length()==1 && 
                        32 < v24.charAt(0) && v24.charAt(0) < 127;
            } while (!v25);
            v21[v23-1]=v24.charAt(0);
        }
        f7.m12(v20);
        f7.m13(v21);
    }
    
    
    private static void m15() {
        
        String v26 = "1 2 3 4 5 6 7 8 9";
        System.out.println(v26.substring(0,C1.K1*2-1));
        
        for (int v27 = 1; v27 <= C1.K2; v27++) {
            StringBuilder v28=new StringBuilder();
            for (int v29 = 1; v29 <= C1.K1; v29++) {
                v28.append(f7.m1(v29, v27));  
                if (v29!=C1.K1)
                    v28.append(' ');
            }
            System.out.println(v28);
        }
        System.out.println();
        
    }

    private static int m16(){
        Scanner v30=new Scanner(System.in);
        boolean v31;
        boolean v32;
        int v33;
        
        do {
            System.out.printf("%s (%c), choose a column (1-%d): ", 
                f7.m2(), f7.m4(), C1.K1);
            v33 = v30.nextInt();
            v31 = 1 <= v33 && v33 <= C1.K1;
            v32 = f7.m6(v33);
            if (!v32) {
                System.out.println("That column is full. Try again.");
            }
            
        } while (!(v31 && v32));
        return v33;
    }
    
    public static void main(String[] args) {

        f7 = new C1();
        if (!f8)        
            m14();

        boolean v34= false;
        
        do {
            m15();
            
            int v35 = m16();
            f7.m8(v35);
            v34 = f7.m10();
            f7.m11();
                    
        } while ((!v34) && (!f7.m7()));
        
        if (v34) {
            System.out.printf("The winner is: %s (%s)\n", f7.m3(), f7.m5());
        } else {
            System.out.println("That was a stalemate!");
        }
    }


    
}
