
package org.eclipse.daanse.odf.xml.style;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
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
 *       &lt;attGroup ref="{urn:oasis:names:tc:opendocument:xmlns:text:1.0}style-ruby-properties-content-strict"/&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "ruby-properties")
public class RubyProperties {

    @XmlAttribute(name = "ruby-position", namespace = "urn:oasis:names:tc:opendocument:xmlns:style:1.0")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String rubyPosition;
    @XmlAttribute(name = "ruby-align", namespace = "urn:oasis:names:tc:opendocument:xmlns:style:1.0")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String rubyAlign;

    /**
     * Gets the value of the rubyPosition property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRubyPosition() {
        return rubyPosition;
    }

    /**
     * Sets the value of the rubyPosition property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRubyPosition(String value) {
        this.rubyPosition = value;
    }

    /**
     * Gets the value of the rubyAlign property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRubyAlign() {
        return rubyAlign;
    }

    /**
     * Sets the value of the rubyAlign property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRubyAlign(String value) {
        this.rubyAlign = value;
    }

}
