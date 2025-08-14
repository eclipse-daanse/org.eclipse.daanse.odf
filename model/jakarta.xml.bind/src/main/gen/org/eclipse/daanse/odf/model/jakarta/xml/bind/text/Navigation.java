
package org.eclipse.daanse.odf.model.jakarta.xml.bind.text;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for navigation.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="navigation"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *     &lt;enumeration value="none"/&gt;
 *     &lt;enumeration value="current"/&gt;
 *     &lt;enumeration value="parent"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "navigation")
@XmlEnum
public enum Navigation {

    @XmlEnumValue("none")
    NONE("none"),
    @XmlEnumValue("current")
    CURRENT("current"),
    @XmlEnumValue("parent")
    PARENT("parent");
    private final String value;

    Navigation(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static Navigation fromValue(String v) {
        for (Navigation c: Navigation.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
