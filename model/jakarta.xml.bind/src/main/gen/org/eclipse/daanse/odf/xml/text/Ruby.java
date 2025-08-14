
package org.eclipse.daanse.odf.xml.text;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
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
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:oasis:names:tc:opendocument:xmlns:text:1.0}ruby-base"/&gt;
 *         &lt;element ref="{urn:oasis:names:tc:opendocument:xmlns:text:1.0}ruby-text"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="style-name"&gt;
 *         &lt;simpleType&gt;
 *           &lt;union memberTypes=" {urn:oasis:names:tc:opendocument:xmlns:text:1.0}styleNameRef"&gt;
 *             &lt;simpleType&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *                 &lt;length value="0"/&gt;
 *               &lt;/restriction&gt;
 *             &lt;/simpleType&gt;
 *           &lt;/union&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "rubyBase",
    "rubyText"
})
@XmlRootElement(name = "ruby")
public class Ruby {

    @XmlElement(name = "ruby-base", required = true)
    protected RubyBase rubyBase;
    @XmlElement(name = "ruby-text", required = true)
    protected RubyText rubyText;
    @XmlAttribute(name = "style-name", namespace = "urn:oasis:names:tc:opendocument:xmlns:text:1.0")
    protected String styleName;

    /**
     * Gets the value of the rubyBase property.
     * 
     * @return
     *     possible object is
     *     {@link RubyBase }
     *     
     */
    public RubyBase getRubyBase() {
        return rubyBase;
    }

    /**
     * Sets the value of the rubyBase property.
     * 
     * @param value
     *     allowed object is
     *     {@link RubyBase }
     *     
     */
    public void setRubyBase(RubyBase value) {
        this.rubyBase = value;
    }

    /**
     * Gets the value of the rubyText property.
     * 
     * @return
     *     possible object is
     *     {@link RubyText }
     *     
     */
    public RubyText getRubyText() {
        return rubyText;
    }

    /**
     * Sets the value of the rubyText property.
     * 
     * @param value
     *     allowed object is
     *     {@link RubyText }
     *     
     */
    public void setRubyText(RubyText value) {
        this.rubyText = value;
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
