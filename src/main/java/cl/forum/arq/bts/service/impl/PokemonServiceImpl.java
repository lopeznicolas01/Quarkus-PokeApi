package cl.forum.arq.bts.service.impl;

import cl.forum.arq.bts.pojo.request.ListaRequest;
import cl.forum.arq.bts.pojo.request.PokemonRequest;

import javax.inject.Singleton;
import javax.ws.rs.core.Response;
import java.util.ArrayList;
import java.util.List;

import cl.forum.arq.bts.pojo.response.GetResponse;
import cl.forum.arq.bts.pojo.response.ListaResponse;
import cl.forum.arq.bts.pojo.response.TraerResponse;
import cl.forum.arq.bts.proxy.ListaProxy;
import cl.forum.arq.bts.proxy.TraerProxy;
import cl.forum.arq.bts.service.PokemonService;
import cl.forum.arq.bts.util.CodigoRetornoRest;
import org.eclipse.microprofile.rest.client.inject.RestClient;

@Singleton
public class PokemonServiceImpl implements PokemonService{
    @RestClient
    ListaProxy listaProxy;
    @RestClient
    TraerProxy traerProxy;

    @Override
    public Response obtenerListaPokemon(ListaRequest body){
        //List<String> listaPokemon =new ArrayList<>();
        //ListaResponse pokemon=listaProxy.obtenerPokemonLista(body.getCantidad());
        Response listaPokemon=listaProxy.TraerLista(body.getCantidad(),body.getOffset());
        GetResponse<ListaResponse> getResponse=new GetResponse<>();
        getResponse.setSuccess(true);
        getResponse.setBody(listaPokemon.readEntity(ListaResponse.class));
        ListaResponse respuestaFinal=getResponse.getBody();
        return CodigoRetornoRest.returnMessage(true,"200",respuestaFinal);
    }
    @Override
    public Response obtenerPokemon(PokemonRequest body){
        Response respuesta=traerProxy.TraerPokemon(body.getName());
        GetResponse<TraerResponse> getResponse=new GetResponse<>();
        getResponse.setSuccess(true);
        getResponse.setBody(respuesta.readEntity(TraerResponse.class));
        TraerResponse respuestaFinal=getResponse.getBody();
        return CodigoRetornoRest.returnMessage(true,"200",respuestaFinal);
    }

}
