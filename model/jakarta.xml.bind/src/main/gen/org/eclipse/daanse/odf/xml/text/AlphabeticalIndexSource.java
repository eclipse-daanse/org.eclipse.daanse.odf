
package org.eclipse.daanse.odf.xml.text;

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
 *         &lt;element ref="{urn:oasis:names:tc:opendocument:xmlns:text:1.0}index-title-template" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:tc:opendocument:xmlns:text:1.0}alphabetical-index-entry-template" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attGroup ref="{urn:oasis:names:tc:opendocument:xmlns:text:1.0}text-alphabetical-index-source-attrs"/&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "indexTitleTemplate",
    "alphabeticalIndexEntryTemplate"
})
@XmlRootElement(name = "alphabetical-index-source")
public class AlphabeticalIndexSource {

    @XmlElement(name = "index-title-template")
    protected IndexTitleTemplate indexTitleTemplate;
    @XmlElement(name = "alphabetical-index-entry-template")
    protected List<AlphabeticalIndexEntryTemplate> alphabeticalIndexEntryTemplate;
    @XmlAttribute(name = "ignore-case", namespace = "urn:oasis:names:tc:opendocument:xmlns:text:1.0")
    protected Boolean ignoreCase;
    @XmlAttribute(name = "main-entry-style-name", namespace = "urn:oasis:names:tc:opendocument:xmlns:text:1.0")
    protected String mainEntryStyleName;
    @XmlAttribute(name = "alphabetical-separators", namespace = "urn:oasis:names:tc:opendocument:xmlns:text:1.0")
    protected Boolean alphabeticalSeparators;
    @XmlAttribute(name = "combine-entries", namespace = "urn:oasis:names:tc:opendocument:xmlns:text:1.0")
    protected Boolean combineEntries;
    @XmlAttribute(name = "combine-entries-with-dash", namespace = "urn:oasis:names:tc:opendocument:xmlns:text:1.0")
    protected Boolean combineEntriesWithDash;
    @XmlAttribute(name = "combine-entries-with-pp", namespace = "urn:oasis:names:tc:opendocument:xmlns:text:1.0")
    protected Boolean combineEntriesWithPp;
    @XmlAttribute(name = "use-keys-as-entries", namespace = "urn:oasis:names:tc:opendocument:xmlns:text:1.0")
    protected Boolean useKeysAsEntries;
    @XmlAttribute(name = "capitalize-entries", namespace = "urn:oasis:names:tc:opendocument:xmlns:text:1.0")
    protected Boolean capitalizeEntries;
    @XmlAttribute(name = "comma-separated", namespace = "urn:oasis:names:tc:opendocument:xmlns:text:1.0")
    protected Boolean commaSeparated;
    @XmlAttribute(name = "language", namespace = "urn:oasis:names:tc:opendocument:xmlns:xsl-fo-compatible:1.0")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String language;
    @XmlAttribute(name = "country", namespace = "urn:oasis:names:tc:opendocument:xmlns:xsl-fo-compatible:1.0")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String country;
    @XmlAttribute(name = "script", namespace = "urn:oasis:names:tc:opendocument:xmlns:xsl-fo-compatible:1.0")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String script;
    @XmlAttribute(name = "rfc-language-tag", namespace = "urn:oasis:names:tc:opendocument:xmlns:style:1.0")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String rfcLanguageTag;
    @XmlAttribute(name = "sort-algorithm", namespace = "urn:oasis:names:tc:opendocument:xmlns:text:1.0")
    protected String sortAlgorithm;
    @XmlAttribute(name = "index-scope", namespace = "urn:oasis:names:tc:opendocument:xmlns:text:1.0")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String indexScope;
    @XmlAttribute(name = "relative-tab-stop-position", namespace = "urn:oasis:names:tc:opendocument:xmlns:text:1.0")
    protected Boolean relativeTabStopPosition;

    /**
     * Gets the value of the indexTitleTemplate property.
     * 
     * @return
     *     possible object is
     *     {@link IndexTitleTemplate }
     *     
     */
    public IndexTitleTemplate getIndexTitleTemplate() {
        return indexTitleTemplate;
    }

