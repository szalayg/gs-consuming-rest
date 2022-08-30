package com.example.consumingrest;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class CatFact {
private String fact;
private long length;

    public CatFact() {
    }

    public void setFact(String fact) {
        this.fact = fact;
    }

    public void setLength(long length) {
        this.length = length;
    }

    public String getFact() {
        return fact;
    }

    public long getLength() {
        return length;
    }

    @Override public String toString() {
        return "CatFact{" + "fact='" + fact + '\'' + ", length=" + length + '}';
    }
}
