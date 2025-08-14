
package org.eclipse.daanse.odf.xml.text;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.XmlValue;
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
 *       &lt;attGroup ref="{urn:oasis:names:tc:opendocument:xmlns:text:1.0}text-page-number-attlist"/&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "content"
})
@XmlRootElement(name = "page-number")
public class PageNumber {

    @XmlValue
    protected String content;
    @XmlAttribute(name = "page-adjust", namespace = "urn:oasis:names:tc:opendocument:xmlns:text:1.0")
    protected BigInteger pageAdjust;
    @XmlAttribute(name = "select-page", namespace = "urn:oasis:names:tc:opendocument:xmlns:text:1.0")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String selectPage;
    @XmlAttribute(name = "num-format", namespace = "urn:oasis:names:tc:opendocument:xmlns:style:1.0")
    protected List<String> numFormat;
    @XmlAttribute(name = "num-letter-sync", namespace = "urn:oasis:names:tc:opendocument:xmlns:style:1.0")
    protected Boolean numLetterSync;
    @XmlAttribute(name = "fixed", namespace = "urn:oasis:names:tc:opendocument:xmlns:text:1.0")
    protected Boolean fixed;

    /**
     * Gets the value of the content property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContent() {
        return content;
    }

    /**
     * Sets the value of the content property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContent(String value) {
        this.content = value;
    }

    /**
     * Gets the value of the pageAdjust property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPageAdjust() {
        return pageAdjust;
    }

    /**
     * Sets the value of the pageAdjust property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPageAdjust(BigInteger value) {
        this.pageAdjust = value;
    }

    /**
     * Gets the value of the selectPage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSelectPage() {
        return selectPage;
    }

    /**
     * Sets the value of the selectPage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSelectPage(String value) {
        this.selectPage = value;
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
     * Gets the value of the fixed property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getFixed() {
        return fixed;
    }

    /**
     * Sets the value of the fixed property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFixed(Boolean value) {
        this.fixed = value;
    }

}
