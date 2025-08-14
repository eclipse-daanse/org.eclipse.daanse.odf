
package org.eclipse.daanse.odf.xml.manifest;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAnyElement;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;
import org.w3c.dom.Element;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;group ref="{urn:oasis:names:tc:opendocument:xmlns:manifest:1.0}anyElements"/&gt;
 *       &lt;attGroup ref="{urn:oasis:names:tc:opendocument:xmlns:manifest:1.0}algorithm-attlist"/&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "any"
})
@XmlRootElement(name = "algorithm")
public class Algorithm {

    @XmlAnyElement
    protected List<Element> any;
    @XmlAttribute(name = "algorithm-name", namespace = "urn:oasis:names:tc:opendocument:xmlns:manifest:1.0", required = true)
    protected String algorithmName;
    @XmlAttribute(name = "initialisation-vector", namespace = "urn:oasis:names:tc:opendocument:xmlns:manifest:1.0", required = true)
    protected byte[] initialisationVector;

    /**
     * Gets the value of the any property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the any property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAny().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Element }
     * 
     * 
     */
    public List<Element> getAny() {
        if (any == null) {
            any = new ArrayList<Element>();
        }
        return this.any;
    }

    /**
     * Gets the value of the algorithmName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAlgorithmName() {
        return algorithmName;
    }

    /**
     * Sets the value of the algorithmName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAlgorithmName(String value) {
        this.algorithmName = value;
    }

    /**
     * Gets the value of the initialisationVector property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getInitialisationVector() {
        return initialisationVector;
    }

    /**
     * Sets the value of the initialisationVector property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setInitialisationVector(byte[] value) {
        this.initialisationVector = value;
    }

}
