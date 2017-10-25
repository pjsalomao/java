/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication7;

import static java.lang.Math.pow;

/**
 *
 * @author work
 */
public class Imc {
    
    
    public float calcimc(float peso, float altura)
    {
        return (float) (peso / pow(altura, 2));
    }
    
}
