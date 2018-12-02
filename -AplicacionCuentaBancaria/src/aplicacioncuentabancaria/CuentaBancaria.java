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
public class CuentaBancaria {
Scanner leer = new Scanner(System.in);
    private String titular_cuenta;
    private String cuenta;
    private String codigo_entidad;
    private String codigo_oficina;
    private String digito_control;
    private String codigo_cliente;
    private int saldo_cliente;
    
    public CuentaBancaria() {
        titular_cuenta = "";
        cuenta = "";
        codigo_entidad = "";
        codigo_oficina = "";
        digito_control = "";
        codigo_cliente = "";
        saldo_cliente = 0;
    }
    
    public CuentaBancaria(String titular_cuenta, String cuenta) {
        this.titular_cuenta = titular_cuenta;
        formatearNombre();
        //formatearNombre();
        this.cuenta = cuenta;
        do{
            if(cuenta.length()==20){
                formatearCuenta(cuenta);
            }
            else{
                do{
                System.out.println("El codigo de cliente no es correcto");
                cuenta=leer.nextLine();    
                }while (this.cuenta.length()!=20);
            }
        }while(!comprobarDigitoControl());
        saldo_cliente = 0;
    }


    private void formatearCuenta(String cuenta){

           codigo_entidad = cuenta.substring(0, 4);
           codigo_oficina = cuenta.substring(4,8);
           digito_control = cuenta.substring(8, 10);
           codigo_cliente = cuenta.substring(10, 20);
         
     }
     
    private void formatearNombre(){
        if (!(titular_cuenta.length()<=20)){
            titular_cuenta = titular_cuenta.substring(0, 20);
        }
    }
    
    private boolean comprobarDigitoControl(){
        boolean comprobado = false;
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
        digito2_paso1 = Integer.valueOf(codigo_cliente.substring(0, 1))*1;
        digito2_paso2 = Integer.valueOf(codigo_cliente.substring(1, 2))*2;
        digito2_paso3 = Integer.valueOf(codigo_cliente.substring(2, 3))*4;
        digito2_paso4 = Integer.valueOf(codigo_cliente.substring(3, 4))*8;
        digito2_paso5 = Integer.valueOf(codigo_cliente.substring(4, 5))*5;
        digito2_paso6 = Integer.valueOf(codigo_cliente.substring(5, 6))*10;
        digito2_paso7 = Integer.valueOf(codigo_cliente.substring(6, 7))*9;
        digito2_paso8 = Integer.valueOf(codigo_cliente.substring(7, 8))*7;
        digito2_paso9 = Integer.valueOf(codigo_cliente.substring(8, 9))*3;
        digito2_paso10 = Integer.valueOf(codigo_cliente.substring(9, 10))*6;
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
        
        if(comprobardigito.equals(digito_control)){
            comprobado=true;
        }
        else{
            this.cuenta="";
        }
        return comprobado;
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
    
    /**
     * @return the leer
     */
    public Scanner getLeer() {
        return leer;
    }

    /**
     * @param leer the leer to set
     */
    public void setLeer(Scanner leer) {
        this.leer = leer;
    }

    /**
     * @return the titular_cuenta
     */
    public String getTitular_cuenta() {
        return titular_cuenta;
    }

    /**
     * @param titular_cuenta the titular_cuenta to set
     */
    public void setTitular_cuenta(String titular_cuenta) {
        this.titular_cuenta = titular_cuenta;
    }

    /**
     * @return the cuenta
     */
    public String getCuenta() {
        return cuenta;
    }

    /**
     * @param cuenta the cuenta to set
     */
    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    /**
     * @return the codigo_entidad
     */
    public String getCodigo_entidad() {
        return codigo_entidad;
    }

    /**
     * @param codigo_entidad the codigo_entidad to set
     */
    public void setCodigo_entidad(String codigo_entidad) {
        this.codigo_entidad = codigo_entidad;
    }

    /**
     * @return the codigo_oficina
     */
    public String getCodigo_oficina() {
        return codigo_oficina;
    }

    /**
     * @param codigo_oficina the codigo_oficina to set
     */
    public void setCodigo_oficina(String codigo_oficina) {
        this.codigo_oficina = codigo_oficina;
    }

    /**
     * @return the digito_control
     */
    public String getDigito_control() {
        return digito_control;
    }

    /**
     * @param digito_control the digito_control to set
     */
    public void setDigito_control(String digito_control) {
        this.digito_control = digito_control;
    }

    /**
     * @return the codigo_cliente
     */
    public String getCodigo_cliente() {
        return codigo_cliente;
    }

    /**
     * @param codigo_cliente the codigo_cliente to set
     */
    public void setCodigo_cliente(String codigo_cliente) {
        this.codigo_cliente = codigo_cliente;
    }

    /**
     * @return the saldo_cliente
     */
    public int getSaldo_cliente() {
        return saldo_cliente;
    }

    /**
     * @param saldo_cliente the saldo_cliente to set
     */
    public void setSaldo_cliente(int saldo_cliente) {
        this.saldo_cliente = saldo_cliente;
    }
    
    
    public int IngresarDinero(int d_ingresar){
        setSaldo_cliente(getSaldo_cliente() +d_ingresar);
    return getSaldo_cliente();
    }
    
    public int RetirarDinero(int d_retirar){
        if(d_retirar>getSaldo_cliente()){
            System.out.println("No puedes retirar tal cantidad de dinero.");
        }
        else{
            setSaldo_cliente(getSaldo_cliente() - d_retirar);
        }
    return getSaldo_cliente();
    }
}
