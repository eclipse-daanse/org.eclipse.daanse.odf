
package org.eclipse.daanse.odf.xml.text;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;
import org.eclipse.daanse.odf.xml.style.FooterStyle;
import org.eclipse.daanse.odf.xml.style.HeaderStyle;
import org.eclipse.daanse.odf.xml.style.PageLayout;


/**
 * <p>Java class for style-page-layout-content complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="style-page-layout-content"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:oasis:names:tc:opendocument:xmlns:style:1.0}page-layout-properties" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:tc:opendocument:xmlns:style:1.0}header-style" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:tc:opendocument:xmlns:style:1.0}footer-style" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "style-page-layout-content", propOrder = {
    "pageLayoutProperties",
    "headerStyle",
    "footerStyle"
})
@XmlSeeAlso({
    PageLayout.class
})
public class StylePageLayoutContent {

    @XmlElement(name = "page-layout-properties", namespace = "urn:oasis:names:tc:opendocument:xmlns:style:1.0")
    protected StylePageLayoutPropertiesContentStrict pageLayoutProperties;
    @XmlElement(name = "header-style", namespace = "urn:oasis:names:tc:opendocument:xmlns:style:1.0")
    protected HeaderStyle headerStyle;
    @XmlElement(name = "footer-style", namespace = "urn:oasis:names:tc:opendocument:xmlns:style:1.0")
    protected FooterStyle footerStyle;

    /**
     * Gets the value of the pageLayoutProperties property.
     * 
     * @return
     *     possible object is
     *     {@link StylePageLayoutPropertiesContentStrict }
     *     
     */
    public StylePageLayoutPropertiesContentStrict getPageLayoutProperties() {
        return pageLayoutProperties;
    }

    /**
     * Sets the value of the pageLayoutProperties property.
     * 
     * @param value
     *     allowed object is
     *     {@link StylePageLayoutPropertiesContentStrict }
     *     
     */
    public void setPageLayoutProperties(StylePageLayoutPropertiesContentStrict value) {
        this.pageLayoutProperties = value;
    }

    /**
     * Gets the value of the headerStyle property.
     * 
     * @return
     *     possible object is
     *     {@link HeaderStyle }
     *     
     */
    public HeaderStyle getHeaderStyle() {
        return headerStyle;
    }

    /**
     * Sets the value of the headerStyle property.
     * 
     * @param value
     *     allowed object is
     *     {@link HeaderStyle }
     *     
     */
    public void setHeaderStyle(HeaderStyle value) {
        this.headerStyle = value;
    }

    /**
     * Gets the value of the footerStyle property.
     * 
     * @return
     *     possible object is
     *     {@link FooterStyle }
     *     
     */
    public FooterStyle getFooterStyle() {
        return footerStyle;
    }

    /**
     * Sets the value of the footerStyle property.
     * 
     * @param value
     *     allowed object is
     *     {@link FooterStyle }
     *     
     */
    public void setFooterStyle(FooterStyle value) {
        this.footerStyle = value;
    }

}
