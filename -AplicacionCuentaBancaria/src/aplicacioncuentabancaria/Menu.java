/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacioncuentabancaria;

/**
 *
 * @author Catalin 'uNKoLL' Ciurcanu
 */
public class Menu {
    public static void mostarMenu(){
        System.out.println("***************************************************************************************************************");
        System.out.println("** 1. Ver el número de cuenta completo (CCC- Código Cuenta Cliente)                                          **");
        System.out.println("** 2. Ver el titular de la cuenta                                                                            **");
        System.out.println("** 3. Ver el código de la entidad                                                                            **");
        System.out.println("** 4. Ver el código de la oficina                                                                            **");
        System.out.println("** 5. Ver el número de la cuenta (solamente el número de cuenta, sin entidad, oficina ni dígitos de control) **");
        System.out.println("** 6. Ver los dígitos de control de la cuenta                                                                **");
        System.out.println("** 7. Realizar un ingreso.                                                                                    **");
        System.out.println("** 8. Retirar efectivo. Habrá que solicitar por teclado la cantidad que se desea retirar                     **");
        System.out.println("** 9. Consultar saldo                                                                                        **");
        System.out.println("** 10. Salir de la aplicación                                                                                **");
        System.out.println("***************************************************************************************************************");
        System.out.print("** Seleccione una opcion : ");
    }
}
