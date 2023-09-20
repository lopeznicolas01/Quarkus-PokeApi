package cl.forum.arq.bts.proxy;

import cl.forum.arq.bts.pojo.response.ListaResponse;
import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@RegisterRestClient(configKey = "getPokemon")
public interface ListaProxy{
    @GET
    @Path("/pokemon")
    @Produces(MediaType.APPLICATION_JSON)
    Response TraerLista(
            @QueryParam("limit") int limit,
            @QueryParam("offset") int offset
    );

}