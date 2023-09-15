package cl.forum.arq.bts.util;

import cl.forum.arq.bts.errornegocio.ErrorNegocioDetailResponse;
import cl.forum.arq.bts.errornegocio.ErrorNegocioResponse;

import java.util.ArrayList;
import java.util.List;

public class Validate {

    public static ErrorNegocioResponse repuestaErrorSpecific(int codigo, String usuario) {

        ErrorNegocioResponse errorResponse = new ErrorNegocioResponse();
        List<ErrorNegocioDetailResponse> errores = new ArrayList<>();

        if (codigo == 1) {
            ErrorNegocioDetailResponse error1 = new ErrorNegocioDetailResponse();
            error1.setCodigo("30004");
            error1.setSeveridad("E");
            error1.setDescripcion("Falló consumo de Obtención de Instancia");
            errores.add(error1);
        }	else if (codigo == 2) {
            ErrorNegocioDetailResponse error1 = new ErrorNegocioDetailResponse();
            error1.setCodigo("30005");
            error1.setSeveridad("E");
            error1.setDescripcion("Falló consumo de Grabar Relevant Data");
            errores.add(error1);
        } else if (codigo == 3) {
            ErrorNegocioDetailResponse error1 = new ErrorNegocioDetailResponse();
            error1.setCodigo("30001");
            error1.setSeveridad("E");
            error1.setDescripcion("El usuario " + usuario + " no tiene asociado la tarea y proceso parametrizado.");
            errores.add(error1);
        }
        errorResponse.setErrores(errores);
        return errorResponse;
    }

    public static Boolean isNullOrEmpty(String a){
        if(a == null || a.isEmpty()){
            return true;
        }else {
            return false;
        }
    }

    public static Boolean isNullOrEmpty(int a){
        if(a <= 0){
            return true;
        }else {
            return false;
        }
    }
}
