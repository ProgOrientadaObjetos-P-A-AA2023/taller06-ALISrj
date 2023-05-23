package paquetedos;

public class Hospital {

    private String nombreH;
    private Ciudad ciudad;
    private int numeroEspecialidades;
    private Medico[] medicos;
    private Enfermero[] enfermeros;
    private double sueldoCancelar;
    private String direccion;

    public Hospital(String n, Ciudad ci, Medico[] me, Enfermero[] en, String dir) {
        nombreH = n;
        ciudad = ci;
        medicos = me;
        enfermeros = en;
        direccion = dir;
    }

//  Metodos establecer
    public void establecerNombreH(String n) {
        nombreH = n;
    }

    public void establecerCiudad(Ciudad n) {
        ciudad = n;
    }

    public void establecerNumeroEspecialidades() {
        numeroEspecialidades = medicos.length + enfermeros.length;
    }

    public void establecerMedicos(Medico[] n) {
        medicos = n;
    }

    public void establecerEnfermeros(Enfermero[] n) {
        enfermeros = n;
    }

    public void calcularSueldoCancelar() {
        for (Medico medico : medicos) {
            sueldoCancelar += medico.obtenerSueldoM();
        }

        for (Enfermero enfermero : enfermeros) {
            sueldoCancelar += enfermero.obtenerSueldoM();
        }
    }

    public void establecerDireccion(String n) {
        direccion = n;
    }

//  Metodos obtener
    public String obtenerNombreH() {
        return nombreH;
    }

    public Ciudad obtenerCiudad() {
        return ciudad;
    }

    public int obtenerNumeroEspecialidades() {
        return numeroEspecialidades;
    }

    public Medico[] obtenerMedicos() {
        return medicos;
    }

    public Enfermero[] obtenerEnfermeros() {
        return enfermeros;
    }

    public double obtenerSueldoCancelar() {
        return sueldoCancelar;
    }

    public String obtenerDireccion() {
        return direccion;
    }

    @Override
    public String toString() {
        String mensaje = String.format("""
                                       %S
                                       Direccion: %s
                                       Ciudad: %s
                                       Provincia: %s
                                       Número de Espcialidades: %d
                                       Listado de Médicos:\n
                                       """, nombreH,
                direccion,
                ciudad.obtenerNombreCiudad(),
                ciudad.obtenerProvincia(),
                numeroEspecialidades);

        for (int i = 0; i < medicos.length; i++) {
            mensaje = String.format("""
                                    %s- %s - sueldo: %.2f - %s
                                    """, mensaje,
                    medicos[i].obtenerNombre(),
                    medicos[i].obtenerSueldoM(),
                    medicos[i].obtenerEspecialidad());
        }
        
        mensaje = String.format("%s\nListado de enfermeros(as)\n",mensaje);

        
        for (int i = 0; i < enfermeros.length; i++) {
            mensaje = String.format("""
                                    %s- %s - sueldo: %.2f - %s
                                    """, mensaje,
                    enfermeros[i].obtenerNombre(),
                    enfermeros[i].obtenerSueldoM(),
                    enfermeros[i].obtenertipo());
        }
        
        mensaje = String.format("%s\nTotal de sueldos a pagar por mes: %.2f",mensaje,sueldoCancelar);
        
        return mensaje;
    }
}
