
package org.eclipse.daanse.odf.model.jakarta.xml.bind.text;

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
 *         &lt;element ref="{urn:oasis:names:tc:opendocument:xmlns:text:1.0}user-index-entry-template" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:tc:opendocument:xmlns:text:1.0}index-source-styles" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attGroup ref="{urn:oasis:names:tc:opendocument:xmlns:text:1.0}text-user-index-source-attr"/&gt;
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
    "userIndexEntryTemplate",
    "indexSourceStyles"
})
@XmlRootElement(name = "user-index-source")
public class UserIndexSource {

    @XmlElement(name = "index-title-template")
    protected IndexTitleTemplate indexTitleTemplate;
    @XmlElement(name = "user-index-entry-template")
    protected List<UserIndexEntryTemplate> userIndexEntryTemplate;
    @XmlElement(name = "index-source-styles")
    protected List<IndexSourceStyles> indexSourceStyles;
    @XmlAttribute(name = "use-index-marks", namespace = "urn:oasis:names:tc:opendocument:xmlns:text:1.0")
    protected Boolean useIndexMarks;
    @XmlAttribute(name = "use-index-source-styles", namespace = "urn:oasis:names:tc:opendocument:xmlns:text:1.0")
    protected Boolean useIndexSourceStyles;
    @XmlAttribute(name = "use-graphics", namespace = "urn:oasis:names:tc:opendocument:xmlns:text:1.0")
    protected Boolean useGraphics;
    @XmlAttribute(name = "use-tables", namespace = "urn:oasis:names:tc:opendocument:xmlns:text:1.0")
    protected Boolean useTables;
    @XmlAttribute(name = "use-floating-frames", namespace = "urn:oasis:names:tc:opendocument:xmlns:text:1.0")
    protected Boolean useFloatingFrames;
    @XmlAttribute(name = "use-objects", namespace = "urn:oasis:names:tc:opendocument:xmlns:text:1.0")
    protected Boolean useObjects;
    @XmlAttribute(name = "copy-outline-levels", namespace = "urn:oasis:names:tc:opendocument:xmlns:text:1.0")
    protected Boolean copyOutlineLevels;
    @XmlAttribute(name = "index-name", namespace = "urn:oasis:names:tc:opendocument:xmlns:text:1.0", required = true)
    protected String indexName;
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
     * Gets the value of the userIndexEntryTemplate property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the userIndexEntryTemplate property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUserIndexEntryTemplate().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UserIndexEntryTemplate }
     * 
     * 
     */
    public List<UserIndexEntryTemplate> getUserIndexEntryTemplate() {
        if (userIndexEntryTemplate == null) {
            userIndexEntryTemplate = new ArrayList<UserIndexEntryTemplate>();
        }
        return this.userIndexEntryTemplate;
    }

    /**
     * Gets the value of the indexSourceStyles property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the indexSourceStyles property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIndexSourceStyles().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IndexSourceStyles }
     * 
     * 
     */
    public List<IndexSourceStyles> getIndexSourceStyles() {
        if (indexSourceStyles == null) {
            indexSourceStyles = new ArrayList<IndexSourceStyles>();
        }
        return this.indexSourceStyles;
    }

    /**
     * Gets the value of the useIndexMarks property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getUseIndexMarks() {
        return useIndexMarks;
    }

    /**
     * Sets the value of the useIndexMarks property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUseIndexMarks(Boolean value) {
        this.useIndexMarks = value;
    }

    /**
     * Gets the value of the useIndexSourceStyles property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getUseIndexSourceStyles() {
        return useIndexSourceStyles;
    }

    /**
     * Sets the value of the useIndexSourceStyles property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUseIndexSourceStyles(Boolean value) {
        this.useIndexSourceStyles = value;
    }

    /**
     * Gets the value of the useGraphics property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getUseGraphics() {
        return useGraphics;
    }

    /**
     * Sets the value of the useGraphics property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUseGraphics(Boolean value) {
        this.useGraphics = value;
    }

    /**
     * Gets the value of the useTables property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getUseTables() {
        return useTables;
    }

    /**
     * Sets the value of the useTables property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUseTables(Boolean value) {
        this.useTables = value;
    }

    /**
     * Gets the value of the useFloatingFrames property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getUseFloatingFrames() {
        return useFloatingFrames;
    }

    /**
     * Sets the value of the useFloatingFrames property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUseFloatingFrames(Boolean value) {
        this.useFloatingFrames = value;
    }

    /**
     * Gets the value of the useObjects property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getUseObjects() {
        return useObjects;
    }

    /**
     * Sets the value of the useObjects property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUseObjects(Boolean value) {
        this.useObjects = value;
    }

    /**
     * Gets the value of the copyOutlineLevels property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getCopyOutlineLevels() {
        return copyOutlineLevels;
    }

    /**
     * Sets the value of the copyOutlineLevels property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCopyOutlineLevels(Boolean value) {
        this.copyOutlineLevels = value;
    }

    /**
     * Gets the value of the indexName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIndexName() {
        return indexName;
    }

    /**
     * Sets the value of the indexName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIndexName(String value) {
        this.indexName = value;
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
