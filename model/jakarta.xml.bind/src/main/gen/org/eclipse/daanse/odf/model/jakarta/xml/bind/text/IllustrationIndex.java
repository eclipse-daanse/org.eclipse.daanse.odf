
package org.eclipse.daanse.odf.model.jakarta.xml.bind.text;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlID;
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
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:oasis:names:tc:opendocument:xmlns:text:1.0}illustration-index-source"/&gt;
 *         &lt;element ref="{urn:oasis:names:tc:opendocument:xmlns:text:1.0}index-body"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attGroup ref="{urn:oasis:names:tc:opendocument:xmlns:text:1.0}common-section-attlist"/&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "illustrationIndexSource",
    "indexBody"
})
@XmlRootElement(name = "illustration-index")
public class IllustrationIndex {

    @XmlElement(name = "illustration-index-source", required = true)
    protected IllustrationIndexSource illustrationIndexSource;
    @XmlElement(name = "index-body", required = true)
    protected IndexBody indexBody;
    @XmlAttribute(name = "style-name", namespace = "urn:oasis:names:tc:opendocument:xmlns:text:1.0")
    protected String styleName;
    @XmlAttribute(name = "name", namespace = "urn:oasis:names:tc:opendocument:xmlns:text:1.0", required = true)
    protected String name;
    @XmlAttribute(name = "protected", namespace = "urn:oasis:names:tc:opendocument:xmlns:text:1.0")
    protected Boolean _protected;
    @XmlAttribute(name = "protection-key", namespace = "urn:oasis:names:tc:opendocument:xmlns:text:1.0")
    protected String protectionKey;
    @XmlAttribute(name = "protection-key-digest-algorithm", namespace = "urn:oasis:names:tc:opendocument:xmlns:text:1.0")
    protected String protectionKeyDigestAlgorithm;
    @XmlAttribute(name = "id", namespace = "http://www.w3.org/XML/1998/namespace")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    protected String id;

    /**
     * Gets the value of the illustrationIndexSource property.
     * 
     * @return
     *     possible object is
     *     {@link IllustrationIndexSource }
     *     
     */
    public IllustrationIndexSource getIllustrationIndexSource() {
        return illustrationIndexSource;
    }

    /**
     * Sets the value of the illustrationIndexSource property.
     * 
     * @param value
     *     allowed object is
     *     {@link IllustrationIndexSource }
     *     
     */
    public void setIllustrationIndexSource(IllustrationIndexSource value) {
        this.illustrationIndexSource = value;
    }

    /**
     * Gets the value of the indexBody property.
     * 
     * @return
     *     possible object is
     *     {@link IndexBody }
     *     
     */
    public IndexBody getIndexBody() {
        return indexBody;
    }

    /**
     * Sets the value of the indexBody property.
     * 
     * @param value
     *     allowed object is
     *     {@link IndexBody }
     *     
     */
    public void setIndexBody(IndexBody value) {
        this.indexBody = value;
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
     * Gets the value of the protected property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getProtected() {
        return _protected;
    }

    /**
     * Sets the value of the protected property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setProtected(Boolean value) {
        this._protected = value;
    }

    /**
     * Gets the value of the protectionKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProtectionKey() {
        return protectionKey;
    }

    /**
     * Sets the value of the protectionKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProtectionKey(String value) {
        this.protectionKey = value;
    }

    /**
     * Gets the value of the protectionKeyDigestAlgorithm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProtectionKeyDigestAlgorithm() {
        return protectionKeyDigestAlgorithm;
    }

    /**
     * Sets the value of the protectionKeyDigestAlgorithm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProtectionKeyDigestAlgorithm(String value) {
        this.protectionKeyDigestAlgorithm = value;
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

}
