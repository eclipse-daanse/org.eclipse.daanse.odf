
package org.eclipse.daanse.odf.xml.text;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for horizontal-mirror.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="horizontal-mirror"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *     &lt;enumeration value="horizontal"/&gt;
 *     &lt;enumeration value="horizontal-on-odd"/&gt;
 *     &lt;enumeration value="horizontal-on-even"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "horizontal-mirror")
@XmlEnum
public enum HorizontalMirror {

    @XmlEnumValue("horizontal")
    HORIZONTAL("horizontal"),
    @XmlEnumValue("horizontal-on-odd")
    HORIZONTAL_ON_ODD("horizontal-on-odd"),
    @XmlEnumValue("horizontal-on-even")
    HORIZONTAL_ON_EVEN("horizontal-on-even");
    private final String value;

    HorizontalMirror(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static HorizontalMirror fromValue(String v) {
        for (HorizontalMirror c: HorizontalMirror.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
