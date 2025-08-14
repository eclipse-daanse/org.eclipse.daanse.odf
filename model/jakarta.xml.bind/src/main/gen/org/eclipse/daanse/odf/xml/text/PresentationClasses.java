
package org.eclipse.daanse.odf.xml.text;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for presentation-classes.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="presentation-classes"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *     &lt;enumeration value="title"/&gt;
 *     &lt;enumeration value="outline"/&gt;
 *     &lt;enumeration value="subtitle"/&gt;
 *     &lt;enumeration value="text"/&gt;
 *     &lt;enumeration value="graphic"/&gt;
 *     &lt;enumeration value="object"/&gt;
 *     &lt;enumeration value="chart"/&gt;
 *     &lt;enumeration value="table"/&gt;
 *     &lt;enumeration value="orgchart"/&gt;
 *     &lt;enumeration value="page"/&gt;
 *     &lt;enumeration value="notes"/&gt;
 *     &lt;enumeration value="handout"/&gt;
 *     &lt;enumeration value="header"/&gt;
 *     &lt;enumeration value="footer"/&gt;
 *     &lt;enumeration value="date-time"/&gt;
 *     &lt;enumeration value="page-number"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "presentation-classes")
@XmlEnum
public enum PresentationClasses {

    @XmlEnumValue("title")
    TITLE("title"),
    @XmlEnumValue("outline")
    OUTLINE("outline"),
    @XmlEnumValue("subtitle")
    SUBTITLE("subtitle"),
    @XmlEnumValue("text")
    TEXT("text"),
    @XmlEnumValue("graphic")
    GRAPHIC("graphic"),
    @XmlEnumValue("object")
    OBJECT("object"),
    @XmlEnumValue("chart")
    CHART("chart"),
    @XmlEnumValue("table")
    TABLE("table"),
    @XmlEnumValue("orgchart")
    ORGCHART("orgchart"),
    @XmlEnumValue("page")
    PAGE("page"),
    @XmlEnumValue("notes")
    NOTES("notes"),
    @XmlEnumValue("handout")
    HANDOUT("handout"),
    @XmlEnumValue("header")
    HEADER("header"),
    @XmlEnumValue("footer")
    FOOTER("footer"),
    @XmlEnumValue("date-time")
    DATE_TIME("date-time"),
    @XmlEnumValue("page-number")
    PAGE_NUMBER("page-number");
    private final String value;

    PresentationClasses(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PresentationClasses fromValue(String v) {
        for (PresentationClasses c: PresentationClasses.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
