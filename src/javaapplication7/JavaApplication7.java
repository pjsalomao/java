/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication7;

import java.util.Scanner;

/**
 *
 * @author work
 */
public class JavaApplication7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        Cotacao c = new Cotacao();
        
        float dolar, real;
        
        System.out.println("Entre com valor em dolar");
        dolar = sc.nextFloat();
        
        System.out.println("Valor em Reais: "+c.convert(dolar));
        
        Imc i = new Imc();
        float peso, altura;
        System.out.println("Entre com peso e altura");
        peso = sc.nextFloat();
        altura = sc.nextFloat();
        
        System.out.println("O imc é: "+i.calcimc(peso, altura));
        
    }
    
}
