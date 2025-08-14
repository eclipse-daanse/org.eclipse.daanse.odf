
package org.eclipse.daanse.odf.model.jakarta.xml.bind.text;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.XmlValue;
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
 *       &lt;attGroup ref="{urn:oasis:names:tc:opendocument:xmlns:text:1.0}text-common-ref-content"/&gt;
 *       &lt;attGroup ref="{urn:oasis:names:tc:opendocument:xmlns:text:1.0}text-note-ref-content"/&gt;
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
@XmlRootElement(name = "note-ref")
public class NoteRef {

    @XmlValue
    protected String content;
    @XmlAttribute(name = "ref-name", namespace = "urn:oasis:names:tc:opendocument:xmlns:text:1.0")
    protected String refName;
    @XmlAttribute(name = "reference-format", namespace = "urn:oasis:names:tc:opendocument:xmlns:text:1.0")
    protected CommonRefFormatValues referenceFormat;
    @XmlAttribute(name = "note-class", namespace = "urn:oasis:names:tc:opendocument:xmlns:text:1.0", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String noteClass;

    /**
     * Gets the value of the content property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContent() {
        return content;
    }

    /**
     * Sets the value of the content property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContent(String value) {
        this.content = value;
    }

    /**
     * Gets the value of the refName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRefName() {
        return refName;
    }

    /**
     * Sets the value of the refName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRefName(String value) {
        this.refName = value;
    }

    /**
     * Gets the value of the referenceFormat property.
     * 
     * @return
     *     possible object is
     *     {@link CommonRefFormatValues }
     *     
     */
    public CommonRefFormatValues getReferenceFormat() {
        return referenceFormat;
    }

    /**
     * Sets the value of the referenceFormat property.
     * 
     * @param value
     *     allowed object is
     *     {@link CommonRefFormatValues }
     *     
     */
    public void setReferenceFormat(CommonRefFormatValues value) {
        this.referenceFormat = value;
    }

    /**
     * Gets the value of the noteClass property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNoteClass() {
        return noteClass;
    }

    /**
     * Sets the value of the noteClass property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNoteClass(String value) {
        this.noteClass = value;
    }

}
