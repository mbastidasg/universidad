/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package universidad;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author ESTUDIANTE
 */
public class Universidad {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        File archivoLectura = new File ("personas.txt");
        try{
            String tipo = "";
            Scanner archivo = new Scanner (archivoLectura);
            archivo.useDelimiter(";");
            Un universidad = new Un();
            while ( archivo.hasNext()){
                tipo = archivo.next();
                if (tipo.equals("p")){
                    String nombre = archivo.next();
                    int edad = archivo.nextInt();
                    String profesion = archivo.next();
                    double salario = archivo.nextDouble();
                    
                    Profesor profesor = new Profesor (nombre, edad, profesion, salario);
                   universidad.addPersona(profesor);
                    
                } else {
                    String nombre = archivo.next();
                    int edad = archivo.nextInt();
                    String carrera = archivo.next();
                    Estudiante estudiante = new Estudiante (nombre, edad, carrera);
                    universidad.addPersona(estudiante);
                }
            }
        } catch (Exception e){
            e.printStackTrace();
        }
      
        
        
            
        
    }

   
    
}
