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
public class CuentaBancaria {
    private String titular_cuenta;
    private String codigo_entidad;
    private String codigo_oficina;
    private String digito_control;
    private String codigo_cliente;
    private String saldo_cliente;

    public CuentaBancaria(String titular_cuenta, String codigo_entidad, String codigo_oficina, String digito_control, String codigo_cliente, String saldo_cliente) {
        this.titular_cuenta = titular_cuenta;
        this.codigo_entidad = codigo_entidad;
        this.codigo_oficina = codigo_oficina;
        this.digito_control = digito_control;
        this.codigo_cliente = codigo_cliente;
        this.saldo_cliente = saldo_cliente;
    }
    
    public void comprobarDigitoControl(String codigo_entidad,String codigo_oficina,String codigo_cuenta_cliente){
        /*
            1-La primera cifra de la entidad se multiplica por 4.
            2-La segunda cifra de la entidad se multiplica por 8.
            3-La tercera cifra de la entidad se multiplica por 5.
            4-La cuarta cifra de la entidad se multiplica por 10.

            5-La primera cifra de la oficina se multiplica por 9.
            6-La segunda cifra de la oficina se multiplica por 7.
            7-La tercera cifra de la oficina se multiplica por 3.
            8-La cuarta cifra de la oficina se multiplica por 6.

            9-Se suman todos los resultados obtenidos.
            10-Se divide entre 11 y nos quedamos con el resto de la división.
            11- A 11 le quitamos el resto anterior, y ese el el primer dígito de control,
                con la salvedad de que si nos da 10, el dígito es 1,
                y si nos da 11, el dígito es 0.
        
            String codigo_entidad,String codigo_oficina,String codigo_cuenta_cliente
        */
        
        int paso1,paso2,paso3,paso4,paso5,paso6,paso7,paso8,paso9,paso10,paso11;
        
        paso1 = Integer.valueOf(codigo_entidad.substring(0, 1))*4;
        paso2 = Integer.valueOf(codigo_entidad.substring(1, 2))*8;
        paso3 = Integer.valueOf(codigo_entidad.substring(2, 3))*5;
        paso4 = Integer.valueOf(codigo_entidad.substring(3, 4))*10;
        
        paso5 = Integer.valueOf(codigo_oficina.substring(0, 1))*9;
        paso6 = Integer.valueOf(codigo_oficina.substring(1, 2))*7;
        paso7 = Integer.valueOf(codigo_oficina.substring(2, 3))*3;
        paso8 = Integer.valueOf(codigo_oficina.substring(3, 4))*6;
        
        paso9 = paso1+paso2+paso3+paso4+paso5+paso6+paso7+paso8;
        paso10 = paso9%11;
        if((11-paso10)==10){
            paso11 = 1;
        }
        if((11-paso10)==11){
            paso11 = 0;
        }
        
        
    }
}
