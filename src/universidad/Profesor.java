/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package universidad;

/**
 *
 * @author ESTUDIANTE
 */
public class Profesor extends  Persona{
    private String profesion;
    private double salario;
    public Profesor(String nombre, int edad,String profesion, double salario) {
        super(nombre, edad);
        this.profesion = profesion;
        this.salario = salario;
    }

    public String getProfesion() {
        return profesion;
    }

    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
}
