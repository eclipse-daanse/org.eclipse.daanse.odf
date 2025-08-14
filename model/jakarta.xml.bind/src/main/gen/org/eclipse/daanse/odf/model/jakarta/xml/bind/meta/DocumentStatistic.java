
package org.eclipse.daanse.odf.model.jakarta.xml.bind.meta;

import java.math.BigInteger;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attribute name="page-count" type="{urn:oasis:names:tc:opendocument:xmlns:text:1.0}nonNegativeInteger" /&gt;
 *       &lt;attribute name="table-count" type="{urn:oasis:names:tc:opendocument:xmlns:text:1.0}nonNegativeInteger" /&gt;
 *       &lt;attribute name="draw-count" type="{urn:oasis:names:tc:opendocument:xmlns:text:1.0}nonNegativeInteger" /&gt;
 *       &lt;attribute name="image-count" type="{urn:oasis:names:tc:opendocument:xmlns:text:1.0}nonNegativeInteger" /&gt;
 *       &lt;attribute name="ole-object-count" type="{urn:oasis:names:tc:opendocument:xmlns:text:1.0}nonNegativeInteger" /&gt;
 *       &lt;attribute name="object-count" type="{urn:oasis:names:tc:opendocument:xmlns:text:1.0}nonNegativeInteger" /&gt;
 *       &lt;attribute name="paragraph-count" type="{urn:oasis:names:tc:opendocument:xmlns:text:1.0}nonNegativeInteger" /&gt;
 *       &lt;attribute name="word-count" type="{urn:oasis:names:tc:opendocument:xmlns:text:1.0}nonNegativeInteger" /&gt;
 *       &lt;attribute name="character-count" type="{urn:oasis:names:tc:opendocument:xmlns:text:1.0}nonNegativeInteger" /&gt;
 *       &lt;attribute name="frame-count" type="{urn:oasis:names:tc:opendocument:xmlns:text:1.0}nonNegativeInteger" /&gt;
 *       &lt;attribute name="sentence-count" type="{urn:oasis:names:tc:opendocument:xmlns:text:1.0}nonNegativeInteger" /&gt;
 *       &lt;attribute name="syllable-count" type="{urn:oasis:names:tc:opendocument:xmlns:text:1.0}nonNegativeInteger" /&gt;
 *       &lt;attribute name="non-whitespace-character-count" type="{urn:oasis:names:tc:opendocument:xmlns:text:1.0}nonNegativeInteger" /&gt;
 *       &lt;attribute name="row-count" type="{urn:oasis:names:tc:opendocument:xmlns:text:1.0}nonNegativeInteger" /&gt;
 *       &lt;attribute name="cell-count" type="{urn:oasis:names:tc:opendocument:xmlns:text:1.0}nonNegativeInteger" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
public class DocumentStatistic {

    @XmlAttribute(name = "page-count", namespace = "urn:oasis:names:tc:opendocument:xmlns:meta:1.0")
    protected BigInteger pageCount;
    @XmlAttribute(name = "table-count", namespace = "urn:oasis:names:tc:opendocument:xmlns:meta:1.0")
    protected BigInteger tableCount;
    @XmlAttribute(name = "draw-count", namespace = "urn:oasis:names:tc:opendocument:xmlns:meta:1.0")
    protected BigInteger drawCount;
    @XmlAttribute(name = "image-count", namespace = "urn:oasis:names:tc:opendocument:xmlns:meta:1.0")
    protected BigInteger imageCount;
    @XmlAttribute(name = "ole-object-count", namespace = "urn:oasis:names:tc:opendocument:xmlns:meta:1.0")
    protected BigInteger oleObjectCount;
    @XmlAttribute(name = "object-count", namespace = "urn:oasis:names:tc:opendocument:xmlns:meta:1.0")
    protected BigInteger objectCount;
    @XmlAttribute(name = "paragraph-count", namespace = "urn:oasis:names:tc:opendocument:xmlns:meta:1.0")
    protected BigInteger paragraphCount;
    @XmlAttribute(name = "word-count", namespace = "urn:oasis:names:tc:opendocument:xmlns:meta:1.0")
    protected BigInteger wordCount;
    @XmlAttribute(name = "character-count", namespace = "urn:oasis:names:tc:opendocument:xmlns:meta:1.0")
    protected BigInteger characterCount;
    @XmlAttribute(name = "frame-count", namespace = "urn:oasis:names:tc:opendocument:xmlns:meta:1.0")
    protected BigInteger frameCount;
    @XmlAttribute(name = "sentence-count", namespace = "urn:oasis:names:tc:opendocument:xmlns:meta:1.0")
    protected BigInteger sentenceCount;
    @XmlAttribute(name = "syllable-count", namespace = "urn:oasis:names:tc:opendocument:xmlns:meta:1.0")
    protected BigInteger syllableCount;
    @XmlAttribute(name = "non-whitespace-character-count", namespace = "urn:oasis:names:tc:opendocument:xmlns:meta:1.0")
    protected BigInteger nonWhitespaceCharacterCount;
    @XmlAttribute(name = "row-count", namespace = "urn:oasis:names:tc:opendocument:xmlns:meta:1.0")
    protected BigInteger rowCount;
    @XmlAttribute(name = "cell-count", namespace = "urn:oasis:names:tc:opendocument:xmlns:meta:1.0")
    protected BigInteger cellCount;

