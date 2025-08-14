
package org.eclipse.daanse.odf.model.jakarta.xml.bind.text;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for common-ref-format-values.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="common-ref-format-values"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *     &lt;enumeration value="page"/&gt;
 *     &lt;enumeration value="chapter"/&gt;
 *     &lt;enumeration value="direction"/&gt;
 *     &lt;enumeration value="text"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "common-ref-format-values")
@XmlEnum
public enum CommonRefFormatValues {

    @XmlEnumValue("page")
    PAGE("page"),
    @XmlEnumValue("chapter")
    CHAPTER("chapter"),
    @XmlEnumValue("direction")
    DIRECTION("direction"),
    @XmlEnumValue("text")
    TEXT("text");
    private final String value;

    CommonRefFormatValues(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CommonRefFormatValues fromValue(String v) {
        for (CommonRefFormatValues c: CommonRefFormatValues.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
