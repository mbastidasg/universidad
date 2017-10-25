package universidad;

import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ESTUDIANTE
 */
public class Un {
    private ArrayList <Persona> personas;

    public Un() {
        this.personas = new ArrayList<>();
        
    }
    public boolean addPersona(Persona persona){
        return this.personas.add(persona);  
    }
}
