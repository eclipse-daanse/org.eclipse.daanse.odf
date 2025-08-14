
package org.eclipse.daanse.odf.model.jakarta.xml.bind.text;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for presentationEffects.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="presentationEffects"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *     &lt;enumeration value="none"/&gt;
 *     &lt;enumeration value="fade"/&gt;
 *     &lt;enumeration value="move"/&gt;
 *     &lt;enumeration value="stripes"/&gt;
 *     &lt;enumeration value="open"/&gt;
 *     &lt;enumeration value="close"/&gt;
 *     &lt;enumeration value="dissolve"/&gt;
 *     &lt;enumeration value="wavyline"/&gt;
 *     &lt;enumeration value="random"/&gt;
 *     &lt;enumeration value="lines"/&gt;
 *     &lt;enumeration value="laser"/&gt;
 *     &lt;enumeration value="appear"/&gt;
 *     &lt;enumeration value="hide"/&gt;
 *     &lt;enumeration value="move-short"/&gt;
 *     &lt;enumeration value="checkerboard"/&gt;
 *     &lt;enumeration value="rotate"/&gt;
 *     &lt;enumeration value="stretch"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "presentationEffects")
@XmlEnum
public enum PresentationEffects {

    @XmlEnumValue("none")
    NONE("none"),
    @XmlEnumValue("fade")
    FADE("fade"),
    @XmlEnumValue("move")
    MOVE("move"),
    @XmlEnumValue("stripes")
    STRIPES("stripes"),
    @XmlEnumValue("open")
    OPEN("open"),
    @XmlEnumValue("close")
    CLOSE("close"),
    @XmlEnumValue("dissolve")
    DISSOLVE("dissolve"),
    @XmlEnumValue("wavyline")
    WAVYLINE("wavyline"),
    @XmlEnumValue("random")
    RANDOM("random"),
    @XmlEnumValue("lines")
    LINES("lines"),
    @XmlEnumValue("laser")
    LASER("laser"),
    @XmlEnumValue("appear")
    APPEAR("appear"),
    @XmlEnumValue("hide")
    HIDE("hide"),
    @XmlEnumValue("move-short")
    MOVE_SHORT("move-short"),
    @XmlEnumValue("checkerboard")
    CHECKERBOARD("checkerboard"),
    @XmlEnumValue("rotate")
    ROTATE("rotate"),
    @XmlEnumValue("stretch")
    STRETCH("stretch");
    private final String value;

    PresentationEffects(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PresentationEffects fromValue(String v) {
        for (PresentationEffects c: PresentationEffects.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
