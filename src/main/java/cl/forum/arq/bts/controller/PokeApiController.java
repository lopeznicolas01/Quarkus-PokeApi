package cl.forum.arq.bts.controller;
import cl.forum.arq.bts.pojo.request.ListaRequest;
import cl.forum.arq.bts.pojo.request.PokemonRequest;
import cl.forum.arq.bts.service.PokemonService;
import org.eclipse.microprofile.openapi.annotations.parameters.RequestBody;

import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.awt.*;
import java.util.List;

@Path("/Pokemons")
@Produces(MediaType.APPLICATION_JSON)
public class PokeApiController {

    @Inject
    PokemonService pokemonService;

    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/traerListaPokemon")
    public Response traerListaPokemon(@RequestBody ListaRequest request){
        return pokemonService.obtenerListaPokemon(request);

    }
    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/traerPokemon")
    public Response traerPokemon(@RequestBody PokemonRequest request){
        return pokemonService.obtenerPokemon(request);
    }

}
