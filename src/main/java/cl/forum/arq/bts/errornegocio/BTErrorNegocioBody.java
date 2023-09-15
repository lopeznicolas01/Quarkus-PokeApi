package cl.forum.arq.bts.errornegocio;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class BTErrorNegocioBody {
    @JsonProperty("BTErrorNegocio")
    private List<BTErrorNegocio> errores;

    public List<BTErrorNegocio> getErrores() {
        return errores;
    }

    public void setErrores(List<BTErrorNegocio> errores) {
        this.errores = errores;
    }

}
