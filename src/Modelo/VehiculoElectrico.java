/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author oarboleda
 */
public class VehiculoElectrico extends Vehiculo {
    private double autonomia;
    private int capacidadBateria; 

    public VehiculoElectrico(double autonomia, int capacidadBateria, String placa, String nombreConductor, double kilometraje, RegistroTecnico suRegistro) {
        super(placa, nombreConductor, kilometraje, suRegistro);
        this.autonomia = autonomia;
        this.capacidadBateria = capacidadBateria;
    }
    
    public double calcularCostoTotal() {
        double costoAnterior = super.calcularCostoTotal();
        double extra;
        if (capacidadBateria < 40) {
            extra = capacidadBateria * 1.20;
        } else {
            extra = capacidadBateria * 1.26;
        }
        double total = costoAnterior + extra;
        return total;
    }

    public double getAutonomia() {
        return autonomia;
    }

    public void setAutonomia(double autonomia) {
        this.autonomia = autonomia;
    }

    public int getCapacidadBateria() {
        return capacidadBateria;
    }

    public void setCapacidadBateria(int capacidadBateria) {
        this.capacidadBateria = capacidadBateria;
    }

    @Override
    public String toString() {
        return "VehiculoElectrico{" + "autonomia=" + autonomia + ", capacidadBateria=" + capacidadBateria + '}';
    }
}
