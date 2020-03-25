package com.java.clone;

import java.io.Serializable;
import java.util.Objects;

public class Inner implements Serializable {
    private static final long serialVersionUID = -9026685153638111193L;
    public String name;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Inner inner = (Inner) o;
        return name.equals(inner.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

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