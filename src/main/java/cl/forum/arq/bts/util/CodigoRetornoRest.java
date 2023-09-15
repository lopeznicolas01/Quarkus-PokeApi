package cl.forum.arq.bts.util;

import cl.forum.arq.bts.pojo.response.DetailResponse;
import cl.forum.arq.bts.pojo.response.GetResponse;

import javax.ws.rs.core.Response;

/**
 * @author  Arquitectura
 * @version 1.0
 * @since   2022-06-15
 */
public final class CodigoRetornoRest {
	public static final String TIPOERROR = "E";
	private static final String OK_REQUEST = "Respuesta exitosa";
	private static final String INTERNAL_SERVER_ERROR="Error interno del Servidor";

	private CodigoRetornoRest() {}

	public static Response returnMessageError(boolean success, String code, String message, Object obj) {
		GetResponse<Object> respuesta = new GetResponse<>();
		respuesta.setSuccess(success);
		respuesta.setDetailResponse(new DetailResponse(code, message));
		respuesta.setBody(obj);
		return Response.status(Response.Status.BAD_REQUEST).entity(respuesta).build();
	}

	public static Response returnMessage(boolean success, String code) {
		GetResponse<Object> respuesta = new GetResponse<>();
		respuesta.setSuccess(success);
		respuesta.setDetailResponse(new DetailResponse(code, OK_REQUEST));
		respuesta.setBody(null);
		return Response.status(Response.Status.OK).entity(respuesta).build();
	}

	public static Response returnMessage(boolean success, String code, Object body) {
		GetResponse<Object> respuesta = new GetResponse<>();
		respuesta.setSuccess(success);
		respuesta.setDetailResponse(new DetailResponse(code, OK_REQUEST));
		respuesta.setBody(body);
		return Response.status(Response.Status.OK).entity(respuesta).build();
	}
}