    /**
     * Gets the value of the pageCount property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPageCount() {
        return pageCount;
    }

    /**
     * Sets the value of the pageCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPageCount(BigInteger value) {
        this.pageCount = value;
    }

    /**
     * Gets the value of the tableCount property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTableCount() {
        return tableCount;
    }

    /**
     * Sets the value of the tableCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTableCount(BigInteger value) {
        this.tableCount = value;
    }

    /**
     * Gets the value of the drawCount property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getDrawCount() {
        return drawCount;
    }

    /**
     * Sets the value of the drawCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setDrawCount(BigInteger value) {
        this.drawCount = value;
    }

    /**
     * Gets the value of the imageCount property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getImageCount() {
        return imageCount;
    }

    /**
     * Sets the value of the imageCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setImageCount(BigInteger value) {
        this.imageCount = value;
    }

    /**
     * Gets the value of the oleObjectCount property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getOleObjectCount() {
        return oleObjectCount;
    }

    /**
     * Sets the value of the oleObjectCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setOleObjectCount(BigInteger value) {
        this.oleObjectCount = value;
    }

    /**
     * Gets the value of the objectCount property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getObjectCount() {
        return objectCount;
    }

    /**
     * Sets the value of the objectCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setObjectCount(BigInteger value) {
        this.objectCount = value;
    }

    /**
     * Gets the value of the paragraphCount property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getParagraphCount() {
        return paragraphCount;
    }

    /**
     * Sets the value of the paragraphCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setParagraphCount(BigInteger value) {
        this.paragraphCount = value;
    }

    /**
     * Gets the value of the wordCount property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getWordCount() {
        return wordCount;
    }

    /**
     * Sets the value of the wordCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setWordCount(BigInteger value) {
        this.wordCount = value;
    }

    /**
     * Gets the value of the characterCount property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCharacterCount() {
        return characterCount;
    }

    /**
     * Sets the value of the characterCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCharacterCount(BigInteger value) {
        this.characterCount = value;
    }

    /**
     * Gets the value of the frameCount property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getFrameCount() {
        return frameCount;
    }

    /**
     * Sets the value of the frameCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setFrameCount(BigInteger value) {
        this.frameCount = value;
    }

    /**
     * Gets the value of the sentenceCount property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSentenceCount() {
        return sentenceCount;
    }

    /**
     * Sets the value of the sentenceCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSentenceCount(BigInteger value) {
        this.sentenceCount = value;
    }

    /**
     * Gets the value of the syllableCount property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSyllableCount() {
        return syllableCount;
    }

    /**
     * Sets the value of the syllableCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSyllableCount(BigInteger value) {
        this.syllableCount = value;
    }

    /**
     * Gets the value of the nonWhitespaceCharacterCount property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNonWhitespaceCharacterCount() {
        return nonWhitespaceCharacterCount;
    }

    /**
     * Sets the value of the nonWhitespaceCharacterCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNonWhitespaceCharacterCount(BigInteger value) {
        this.nonWhitespaceCharacterCount = value;
    }

    /**
     * Gets the value of the rowCount property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getRowCount() {
        return rowCount;
    }

    /**
     * Sets the value of the rowCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setRowCount(BigInteger value) {
        this.rowCount = value;
    }

    /**
     * Gets the value of the cellCount property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCellCount() {
        return cellCount;
    }

    /**
     * Sets the value of the cellCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCellCount(BigInteger value) {
        this.cellCount = value;
    }

}
