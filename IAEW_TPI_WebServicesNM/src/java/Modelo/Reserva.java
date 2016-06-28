/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.Date;

/**
 *
 * @author ang_2
 */
public class Reserva {

    private int id;
    private String codigoReserva;
    private Date fechaReserva;
    private Vendedor vendedor;
    private Cliente cliente;
    private float costo;
    private float precioVenta;
    private int id_vehiculo;

    public Reserva() {
    }

    public Reserva(String codigoReserva, Date fechaReserva, Vendedor vendedor, Cliente cliente, float costo, float precioVenta, int id_vehiculo) {
        this.codigoReserva = codigoReserva;
        this.fechaReserva = fechaReserva;
        this.vendedor = vendedor;
        this.cliente = cliente;
        this.costo = costo;
        this.precioVenta = precioVenta;
        this.id_vehiculo = id_vehiculo;
    }

    public int getId_vehiculo() {
        return id_vehiculo;
    }

    public void setId_vehiculo(int id_vehiculo) {
        this.id_vehiculo = id_vehiculo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCodigoReserva() {
        return codigoReserva;
    }

    public void setCodigoReserva(String codigoReserva) {
        this.codigoReserva = codigoReserva;
    }

    public Date getFechaReserva() {
        return fechaReserva;
    }

    public void setFechaReserva(Date fechaReserva) {
        this.fechaReserva = fechaReserva;
    }

    public Vendedor getVendedor() {
        return vendedor;
    }

    public void setVendedor(Vendedor vendedor) {
        this.vendedor = vendedor;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public float getCosto() {
        return costo;
    }

    public void setCosto(float costo) {
        this.costo = costo;
    }

    public float getPrecioVenta() {
        return precioVenta;
    }

    public void setPrecioVenta(float precioVenta) {
        this.precioVenta = precioVenta;
    }

}
