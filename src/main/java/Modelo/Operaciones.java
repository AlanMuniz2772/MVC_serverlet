/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author USUARIO
 */
public class Operaciones {
    private String valor1;
    private String valor2;
    private String accion;

    public Operaciones(String valor1, String valor2, String accion) {
        this.valor1 = valor1;
        this.valor2 = valor2;
        this.accion = accion;
    }

    public String procesarAccion() {
        switch (accion) {
            case "Cronómetro":
                return getSegundos(this.valor1);
            case "Cinta Métrica":
                return getYardas(this.valor1);
            case "Termómetro":
                return getRankine(this.valor1);
            case "Cobranza":
                return Cobranzas(this.valor1, this.valor2);
            default:
                return "";
        }
    }

    // Getters y setters
    public String getValor1() {
        return valor1;
    }

    public void setValor1(String valor1) {
        this.valor1 = valor1;
    }

    public String getValor2() {
        return valor2;
    }

    public void setValor2(String valor2) {
        this.valor2 = valor2;
    }

    public String getAccion() {
        return accion;
    }

    public void setAccion(String accion) {
        this.accion = accion;
    }

    public String getSegundos(String valor1){
        int dias = Integer.parseInt(valor1);
        int segundos = (dias * 86400);
        return (""+dias+" dias = "+segundos+" segundos");
    }
    
    public String getYardas(String valor1){
        int kilometros = Integer.parseInt(valor1);
        double yardas = (kilometros * 914.4);
        return (""+kilometros+" km = "+yardas+" yardas");
    }
    
    public String getRankine(String valor1){
        int centigrados = Integer.parseInt(valor1);
        double rankine = (9/5)*(centigrados + 273.15);
        return (""+centigrados+" celcius = "+rankine+" rankine");
    }
    
    public String Cobranzas(String valor1, String valor2){
        int montoTotal = Integer.parseInt(valor1);
        int pagoCliente = Integer.parseInt(valor2);
        int cambio = (pagoCliente - montoTotal);
        if(cambio < 0){
            return "No se puede efectuar el cobro";
        }else{
            return ("Compra = $"+montoTotal+" ____ Pago = $"+pagoCliente+" _____  Cambio = $"+cambio+"");
        }
    }
}

