package com.company.app;

import java.util.List;

public class Ship {
    private List<Field> fields;
    private boolean sunk;

    public Ship(List<Field> fields) {
        this.fields = fields;
        this.sunk = false;
    }

    public List<Field> getFields() {
        return fields;
    }

    public boolean isSunk() {
        return sunk;
    }

    public void setSunk(boolean sunk) {
        this.sunk = sunk;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}
