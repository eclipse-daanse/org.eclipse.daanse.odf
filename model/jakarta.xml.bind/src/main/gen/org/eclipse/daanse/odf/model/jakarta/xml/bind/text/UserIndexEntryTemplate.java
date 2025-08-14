
package org.eclipse.daanse.odf.model.jakarta.xml.bind.text;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlElements;
import jakarta.xml.bind.annotation.XmlRootElement;
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
 *       &lt;choice maxOccurs="unbounded" minOccurs="0"&gt;
 *         &lt;element ref="{urn:oasis:names:tc:opendocument:xmlns:text:1.0}index-entry-chapter"/&gt;
 *         &lt;element ref="{urn:oasis:names:tc:opendocument:xmlns:text:1.0}index-entry-page-number"/&gt;
 *         &lt;element ref="{urn:oasis:names:tc:opendocument:xmlns:text:1.0}index-entry-text"/&gt;
 *         &lt;element ref="{urn:oasis:names:tc:opendocument:xmlns:text:1.0}index-entry-span"/&gt;
 *         &lt;element ref="{urn:oasis:names:tc:opendocument:xmlns:text:1.0}index-entry-tab-stop"/&gt;
 *         &lt;element ref="{urn:oasis:names:tc:opendocument:xmlns:text:1.0}index-entry-link-start"/&gt;
 *         &lt;element ref="{urn:oasis:names:tc:opendocument:xmlns:text:1.0}index-entry-link-end"/&gt;
 *       &lt;/choice&gt;
 *       &lt;attGroup ref="{urn:oasis:names:tc:opendocument:xmlns:text:1.0}text-user-index-entry-template-attrs"/&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "indexEntryChapterOrIndexEntryPageNumberOrIndexEntryText"
})
@XmlRootElement(name = "user-index-entry-template")
public class UserIndexEntryTemplate {

    @XmlElements({
        @XmlElement(name = "index-entry-chapter", type = IndexEntryChapter.class),
        @XmlElement(name = "index-entry-page-number", type = IndexEntryPageNumber.class),
        @XmlElement(name = "index-entry-text", type = IndexEntryText.class),
        @XmlElement(name = "index-entry-span", type = IndexEntrySpan.class),
        @XmlElement(name = "index-entry-tab-stop", type = IndexEntryTabStop.class),
        @XmlElement(name = "index-entry-link-start", type = IndexEntryLinkStart.class),
        @XmlElement(name = "index-entry-link-end", type = IndexEntryLinkEnd.class)
    })
    protected List<Object> indexEntryChapterOrIndexEntryPageNumberOrIndexEntryText;
    @XmlAttribute(name = "outline-level", namespace = "urn:oasis:names:tc:opendocument:xmlns:text:1.0", required = true)
    protected BigInteger outlineLevel;
    @XmlAttribute(name = "style-name", namespace = "urn:oasis:names:tc:opendocument:xmlns:text:1.0", required = true)
    protected String styleName;

    /**
     * Gets the value of the indexEntryChapterOrIndexEntryPageNumberOrIndexEntryText property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the indexEntryChapterOrIndexEntryPageNumberOrIndexEntryText property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIndexEntryChapterOrIndexEntryPageNumberOrIndexEntryText().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IndexEntryChapter }
     * {@link IndexEntryPageNumber }
     * {@link IndexEntryText }
     * {@link IndexEntrySpan }
     * {@link IndexEntryTabStop }
     * {@link IndexEntryLinkStart }
     * {@link IndexEntryLinkEnd }
     * 
     * 
     */
    public List<Object> getIndexEntryChapterOrIndexEntryPageNumberOrIndexEntryText() {
        if (indexEntryChapterOrIndexEntryPageNumberOrIndexEntryText == null) {
            indexEntryChapterOrIndexEntryPageNumberOrIndexEntryText = new ArrayList<Object>();
        }
        return this.indexEntryChapterOrIndexEntryPageNumberOrIndexEntryText;
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
     * Gets the value of the styleName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStyleName() {
        return styleName;
    }

    /**
     * Sets the value of the styleName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStyleName(String value) {
        this.styleName = value;
    }

}
