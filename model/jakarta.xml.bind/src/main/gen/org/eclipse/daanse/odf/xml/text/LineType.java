
package org.eclipse.daanse.odf.xml.text;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for lineType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="lineType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *     &lt;enumeration value="none"/&gt;
 *     &lt;enumeration value="single"/&gt;
 *     &lt;enumeration value="double"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "lineType")
@XmlEnum
public enum LineType {

    @XmlEnumValue("none")
    NONE("none"),
    @XmlEnumValue("single")
    SINGLE("single"),
    @XmlEnumValue("double")
    DOUBLE("double");
    private final String value;

    LineType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static LineType fromValue(String v) {
        for (LineType c: LineType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
