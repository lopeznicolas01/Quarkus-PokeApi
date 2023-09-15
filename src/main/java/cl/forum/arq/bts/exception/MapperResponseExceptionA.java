package cl.forum.arq.bts.exception;

import cl.forum.arq.bts.pojo.response.ErrorBody;
import cl.forum.arq.bts.pojo.response.ErrorResponse;

import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;
import java.util.ArrayList;

@Provider
public class MapperResponseExceptionA implements ExceptionMapper<ResponseExceptionA> {
    @Override
    public Response toResponse(ResponseExceptionA e) {
        ArrayList<String> list = new ArrayList<>();
        list.add(e.getMessage());
    	ErrorResponse errorResponse = new ErrorResponse();
    	ErrorBody errorBody = new ErrorBody();
        errorBody.setCode(e.getCodigo());
        errorBody.setMessages(list);
        errorResponse.setStatus(errorBody);
        return Response.status(Response.Status.BAD_REQUEST).entity(errorResponse).build();
    }
}
