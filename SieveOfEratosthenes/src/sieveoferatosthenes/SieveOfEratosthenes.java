/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sieveoferatosthenes;


import Goldbach.Goldbach;
import java.util.Scanner;

/**
 *
 * @author eleidinger17
 */
public class SieveOfEratosthenes {

     public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Bitte Zahl eingeben:");
            String input = sc.next();
            int n = Integer.parseInt(input);
            System.out.print("Following are the prime numbers "); 
            System.out.println("smaller than or equal to " + n); 
            SieveOfEratosthenes g = new SieveOfEratosthenes(); 
            g.sieveOfEratosthenes(n); 
           System.out.println("\n" + "Zahl ist Prime: " +Goldbach.isPrime(n));
           
            
    }
    
    public void sieveOfEratosthenes(int n) 
    { 
        
        boolean prime[] = new boolean[n+1]; 
        for(int i=0;i<n;i++) 
            prime[i] = true; 
          
        for(int p = 2; p*p <=n; p++) 
        { 
            
            if(prime[p] == true) 
            { 
                
                for(int i = p*2; i <= n; i += p) 
                    prime[i] = false; 
            } 
        } 
          
        
        for(int i = 2; i <= n; i++) 
        { 
            if(prime[i] == true) 
                System.out.print(i + " "); 
        } 
    }
   
          
    
    
    }
    


