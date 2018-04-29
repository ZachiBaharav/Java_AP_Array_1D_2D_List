
import java.util.ArrayList;



public class Main {

    
    public static void main(String[] args){
        
        String[] S1;
        S1 = new String[5];
        
        for (int ii=0; ii<S1.length ; ++ii)
            S1[ii] = "" + ii*ii;
        
        System.out.println("S1");
        for (String s: S1)
            System.out.print(s + "; ");
        
        System.out.println();
        
        ///
        String[][] S2;
        S2 = new String[3][4];
        
        for (int rr=0; rr<S2.length ; ++rr)
            for (int cc=0; cc<S2[0].length ; ++cc)
                S2[rr][cc] = "" + rr*cc;
        
        System.out.println("S2");
        for (int rr=0; rr<S2.length ; ++rr){
            for (String s: S2[rr])
                System.out.print(s + " ; ");
            System.out.println();
        }
        
        ///
        ArrayList<Integer> AL;
        AL = new ArrayList<>();
        // ArrayList<Integer> AL = new ArrayList<>();
        // AL = new ArrayList<>(20);
        
        AL.add(5);  // Will produce error if we do not SET memory (even empty!)
        AL.remove(0);
        
        for (int ii=0; ii<9;++ii)
            AL.add(ii);
        
        // remove element if value == 5 ; 
        int val = 5;
        int ii=0; 
        while (ii<AL.size())
        {
            if (AL.get(ii)== val)
                AL.remove(ii);
            else
                ii++;
        }
        System.out.println("AL " + AL.size());
        for (Integer v : AL)
            System.out.print(v+ " ; ");
        
                
        // Add element value == 99 BEFORE each even number 
        val = 99;
        ii = 0;
        while (ii<AL.size())
        {
            int tmp = AL.get(ii);
            if ( tmp%2 ==0) {
                AL.add(ii,val);
                ii+=2;
            }
            else
                ii++;
        }

        AL.add(AL.size(),999);

        System.out.println("AL " + AL.size());
        for (Integer v : AL)
            System.out.print(v+ " ; ");
        
        System.out.println();


        
        
    }
    
    
}
