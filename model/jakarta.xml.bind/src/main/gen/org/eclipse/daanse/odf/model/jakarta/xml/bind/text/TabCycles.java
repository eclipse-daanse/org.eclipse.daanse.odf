
package org.eclipse.daanse.odf.model.jakarta.xml.bind.text;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for tab-cycles.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="tab-cycles"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *     &lt;enumeration value="records"/&gt;
 *     &lt;enumeration value="current"/&gt;
 *     &lt;enumeration value="page"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "tab-cycles")
@XmlEnum
public enum TabCycles {

    @XmlEnumValue("records")
    RECORDS("records"),
    @XmlEnumValue("current")
    CURRENT("current"),
    @XmlEnumValue("page")
    PAGE("page");
    private final String value;

    TabCycles(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TabCycles fromValue(String v) {
        for (TabCycles c: TabCycles.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
