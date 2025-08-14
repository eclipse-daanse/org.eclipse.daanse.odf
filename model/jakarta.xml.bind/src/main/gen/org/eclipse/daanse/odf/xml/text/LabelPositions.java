
package org.eclipse.daanse.odf.xml.text;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for labelPositions.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="labelPositions"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *     &lt;enumeration value="avoid-overlap"/&gt;
 *     &lt;enumeration value="center"/&gt;
 *     &lt;enumeration value="top"/&gt;
 *     &lt;enumeration value="top-right"/&gt;
 *     &lt;enumeration value="right"/&gt;
 *     &lt;enumeration value="bottom-right"/&gt;
 *     &lt;enumeration value="bottom"/&gt;
 *     &lt;enumeration value="bottom-left"/&gt;
 *     &lt;enumeration value="left"/&gt;
 *     &lt;enumeration value="top-left"/&gt;
 *     &lt;enumeration value="inside"/&gt;
 *     &lt;enumeration value="outside"/&gt;
 *     &lt;enumeration value="near-origin"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "labelPositions")
@XmlEnum
public enum LabelPositions {

    @XmlEnumValue("avoid-overlap")
    AVOID_OVERLAP("avoid-overlap"),
    @XmlEnumValue("center")
    CENTER("center"),
    @XmlEnumValue("top")
    TOP("top"),
    @XmlEnumValue("top-right")
    TOP_RIGHT("top-right"),
    @XmlEnumValue("right")
    RIGHT("right"),
    @XmlEnumValue("bottom-right")
    BOTTOM_RIGHT("bottom-right"),
    @XmlEnumValue("bottom")
    BOTTOM("bottom"),
    @XmlEnumValue("bottom-left")
    BOTTOM_LEFT("bottom-left"),
    @XmlEnumValue("left")
    LEFT("left"),
    @XmlEnumValue("top-left")
    TOP_LEFT("top-left"),
    @XmlEnumValue("inside")
    INSIDE("inside"),
    @XmlEnumValue("outside")
    OUTSIDE("outside"),
    @XmlEnumValue("near-origin")
    NEAR_ORIGIN("near-origin");
    private final String value;

    LabelPositions(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static LabelPositions fromValue(String v) {
        for (LabelPositions c: LabelPositions.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
