package paqueteuno;

import java.util.Scanner;
import paquetedos.Ciudad;
import paquetedos.Medico;
import paquetedos.Enfermero;
import paquetedos.Hospital;


public class Principal {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        String nombreMedico;
        String especialidadMedico;
        double sueldoMedico;
        
        String nombreEnfermero;
        String tipoEnfemero;
        double sueldoEnfermero;
        
        System.out.println("Ingrese el nombre del Hospital:");
        String hospital = entrada.nextLine();
        
        System.out.println("Ingrese el nombre de la ciudad del hospital");
        String nombreCiudad = entrada.nextLine();
        
        System.out.println("Ingrese la provincia de la ciudad del hospital");
        String nombreProvincia = entrada.nextLine();
        
        Ciudad ciudad1 = new Ciudad(nombreCiudad, nombreProvincia);
        
        System.out.println("Cuantos médicos desea ingresar en el hospital");
        int numeroMedicos = entrada.nextInt();
        entrada.nextLine();
        
        Medico[] medicos = new Medico[numeroMedicos];
        
        for (int i = 0; i < medicos.length; i++) {
            
            System.out.printf("Ingrese el nombre del medico n %d\n", i+1);
            nombreMedico = entrada.nextLine();
            System.out.printf("Ingrese la especialidad del medico n %d\n", i+1);
            especialidadMedico = entrada.nextLine();
            System.out.printf("Ingrese el sueldo mensual del medico n %d\n", i+1);
            sueldoMedico = entrada.nextDouble();
            entrada.nextLine();
            
            medicos[i] = new Medico(nombreMedico, especialidadMedico, sueldoMedico);
            
        }
        
        System.out.println("Cuantos enfermeros desea ingresar en el hospital");
        int numeroEnfermeros = entrada.nextInt();
        entrada.nextLine();
        
        Enfermero[] enfermeros = new Enfermero[numeroEnfermeros];
        
        
        for (int i = 0; i < enfermeros.length; i++) {
            
            System.out.printf("Ingrese el nombre del enfermero n %d\n", i+1);
            nombreEnfermero = entrada.nextLine();
            System.out.printf("Ingrese el tipo del enfermero n %d\n", i+1);
            tipoEnfemero = entrada.nextLine();
            System.out.printf("Ingrese el sueldo mensual del enfermero n %d\n", i+1);
            sueldoEnfermero = entrada.nextDouble();
            entrada.nextLine();
            
            enfermeros[i] = new Enfermero(nombreEnfermero, tipoEnfemero, sueldoEnfermero);
            
        }
        
        System.out.println("Ingrese la direccion del Hospital");
        String direccionH = entrada.nextLine();
        
        Hospital hospital1 = new Hospital(hospital, ciudad1, medicos, enfermeros, direccionH);
        hospital1.establecerNumeroEspecialidades();
        hospital1.calcularSueldoCancelar();
        System.out.printf("\n%s\n",hospital1);
    }
    
}