    /**
     * Sets the value of the indexTitleTemplate property.
     * 
     * @param value
     *     allowed object is
     *     {@link IndexTitleTemplate }
     *     
     */
    public void setIndexTitleTemplate(IndexTitleTemplate value) {
        this.indexTitleTemplate = value;
    }

    /**
     * Gets the value of the alphabeticalIndexEntryTemplate property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the alphabeticalIndexEntryTemplate property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAlphabeticalIndexEntryTemplate().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AlphabeticalIndexEntryTemplate }
     * 
     * 
     */
    public List<AlphabeticalIndexEntryTemplate> getAlphabeticalIndexEntryTemplate() {
        if (alphabeticalIndexEntryTemplate == null) {
            alphabeticalIndexEntryTemplate = new ArrayList<AlphabeticalIndexEntryTemplate>();
        }
        return this.alphabeticalIndexEntryTemplate;
    }

    /**
     * Gets the value of the ignoreCase property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getIgnoreCase() {
        return ignoreCase;
    }

    /**
     * Sets the value of the ignoreCase property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIgnoreCase(Boolean value) {
        this.ignoreCase = value;
    }

    /**
     * Gets the value of the mainEntryStyleName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMainEntryStyleName() {
        return mainEntryStyleName;
    }

    /**
     * Sets the value of the mainEntryStyleName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMainEntryStyleName(String value) {
        this.mainEntryStyleName = value;
    }

    /**
     * Gets the value of the alphabeticalSeparators property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getAlphabeticalSeparators() {
        return alphabeticalSeparators;
    }

    /**
     * Sets the value of the alphabeticalSeparators property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAlphabeticalSeparators(Boolean value) {
        this.alphabeticalSeparators = value;
    }

    /**
     * Gets the value of the combineEntries property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getCombineEntries() {
        return combineEntries;
    }

    /**
     * Sets the value of the combineEntries property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCombineEntries(Boolean value) {
        this.combineEntries = value;
    }

    /**
     * Gets the value of the combineEntriesWithDash property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getCombineEntriesWithDash() {
        return combineEntriesWithDash;
    }

    /**
     * Sets the value of the combineEntriesWithDash property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCombineEntriesWithDash(Boolean value) {
        this.combineEntriesWithDash = value;
    }

    /**
     * Gets the value of the combineEntriesWithPp property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getCombineEntriesWithPp() {
        return combineEntriesWithPp;
    }

    /**
     * Sets the value of the combineEntriesWithPp property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCombineEntriesWithPp(Boolean value) {
        this.combineEntriesWithPp = value;
    }

    /**
     * Gets the value of the useKeysAsEntries property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getUseKeysAsEntries() {
        return useKeysAsEntries;
    }

    /**
     * Sets the value of the useKeysAsEntries property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUseKeysAsEntries(Boolean value) {
        this.useKeysAsEntries = value;
    }

    /**
     * Gets the value of the capitalizeEntries property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getCapitalizeEntries() {
        return capitalizeEntries;
    }

    /**
     * Sets the value of the capitalizeEntries property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCapitalizeEntries(Boolean value) {
        this.capitalizeEntries = value;
    }

    /**
     * Gets the value of the commaSeparated property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getCommaSeparated() {
        return commaSeparated;
    }

    /**
     * Sets the value of the commaSeparated property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCommaSeparated(Boolean value) {
        this.commaSeparated = value;
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
     * Gets the value of the sortAlgorithm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSortAlgorithm() {
        return sortAlgorithm;
    }

    /**
     * Sets the value of the sortAlgorithm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSortAlgorithm(String value) {
        this.sortAlgorithm = value;
    }

    /**
     * Gets the value of the indexScope property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIndexScope() {
        return indexScope;
    }

    /**
     * Sets the value of the indexScope property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIndexScope(String value) {
        this.indexScope = value;
    }

    /**
     * Gets the value of the relativeTabStopPosition property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getRelativeTabStopPosition() {
        return relativeTabStopPosition;
    }

    /**
     * Sets the value of the relativeTabStopPosition property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRelativeTabStopPosition(Boolean value) {
        this.relativeTabStopPosition = value;
    }

}
