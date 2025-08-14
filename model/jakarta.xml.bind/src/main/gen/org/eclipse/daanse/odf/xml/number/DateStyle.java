
package org.eclipse.daanse.odf.xml.number;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlElementRefs;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.eclipse.daanse.odf.xml.style.Map;
import org.eclipse.daanse.odf.xml.style.TextProperties;
import org.eclipse.daanse.odf.xml.text.Boolean;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:oasis:names:tc:opendocument:xmlns:style:1.0}text-properties" minOccurs="0"/&gt;
 *         &lt;group ref="{urn:oasis:names:tc:opendocument:xmlns:text:1.0}number-text-with-fillchar" minOccurs="0"/&gt;
 *         &lt;sequence maxOccurs="unbounded"&gt;
 *           &lt;group ref="{urn:oasis:names:tc:opendocument:xmlns:text:1.0}any-date"/&gt;
 *           &lt;group ref="{urn:oasis:names:tc:opendocument:xmlns:text:1.0}number-text-with-fillchar" minOccurs="0"/&gt;
 *         &lt;/sequence&gt;
 *         &lt;element ref="{urn:oasis:names:tc:opendocument:xmlns:style:1.0}map" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attGroup ref="{urn:oasis:names:tc:opendocument:xmlns:text:1.0}common-auto-reorder-attlist"/&gt;
 *       &lt;attGroup ref="{urn:oasis:names:tc:opendocument:xmlns:text:1.0}common-format-source-attlist"/&gt;
 *       &lt;attGroup ref="{urn:oasis:names:tc:opendocument:xmlns:text:1.0}common-data-style-attlist"/&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "content"
})
@XmlRootElement(name = "date-style")
public class DateStyle {

