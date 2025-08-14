
package org.eclipse.daanse.odf.model.jakarta.xml.bind.text;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for vertBackPos.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="vertBackPos"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *     &lt;enumeration value="top"/&gt;
 *     &lt;enumeration value="center"/&gt;
 *     &lt;enumeration value="bottom"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "vertBackPos")
@XmlEnum
public enum VertBackPos {

    @XmlEnumValue("top")
    TOP("top"),
    @XmlEnumValue("center")
    CENTER("center"),
    @XmlEnumValue("bottom")
    BOTTOM("bottom");
    private final String value;

    VertBackPos(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static VertBackPos fromValue(String v) {
        for (VertBackPos c: VertBackPos.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
