package cl.forum.arq.bts.pojo.request;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PokemonRequest {
    @JsonProperty("name")
    private String name;

    public PokemonRequest() {
    }

    public PokemonRequest(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
