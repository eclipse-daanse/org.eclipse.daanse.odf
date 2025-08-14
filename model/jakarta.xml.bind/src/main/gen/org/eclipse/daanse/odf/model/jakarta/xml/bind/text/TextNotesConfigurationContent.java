
package org.eclipse.daanse.odf.model.jakarta.xml.bind.text;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlElementRefs;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for text-notes-configuration-content complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="text-notes-configuration-content"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice maxOccurs="unbounded" minOccurs="0"&gt;
 *         &lt;element ref="{urn:oasis:names:tc:opendocument:xmlns:text:1.0}note-continuation-notice-forward"/&gt;
 *         &lt;element ref="{urn:oasis:names:tc:opendocument:xmlns:text:1.0}note-continuation-notice-backward"/&gt;
 *       &lt;/choice&gt;
 *       &lt;attGroup ref="{urn:oasis:names:tc:opendocument:xmlns:text:1.0}common-num-format-prefix-suffix-attlist"/&gt;
 *       &lt;attGroup ref="{urn:oasis:names:tc:opendocument:xmlns:text:1.0}common-num-format-attlist"/&gt;
 *       &lt;attGroup ref="{urn:oasis:names:tc:opendocument:xmlns:text:1.0}text-note-class"/&gt;
 *       &lt;attribute name="citation-style-name"&gt;
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
 *       &lt;attribute name="citation-body-style-name"&gt;
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
 *       &lt;attribute name="default-style-name"&gt;
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
 *       &lt;attribute name="master-page-name"&gt;
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
 *       &lt;attribute name="start-value" type="{urn:oasis:names:tc:opendocument:xmlns:text:1.0}nonNegativeInteger" /&gt;
 *       &lt;attribute name="start-numbering-at"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *             &lt;enumeration value="document"/&gt;
 *             &lt;enumeration value="chapter"/&gt;
 *             &lt;enumeration value="page"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="footnotes-position"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *             &lt;enumeration value="text"/&gt;
 *             &lt;enumeration value="page"/&gt;
 *             &lt;enumeration value="section"/&gt;
 *             &lt;enumeration value="document"/&gt;
 *           &lt;/restriction&gt;
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
@XmlType(name = "text-notes-configuration-content", propOrder = {
    "noteContinuationNoticeForwardOrNoteContinuationNoticeBackward"
})
public class TextNotesConfigurationContent {

