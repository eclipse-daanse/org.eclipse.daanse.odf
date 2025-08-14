
package org.eclipse.daanse.odf.model.jakarta.xml.bind.text;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for rowOrCol.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="rowOrCol"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *     &lt;enumeration value="row"/&gt;
 *     &lt;enumeration value="column"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "rowOrCol")
@XmlEnum
public enum RowOrCol {

    @XmlEnumValue("row")
    ROW("row"),
    @XmlEnumValue("column")
    COLUMN("column");
    private final String value;

    RowOrCol(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static RowOrCol fromValue(String v) {
        for (RowOrCol c: RowOrCol.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
