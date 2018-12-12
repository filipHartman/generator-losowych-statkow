package com.company.app;

public class Field {

    private int index;
    private boolean isMarked;

    public Field(int index, boolean isMarked) {
        this.index = index;
        this.isMarked = isMarked;
    }

    public int getIndex() {
        return index;
    }

    public boolean isMarked() {
        return isMarked;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public void setMarked(boolean marked) {
        isMarked = marked;
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

