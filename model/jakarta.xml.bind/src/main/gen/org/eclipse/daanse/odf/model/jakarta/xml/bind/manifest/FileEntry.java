
package org.eclipse.daanse.odf.model.jakarta.xml.bind.manifest;

import java.math.BigInteger;
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
 *         &lt;element ref="{urn:oasis:names:tc:opendocument:xmlns:manifest:1.0}encryption-data" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attGroup ref="{urn:oasis:names:tc:opendocument:xmlns:manifest:1.0}file-entry-attlist"/&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "encryptionData"
})
@XmlRootElement(name = "file-entry")
public class FileEntry {

    @XmlElement(name = "encryption-data")
    protected EncryptionData encryptionData;
    @XmlAttribute(name = "full-path", namespace = "urn:oasis:names:tc:opendocument:xmlns:manifest:1.0", required = true)
    protected String fullPath;
    @XmlAttribute(name = "size", namespace = "urn:oasis:names:tc:opendocument:xmlns:manifest:1.0")
    protected BigInteger size;
    @XmlAttribute(name = "media-type", namespace = "urn:oasis:names:tc:opendocument:xmlns:manifest:1.0", required = true)
    protected String mediaType;
    @XmlAttribute(name = "preferred-view-mode", namespace = "urn:oasis:names:tc:opendocument:xmlns:manifest:1.0")
    protected String preferredViewMode;
    @XmlAttribute(name = "version", namespace = "urn:oasis:names:tc:opendocument:xmlns:manifest:1.0")
    protected String version;

    /**
     * Gets the value of the encryptionData property.
     * 
     * @return
     *     possible object is
     *     {@link EncryptionData }
     *     
     */
    public EncryptionData getEncryptionData() {
        return encryptionData;
    }

    /**
     * Sets the value of the encryptionData property.
     * 
     * @param value
     *     allowed object is
     *     {@link EncryptionData }
     *     
     */
    public void setEncryptionData(EncryptionData value) {
        this.encryptionData = value;
    }

    /**
     * Gets the value of the fullPath property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFullPath() {
        return fullPath;
    }

    /**
     * Sets the value of the fullPath property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFullPath(String value) {
        this.fullPath = value;
    }

    /**
     * Gets the value of the size property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSize() {
        return size;
    }

    /**
     * Sets the value of the size property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSize(BigInteger value) {
        this.size = value;
    }

    /**
     * Gets the value of the mediaType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMediaType() {
        return mediaType;
    }

    /**
     * Sets the value of the mediaType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMediaType(String value) {
        this.mediaType = value;
    }

    /**
     * Gets the value of the preferredViewMode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPreferredViewMode() {
        return preferredViewMode;
    }

    /**
     * Sets the value of the preferredViewMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPreferredViewMode(String value) {
        this.preferredViewMode = value;
    }

    /**
     * Gets the value of the version property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersion() {
        return version;
    }

    /**
     * Sets the value of the version property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersion(String value) {
        this.version = value;
    }

}