    @XmlElementRefs({
        @XmlElementRef(name = "note-continuation-notice-forward", namespace = "urn:oasis:names:tc:opendocument:xmlns:text:1.0", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "note-continuation-notice-backward", namespace = "urn:oasis:names:tc:opendocument:xmlns:text:1.0", type = JAXBElement.class, required = false)
    })
    protected List<JAXBElement<String>> noteContinuationNoticeForwardOrNoteContinuationNoticeBackward;
    @XmlAttribute(name = "citation-style-name", namespace = "urn:oasis:names:tc:opendocument:xmlns:text:1.0")
    protected String citationStyleName;
    @XmlAttribute(name = "citation-body-style-name", namespace = "urn:oasis:names:tc:opendocument:xmlns:text:1.0")
    protected String citationBodyStyleName;
    @XmlAttribute(name = "default-style-name", namespace = "urn:oasis:names:tc:opendocument:xmlns:text:1.0")
    protected String defaultStyleName;
    @XmlAttribute(name = "master-page-name", namespace = "urn:oasis:names:tc:opendocument:xmlns:text:1.0")
    protected String masterPageName;
    @XmlAttribute(name = "start-value", namespace = "urn:oasis:names:tc:opendocument:xmlns:text:1.0")
    protected BigInteger startValue;
    @XmlAttribute(name = "start-numbering-at", namespace = "urn:oasis:names:tc:opendocument:xmlns:text:1.0")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String startNumberingAt;
    @XmlAttribute(name = "footnotes-position", namespace = "urn:oasis:names:tc:opendocument:xmlns:text:1.0")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String footnotesPosition;
    @XmlAttribute(name = "num-prefix", namespace = "urn:oasis:names:tc:opendocument:xmlns:style:1.0")
    protected String numPrefix;
    @XmlAttribute(name = "num-suffix", namespace = "urn:oasis:names:tc:opendocument:xmlns:style:1.0")
    protected String numSuffix;
    @XmlAttribute(name = "num-format", namespace = "urn:oasis:names:tc:opendocument:xmlns:style:1.0")
    protected List<String> numFormat;
    @XmlAttribute(name = "num-letter-sync", namespace = "urn:oasis:names:tc:opendocument:xmlns:style:1.0")
    protected Boolean numLetterSync;
    @XmlAttribute(name = "note-class", namespace = "urn:oasis:names:tc:opendocument:xmlns:text:1.0", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String noteClass;

    /**
     * Gets the value of the noteContinuationNoticeForwardOrNoteContinuationNoticeBackward property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the noteContinuationNoticeForwardOrNoteContinuationNoticeBackward property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNoteContinuationNoticeForwardOrNoteContinuationNoticeBackward().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * 
     */
    public List<JAXBElement<String>> getNoteContinuationNoticeForwardOrNoteContinuationNoticeBackward() {
        if (noteContinuationNoticeForwardOrNoteContinuationNoticeBackward == null) {
            noteContinuationNoticeForwardOrNoteContinuationNoticeBackward = new ArrayList<JAXBElement<String>>();
        }
        return this.noteContinuationNoticeForwardOrNoteContinuationNoticeBackward;
    }

    /**
     * Gets the value of the citationStyleName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCitationStyleName() {
        return citationStyleName;
    }

    /**
     * Sets the value of the citationStyleName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCitationStyleName(String value) {
        this.citationStyleName = value;
    }

    /**
     * Gets the value of the citationBodyStyleName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCitationBodyStyleName() {
        return citationBodyStyleName;
    }

    /**
     * Sets the value of the citationBodyStyleName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCitationBodyStyleName(String value) {
        this.citationBodyStyleName = value;
    }

    /**
     * Gets the value of the defaultStyleName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDefaultStyleName() {
        return defaultStyleName;
    }

    /**
     * Sets the value of the defaultStyleName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDefaultStyleName(String value) {
        this.defaultStyleName = value;
    }

    /**
     * Gets the value of the masterPageName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMasterPageName() {
        return masterPageName;
    }

    /**
     * Sets the value of the masterPageName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMasterPageName(String value) {
        this.masterPageName = value;
    }

    /**
     * Gets the value of the startValue property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getStartValue() {
        return startValue;
    }

    /**
     * Sets the value of the startValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setStartValue(BigInteger value) {
        this.startValue = value;
    }

    /**
     * Gets the value of the startNumberingAt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStartNumberingAt() {
        return startNumberingAt;
    }

    /**
     * Sets the value of the startNumberingAt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStartNumberingAt(String value) {
        this.startNumberingAt = value;
    }

    /**
     * Gets the value of the footnotesPosition property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFootnotesPosition() {
        return footnotesPosition;
    }

    /**
     * Sets the value of the footnotesPosition property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFootnotesPosition(String value) {
        this.footnotesPosition = value;
    }

    /**
     * Gets the value of the numPrefix property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumPrefix() {
        return numPrefix;
    }

    /**
     * Sets the value of the numPrefix property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumPrefix(String value) {
        this.numPrefix = value;
    }

    /**
     * Gets the value of the numSuffix property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumSuffix() {
        return numSuffix;
    }

    /**
     * Sets the value of the numSuffix property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumSuffix(String value) {
        this.numSuffix = value;
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

    /**
     * Gets the value of the noteClass property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNoteClass() {
        return noteClass;
    }

    /**
     * Sets the value of the noteClass property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNoteClass(String value) {
        this.noteClass = value;
    }

}
