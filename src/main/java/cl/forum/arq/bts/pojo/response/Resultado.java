package cl.forum.arq.bts.pojo.response;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Resultado {
    @JsonProperty("name")
    private String name;
    @JsonProperty("url")
    private String url;

    public Resultado() {
    }

    public Resultado(String name, String url) {
        this.name = name;
        this.url = url;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}