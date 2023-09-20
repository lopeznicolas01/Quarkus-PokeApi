package cl.forum.arq.bts.proxy;

import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@RegisterRestClient
public interface PokeApiService {
    @GET
    @Path("/pokemon")
    @Produces("aplication/json")

    PokemonResponse obtenerPokemonAleatorio();

    @GET
    @Path("/pokemon/{nombre}")
    @Produces("aplicarion/json")
    Pokemon obtenerPokemonNombre(String nombre);

}