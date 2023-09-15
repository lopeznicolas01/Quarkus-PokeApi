package cl.forum.arq.bts.errornegocio;

import com.fasterxml.jackson.annotation.JsonProperty;

public class BTErrorNegocio {

    @JsonProperty("Codigo")
    private String Codigo;
    @JsonProperty("Severidad")
    private String Severidad;
    @JsonProperty("Descripcion")
    private String Descripcion;

    public BTErrorNegocio() {
    }

    public String getCodigo() {
        return Codigo;
    }

    public void setCodigo(String codigo) {
        Codigo = codigo;
    }

    public String getSeveridad() {
        return Severidad;
    }

    public void setSeveridad(String severidad) {
        Severidad = severidad;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String descripcion) {
        Descripcion = descripcion;
    }
}
