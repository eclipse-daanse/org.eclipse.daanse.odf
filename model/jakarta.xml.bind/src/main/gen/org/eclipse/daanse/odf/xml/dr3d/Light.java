
package org.eclipse.daanse.odf.xml.dr3d;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;
import org.eclipse.daanse.odf.xml.text.Boolean;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attGroup ref="{urn:oasis:names:tc:opendocument:xmlns:text:1.0}dr3d-light-attlist"/&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "light")
public class Light {

    @XmlAttribute(name = "diffuse-color", namespace = "urn:oasis:names:tc:opendocument:xmlns:dr3d:1.0")
    protected String diffuseColor;
    @XmlAttribute(name = "direction", namespace = "urn:oasis:names:tc:opendocument:xmlns:dr3d:1.0", required = true)
    protected String direction;
    @XmlAttribute(name = "enabled", namespace = "urn:oasis:names:tc:opendocument:xmlns:dr3d:1.0")
    protected Boolean enabled;
    @XmlAttribute(name = "specular", namespace = "urn:oasis:names:tc:opendocument:xmlns:dr3d:1.0")
    protected Boolean specular;

    /**
     * Gets the value of the diffuseColor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDiffuseColor() {
        return diffuseColor;
    }

    /**
     * Sets the value of the diffuseColor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDiffuseColor(String value) {
        this.diffuseColor = value;
    }

    /**
     * Gets the value of the direction property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDirection() {
        return direction;
    }

    /**
     * Sets the value of the direction property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDirection(String value) {
        this.direction = value;
    }

    /**
     * Gets the value of the enabled property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getEnabled() {
        return enabled;
    }

    /**
     * Sets the value of the enabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEnabled(Boolean value) {
        this.enabled = value;
    }

    /**
     * Gets the value of the specular property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getSpecular() {
        return specular;
    }

    /**
     * Sets the value of the specular property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSpecular(Boolean value) {
        this.specular = value;
    }

}
