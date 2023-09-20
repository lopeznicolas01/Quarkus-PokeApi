package cl.forum.arq.bts.pojo.request;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ListaRequest {
    @JsonProperty("cantidad")
    private int cantidad;
    @JsonProperty("offset")
    private int offset;

    public ListaRequest() {
    }

    public ListaRequest(int cantidad, int offset) {
        this.cantidad = cantidad;
        this.offset = offset;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getOffset() {
        return offset;
    }

    public void setOffset(int offset) {
        this.offset = offset;
    }
}
