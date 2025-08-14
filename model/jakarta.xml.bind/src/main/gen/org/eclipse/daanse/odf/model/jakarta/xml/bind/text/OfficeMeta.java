
package org.eclipse.daanse.odf.model.jakarta.xml.bind.text;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;
import org.eclipse.daanse.odf.model.jakarta.xml.bind.office.Document;
import org.eclipse.daanse.odf.model.jakarta.xml.bind.office.DocumentMeta;


/**
 * <p>Java class for office-meta complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="office-meta"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:oasis:names:tc:opendocument:xmlns:office:1.0}meta" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "office-meta", propOrder = {
    "meta"
})
@XmlSeeAlso({
    DocumentMeta.class,
    Document.class
})
public class OfficeMeta {

    @XmlElement(namespace = "urn:oasis:names:tc:opendocument:xmlns:office:1.0")
    protected OfficeMetaContentStrict meta;

    /**
     * Gets the value of the meta property.
     * 
     * @return
     *     possible object is
     *     {@link OfficeMetaContentStrict }
     *     
     */
    public OfficeMetaContentStrict getMeta() {
        return meta;
    }

    /**
     * Sets the value of the meta property.
     * 
     * @param value
     *     allowed object is
     *     {@link OfficeMetaContentStrict }
     *     
     */
    public void setMeta(OfficeMetaContentStrict value) {
        this.meta = value;
    }

}
