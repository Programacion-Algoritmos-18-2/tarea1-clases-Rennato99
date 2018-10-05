package ejercicio_semana_01;

import java.util.Scanner;

public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        String name, lastname;;
        int age, number;

        Scanner ent = new Scanner(System.in);

        System.out.println("Cuántos estudiantes desea ingresar?");
        number = ent.nextInt();
        

        for (int i = 1; i <= number; i++) {
            
            ent.nextLine(); // Limpiando scanner
            
            // Instanciando el objeto 
            Estudiante student = new Estudiante();

            System.out.printf("\nIngrese el nombre del estudiante #%d: \n", i);
            name = ent.nextLine();

            System.out.println("\nIngrese el apellido del estudiante: ");
            lastname = ent.nextLine();

            System.out.println("\nIngrese la edad del estudiante: ");
            age = ent.nextInt();

            // Enviando las variable al objeto studient
            student.nombre = name;
            student.apellido = lastname;
            student.edad = age;
            
            
            // Presento datos del estudiante
            student.presentar_datos();
        }

    }

}
