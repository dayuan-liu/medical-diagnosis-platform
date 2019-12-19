package com.ldy.domain;

public class SysConfig {
    private String variable;
    private String value;
    private String set_by;

    public String getVariable() {
        return variable;
    }

    public void setVariable(String variable) {
        this.variable = variable;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getSet_by() {
        return set_by;
    }

    public void setSet_by(String set_by) {
        this.set_by = set_by;
    }

    @Override
    public String toString() {
        return "SysConfig{" +
                "variable='" + variable + '\'' +
                ", value='" + value + '\'' +
                ", set_by='" + set_by + '\'' + "12"+
                '}';
    }
}
