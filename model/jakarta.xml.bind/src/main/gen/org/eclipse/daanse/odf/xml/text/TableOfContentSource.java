
package org.eclipse.daanse.odf.xml.text;

import java.math.BigInteger;
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
 *         &lt;element ref="{urn:oasis:names:tc:opendocument:xmlns:text:1.0}table-of-content-entry-template" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:tc:opendocument:xmlns:text:1.0}index-source-styles" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attGroup ref="{urn:oasis:names:tc:opendocument:xmlns:text:1.0}text-table-of-content-source-attlist"/&gt;
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
    "tableOfContentEntryTemplate",
    "indexSourceStyles"
})
@XmlRootElement(name = "table-of-content-source")
public class TableOfContentSource {

    @XmlElement(name = "index-title-template")
    protected IndexTitleTemplate indexTitleTemplate;
    @XmlElement(name = "table-of-content-entry-template")
    protected List<TableOfContentEntryTemplate> tableOfContentEntryTemplate;
    @XmlElement(name = "index-source-styles")
    protected List<IndexSourceStyles> indexSourceStyles;
    @XmlAttribute(name = "outline-level", namespace = "urn:oasis:names:tc:opendocument:xmlns:text:1.0")
    protected BigInteger outlineLevel;
    @XmlAttribute(name = "use-outline-level", namespace = "urn:oasis:names:tc:opendocument:xmlns:text:1.0")
    protected Boolean useOutlineLevel;
    @XmlAttribute(name = "use-index-marks", namespace = "urn:oasis:names:tc:opendocument:xmlns:text:1.0")
    protected Boolean useIndexMarks;
    @XmlAttribute(name = "use-index-source-styles", namespace = "urn:oasis:names:tc:opendocument:xmlns:text:1.0")
    protected Boolean useIndexSourceStyles;
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
     * Gets the value of the tableOfContentEntryTemplate property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the tableOfContentEntryTemplate property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTableOfContentEntryTemplate().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TableOfContentEntryTemplate }
     * 
     * 
     */
    public List<TableOfContentEntryTemplate> getTableOfContentEntryTemplate() {
        if (tableOfContentEntryTemplate == null) {
            tableOfContentEntryTemplate = new ArrayList<TableOfContentEntryTemplate>();
        }
        return this.tableOfContentEntryTemplate;
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
     * Gets the value of the outlineLevel property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getOutlineLevel() {
        return outlineLevel;
    }

    /**
     * Sets the value of the outlineLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setOutlineLevel(BigInteger value) {
        this.outlineLevel = value;
    }

    /**
     * Gets the value of the useOutlineLevel property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getUseOutlineLevel() {
        return useOutlineLevel;
    }

    /**
     * Sets the value of the useOutlineLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUseOutlineLevel(Boolean value) {
        this.useOutlineLevel = value;
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
