
package org.eclipse.daanse.odf.model.jakarta.xml.bind.text;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
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
 *       &lt;attGroup ref="{urn:oasis:names:tc:opendocument:xmlns:text:1.0}office-dde-source-attlist"/&gt;
 *       &lt;attGroup ref="{urn:oasis:names:tc:opendocument:xmlns:text:1.0}common-dde-connection-decl-attlist"/&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
public class TextSectionSourceDde {

    @XmlAttribute(name = "name", namespace = "urn:oasis:names:tc:opendocument:xmlns:office:1.0")
    protected String name;
    @XmlAttribute(name = "conversion-mode", namespace = "urn:oasis:names:tc:opendocument:xmlns:office:1.0")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String conversionMode;
    @XmlAttribute(name = "dde-application", namespace = "urn:oasis:names:tc:opendocument:xmlns:office:1.0", required = true)
    protected String ddeApplication;
    @XmlAttribute(name = "dde-topic", namespace = "urn:oasis:names:tc:opendocument:xmlns:office:1.0", required = true)
    protected String ddeTopic;
    @XmlAttribute(name = "dde-item", namespace = "urn:oasis:names:tc:opendocument:xmlns:office:1.0", required = true)
    protected String ddeItem;
    @XmlAttribute(name = "automatic-update", namespace = "urn:oasis:names:tc:opendocument:xmlns:office:1.0")
    protected Boolean automaticUpdate;

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the conversionMode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConversionMode() {
        return conversionMode;
    }

    /**
     * Sets the value of the conversionMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConversionMode(String value) {
        this.conversionMode = value;
    }

    /**
     * Gets the value of the ddeApplication property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDdeApplication() {
        return ddeApplication;
    }

    /**
     * Sets the value of the ddeApplication property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDdeApplication(String value) {
        this.ddeApplication = value;
    }

    /**
     * Gets the value of the ddeTopic property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDdeTopic() {
        return ddeTopic;
    }

    /**
     * Sets the value of the ddeTopic property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDdeTopic(String value) {
        this.ddeTopic = value;
    }

    /**
     * Gets the value of the ddeItem property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDdeItem() {
        return ddeItem;
    }

    /**
     * Sets the value of the ddeItem property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDdeItem(String value) {
        this.ddeItem = value;
    }

    /**
     * Gets the value of the automaticUpdate property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getAutomaticUpdate() {
        return automaticUpdate;
    }

    /**
     * Sets the value of the automaticUpdate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAutomaticUpdate(Boolean value) {
        this.automaticUpdate = value;
    }

}
