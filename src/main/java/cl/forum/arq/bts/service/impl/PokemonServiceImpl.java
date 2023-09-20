package cl.forum.arq.bts.service.impl;

import cl.forum.arq.bts.pojo.request.ListaRequest;
import cl.forum.arq.bts.pojo.request.PokemonRequest;

import javax.inject.Inject;
import javax.inject.Singleton;
import java.util.ArrayList;
import java.util.List;

import cl.forum.arq.bts.proxy.PokeApiService;
import cl.forum.arq.bts.service.PokemonService;

@Singleton
public class PokemonServiceImpl implements PokemonService{
    @Inject
    PokeApiService pokeApiService;

    @Override
    public List<String> obtenerListaPokemon(ListaRequest body){
        List<String> listaPokemon =new ArrayList<>();
        //for each buscar
        for (:listaPokemon) {
            PokemonResponse pokemon=pokeApiService.obtenerPokemonAleatorio();
            listaPokemon.add(pokemon.getName());
        }
        return listaPokemon;
    }
    @Override
    public Pokemon obtenerPokemon(PokemonRequest body){
        return pokeApiService.obtenerPokemonNombre(body.getName());
    }

}
