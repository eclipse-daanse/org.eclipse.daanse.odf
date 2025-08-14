
package org.eclipse.daanse.odf.xml.text;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for fontStyle.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="fontStyle"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *     &lt;enumeration value="normal"/&gt;
 *     &lt;enumeration value="italic"/&gt;
 *     &lt;enumeration value="oblique"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "fontStyle")
@XmlEnum
public enum FontStyle {

    @XmlEnumValue("normal")
    NORMAL("normal"),
    @XmlEnumValue("italic")
    ITALIC("italic"),
    @XmlEnumValue("oblique")
    OBLIQUE("oblique");
    private final String value;

    FontStyle(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static FontStyle fromValue(String v) {
        for (FontStyle c: FontStyle.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
