package com.java.clone;

import java.io.Serializable;

public class Inner implements Serializable {
    private static final long serialVersionUID = -9026685153638111193L;
    public String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Inner的name值为：" + name;
    }
}