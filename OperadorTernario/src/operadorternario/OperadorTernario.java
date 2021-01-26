/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operadorternario;

import java.util.Scanner;

/**
 *
 * @author ambert
 */
public class OperadorTernario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n1, n2, maior;
        Scanner ler = new Scanner(System.in);
        
        
        System.out.print("Digite dois numeros: " );
        n1 = ler.nextInt();
        n2 = ler.nextInt();
        maior = (n1>n2)?n1:n2;
        System.out.println("O maior número é: " + maior);
    }
    
}
