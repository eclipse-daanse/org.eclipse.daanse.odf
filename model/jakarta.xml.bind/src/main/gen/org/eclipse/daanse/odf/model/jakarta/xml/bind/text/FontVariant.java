
package org.eclipse.daanse.odf.model.jakarta.xml.bind.text;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for fontVariant.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="fontVariant"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *     &lt;enumeration value="normal"/&gt;
 *     &lt;enumeration value="small-caps"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "fontVariant")
@XmlEnum
public enum FontVariant {

    @XmlEnumValue("normal")
    NORMAL("normal"),
    @XmlEnumValue("small-caps")
    SMALL_CAPS("small-caps");
    private final String value;

    FontVariant(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static FontVariant fromValue(String v) {
        for (FontVariant c: FontVariant.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
