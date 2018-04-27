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
        int [][] ast = new int[4][];
        
        int min = 6;
        int max =7;
        int vol = 0;
        
        for (int i = min; i <= max;i++) {
            for (int x = 0; x < ast.length; x++) {
                for (int y = 0; y < ast[0].length; y++) {
                    if (ast[x][y] <= i && ast[x][y] != 0) {
                        vol++;
                    }
                }
            }
        }
        
    }
    
}
