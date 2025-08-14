
package org.eclipse.daanse.odf.model.jakarta.xml.bind.text;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for lineStyle.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="lineStyle"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *     &lt;enumeration value="none"/&gt;
 *     &lt;enumeration value="solid"/&gt;
 *     &lt;enumeration value="dotted"/&gt;
 *     &lt;enumeration value="dash"/&gt;
 *     &lt;enumeration value="long-dash"/&gt;
 *     &lt;enumeration value="dot-dash"/&gt;
 *     &lt;enumeration value="dot-dot-dash"/&gt;
 *     &lt;enumeration value="wave"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "lineStyle")
@XmlEnum
public enum LineStyle {

    @XmlEnumValue("none")
    NONE("none"),
    @XmlEnumValue("solid")
    SOLID("solid"),
    @XmlEnumValue("dotted")
    DOTTED("dotted"),
    @XmlEnumValue("dash")
    DASH("dash"),
    @XmlEnumValue("long-dash")
    LONG_DASH("long-dash"),
    @XmlEnumValue("dot-dash")
    DOT_DASH("dot-dash"),
    @XmlEnumValue("dot-dot-dash")
    DOT_DOT_DASH("dot-dot-dash"),
    @XmlEnumValue("wave")
    WAVE("wave");
    private final String value;

    LineStyle(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static LineStyle fromValue(String v) {
        for (LineStyle c: LineStyle.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
