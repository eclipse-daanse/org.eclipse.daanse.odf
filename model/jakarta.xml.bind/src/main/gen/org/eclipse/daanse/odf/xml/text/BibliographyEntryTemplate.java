
package org.eclipse.daanse.odf.xml.text;

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
 *         &lt;element ref="{urn:oasis:names:tc:opendocument:xmlns:text:1.0}index-entry-span"/&gt;
 *         &lt;element ref="{urn:oasis:names:tc:opendocument:xmlns:text:1.0}index-entry-tab-stop"/&gt;
 *         &lt;element ref="{urn:oasis:names:tc:opendocument:xmlns:text:1.0}index-entry-bibliography"/&gt;
 *       &lt;/choice&gt;
 *       &lt;attGroup ref="{urn:oasis:names:tc:opendocument:xmlns:text:1.0}text-bibliography-entry-template-attrs"/&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "indexEntrySpanOrIndexEntryTabStopOrIndexEntryBibliography"
})
@XmlRootElement(name = "bibliography-entry-template")
public class BibliographyEntryTemplate {

    @XmlElements({
        @XmlElement(name = "index-entry-span", type = IndexEntrySpan.class),
        @XmlElement(name = "index-entry-tab-stop", type = IndexEntryTabStop.class),
        @XmlElement(name = "index-entry-bibliography", type = IndexEntryBibliography.class)
    })
    protected List<Object> indexEntrySpanOrIndexEntryTabStopOrIndexEntryBibliography;
    @XmlAttribute(name = "bibliography-type", namespace = "urn:oasis:names:tc:opendocument:xmlns:text:1.0", required = true)
    protected TextBibliographyTypes bibliographyType;
    @XmlAttribute(name = "style-name", namespace = "urn:oasis:names:tc:opendocument:xmlns:text:1.0", required = true)
    protected String styleName;

    /**
     * Gets the value of the indexEntrySpanOrIndexEntryTabStopOrIndexEntryBibliography property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the indexEntrySpanOrIndexEntryTabStopOrIndexEntryBibliography property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIndexEntrySpanOrIndexEntryTabStopOrIndexEntryBibliography().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IndexEntrySpan }
     * {@link IndexEntryTabStop }
     * {@link IndexEntryBibliography }
     * 
     * 
     */
    public List<Object> getIndexEntrySpanOrIndexEntryTabStopOrIndexEntryBibliography() {
        if (indexEntrySpanOrIndexEntryTabStopOrIndexEntryBibliography == null) {
            indexEntrySpanOrIndexEntryTabStopOrIndexEntryBibliography = new ArrayList<Object>();
        }
        return this.indexEntrySpanOrIndexEntryTabStopOrIndexEntryBibliography;
    }

    /**
     * Gets the value of the bibliographyType property.
     * 
     * @return
     *     possible object is
     *     {@link TextBibliographyTypes }
     *     
     */
    public TextBibliographyTypes getBibliographyType() {
        return bibliographyType;
    }

    /**
     * Sets the value of the bibliographyType property.
     * 
     * @param value
     *     allowed object is
     *     {@link TextBibliographyTypes }
     *     
     */
    public void setBibliographyType(TextBibliographyTypes value) {
        this.bibliographyType = value;
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
