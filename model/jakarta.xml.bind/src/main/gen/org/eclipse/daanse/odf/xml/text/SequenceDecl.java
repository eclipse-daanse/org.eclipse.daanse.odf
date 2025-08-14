
package org.eclipse.daanse.odf.xml.text;

import java.math.BigInteger;
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
 *       &lt;attGroup ref="{urn:oasis:names:tc:opendocument:xmlns:text:1.0}text-sequence-decl-attlist"/&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "sequence-decl")
public class SequenceDecl {

    @XmlAttribute(name = "display-outline-level", namespace = "urn:oasis:names:tc:opendocument:xmlns:text:1.0", required = true)
    protected BigInteger displayOutlineLevel;
    @XmlAttribute(name = "separation-character", namespace = "urn:oasis:names:tc:opendocument:xmlns:text:1.0")
    protected String separationCharacter;
    @XmlAttribute(name = "name", namespace = "urn:oasis:names:tc:opendocument:xmlns:text:1.0", required = true)
    protected String name;

    /**
     * Gets the value of the displayOutlineLevel property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getDisplayOutlineLevel() {
        return displayOutlineLevel;
    }

    /**
     * Sets the value of the displayOutlineLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setDisplayOutlineLevel(BigInteger value) {
        this.displayOutlineLevel = value;
    }

    /**
     * Gets the value of the separationCharacter property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSeparationCharacter() {
        return separationCharacter;
    }

    /**
     * Sets the value of the separationCharacter property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSeparationCharacter(String value) {
        this.separationCharacter = value;
    }

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

}
