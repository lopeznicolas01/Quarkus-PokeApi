package cl.forum.arq.bts.exception;

import cl.forum.arq.bts.pojo.response.ErrorBody;
import cl.forum.arq.bts.pojo.response.ErrorResponse;
import org.apache.http.HttpStatus;

import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;
import java.util.ArrayList;

@Provider
public class MapperWebAplicationException implements ExceptionMapper<WebApplicationException> {
    @Override
    public Response toResponse(WebApplicationException e) {
        ErrorResponse errorResponse = new ErrorResponse();
        ErrorBody errorBody = new ErrorBody();
        ArrayList<String> list = new ArrayList<>();
        errorBody.setCode(HttpStatus.SC_BAD_REQUEST);
        list.add("Debe ingresar al menos un valor a actualizar");
        errorBody.setMessages(list);
        errorResponse.setStatus(errorBody);;
        return Response.status(Response.Status.BAD_REQUEST).entity(errorResponse).build();
    }
}