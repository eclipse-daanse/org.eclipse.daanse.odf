
package org.eclipse.daanse.odf.xml.text;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for text-bibliography-types.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="text-bibliography-types"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *     &lt;enumeration value="article"/&gt;
 *     &lt;enumeration value="book"/&gt;
 *     &lt;enumeration value="booklet"/&gt;
 *     &lt;enumeration value="conference"/&gt;
 *     &lt;enumeration value="custom1"/&gt;
 *     &lt;enumeration value="custom2"/&gt;
 *     &lt;enumeration value="custom3"/&gt;
 *     &lt;enumeration value="custom4"/&gt;
 *     &lt;enumeration value="custom5"/&gt;
 *     &lt;enumeration value="email"/&gt;
 *     &lt;enumeration value="inbook"/&gt;
 *     &lt;enumeration value="incollection"/&gt;
 *     &lt;enumeration value="inproceedings"/&gt;
 *     &lt;enumeration value="journal"/&gt;
 *     &lt;enumeration value="manual"/&gt;
 *     &lt;enumeration value="mastersthesis"/&gt;
 *     &lt;enumeration value="misc"/&gt;
 *     &lt;enumeration value="phdthesis"/&gt;
 *     &lt;enumeration value="proceedings"/&gt;
 *     &lt;enumeration value="techreport"/&gt;
 *     &lt;enumeration value="unpublished"/&gt;
 *     &lt;enumeration value="www"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "text-bibliography-types")
@XmlEnum
public enum TextBibliographyTypes {

    @XmlEnumValue("article")
    ARTICLE("article"),
    @XmlEnumValue("book")
    BOOK("book"),
    @XmlEnumValue("booklet")
    BOOKLET("booklet"),
    @XmlEnumValue("conference")
    CONFERENCE("conference"),
    @XmlEnumValue("custom1")
    CUSTOM_1("custom1"),
    @XmlEnumValue("custom2")
    CUSTOM_2("custom2"),
    @XmlEnumValue("custom3")
    CUSTOM_3("custom3"),
    @XmlEnumValue("custom4")
    CUSTOM_4("custom4"),
    @XmlEnumValue("custom5")
    CUSTOM_5("custom5"),
    @XmlEnumValue("email")
    EMAIL("email"),
    @XmlEnumValue("inbook")
    INBOOK("inbook"),
    @XmlEnumValue("incollection")
    INCOLLECTION("incollection"),
    @XmlEnumValue("inproceedings")
    INPROCEEDINGS("inproceedings"),
    @XmlEnumValue("journal")
    JOURNAL("journal"),
    @XmlEnumValue("manual")
    MANUAL("manual"),
    @XmlEnumValue("mastersthesis")
    MASTERSTHESIS("mastersthesis"),
    @XmlEnumValue("misc")
    MISC("misc"),
    @XmlEnumValue("phdthesis")
    PHDTHESIS("phdthesis"),
    @XmlEnumValue("proceedings")
    PROCEEDINGS("proceedings"),
    @XmlEnumValue("techreport")
    TECHREPORT("techreport"),
    @XmlEnumValue("unpublished")
    UNPUBLISHED("unpublished"),
    @XmlEnumValue("www")
    WWW("www");
    private final String value;

    TextBibliographyTypes(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TextBibliographyTypes fromValue(String v) {
        for (TextBibliographyTypes c: TextBibliographyTypes.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
