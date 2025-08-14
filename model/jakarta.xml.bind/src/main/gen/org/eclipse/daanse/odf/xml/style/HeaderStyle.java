
package org.eclipse.daanse.odf.xml.style;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;
import org.eclipse.daanse.odf.xml.text.StyleHeaderFooterPropertiesContentStrict;


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
 *         &lt;element ref="{urn:oasis:names:tc:opendocument:xmlns:style:1.0}header-footer-properties" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "headerFooterProperties"
})
@XmlRootElement(name = "header-style")
public class HeaderStyle {

    @XmlElement(name = "header-footer-properties")
    protected StyleHeaderFooterPropertiesContentStrict headerFooterProperties;

    /**
     * Gets the value of the headerFooterProperties property.
     * 
     * @return
     *     possible object is
     *     {@link StyleHeaderFooterPropertiesContentStrict }
     *     
     */
    public StyleHeaderFooterPropertiesContentStrict getHeaderFooterProperties() {
        return headerFooterProperties;
    }

    /**
     * Sets the value of the headerFooterProperties property.
     * 
     * @param value
     *     allowed object is
     *     {@link StyleHeaderFooterPropertiesContentStrict }
     *     
     */
    public void setHeaderFooterProperties(StyleHeaderFooterPropertiesContentStrict value) {
        this.headerFooterProperties = value;
    }

}
