/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author oarboleda
 */
public class Vehiculo {
    protected String placa;
    protected String nombreConductor;
    protected double kilometraje;
    protected RegistroTecnico suRegistro;
    
    public Vehiculo(String placa, String nombreConductor, double kilometraje, RegistroTecnico suRegistro) {
        this.placa = placa;
        this.nombreConductor = nombreConductor;
        this.kilometraje = kilometraje;
        this.suRegistro = suRegistro;
    }
    
    public double calcularCostoBase() {
        double res;

        if (suRegistro.getAñoFabricacion() < 2020) {
            res = kilometraje * 0.8;
        } else {
            res = kilometraje * 1.2;
        }
        return res;
    }

    public String calcularCostoBase(double factor) {
        String res;
        
        double resultado = calcularCostoBase() * factor;
        if (factor > 1.2) {
            res = resultado + " INCREMENTO SIGNIFICATIVO";
        } else {
            res = resultado + " INCREMENTO MODERADO";
        }
        return res;
    }
    
    public double calcularCostoTotal() {
        double recargo;
        if (suRegistro.getCiudad().equals("CALI")) {
            recargo = 5000;
        } else {
            recargo = 3000;
        }
        double total = calcularCostoBase() + recargo;
        return total;
    }
    
    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getNombreConductor() {
        return nombreConductor;
    }

    public void setNombreConductor(String nombreConductor) {
        this.nombreConductor = nombreConductor;
    }

    public double getKilometraje() {
        return kilometraje;
    }

    public void setKilometraje(double kilometraje) {
        this.kilometraje = kilometraje;
    }

    public RegistroTecnico getSuRegistro() {
        return suRegistro;
    }

    public void setSuRegistro(RegistroTecnico suRegistro) {
        this.suRegistro = suRegistro;
    }

    @Override
    public String toString() {
        return "Vehiculo{" + "placa=" + placa + ", nombreConductor=" + nombreConductor + ", kilometraje=" + kilometraje + ", suRegistro=" + suRegistro + '}';
    }                           
}
