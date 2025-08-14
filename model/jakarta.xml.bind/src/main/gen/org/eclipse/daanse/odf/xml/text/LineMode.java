
package org.eclipse.daanse.odf.xml.text;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for lineMode.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="lineMode"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *     &lt;enumeration value="continuous"/&gt;
 *     &lt;enumeration value="skip-white-space"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "lineMode")
@XmlEnum
public enum LineMode {

    @XmlEnumValue("continuous")
    CONTINUOUS("continuous"),
    @XmlEnumValue("skip-white-space")
    SKIP_WHITE_SPACE("skip-white-space");
    private final String value;

    LineMode(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static LineMode fromValue(String v) {
        for (LineMode c: LineMode.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
