
package org.eclipse.daanse.odf.model.jakarta.xml.bind.text;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for states.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="states"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *     &lt;enumeration value="unchecked"/&gt;
 *     &lt;enumeration value="checked"/&gt;
 *     &lt;enumeration value="unknown"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "states")
@XmlEnum
public enum States {

    @XmlEnumValue("unchecked")
    UNCHECKED("unchecked"),
    @XmlEnumValue("checked")
    CHECKED("checked"),
    @XmlEnumValue("unknown")
    UNKNOWN("unknown");
    private final String value;

    States(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static States fromValue(String v) {
        for (States c: States.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
