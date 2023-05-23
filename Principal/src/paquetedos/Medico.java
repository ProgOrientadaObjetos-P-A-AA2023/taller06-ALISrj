package paquetedos;

public class Medico {
    
    private String nombre;
    private String especialidad;
    private double sueldoM;
    
    public Medico(){
        nombre = "";
        especialidad = "General";
        sueldoM = 1100;
    }
    
    public Medico(String n, String e, double s){
        nombre = n;
        especialidad = e;
        sueldoM = s;
    }
    
    public void establecerNombre(String n){
        nombre = n;
    }
    
    public void establecerEspecialidad(String n){
        especialidad = n;
    }
    
    public void establecerSueldoM(double n){
        sueldoM = n;
    }
    
    public String obtenerNombre(){
        return nombre;
    }
    
    public String obtenerEspecialidad(){
        return especialidad;
    }
    
    public double obtenerSueldoM(){
        return sueldoM;
    }
    
}
