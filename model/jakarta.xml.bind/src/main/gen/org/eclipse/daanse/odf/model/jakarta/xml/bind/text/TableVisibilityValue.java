
package org.eclipse.daanse.odf.model.jakarta.xml.bind.text;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for table-visibility-value.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="table-visibility-value"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *     &lt;enumeration value="visible"/&gt;
 *     &lt;enumeration value="collapse"/&gt;
 *     &lt;enumeration value="filter"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "table-visibility-value")
@XmlEnum
public enum TableVisibilityValue {

    @XmlEnumValue("visible")
    VISIBLE("visible"),
    @XmlEnumValue("collapse")
    COLLAPSE("collapse"),
    @XmlEnumValue("filter")
    FILTER("filter");
    private final String value;

    TableVisibilityValue(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TableVisibilityValue fromValue(String v) {
        for (TableVisibilityValue c: TableVisibilityValue.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
