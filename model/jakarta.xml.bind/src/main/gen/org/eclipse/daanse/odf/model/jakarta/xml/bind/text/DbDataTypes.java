
package org.eclipse.daanse.odf.model.jakarta.xml.bind.text;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for db-data-types.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="db-data-types"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *     &lt;enumeration value="bit"/&gt;
 *     &lt;enumeration value="boolean"/&gt;
 *     &lt;enumeration value="tinyint"/&gt;
 *     &lt;enumeration value="smallint"/&gt;
 *     &lt;enumeration value="integer"/&gt;
 *     &lt;enumeration value="bigint"/&gt;
 *     &lt;enumeration value="float"/&gt;
 *     &lt;enumeration value="real"/&gt;
 *     &lt;enumeration value="double"/&gt;
 *     &lt;enumeration value="numeric"/&gt;
 *     &lt;enumeration value="decimal"/&gt;
 *     &lt;enumeration value="char"/&gt;
 *     &lt;enumeration value="varchar"/&gt;
 *     &lt;enumeration value="longvarchar"/&gt;
 *     &lt;enumeration value="date"/&gt;
 *     &lt;enumeration value="time"/&gt;
 *     &lt;enumeration value="timestmp"/&gt;
 *     &lt;enumeration value="binary"/&gt;
 *     &lt;enumeration value="varbinary"/&gt;
 *     &lt;enumeration value="longvarbinary"/&gt;
 *     &lt;enumeration value="sqlnull"/&gt;
 *     &lt;enumeration value="other"/&gt;
 *     &lt;enumeration value="object"/&gt;
 *     &lt;enumeration value="distinct"/&gt;
 *     &lt;enumeration value="struct"/&gt;
 *     &lt;enumeration value="array"/&gt;
 *     &lt;enumeration value="blob"/&gt;
 *     &lt;enumeration value="clob"/&gt;
 *     &lt;enumeration value="ref"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "db-data-types")
@XmlEnum
public enum DbDataTypes {

    @XmlEnumValue("bit")
    BIT("bit"),
    @XmlEnumValue("boolean")
    BOOLEAN("boolean"),
    @XmlEnumValue("tinyint")
    TINYINT("tinyint"),
    @XmlEnumValue("smallint")
    SMALLINT("smallint"),
    @XmlEnumValue("integer")
    INTEGER("integer"),
    @XmlEnumValue("bigint")
    BIGINT("bigint"),
    @XmlEnumValue("float")
    FLOAT("float"),
    @XmlEnumValue("real")
    REAL("real"),
    @XmlEnumValue("double")
    DOUBLE("double"),
    @XmlEnumValue("numeric")
    NUMERIC("numeric"),
    @XmlEnumValue("decimal")
    DECIMAL("decimal"),
    @XmlEnumValue("char")
    CHAR("char"),
    @XmlEnumValue("varchar")
    VARCHAR("varchar"),
    @XmlEnumValue("longvarchar")
    LONGVARCHAR("longvarchar"),
    @XmlEnumValue("date")
    DATE("date"),
    @XmlEnumValue("time")
    TIME("time"),
    @XmlEnumValue("timestmp")
    TIMESTMP("timestmp"),
    @XmlEnumValue("binary")
    BINARY("binary"),
    @XmlEnumValue("varbinary")
    VARBINARY("varbinary"),
    @XmlEnumValue("longvarbinary")
    LONGVARBINARY("longvarbinary"),
    @XmlEnumValue("sqlnull")
    SQLNULL("sqlnull"),
    @XmlEnumValue("other")
    OTHER("other"),
    @XmlEnumValue("object")
    OBJECT("object"),
    @XmlEnumValue("distinct")
    DISTINCT("distinct"),
    @XmlEnumValue("struct")
    STRUCT("struct"),
    @XmlEnumValue("array")
    ARRAY("array"),
    @XmlEnumValue("blob")
    BLOB("blob"),
    @XmlEnumValue("clob")
    CLOB("clob"),
    @XmlEnumValue("ref")
    REF("ref");
    private final String value;

    DbDataTypes(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DbDataTypes fromValue(String v) {
        for (DbDataTypes c: DbDataTypes.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
