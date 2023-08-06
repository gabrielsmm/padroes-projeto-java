package com.gabrielsmm.gof.comportamentais.template.sales.model;

public enum Category {

    ELETRONICS("Eletronics", 1),
    CLOTHES("Clothes", 2),
    SPORTS("Sports", 3);

    private String description;
    private int code;

    Category(String description, int code) {
        this.description = description;
        this.code = code;
    }

    public String getDescription() {
        return description;
    }

    public int getCode() {
        return code;
    }

}
