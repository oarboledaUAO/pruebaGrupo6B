/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author oarboleda
 */
public class VehiculoCombustion extends Vehiculo{
    private int cilindraje;
    private String combustible;

    public VehiculoCombustion(int cilindraje, String combustible, String placa, String nombreConductor, double kilometraje, RegistroTecnico suRegistro) {
        super(placa, nombreConductor, kilometraje, suRegistro);
        this.cilindraje = cilindraje;
        this.combustible = combustible;
    }
    
    public double calcularCostoTotal() {
        double costoAnterior = super.calcularCostoTotal();
        double recargo;
        
        if (combustible.equals("GASOLINA")) {
            recargo = 300;
        } else {
            recargo = 500;
        }
        double total = costoAnterior + recargo;
        return total;
    }

    public int getCilindraje() {
        return cilindraje;
    }

    public void setCilindraje(int cilindraje) {
        this.cilindraje = cilindraje;
    }

    public String getCombustible() {
        return combustible;
    }

    public void setCombustible(String combustible) {
        this.combustible = combustible;
    }

    @Override
    public String toString() {
        return "VehiculoCombustion{" + "cilindraje=" + cilindraje + ", combustible=" + combustible + '}';
    }    
}
