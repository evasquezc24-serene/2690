/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejemplo;

/**
 *
 * @author umg
 */
public class Carpintero extends Persona {
    
    private double salario;
   
    public Carpintero(String nombre, int edad, String genero, String pais, double salario)        
    {
        super(nombre,edad,genero,pais);
        this.salario =salario;
    }
    
    public void mostrarInfoC()
    {
        System.out.println(" Salario "+ salario);
        mostrarInfo();
   
        
    }
    
}
