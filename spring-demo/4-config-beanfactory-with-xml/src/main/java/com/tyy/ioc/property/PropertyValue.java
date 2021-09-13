package com.tyy.ioc.property;

/**
 * @author:tyy
 * @date:2021/8/28
 */
public class PropertyValue {

    private String name;

    private String value;

    public PropertyValue() {

    }

    public PropertyValue(String name, String value) {
        this.name = name;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
