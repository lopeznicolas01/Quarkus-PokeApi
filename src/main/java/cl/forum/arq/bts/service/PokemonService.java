package cl.forum.arq.bts.service;
import cl.forum.arq.bts.pojo.request.ListaRequest;
import cl.forum.arq.bts.pojo.request.PokemonRequest;

import java.util.List;

public interface PokemonService {

    List<String> obtenerListaPokemon(ListaRequest body);
    Pokemon obtenerPokemon(PokemonRequest body);

}
