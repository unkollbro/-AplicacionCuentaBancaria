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
        String nombre_titular,codigo_entidad,codigo_oficina,digito_control,codigo_cuenta_cliente,cuenta_cliente;
        System.out.println("Nombre del titular de la cuenta (max 30 caracteres)");
        nombre_titular = leer.nextLine();
        System.out.println("Código cuenta cliente (CCC) de la cuenta completo (entidad-oficina-dígitos de control-cuenta)");
        System.out.println("por ejemplo : 2077 0024 00 3102575766");
        //SOLICITANDO CODIGO DE CUENTA ENTERO
        cuenta_cliente = leer.nextLine();
        //SEPARAR EL CODIGO DE CUENTA EN TROZOS
        codigo_entidad = cuenta_cliente.substring(0, 4);
        codigo_oficina = cuenta_cliente.substring(5,9);
        digito_control = cuenta_cliente.substring(8, 11);
        codigo_cuenta_cliente = cuenta_cliente.substring(11, 21);
        
        CuentaBancaria generado = new CuentaBancaria(cuenta_cliente, codigo_entidad, codigo_oficina, cuenta_cliente, digito_control);
        System.out.println(generado.toString());
        /*
        int opcion=11;
        Menu.mostarMenu(opcion);
        do{
            Menu.mostarMenu(opcion);
            opcion = leer.nextInt();
            switch(opcion){
                case 1: System.out.println("1. Ver el número de cuenta completo (CCC- Código Cuenta Cliente)");
                        
                        break;
                case 2: System.out.println("2. Ver el titular de la cuenta.");
                        break;
                case 3: System.out.println("3. Ver el código de la entidad");
                        break;
                case 4: System.out.println("4. Ver el código de la oficina");
                        break;
                case 5: System.out.println("5. Ver el número de la cuenta (solamente el número de cuenta, sin entidad, oficina ni dígitos de control)");
                        break;
                case 6: System.out.println("6. Ver los dígitos de control de la cuenta");
                        break;
                case 7: System.out.println("7. Realizar un ingreso.");
                        break;
                case 8: System.out.println("8. Retirar efectivo. Habrá que solicitar por teclado la cantidad que se desea retirar");
                        break;
                case 9: System.out.println("9. Consultar saldo");
                        break;
                case 10: break; 
            }
        }while(opcion!=10);
        */
    }
    
}
