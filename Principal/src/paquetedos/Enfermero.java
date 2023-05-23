
package paquetedos;


public class Enfermero {
    
    private String nombre;
    private String tipo;
    private double sueldoM;
    
    public Enfermero(){
        nombre = "";
        tipo = "Contrato";
        sueldoM = 1100;
    }
    
    public Enfermero(String n, String t, double s){
        nombre = n;
        tipo = t;
        sueldoM = s;
    }
    
    public void establecerNombre(String n){
        nombre = n;
    }
    
    public void establecerTipo(String n){
        tipo = n;
    }
    
    public void establecerSueldoM(double n){
        sueldoM = n;
    }
    
    public String obtenerNombre(){
        return nombre;
    }
    
    public String obtenertipo(){
        return tipo;
    }
    
    public double obtenerSueldoM(){
        return sueldoM;
    }
    
    
    
}
