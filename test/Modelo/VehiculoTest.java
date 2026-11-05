/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package Modelo;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author oarboleda
 */
public class VehiculoTest {
    
    public VehiculoTest() {
    }

    /**
     * Test of calcularCostoBase method, of class Vehiculo.
     */
    @Test
    public void testCalcularCostoBase_menor() {
        System.out.println("testCalcularCostoBase_menor");
        Vehiculo instance = new Vehiculo("ABC 123","Martha",1000.0, new RegistroTecnico("123","Cali",2019));
        assertEquals(800.0, instance.calcularCostoBase(), 0);
    }
    
    @Test
    public void testCalcularCostoBase_mayor() {
        System.out.println("testCalcularCostoBase_mayor");

        Vehiculo instance = new Vehiculo("ABC 123", "Martha", 1000.0, new RegistroTecnico("123", "Cali", 2021));

        double expResult = 1200.0;
        double result = instance.calcularCostoBase();

        assertEquals(expResult, result, 0);
    }

    @Test
    public void testCalcularCostoBase_igual() {
        System.out.println("testCalcularCostoBase_igual");

        Vehiculo instance = new Vehiculo("ABC 123", "Martha", 1000.0, new RegistroTecnico("123", "Cali", 2020));

        double expResult = 1200.0;
        double result = instance.calcularCostoBase();

        assertEquals(expResult, result, 0);
    }

    /**
     * Test of calcularCostoBase method, of class Vehiculo.
     */
    @Test
    public void testCalcularCostoBase_moderado() {
        System.out.println("testCalcularCostoBase_moderado");
        double factor = 1.0;
        Vehiculo instance = new Vehiculo("ABC 123", "Martha", 1000.0, new RegistroTecnico("123", "Cali", 2019));
        String expResult = "800.0 INCREMENTO MODERADO";
        String result = instance.calcularCostoBase(factor);
        assertEquals(expResult, result);
    }

    @Test
    public void testCalcularCostoBase_significativo() {
        System.out.println("testCalcularCostoBase_significativo");
        double factor = 1.5;
        Vehiculo instance = new Vehiculo("ABC 123", "Martha", 1000.0, new RegistroTecnico("123", "Cali", 2019));
        String expResult = "1200.0 INCREMENTO SIGNIFICATIVO";
        String result = instance.calcularCostoBase(factor);
        assertEquals(expResult, result);
    }

    @Test
    public void testCalcularCostoBase_borde() {
        System.out.println("testCalcularCostoBase_borde");
        double factor = 1.2;
        Vehiculo instance = new Vehiculo("ABC 123", "Martha", 1000.0, new RegistroTecnico("123", "Cali", 2019));
        String expResult = "960.0 INCREMENTO MODERADO";
        String result = instance.calcularCostoBase(factor);
        assertEquals(expResult, result);
    }
}
