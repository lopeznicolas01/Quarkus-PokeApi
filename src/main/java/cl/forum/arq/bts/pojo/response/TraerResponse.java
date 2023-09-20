package cl.forum.arq.bts.pojo.response;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class TraerResponse {
    @JsonProperty("name")
    private String name;
    @JsonProperty("weight")
    private int weight;
    @JsonProperty("height")
    private int height;
    @JsonProperty("id")
    private int id;
    @JsonProperty ("order")
    private int order;
    @JsonProperty("is_default")
    private boolean is_default;
    @JsonProperty("abilities")
    private List <Habilidades> abilities;

    public TraerResponse() {
    }

    public TraerResponse(String name, int weight, int height, int id, int order, boolean is_default, List<Habilidades> abilities) {
        this.name = name;
        this.weight = weight;
        this.height = height;
        this.id = id;
        this.order = order;
        this.is_default = is_default;
        this.abilities = abilities;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getOrder() {
        return order;
    }

    public void setOrder(int order) {
        this.order = order;
    }

    public boolean isIs_default() {
        return is_default;
    }

    public void setIs_default(boolean is_default) {
        this.is_default = is_default;
    }

    public List<Habilidades> getAbilities() {
        return abilities;
    }

    public void setAbilities(List<Habilidades> abilities) {
        this.abilities = abilities;
    }
}
