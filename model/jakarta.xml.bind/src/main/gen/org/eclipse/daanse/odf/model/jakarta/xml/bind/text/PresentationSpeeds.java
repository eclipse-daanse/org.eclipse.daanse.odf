
package org.eclipse.daanse.odf.model.jakarta.xml.bind.text;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for presentationSpeeds.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="presentationSpeeds"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *     &lt;enumeration value="slow"/&gt;
 *     &lt;enumeration value="medium"/&gt;
 *     &lt;enumeration value="fast"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "presentationSpeeds")
@XmlEnum
public enum PresentationSpeeds {

    @XmlEnumValue("slow")
    SLOW("slow"),
    @XmlEnumValue("medium")
    MEDIUM("medium"),
    @XmlEnumValue("fast")
    FAST("fast");
    private final String value;

    PresentationSpeeds(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PresentationSpeeds fromValue(String v) {
        for (PresentationSpeeds c: PresentationSpeeds.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
