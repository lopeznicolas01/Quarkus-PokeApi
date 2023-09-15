package cl.forum.arq.bts.exception;

import java.util.Collections;

import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;

import org.apache.http.HttpStatus;

import cl.forum.arq.bts.pojo.response.ErrorBody;
import cl.forum.arq.bts.pojo.response.ErrorResponse;

public class MapperException implements ExceptionMapper<Exception> {	
    @Override
    public Response toResponse(Exception e) {
    	// Genera objetos de error de respuesta
    	ErrorResponse errorResponse = new ErrorResponse();
    	ErrorBody errorBody = new ErrorBody();
        // Mapea datos desde response exception
    	errorBody.setCode(HttpStatus.SC_INTERNAL_SERVER_ERROR);
        errorBody.setMessages(Collections.emptyList());
        errorBody.getMessages().add(e.getMessage());
        errorResponse.setStatus(errorBody);;

        return Response.status(Response.Status.BAD_REQUEST).entity(errorResponse).build();
    }
}
