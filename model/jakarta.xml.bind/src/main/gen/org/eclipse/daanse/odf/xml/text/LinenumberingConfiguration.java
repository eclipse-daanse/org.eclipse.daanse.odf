
package org.eclipse.daanse.odf.xml.text;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
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
 *         &lt;element ref="{urn:oasis:names:tc:opendocument:xmlns:text:1.0}linenumbering-separator" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attGroup ref="{urn:oasis:names:tc:opendocument:xmlns:text:1.0}text-linenumbering-configuration-attlist"/&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "linenumberingSeparator"
})
@XmlRootElement(name = "linenumbering-configuration")
public class LinenumberingConfiguration {

    @XmlElement(name = "linenumbering-separator")
    protected LinenumberingSeparator linenumberingSeparator;
    @XmlAttribute(name = "number-lines", namespace = "urn:oasis:names:tc:opendocument:xmlns:text:1.0")
    protected Boolean numberLines;
    @XmlAttribute(name = "style-name", namespace = "urn:oasis:names:tc:opendocument:xmlns:text:1.0")
    protected String styleName;
    @XmlAttribute(name = "increment", namespace = "urn:oasis:names:tc:opendocument:xmlns:text:1.0")
    protected BigInteger increment;
    @XmlAttribute(name = "number-position", namespace = "urn:oasis:names:tc:opendocument:xmlns:text:1.0")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String numberPosition;
    @XmlAttribute(name = "offset", namespace = "urn:oasis:names:tc:opendocument:xmlns:text:1.0")
    protected String offset;
    @XmlAttribute(name = "count-empty-lines", namespace = "urn:oasis:names:tc:opendocument:xmlns:text:1.0")
    protected Boolean countEmptyLines;
    @XmlAttribute(name = "count-in-text-boxes", namespace = "urn:oasis:names:tc:opendocument:xmlns:text:1.0")
    protected Boolean countInTextBoxes;
    @XmlAttribute(name = "restart-on-page", namespace = "urn:oasis:names:tc:opendocument:xmlns:text:1.0")
    protected Boolean restartOnPage;
    @XmlAttribute(name = "num-format", namespace = "urn:oasis:names:tc:opendocument:xmlns:style:1.0")
    protected List<String> numFormat;
    @XmlAttribute(name = "num-letter-sync", namespace = "urn:oasis:names:tc:opendocument:xmlns:style:1.0")
    protected Boolean numLetterSync;

    /**
     * Gets the value of the linenumberingSeparator property.
     * 
     * @return
     *     possible object is
     *     {@link LinenumberingSeparator }
     *     
     */
    public LinenumberingSeparator getLinenumberingSeparator() {
        return linenumberingSeparator;
    }

    /**
     * Sets the value of the linenumberingSeparator property.
     * 
     * @param value
     *     allowed object is
     *     {@link LinenumberingSeparator }
     *     
     */
    public void setLinenumberingSeparator(LinenumberingSeparator value) {
        this.linenumberingSeparator = value;
    }

    /**
     * Gets the value of the numberLines property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getNumberLines() {
        return numberLines;
    }

    /**
     * Sets the value of the numberLines property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNumberLines(Boolean value) {
        this.numberLines = value;
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
     * Gets the value of the increment property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getIncrement() {
        return increment;
    }

    /**
     * Sets the value of the increment property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setIncrement(BigInteger value) {
        this.increment = value;
    }

    /**
     * Gets the value of the numberPosition property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumberPosition() {
        return numberPosition;
    }

    /**
     * Sets the value of the numberPosition property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumberPosition(String value) {
        this.numberPosition = value;
    }

    /**
     * Gets the value of the offset property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOffset() {
        return offset;
    }

    /**
     * Sets the value of the offset property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOffset(String value) {
        this.offset = value;
    }

    /**
     * Gets the value of the countEmptyLines property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getCountEmptyLines() {
        return countEmptyLines;
    }

    /**
     * Sets the value of the countEmptyLines property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCountEmptyLines(Boolean value) {
        this.countEmptyLines = value;
    }

    /**
     * Gets the value of the countInTextBoxes property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getCountInTextBoxes() {
        return countInTextBoxes;
    }

    /**
     * Sets the value of the countInTextBoxes property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCountInTextBoxes(Boolean value) {
        this.countInTextBoxes = value;
    }

    /**
     * Gets the value of the restartOnPage property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getRestartOnPage() {
        return restartOnPage;
    }

    /**
     * Sets the value of the restartOnPage property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRestartOnPage(Boolean value) {
        this.restartOnPage = value;
    }

    /**
     * Gets the value of the numFormat property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the numFormat property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNumFormat().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getNumFormat() {
        if (numFormat == null) {
            numFormat = new ArrayList<String>();
        }
        return this.numFormat;
    }

    /**
     * Gets the value of the numLetterSync property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getNumLetterSync() {
        return numLetterSync;
    }

    /**
     * Sets the value of the numLetterSync property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNumLetterSync(Boolean value) {
        this.numLetterSync = value;
    }

}
