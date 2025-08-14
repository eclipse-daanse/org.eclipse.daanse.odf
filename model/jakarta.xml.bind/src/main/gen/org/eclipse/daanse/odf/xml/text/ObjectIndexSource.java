
package org.eclipse.daanse.odf.xml.text;

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
 *         &lt;element ref="{urn:oasis:names:tc:opendocument:xmlns:text:1.0}object-index-entry-template" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attGroup ref="{urn:oasis:names:tc:opendocument:xmlns:text:1.0}text-object-index-source-attrs"/&gt;
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
    "objectIndexEntryTemplate"
})
@XmlRootElement(name = "object-index-source")
public class ObjectIndexSource {

    @XmlElement(name = "index-title-template")
    protected IndexTitleTemplate indexTitleTemplate;
    @XmlElement(name = "object-index-entry-template")
    protected TextIllustrationIndexEntryContent objectIndexEntryTemplate;
    @XmlAttribute(name = "use-spreadsheet-objects", namespace = "urn:oasis:names:tc:opendocument:xmlns:text:1.0")
    protected Boolean useSpreadsheetObjects;
    @XmlAttribute(name = "use-math-objects", namespace = "urn:oasis:names:tc:opendocument:xmlns:text:1.0")
    protected Boolean useMathObjects;
    @XmlAttribute(name = "use-draw-objects", namespace = "urn:oasis:names:tc:opendocument:xmlns:text:1.0")
    protected Boolean useDrawObjects;
    @XmlAttribute(name = "use-chart-objects", namespace = "urn:oasis:names:tc:opendocument:xmlns:text:1.0")
    protected Boolean useChartObjects;
    @XmlAttribute(name = "use-other-objects", namespace = "urn:oasis:names:tc:opendocument:xmlns:text:1.0")
    protected Boolean useOtherObjects;
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
     * Gets the value of the objectIndexEntryTemplate property.
     * 
     * @return
     *     possible object is
     *     {@link TextIllustrationIndexEntryContent }
     *     
     */
    public TextIllustrationIndexEntryContent getObjectIndexEntryTemplate() {
        return objectIndexEntryTemplate;
    }

    /**
     * Sets the value of the objectIndexEntryTemplate property.
     * 
     * @param value
     *     allowed object is
     *     {@link TextIllustrationIndexEntryContent }
     *     
     */
    public void setObjectIndexEntryTemplate(TextIllustrationIndexEntryContent value) {
        this.objectIndexEntryTemplate = value;
    }

    /**
     * Gets the value of the useSpreadsheetObjects property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getUseSpreadsheetObjects() {
        return useSpreadsheetObjects;
    }

    /**
     * Sets the value of the useSpreadsheetObjects property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUseSpreadsheetObjects(Boolean value) {
        this.useSpreadsheetObjects = value;
    }

    /**
     * Gets the value of the useMathObjects property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getUseMathObjects() {
        return useMathObjects;
    }

    /**
     * Sets the value of the useMathObjects property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUseMathObjects(Boolean value) {
        this.useMathObjects = value;
    }

    /**
     * Gets the value of the useDrawObjects property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getUseDrawObjects() {
        return useDrawObjects;
    }

    /**
     * Sets the value of the useDrawObjects property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUseDrawObjects(Boolean value) {
        this.useDrawObjects = value;
    }

    /**
     * Gets the value of the useChartObjects property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getUseChartObjects() {
        return useChartObjects;
    }

    /**
     * Sets the value of the useChartObjects property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUseChartObjects(Boolean value) {
        this.useChartObjects = value;
    }

    /**
     * Gets the value of the useOtherObjects property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getUseOtherObjects() {
        return useOtherObjects;
    }

    /**
     * Sets the value of the useOtherObjects property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUseOtherObjects(Boolean value) {
        this.useOtherObjects = value;
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
