
package org.eclipse.daanse.odf.xml.text;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for db-data-source-setting-types.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="db-data-source-setting-types"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *     &lt;enumeration value="boolean"/&gt;
 *     &lt;enumeration value="short"/&gt;
 *     &lt;enumeration value="int"/&gt;
 *     &lt;enumeration value="long"/&gt;
 *     &lt;enumeration value="double"/&gt;
 *     &lt;enumeration value="string"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "db-data-source-setting-types")
@XmlEnum
public enum DbDataSourceSettingTypes {

    @XmlEnumValue("boolean")
    BOOLEAN("boolean"),
    @XmlEnumValue("short")
    SHORT("short"),
    @XmlEnumValue("int")
    INT("int"),
    @XmlEnumValue("long")
    LONG("long"),
    @XmlEnumValue("double")
    DOUBLE("double"),
    @XmlEnumValue("string")
    STRING("string");
    private final String value;

    DbDataSourceSettingTypes(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DbDataSourceSettingTypes fromValue(String v) {
        for (DbDataSourceSettingTypes c: DbDataSourceSettingTypes.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
