
package org.eclipse.daanse.odf.xml.text;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for fontPitch.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="fontPitch"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *     &lt;enumeration value="fixed"/&gt;
 *     &lt;enumeration value="variable"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "fontPitch")
@XmlEnum
public enum FontPitch {

    @XmlEnumValue("fixed")
    FIXED("fixed"),
    @XmlEnumValue("variable")
    VARIABLE("variable");
    private final String value;

    FontPitch(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static FontPitch fromValue(String v) {
        for (FontPitch c: FontPitch.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
