
package org.eclipse.daanse.odf.model.jakarta.xml.bind.text;

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
 *         &lt;element ref="{urn:oasis:names:tc:opendocument:xmlns:text:1.0}illustration-index-entry-template" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attGroup ref="{urn:oasis:names:tc:opendocument:xmlns:text:1.0}text-illustration-index-source-attrs"/&gt;
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
    "illustrationIndexEntryTemplate"
})
@XmlRootElement(name = "illustration-index-source")
public class IllustrationIndexSource {

    @XmlElement(name = "index-title-template")
    protected IndexTitleTemplate indexTitleTemplate;
    @XmlElement(name = "illustration-index-entry-template")
    protected TextIllustrationIndexEntryContent illustrationIndexEntryTemplate;
    @XmlAttribute(name = "use-caption", namespace = "urn:oasis:names:tc:opendocument:xmlns:text:1.0")
    protected Boolean useCaption;
    @XmlAttribute(name = "caption-sequence-name", namespace = "urn:oasis:names:tc:opendocument:xmlns:text:1.0")
    protected String captionSequenceName;
    @XmlAttribute(name = "caption-sequence-format", namespace = "urn:oasis:names:tc:opendocument:xmlns:text:1.0")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String captionSequenceFormat;
    @XmlAttribute(name = "relative-tab-stop-position", namespace = "urn:oasis:names:tc:opendocument:xmlns:text:1.0")
    protected Boolean relativeTabStopPosition;
    @XmlAttribute(name = "index-scope", namespace = "urn:oasis:names:tc:opendocument:xmlns:text:1.0")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String indexScope;

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
     * Gets the value of the illustrationIndexEntryTemplate property.
     * 
     * @return
     *     possible object is
     *     {@link TextIllustrationIndexEntryContent }
     *     
     */
    public TextIllustrationIndexEntryContent getIllustrationIndexEntryTemplate() {
        return illustrationIndexEntryTemplate;
    }

    /**
     * Sets the value of the illustrationIndexEntryTemplate property.
     * 
     * @param value
     *     allowed object is
     *     {@link TextIllustrationIndexEntryContent }
     *     
     */
    public void setIllustrationIndexEntryTemplate(TextIllustrationIndexEntryContent value) {
        this.illustrationIndexEntryTemplate = value;
    }

    /**
     * Gets the value of the useCaption property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getUseCaption() {
        return useCaption;
    }

    /**
     * Sets the value of the useCaption property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUseCaption(Boolean value) {
        this.useCaption = value;
    }

    /**
     * Gets the value of the captionSequenceName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCaptionSequenceName() {
        return captionSequenceName;
    }

    /**
     * Sets the value of the captionSequenceName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCaptionSequenceName(String value) {
        this.captionSequenceName = value;
    }

    /**
     * Gets the value of the captionSequenceFormat property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCaptionSequenceFormat() {
        return captionSequenceFormat;
    }

    /**
     * Sets the value of the captionSequenceFormat property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCaptionSequenceFormat(String value) {
        this.captionSequenceFormat = value;
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

}
