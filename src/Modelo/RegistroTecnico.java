/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author oarboleda
 */
public class RegistroTecnico {
    private String codigo;
    private String ciudad;
    private int añoFabricacion;

    public RegistroTecnico(String codigo, String ciudad, int añoFabricacion) {
        this.codigo = codigo;
        this.ciudad = ciudad;
        this.añoFabricacion = añoFabricacion;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public int getAñoFabricacion() {
        return añoFabricacion;
    }

    public void setAñoFabricacion(int añoFabricacion) {
        this.añoFabricacion = añoFabricacion;
    }

    @Override
    public String toString() {
        return "RegistroTecnico{" + "codigo=" + codigo + ", ciudad=" + ciudad + ", a\u00f1oFabricacion=" + añoFabricacion + '}';
    }    
}
