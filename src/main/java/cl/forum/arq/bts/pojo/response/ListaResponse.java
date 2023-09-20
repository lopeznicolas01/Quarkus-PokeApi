package cl.forum.arq.bts.pojo.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import java.util.List;

public class ListaResponse {
    @JsonPropertyOrder("count,results")
    @JsonProperty("count")
    private int count;
    @JsonProperty("results")
    private List<Resultado> results;

    public ListaResponse() {
    }

    public ListaResponse(List<Resultado> results, int count) {
        this.results = results;
        this.count = count;
    }

    public List<Resultado> getResults() {
        return results;
    }

    public void setResults(List<Resultado> results) {
        this.results = results;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}