package cl.forum.arq.bts.service;
import cl.forum.arq.bts.pojo.request.ListaRequest;
import cl.forum.arq.bts.pojo.request.PokemonRequest;

import javax.ws.rs.core.Response;

public interface PokemonService {

    Response obtenerListaPokemon(ListaRequest body);
    Response obtenerPokemon(PokemonRequest body);

}
