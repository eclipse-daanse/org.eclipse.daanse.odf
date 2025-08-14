
package org.eclipse.daanse.odf.model.jakarta.xml.bind.table;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
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
 *       &lt;attGroup ref="{urn:oasis:names:tc:opendocument:xmlns:text:1.0}common-table-template-attlist"/&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "body")
public class Body {

    @XmlAttribute(name = "style-name", namespace = "urn:oasis:names:tc:opendocument:xmlns:table:1.0", required = true)
    protected String styleName;
    @XmlAttribute(name = "paragraph-style-name", namespace = "urn:oasis:names:tc:opendocument:xmlns:table:1.0")
    protected String paragraphStyleName;

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

    /**
     * Gets the value of the paragraphStyleName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParagraphStyleName() {
        return paragraphStyleName;
    }

    /**
     * Sets the value of the paragraphStyleName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParagraphStyleName(String value) {
        this.paragraphStyleName = value;
    }

}
