package cl.forum.arq.bts.pojo.response;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Habilidades {
    @JsonProperty("ability")
    private Habilidad ability;
    @JsonProperty("is_hidden")
    private boolean is_hidden;
    @JsonProperty("slot")
    private int slot;

    public Habilidades() {
    }

    public Habilidades(Habilidad ability, boolean is_hidden, int slot) {
        this.ability = ability;
        this.is_hidden = is_hidden;
        this.slot = slot;
    }

    public Habilidad getAbility() {
        return ability;
    }

    public void setAbility(Habilidad ability) {
        this.ability = ability;
    }

    public boolean isIs_hidden() {
        return is_hidden;
    }

    public void setIs_hidden(boolean is_hidden) {
        this.is_hidden = is_hidden;
    }

    public int getSlot() {
        return slot;
    }

    public void setSlot(int slot) {
        this.slot = slot;
    }
}
