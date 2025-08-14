
package org.eclipse.daanse.odf.xml.table;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
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
 *         &lt;element ref="{urn:oasis:names:tc:opendocument:xmlns:table:1.0}sort-by" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attGroup ref="{urn:oasis:names:tc:opendocument:xmlns:text:1.0}table-sort-attlist"/&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "sortBy"
})
@XmlRootElement(name = "sort")
public class Sort {

    @XmlElement(name = "sort-by", required = true)
    protected List<SortBy> sortBy;
    @XmlAttribute(name = "bind-styles-to-content", namespace = "urn:oasis:names:tc:opendocument:xmlns:table:1.0")
    protected Boolean bindStylesToContent;
    @XmlAttribute(name = "target-range-address", namespace = "urn:oasis:names:tc:opendocument:xmlns:table:1.0")
    protected String targetRangeAddress;
    @XmlAttribute(name = "language", namespace = "urn:oasis:names:tc:opendocument:xmlns:table:1.0")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String language;
    @XmlAttribute(name = "country", namespace = "urn:oasis:names:tc:opendocument:xmlns:table:1.0")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String country;
    @XmlAttribute(name = "script", namespace = "urn:oasis:names:tc:opendocument:xmlns:table:1.0")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String script;
    @XmlAttribute(name = "rfc-language-tag", namespace = "urn:oasis:names:tc:opendocument:xmlns:table:1.0")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String rfcLanguageTag;
    @XmlAttribute(name = "algorithm", namespace = "urn:oasis:names:tc:opendocument:xmlns:table:1.0")
    protected String algorithm;
    @XmlAttribute(name = "embedded-number-behavior", namespace = "urn:oasis:names:tc:opendocument:xmlns:table:1.0")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String embeddedNumberBehavior;
    @XmlAttribute(name = "case-sensitive", namespace = "urn:oasis:names:tc:opendocument:xmlns:table:1.0", required = true)
    protected Boolean caseSensitive;

    /**
     * Gets the value of the sortBy property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the sortBy property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSortBy().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SortBy }
     * 
     * 
     */
    public List<SortBy> getSortBy() {
        if (sortBy == null) {
            sortBy = new ArrayList<SortBy>();
        }
        return this.sortBy;
    }

    /**
     * Gets the value of the bindStylesToContent property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getBindStylesToContent() {
        return bindStylesToContent;
    }

    /**
     * Sets the value of the bindStylesToContent property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBindStylesToContent(Boolean value) {
        this.bindStylesToContent = value;
    }

    /**
     * Gets the value of the targetRangeAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTargetRangeAddress() {
        return targetRangeAddress;
    }

    /**
     * Sets the value of the targetRangeAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTargetRangeAddress(String value) {
        this.targetRangeAddress = value;
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
     * Gets the value of the algorithm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAlgorithm() {
        return algorithm;
    }

    /**
     * Sets the value of the algorithm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAlgorithm(String value) {
        this.algorithm = value;
    }

    /**
     * Gets the value of the embeddedNumberBehavior property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmbeddedNumberBehavior() {
        return embeddedNumberBehavior;
    }

    /**
     * Sets the value of the embeddedNumberBehavior property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmbeddedNumberBehavior(String value) {
        this.embeddedNumberBehavior = value;
    }

    /**
     * Gets the value of the caseSensitive property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getCaseSensitive() {
        return caseSensitive;
    }

    /**
     * Sets the value of the caseSensitive property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCaseSensitive(Boolean value) {
        this.caseSensitive = value;
    }

}
