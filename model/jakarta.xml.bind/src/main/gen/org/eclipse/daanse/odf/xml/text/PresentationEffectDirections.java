
package org.eclipse.daanse.odf.xml.text;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for presentationEffectDirections.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="presentationEffectDirections"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *     &lt;enumeration value="none"/&gt;
 *     &lt;enumeration value="from-left"/&gt;
 *     &lt;enumeration value="from-top"/&gt;
 *     &lt;enumeration value="from-right"/&gt;
 *     &lt;enumeration value="from-bottom"/&gt;
 *     &lt;enumeration value="from-center"/&gt;
 *     &lt;enumeration value="from-upper-left"/&gt;
 *     &lt;enumeration value="from-upper-right"/&gt;
 *     &lt;enumeration value="from-lower-left"/&gt;
 *     &lt;enumeration value="from-lower-right"/&gt;
 *     &lt;enumeration value="to-left"/&gt;
 *     &lt;enumeration value="to-top"/&gt;
 *     &lt;enumeration value="to-right"/&gt;
 *     &lt;enumeration value="to-bottom"/&gt;
 *     &lt;enumeration value="to-upper-left"/&gt;
 *     &lt;enumeration value="to-upper-right"/&gt;
 *     &lt;enumeration value="to-lower-right"/&gt;
 *     &lt;enumeration value="to-lower-left"/&gt;
 *     &lt;enumeration value="path"/&gt;
 *     &lt;enumeration value="spiral-inward-left"/&gt;
 *     &lt;enumeration value="spiral-inward-right"/&gt;
 *     &lt;enumeration value="spiral-outward-left"/&gt;
 *     &lt;enumeration value="spiral-outward-right"/&gt;
 *     &lt;enumeration value="vertical"/&gt;
 *     &lt;enumeration value="horizontal"/&gt;
 *     &lt;enumeration value="to-center"/&gt;
 *     &lt;enumeration value="clockwise"/&gt;
 *     &lt;enumeration value="counter-clockwise"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "presentationEffectDirections")
@XmlEnum
public enum PresentationEffectDirections {

    @XmlEnumValue("none")
    NONE("none"),
    @XmlEnumValue("from-left")
    FROM_LEFT("from-left"),
    @XmlEnumValue("from-top")
    FROM_TOP("from-top"),
    @XmlEnumValue("from-right")
    FROM_RIGHT("from-right"),
    @XmlEnumValue("from-bottom")
    FROM_BOTTOM("from-bottom"),
    @XmlEnumValue("from-center")
    FROM_CENTER("from-center"),
    @XmlEnumValue("from-upper-left")
    FROM_UPPER_LEFT("from-upper-left"),
    @XmlEnumValue("from-upper-right")
    FROM_UPPER_RIGHT("from-upper-right"),
    @XmlEnumValue("from-lower-left")
    FROM_LOWER_LEFT("from-lower-left"),
    @XmlEnumValue("from-lower-right")
    FROM_LOWER_RIGHT("from-lower-right"),
    @XmlEnumValue("to-left")
    TO_LEFT("to-left"),
    @XmlEnumValue("to-top")
    TO_TOP("to-top"),
    @XmlEnumValue("to-right")
    TO_RIGHT("to-right"),
    @XmlEnumValue("to-bottom")
    TO_BOTTOM("to-bottom"),
    @XmlEnumValue("to-upper-left")
    TO_UPPER_LEFT("to-upper-left"),
    @XmlEnumValue("to-upper-right")
    TO_UPPER_RIGHT("to-upper-right"),
    @XmlEnumValue("to-lower-right")
    TO_LOWER_RIGHT("to-lower-right"),
    @XmlEnumValue("to-lower-left")
    TO_LOWER_LEFT("to-lower-left"),
    @XmlEnumValue("path")
    PATH("path"),
    @XmlEnumValue("spiral-inward-left")
    SPIRAL_INWARD_LEFT("spiral-inward-left"),
    @XmlEnumValue("spiral-inward-right")
    SPIRAL_INWARD_RIGHT("spiral-inward-right"),
    @XmlEnumValue("spiral-outward-left")
    SPIRAL_OUTWARD_LEFT("spiral-outward-left"),
    @XmlEnumValue("spiral-outward-right")
    SPIRAL_OUTWARD_RIGHT("spiral-outward-right"),
    @XmlEnumValue("vertical")
    VERTICAL("vertical"),
    @XmlEnumValue("horizontal")
    HORIZONTAL("horizontal"),
    @XmlEnumValue("to-center")
    TO_CENTER("to-center"),
    @XmlEnumValue("clockwise")
    CLOCKWISE("clockwise"),
    @XmlEnumValue("counter-clockwise")
    COUNTER_CLOCKWISE("counter-clockwise");
    private final String value;

    PresentationEffectDirections(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PresentationEffectDirections fromValue(String v) {
        for (PresentationEffectDirections c: PresentationEffectDirections.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
