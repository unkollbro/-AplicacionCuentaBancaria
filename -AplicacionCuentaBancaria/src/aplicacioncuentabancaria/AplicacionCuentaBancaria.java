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
        String nombre_titular,cuenta_cliente;
        System.out.println("Nombre del titular de la cuenta (max 30 caracteres)");
        nombre_titular = leer.nextLine();
        System.out.println("Código cuenta cliente (CCC) de la cuenta completo (entidad-oficina-dígitos de control-cuenta) SIN ESPACIOS");
        System.out.println("por ejemplo : 20770024003102575766");
        cuenta_cliente = leer.nextLine();
        System.out.println("Bien");
        CuentaBancaria generado;
        generado = new CuentaBancaria(nombre_titular, cuenta_cliente);
        System.out.println("Que deseas hacer?");
        int opcion=11;
        Menu.mostarMenu();
        do{
            Menu.mostarMenu();
            opcion = leer.nextInt();
            switch(opcion){
                case 1: System.out.println("1. Ver el número de cuenta completo (CCC- Código Cuenta Cliente)");
                        System.out.print("NUMERO DE CUENTA : ");
                        System.out.println(generado.getCuenta());
                        break;
                case 2: System.out.println("2. Ver el titular de la cuenta.");
                        System.out.print("El titular de la cuenta : ");
                        System.out.println(generado.getTitular_cuenta());
                        break;
                case 3: System.out.println("3. Ver el código de la entidad");
                        System.out.print("El codigo de tu entidad es : ");
                        System.out.println(generado.getCodigo_entidad());
                        break;
                case 4: System.out.println("4. Ver el código de la oficina");
                        System.out.print("El codigo de tu oficina es : ");
                        System.out.println(generado.getCodigo_oficina());
                        break;
                case 5: System.out.println("5. Ver el número de la cuenta (solamente el número de cuenta, sin entidad, oficina ni dígitos de control)");
                        System.out.print("Tu numero de cuenta es : ");
                        System.out.println(generado.getCodigo_cliente());
                        break;
                case 6: System.out.println("6. Ver los dígitos de control de la cuenta");
                        System.out.print("Los digitos de control son : ");
                        System.out.println(generado.getDigito_control());
                        break;
                case 7: System.out.println("7. Realizar un ingreso.");
                        System.out.print("Cuanto dinero quieres ingresar ?: ");
                        int ingresar = leer.nextInt();
                        System.out.println(generado.IngresarDinero(ingresar));
                        break;
                case 8: System.out.println("8. Retirar efectivo. Habrá que solicitar por teclado la cantidad que se desea retirar");
                        System.out.print("Cuanto dinero quieres retirar ?: ");
                        int retirar = leer.nextInt();
                        System.out.println(generado.RetirarDinero(retirar));
                        break;
                case 9: System.out.println("9. Consultar saldo");
                        System.out.print("Ahora mismo dispones de : ");
                        System.out.println(generado.getSaldo_cliente());
                        break;
                case 0: break; 
            }
        }while(opcion!=0);
    }
    
}
