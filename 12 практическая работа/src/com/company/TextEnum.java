package com.company;

public enum TextEnum {
    TEXT1("Hello1"),
    TEXT2("Hello2"),
    TEXT3("Hello3"),
    TEXT4("Hello4");
    private final String field;

    TextEnum(String field) {
        this.field = field;
    }

    public String getField() {
        return field;
    }
}
