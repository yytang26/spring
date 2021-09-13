package com.tyy.ioc.property;

import java.util.ArrayList;
import java.util.List;

/**
 * @author:tyy
 * @date:2021/8/28
 */
public class PropertyValues {

    private final List<PropertyValue> propertyValueList = new ArrayList<PropertyValue>();

    public PropertyValues() {

    }

    public void addPropertyValue(PropertyValue propertyValue) {
        this.propertyValueList.add(propertyValue);
    }

    public List<PropertyValue> getPropertyValue() {
        return this.propertyValueList;
    }
}
