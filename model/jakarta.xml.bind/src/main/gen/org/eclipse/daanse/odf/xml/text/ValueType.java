
package org.eclipse.daanse.odf.xml.text;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for valueType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="valueType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *     &lt;enumeration value="float"/&gt;
 *     &lt;enumeration value="time"/&gt;
 *     &lt;enumeration value="date"/&gt;
 *     &lt;enumeration value="percentage"/&gt;
 *     &lt;enumeration value="currency"/&gt;
 *     &lt;enumeration value="boolean"/&gt;
 *     &lt;enumeration value="string"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "valueType")
@XmlEnum
public enum ValueType {

    @XmlEnumValue("float")
    FLOAT("float"),
    @XmlEnumValue("time")
    TIME("time"),
    @XmlEnumValue("date")
    DATE("date"),
    @XmlEnumValue("percentage")
    PERCENTAGE("percentage"),
    @XmlEnumValue("currency")
    CURRENCY("currency"),
    @XmlEnumValue("boolean")
    BOOLEAN("boolean"),
    @XmlEnumValue("string")
    STRING("string");
    private final String value;

    ValueType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ValueType fromValue(String v) {
        for (ValueType c: ValueType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
