package fourline;

public class C1 {
    
    private String f1[]=new String[2];
    private char f2[]= new char[2];

    
    public static final int K1=7;
    public static final int K2=6;
    private final char[][] f3 = new char[K1][K2];
    
    private int f4;
    private int f5;
    
    private boolean f6;
    
    public C1() {
        m12(new String[]{"Ian", "David"});
        m13(new char[]{'o','x'});

        for (int v1 = 1; v1 <= K2; v1++) {
            for (int v2 = 1; v2 <= K1; v2++) {
                f3[v2-1][v1-1]='-';
            }
        }

        f4=-1;
        f5=-1;
        
        f6=true;
        
    }

    public char m1(int p1, int p2) {
        return f3[p1-1][p2-1];
    }
    
    public String m2(){
        return (f6) ? f1[0] : f1[1];
    }
    
    public String m3(){
        return (f6) ? f1[1] : f1[0];
    }
    
    public char m4() {
        return (f6) ? f2[0] : f2[1];
    }
            
    public char m5() {
        return (f6) ? f2[1] : f2[0];
    }
    
    public boolean m6(int p3) {
        return f3[p3-1][0] == '-';
    }

    public boolean m7() {
        boolean v3 = true;
        for (int coli=0; coli < K1; coli++) {
            if (f3[coli][0]=='-') {
                v3 = false;
            }
        }
        return v3;
    }

    public void m8(int p4) {
        int v4=0;
        while (v4 < K2-1 && f3[p4-1][v4+1]=='-') {
            v4++;
        }
        f4=v4;
        f5=p4-1;
        f3[f5][f4]= m4(); 

    }
    
    private int m9(int p5, int p6) {
        int v5=f5;
        int v6=f4;
        int v7=0;
        
        boolean v8;
        do {
            v5+=p5;
            v6+=p6;
            v8 = 0<=v5 && v5 < K1 && 
                    0<=v6 && v6< K2 && f3[v5][v6]==m4();
            if (v8) {
                v7++;
            }
        } while (v8);
        
        return v7;
    }

    public boolean m10() {
        int v9=m9(+1, -1);
        int v10=m9(-1, -1);
        int v11=m9(+1, +1);
        int v12=m9(-1, +1);
        int v13=m9(+1, 0);
        int v14=m9(-1, 0);
        int v15=m9(0, +1);
        
        int v16=v9+1+v12;
        int v17=v10+1+v11;
        int v18=v14+1+v13;
        int v19=1+v15;
        
        return v16 > 3 || v17 > 3 || v18 > 3 || v19 > 3;
    }

    public void m11() {
        this.f6 = !this.f6;
    }

    
    public void m12(String[] p7) {
        this.f1=p7;
    }
    
    public void m13(char[] p8) {
        this.f2=p8;
    }
    
}
