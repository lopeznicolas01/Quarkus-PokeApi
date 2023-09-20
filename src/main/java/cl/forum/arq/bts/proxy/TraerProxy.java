package cl.forum.arq.bts.proxy;

import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@RegisterRestClient(configKey = "getPokemon")
public interface TraerProxy {
    @GET
    @Path("/pokemon/{nombre}")
    @Produces(MediaType.APPLICATION_JSON)
    Response TraerPokemon(
            @PathParam("nombre") String nombre
    );

}
