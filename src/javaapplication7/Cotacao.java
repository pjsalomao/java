/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication7;

/**
 *
 * @author work
 */
public class Cotacao {
    
    private float vdolar, vreal;
    
    
    public float convert (float vdolar)
    {
        vreal = (float) (vdolar * 2.5);
        return vreal;
    }
}
