/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.ArrayList;

/**
 *
 * @author LabingXEON
 */
public class BaseDatos {
    
    private ArrayList<Persona> personas;
    
    public BaseDatos(){
        this.personas.add(new Persona("Diana","Parada"));
        
    }
    public boolean insertar(Persona personas){
    return this.personas.add(personas);
    }
    
    public ArrayList<Persona> listarTodo(){
       
    return this.personas;    
    }
    
}
