
package org.eclipse.daanse.odf.model.jakarta.xml.bind.text;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for types.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="types"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *     &lt;enumeration value="submit"/&gt;
 *     &lt;enumeration value="reset"/&gt;
 *     &lt;enumeration value="push"/&gt;
 *     &lt;enumeration value="url"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "types")
@XmlEnum
public enum Types {

    @XmlEnumValue("submit")
    SUBMIT("submit"),
    @XmlEnumValue("reset")
    RESET("reset"),
    @XmlEnumValue("push")
    PUSH("push"),
    @XmlEnumValue("url")
    URL("url");
    private final String value;

    Types(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static Types fromValue(String v) {
        for (Types c: Types.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
