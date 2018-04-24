/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hagmann;

/**
 *
 * @author Fabian Hagmann
 */
public class test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String input = "tri Length=531441 Iterations=7";
        String[] parts = input.split(" ");
        String it = parts[2].split("=")[1];
        int iterations = Integer.parseInt(it);
        
        String le = parts[1].split("=")[1];
        double lenght = Double.parseDouble(le);
        
        double ges = lenght;
        int vorkommen = 1;
        if (parts[0].equals("tri")) {
            double innerLength = lenght;
            for (int i = 0; i < iterations; i++) {
                double part = innerLength/3;
                ges += part*vorkommen;
                vorkommen *= 4;
                innerLength /= 3;
            }
        } else {
            
        }
        ges*=3;
        System.out.println(ges);
    }
    
}
