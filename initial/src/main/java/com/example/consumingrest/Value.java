package com.example.consumingrest;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Value {

    private Long length;
    private String fact;

    public Value() {
    }

    public Long getlength() {
        return this.length;
    }

    public String getFact() {
        return this.fact;
    }

    public void setLength(Long length) {
        this.length = length;
    }

    public void setFact(String fact) {
        this.fact = fact;
    }

    @Override
    public String toString() {
        return "Value{" +
            "length=" + length +
            ", fact='" + fact + '\'' +
            '}';
    }
}
