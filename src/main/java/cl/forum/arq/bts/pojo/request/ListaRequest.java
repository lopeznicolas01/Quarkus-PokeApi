package cl.forum.arq.bts.pojo.request;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ListaRequest {
    @JsonProperty("cantidad")
    private int cantidad;

    public ListaRequest() {
    }

    public ListaRequest(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
}
