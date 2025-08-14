
package org.eclipse.daanse.odf.xml.text;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for gradient-style.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="gradient-style"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *     &lt;enumeration value="linear"/&gt;
 *     &lt;enumeration value="axial"/&gt;
 *     &lt;enumeration value="radial"/&gt;
 *     &lt;enumeration value="ellipsoid"/&gt;
 *     &lt;enumeration value="square"/&gt;
 *     &lt;enumeration value="rectangular"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "gradient-style")
@XmlEnum
public enum GradientStyle {

    @XmlEnumValue("linear")
    LINEAR("linear"),
    @XmlEnumValue("axial")
    AXIAL("axial"),
    @XmlEnumValue("radial")
    RADIAL("radial"),
    @XmlEnumValue("ellipsoid")
    ELLIPSOID("ellipsoid"),
    @XmlEnumValue("square")
    SQUARE("square"),
    @XmlEnumValue("rectangular")
    RECTANGULAR("rectangular");
    private final String value;

    GradientStyle(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static GradientStyle fromValue(String v) {
        for (GradientStyle c: GradientStyle.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
