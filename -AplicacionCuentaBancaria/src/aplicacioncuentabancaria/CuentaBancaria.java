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
    private int saldo_cliente;

    public CuentaBancaria(String titular_cuenta, String codigo_entidad, String codigo_oficina, String digito_control, String codigo_cliente, int saldo_cliente) {
        this.titular_cuenta = titular_cuenta;
        this.codigo_entidad = codigo_entidad;
        this.codigo_oficina = codigo_oficina;
        this.codigo_cliente = codigo_cliente;
        this.digito_control = comprobarDigitoControl(codigo_entidad, codigo_oficina, codigo_cliente);
        this.saldo_cliente = saldo_cliente;
    }

    public CuentaBancaria(String titular_cuenta, String codigo_entidad, String codigo_oficina, String codigo_cliente, String digito_control) {
        this.titular_cuenta = titular_cuenta;
        this.codigo_entidad = codigo_entidad;
        this.codigo_oficina = codigo_oficina;
        this.codigo_cliente = codigo_cliente;
        this.digito_control = digito_control;
        this.saldo_cliente = 0;
    }
    
    private String comprobarDigitoControl(String codigo_entidad,String codigo_oficina,String codigo_cuenta_cliente){
        String comprobardigito="";
        // CALCULO DIGITO 1 DE CONTROL
        int digito1_paso1,digito1_paso2,digito1_paso3,digito1_paso4,digito1_paso5,digito1_paso6,digito1_paso7,digito1_paso8,digito1_paso9,digito1_paso10,digito1_paso11,digito_1;
        digito1_paso1 = Integer.valueOf(codigo_entidad.substring(0, 1))*4;
        digito1_paso2 = Integer.valueOf(codigo_entidad.substring(1, 2))*8;
        digito1_paso3 = Integer.valueOf(codigo_entidad.substring(2, 3))*5;
        digito1_paso4 = Integer.valueOf(codigo_entidad.substring(3, 4))*10;
        digito1_paso5 = Integer.valueOf(codigo_oficina.substring(0, 1))*9;
        digito1_paso6 = Integer.valueOf(codigo_oficina.substring(1, 2))*7;
        digito1_paso7 = Integer.valueOf(codigo_oficina.substring(2, 3))*3;
        digito1_paso8 = Integer.valueOf(codigo_oficina.substring(3, 4))*6;
        digito1_paso9 = digito1_paso1+digito1_paso2+digito1_paso3+digito1_paso4+digito1_paso5+digito1_paso6+digito1_paso7+digito1_paso8;
        digito1_paso10 = digito1_paso9%11;
        digito1_paso11=11-digito1_paso10;
        if((11-digito1_paso10)==10){
            digito1_paso11 = 1;
        }
        if((11-digito1_paso10)==11){
            digito1_paso11 = 0;
        }
        digito_1 = digito1_paso11;
        // CALCULO DIGITO 2 DE CONTROL
        int digito2_paso1,digito2_paso2,digito2_paso3,digito2_paso4,digito2_paso5,digito2_paso6,digito2_paso7,digito2_paso8,digito2_paso9,digito2_paso10,digito2_paso11,digito2_paso12,digito2_paso13,digito_2;
        digito2_paso1 = Integer.valueOf(codigo_cuenta_cliente.substring(0, 1))*1;
        digito2_paso2 = Integer.valueOf(codigo_cuenta_cliente.substring(1, 2))*2;
        digito2_paso3 = Integer.valueOf(codigo_cuenta_cliente.substring(2, 3))*4;
        digito2_paso4 = Integer.valueOf(codigo_cuenta_cliente.substring(3, 4))*8;
        digito2_paso5 = Integer.valueOf(codigo_cuenta_cliente.substring(4, 5))*5;
        digito2_paso6 = Integer.valueOf(codigo_cuenta_cliente.substring(5, 6))*10;
        digito2_paso7 = Integer.valueOf(codigo_cuenta_cliente.substring(6, 7))*9;
        digito2_paso8 = Integer.valueOf(codigo_cuenta_cliente.substring(7, 8))*7;
        digito2_paso9 = Integer.valueOf(codigo_cuenta_cliente.substring(8, 9))*3;
        digito2_paso10 = Integer.valueOf(codigo_cuenta_cliente.substring(9, 10))*6;
        digito2_paso11 = digito2_paso1+digito2_paso2+digito2_paso3+digito2_paso4+digito2_paso5+digito2_paso6+digito2_paso7+digito2_paso8+digito2_paso9+digito2_paso10;
        digito2_paso12 = digito2_paso11%11;
        digito2_paso13 = 11-digito2_paso12;
        if((11-digito2_paso12)==10){
            digito2_paso13 = 1;
        }
        if((11-digito2_paso12)==11){
            digito2_paso13 = 0;
        }
        digito_2 = digito2_paso13;
        
        comprobardigito = digito_1+""+digito_2;
        return comprobardigito;
    }
    
    public String toString(){
        String devolver="Titular de la cuenta : "+titular_cuenta+
                        "\nNumero de Cuenta : "+codigo_entidad+codigo_oficina+digito_control+codigo_cliente+
                        "\nSaldo  : "+saldo_cliente+
                        "\nCodigo Entidad : " +codigo_entidad+
                        "\nCodigo Oficina : " +codigo_oficina+
                        "\nDigito de Control : "+digito_control;
        return devolver;
    }
    
    
}
