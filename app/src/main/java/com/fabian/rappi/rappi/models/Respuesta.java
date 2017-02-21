package com.fabian.rappi.rappi.models;

import java.io.Serializable;
import java.util.List;

public class Respuesta implements Serializable {

    /**
     * Atributos
     */

    private String modhash;
    private List<Child> children = null;
    private String after;
    private Object before;

    /**
     * Metodos Get y Set
     */

    public String getModhash() {
        return modhash;
    }
    public void setModhash(String modhash) {
        this.modhash = modhash;
    }

    public List<Child> getChildren() {
        return children;
    }
    public void setChildren(List<Child> children) {
        this.children = children;
    }

    public String getAfter() {
        return after;
    }
    public void setAfter(String after) {
        this.after = after;
    }

    public Object getBefore() {
        return before;
    }
    public void setBefore(Object before) {
        this.before = before;
    }
}
