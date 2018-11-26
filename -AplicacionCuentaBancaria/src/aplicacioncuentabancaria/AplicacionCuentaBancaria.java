/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacioncuentabancaria;

import java.util.Scanner;

/**
 *
 * @author Catalin 'uNKoLL' Ciurcanu
 */
public class AplicacionCuentaBancaria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int opcion=11;
        
        String nombre_titular,codigo_entidad,codigo_oficina,digito_control,codigo_cuenta_cliente,cuenta_cliente;
        System.out.println("Nombre del titular de la cuenta (max 30 caracteres)");
        nombre_titular = leer.nextLine();
        System.out.println("Código cuenta cliente (CCC) de la cuenta completo (entidad-oficina-dígitos de control-cuenta)");
        System.out.println("por ejemplo : 2077 0024 00 3102575766");
        System.out.println("Introduce los CUATRO(4) Digitos de ENTIDAD");
        codigo_entidad = leer.next();
        System.out.println("Introduce los CUATRO(4) Digitos de OFICINA");
        codigo_oficina = leer.next();
        System.out.println("Introduce los DOS(2) Digitos de CONTROL");
        digito_control = leer.next();
        System.out.println("Introduce los DIEZ(10) Digitos del NUMERO DE CUENTA");
        codigo_cuenta_cliente = leer.next();
        cuenta_cliente = codigo_entidad+codigo_oficina+digito_control+codigo_cuenta_cliente;
        System.out.println("Tu nombre es.. "+nombre_titular);
        System.out.println("Tu cuenta es.. "+codigo_entidad+" "+codigo_oficina+" "+digito_control+" "+codigo_cuenta_cliente);
        System.out.println("Tu cuenta es.. "+cuenta_cliente);
        
        System.out.println("Lo que buscas.."+codigo_entidad.substring(3, 4));
        
        //CALCULO DEL DIGITO CONTROL
        
        /*
        for (int i = 0; i < codigo_cuenta_cliente.length()-1; i++) {
            codigo_cuenta_cliente.substring(i,i+1);
            
        }
        String[] partes = codigo_cuenta_cliente.split(" ");
        // por ejemplo 2077 0024 00 3102575766
        String part1 = partes[0]; // 2077
        String part2 = partes[1]; // 0024
        String part3 = partes[2]; // 00
        String part4 = partes[3]; // 3102575766
        
        for (int i = 0; i < partes.length ; i++) {
            System.out.println(partes[i]);
        }
        */
        
        
        /*
        do{
            Menu.mostarMenu(opcion);
            opcion = leer.nextInt();
        }while(opcion!=10);
        */
    }
    
}
