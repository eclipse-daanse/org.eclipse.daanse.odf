
package org.eclipse.daanse.odf.xml.text;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for fontFamilyGeneric.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="fontFamilyGeneric"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *     &lt;enumeration value="roman"/&gt;
 *     &lt;enumeration value="swiss"/&gt;
 *     &lt;enumeration value="modern"/&gt;
 *     &lt;enumeration value="decorative"/&gt;
 *     &lt;enumeration value="script"/&gt;
 *     &lt;enumeration value="system"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "fontFamilyGeneric")
@XmlEnum
public enum FontFamilyGeneric {

    @XmlEnumValue("roman")
    ROMAN("roman"),
    @XmlEnumValue("swiss")
    SWISS("swiss"),
    @XmlEnumValue("modern")
    MODERN("modern"),
    @XmlEnumValue("decorative")
    DECORATIVE("decorative"),
    @XmlEnumValue("script")
    SCRIPT("script"),
    @XmlEnumValue("system")
    SYSTEM("system");
    private final String value;

    FontFamilyGeneric(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static FontFamilyGeneric fromValue(String v) {
        for (FontFamilyGeneric c: FontFamilyGeneric.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
