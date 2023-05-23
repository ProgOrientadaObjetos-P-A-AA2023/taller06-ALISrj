package paquetedos;

public class Ciudad {
    
    private String nombreCiudad;
    private String provincia;
    
    public Ciudad(){
        nombreCiudad = "Loja";
        provincia = "Loja";
    }
    
    public Ciudad(String c, String p){
        nombreCiudad = c;
        provincia = p;
    }
    
    public void establecerNombreCiudad(String n){
        nombreCiudad = n;
    }
    
    public void establecerProvincia(String p){
        provincia = p;
    }
    
    public String obtenerNombreCiudad(){
        return nombreCiudad;
    }
    
    public String obtenerProvincia(){
        return nombreCiudad;
    }
    
    
    
    
}
