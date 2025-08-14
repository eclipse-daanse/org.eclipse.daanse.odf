
package org.eclipse.daanse.odf.xml.dr3d;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlID;
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
 *       &lt;attGroup ref="{urn:oasis:names:tc:opendocument:xmlns:text:1.0}common-draw-layer-name-attlist"/&gt;
 *       &lt;attGroup ref="{urn:oasis:names:tc:opendocument:xmlns:text:1.0}dr3d-cube-attlist"/&gt;
 *       &lt;attGroup ref="{urn:oasis:names:tc:opendocument:xmlns:text:1.0}common-draw-z-index-attlist"/&gt;
 *       &lt;attGroup ref="{urn:oasis:names:tc:opendocument:xmlns:text:1.0}common-draw-id-attlist"/&gt;
 *       &lt;attGroup ref="{urn:oasis:names:tc:opendocument:xmlns:text:1.0}common-draw-style-name-attlist"/&gt;
 *       &lt;attGroup ref="{urn:oasis:names:tc:opendocument:xmlns:text:1.0}common-dr3d-transform-attlist"/&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
public class Cube {

    @XmlAttribute(name = "layer", namespace = "urn:oasis:names:tc:opendocument:xmlns:drawing:1.0")
    protected String layer;
    @XmlAttribute(name = "min-edge", namespace = "urn:oasis:names:tc:opendocument:xmlns:dr3d:1.0")
    protected String minEdge;
    @XmlAttribute(name = "max-edge", namespace = "urn:oasis:names:tc:opendocument:xmlns:dr3d:1.0")
    protected String maxEdge;
    @XmlAttribute(name = "z-index", namespace = "urn:oasis:names:tc:opendocument:xmlns:drawing:1.0")
    protected BigInteger zIndex;
    @XmlAttribute(name = "id", namespace = "http://www.w3.org/XML/1998/namespace")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    protected String id;
    @XmlAttribute(name = "id", namespace = "urn:oasis:names:tc:opendocument:xmlns:drawing:1.0", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String idAttribute;
    @XmlAttribute(name = "style-name", namespace = "urn:oasis:names:tc:opendocument:xmlns:drawing:1.0")
    protected String drawStyleName;
    @XmlAttribute(name = "class-names", namespace = "urn:oasis:names:tc:opendocument:xmlns:drawing:1.0")
    protected List<String> drawClassNames;
    @XmlAttribute(name = "style-name", namespace = "urn:oasis:names:tc:opendocument:xmlns:presentation:1.0")
    protected String presentationStyleName;
    @XmlAttribute(name = "class-names", namespace = "urn:oasis:names:tc:opendocument:xmlns:presentation:1.0")
    protected List<String> presentationClassNames;
    @XmlAttribute(name = "transform", namespace = "urn:oasis:names:tc:opendocument:xmlns:dr3d:1.0")
    protected String transform;

    /**
     * Gets the value of the layer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLayer() {
        return layer;
    }

    /**
     * Sets the value of the layer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLayer(String value) {
        this.layer = value;
    }

    /**
     * Gets the value of the minEdge property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMinEdge() {
        return minEdge;
    }

    /**
     * Sets the value of the minEdge property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMinEdge(String value) {
        this.minEdge = value;
    }

    /**
     * Gets the value of the maxEdge property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaxEdge() {
        return maxEdge;
    }

    /**
     * Sets the value of the maxEdge property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaxEdge(String value) {
        this.maxEdge = value;
    }

    /**
     * Gets the value of the zIndex property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getZIndex() {
        return zIndex;
    }

    /**
     * Sets the value of the zIndex property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setZIndex(BigInteger value) {
        this.zIndex = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the idAttribute property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdAttribute() {
        return idAttribute;
    }

    /**
     * Sets the value of the idAttribute property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdAttribute(String value) {
        this.idAttribute = value;
    }

    /**
     * Gets the value of the drawStyleName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDrawStyleName() {
        return drawStyleName;
    }

    /**
     * Sets the value of the drawStyleName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDrawStyleName(String value) {
        this.drawStyleName = value;
    }

    /**
     * Gets the value of the drawClassNames property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the drawClassNames property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDrawClassNames().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getDrawClassNames() {
        if (drawClassNames == null) {
            drawClassNames = new ArrayList<String>();
        }
        return this.drawClassNames;
    }

    /**
     * Gets the value of the presentationStyleName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPresentationStyleName() {
        return presentationStyleName;
    }

    /**
     * Sets the value of the presentationStyleName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPresentationStyleName(String value) {
        this.presentationStyleName = value;
    }

    /**
     * Gets the value of the presentationClassNames property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the presentationClassNames property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPresentationClassNames().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getPresentationClassNames() {
        if (presentationClassNames == null) {
            presentationClassNames = new ArrayList<String>();
        }
        return this.presentationClassNames;
    }

    /**
     * Gets the value of the transform property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransform() {
        return transform;
    }

    /**
     * Sets the value of the transform property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransform(String value) {
        this.transform = value;
    }

}