    @XmlElementRefs({
        @XmlElementRef(name = "text-properties", namespace = "urn:oasis:names:tc:opendocument:xmlns:style:1.0", type = TextProperties.class, required = false),
        @XmlElementRef(name = "text", namespace = "urn:oasis:names:tc:opendocument:xmlns:datastyle:1.0", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "fill-character", namespace = "urn:oasis:names:tc:opendocument:xmlns:datastyle:1.0", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "day", namespace = "urn:oasis:names:tc:opendocument:xmlns:datastyle:1.0", type = Day.class, required = false),
        @XmlElementRef(name = "month", namespace = "urn:oasis:names:tc:opendocument:xmlns:datastyle:1.0", type = Month.class, required = false),
        @XmlElementRef(name = "year", namespace = "urn:oasis:names:tc:opendocument:xmlns:datastyle:1.0", type = Year.class, required = false),
        @XmlElementRef(name = "era", namespace = "urn:oasis:names:tc:opendocument:xmlns:datastyle:1.0", type = Era.class, required = false),
        @XmlElementRef(name = "day-of-week", namespace = "urn:oasis:names:tc:opendocument:xmlns:datastyle:1.0", type = DayOfWeek.class, required = false),
        @XmlElementRef(name = "week-of-year", namespace = "urn:oasis:names:tc:opendocument:xmlns:datastyle:1.0", type = WeekOfYear.class, required = false),
        @XmlElementRef(name = "quarter", namespace = "urn:oasis:names:tc:opendocument:xmlns:datastyle:1.0", type = Quarter.class, required = false),
        @XmlElementRef(name = "hours", namespace = "urn:oasis:names:tc:opendocument:xmlns:datastyle:1.0", type = Hours.class, required = false),
        @XmlElementRef(name = "am-pm", namespace = "urn:oasis:names:tc:opendocument:xmlns:datastyle:1.0", type = AmPm.class, required = false),
        @XmlElementRef(name = "minutes", namespace = "urn:oasis:names:tc:opendocument:xmlns:datastyle:1.0", type = Minutes.class, required = false),
        @XmlElementRef(name = "seconds", namespace = "urn:oasis:names:tc:opendocument:xmlns:datastyle:1.0", type = Seconds.class, required = false),
        @XmlElementRef(name = "map", namespace = "urn:oasis:names:tc:opendocument:xmlns:style:1.0", type = Map.class, required = false)
    })
    protected List<Object> content;
    @XmlAttribute(name = "automatic-order", namespace = "urn:oasis:names:tc:opendocument:xmlns:datastyle:1.0")
    protected Boolean automaticOrder;
    @XmlAttribute(name = "format-source", namespace = "urn:oasis:names:tc:opendocument:xmlns:datastyle:1.0")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String formatSource;
    @XmlAttribute(name = "display-name", namespace = "urn:oasis:names:tc:opendocument:xmlns:style:1.0")
    protected String displayName;
    @XmlAttribute(name = "language", namespace = "urn:oasis:names:tc:opendocument:xmlns:datastyle:1.0")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String language;
    @XmlAttribute(name = "country", namespace = "urn:oasis:names:tc:opendocument:xmlns:datastyle:1.0")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String country;
    @XmlAttribute(name = "script", namespace = "urn:oasis:names:tc:opendocument:xmlns:datastyle:1.0")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String script;
    @XmlAttribute(name = "rfc-language-tag", namespace = "urn:oasis:names:tc:opendocument:xmlns:datastyle:1.0")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String rfcLanguageTag;
    @XmlAttribute(name = "title", namespace = "urn:oasis:names:tc:opendocument:xmlns:datastyle:1.0")
    protected String title;
    @XmlAttribute(name = "volatile", namespace = "urn:oasis:names:tc:opendocument:xmlns:style:1.0")
    protected Boolean _volatile;
    @XmlAttribute(name = "transliteration-format", namespace = "urn:oasis:names:tc:opendocument:xmlns:datastyle:1.0")
    protected String transliterationFormat;
    @XmlAttribute(name = "transliteration-language", namespace = "urn:oasis:names:tc:opendocument:xmlns:datastyle:1.0")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String transliterationLanguage;
    @XmlAttribute(name = "transliteration-country", namespace = "urn:oasis:names:tc:opendocument:xmlns:datastyle:1.0")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String transliterationCountry;
    @XmlAttribute(name = "transliteration-style", namespace = "urn:oasis:names:tc:opendocument:xmlns:datastyle:1.0")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String transliterationStyle;
    @XmlAttribute(name = "name", namespace = "urn:oasis:names:tc:opendocument:xmlns:style:1.0", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String name;

    /**
     * Gets the rest of the content model. 
     * 
     * <p>
     * You are getting this "catch-all" property because of the following reason: 
     * The field name "Text" is used by two different parts of a schema. See: 
     * line 2161 of file:/var/home/stbischof/git/daanse/org.eclipse.daanse.odf/model/xsd/text.xsd
     * line 2158 of file:/var/home/stbischof/git/daanse/org.eclipse.daanse.odf/model/xsd/text.xsd
     * <p>
     * To get rid of this property, apply a property customization to one 
     * of both of the following declarations to change their names: 
     * Gets the value of the content property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the content property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContent().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TextProperties }
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link Day }
     * {@link Month }
     * {@link Year }
     * {@link Era }
     * {@link DayOfWeek }
     * {@link WeekOfYear }
     * {@link Quarter }
     * {@link Hours }
     * {@link AmPm }
     * {@link Minutes }
     * {@link Seconds }
     * {@link Map }
     * 
     * 
     */
    public List<Object> getContent() {
        if (content == null) {
            content = new ArrayList<Object>();
        }
        return this.content;
    }

    /**
     * Gets the value of the automaticOrder property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getAutomaticOrder() {
        return automaticOrder;
    }

    /**
     * Sets the value of the automaticOrder property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAutomaticOrder(Boolean value) {
        this.automaticOrder = value;
    }

    /**
     * Gets the value of the formatSource property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFormatSource() {
        return formatSource;
    }

    /**
     * Sets the value of the formatSource property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFormatSource(String value) {
        this.formatSource = value;
    }

    /**
     * Gets the value of the displayName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDisplayName() {
        return displayName;
    }

    /**
     * Sets the value of the displayName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDisplayName(String value) {
        this.displayName = value;
    }

    /**
     * Gets the value of the language property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLanguage() {
        return language;
    }

    /**
     * Sets the value of the language property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLanguage(String value) {
        this.language = value;
    }

    /**
     * Gets the value of the country property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountry() {
        return country;
    }

    /**
     * Sets the value of the country property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountry(String value) {
        this.country = value;
    }

    /**
     * Gets the value of the script property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScript() {
        return script;
    }

    /**
     * Sets the value of the script property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScript(String value) {
        this.script = value;
    }

    /**
     * Gets the value of the rfcLanguageTag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRfcLanguageTag() {
        return rfcLanguageTag;
    }

    /**
     * Sets the value of the rfcLanguageTag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRfcLanguageTag(String value) {
        this.rfcLanguageTag = value;
    }

    /**
     * Gets the value of the title property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitle() {
        return title;
    }

    /**
     * Sets the value of the title property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitle(String value) {
        this.title = value;
    }

    /**
     * Gets the value of the volatile property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getVolatile() {
        return _volatile;
    }

    /**
     * Sets the value of the volatile property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setVolatile(Boolean value) {
        this._volatile = value;
    }

    /**
     * Gets the value of the transliterationFormat property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransliterationFormat() {
        return transliterationFormat;
    }

    /**
     * Sets the value of the transliterationFormat property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransliterationFormat(String value) {
        this.transliterationFormat = value;
    }

    /**
     * Gets the value of the transliterationLanguage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransliterationLanguage() {
        return transliterationLanguage;
    }

    /**
     * Sets the value of the transliterationLanguage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransliterationLanguage(String value) {
        this.transliterationLanguage = value;
    }

    /**
     * Gets the value of the transliterationCountry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransliterationCountry() {
        return transliterationCountry;
    }

    /**
     * Sets the value of the transliterationCountry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransliterationCountry(String value) {
        this.transliterationCountry = value;
    }

    /**
     * Gets the value of the transliterationStyle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransliterationStyle() {
        return transliterationStyle;
    }

    /**
     * Sets the value of the transliterationStyle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransliterationStyle(String value) {
        this.transliterationStyle = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

}
