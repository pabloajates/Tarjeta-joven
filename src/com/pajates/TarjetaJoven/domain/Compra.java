package com.pajates.TarjetaJoven.domain;

public class Compra {

    private Integer id;
    private String fechaCompra;
    private Usuario usuario;
    private Promociones promociones;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFechaCompra() {
        return fechaCompra;
    }

    public void setFechaCompra(String fechaCompra) {
        this.fechaCompra = fechaCompra;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Promociones getPromociones() {
        return promociones;
    }

    public void setPromociones(Promociones promociones) {
        this.promociones = promociones;
    }
}
