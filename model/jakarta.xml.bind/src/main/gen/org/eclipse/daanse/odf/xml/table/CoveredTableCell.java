
package org.eclipse.daanse.odf.xml.table;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.datatype.Duration;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlID;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.eclipse.daanse.odf.xml.text.Boolean;
import org.eclipse.daanse.odf.xml.text.TableTableCellContent;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:oasis:names:tc:opendocument:xmlns:text:1.0}table-table-cell-content"&gt;
 *       &lt;attGroup ref="{urn:oasis:names:tc:opendocument:xmlns:text:1.0}table-table-cell-attlist"/&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "covered-table-cell")
public class CoveredTableCell
    extends TableTableCellContent
{

    @XmlAttribute(name = "number-columns-repeated", namespace = "urn:oasis:names:tc:opendocument:xmlns:table:1.0")
    protected BigInteger numberColumnsRepeated;
    @XmlAttribute(name = "style-name", namespace = "urn:oasis:names:tc:opendocument:xmlns:table:1.0")
    protected String styleName;
    @XmlAttribute(name = "content-validation-name", namespace = "urn:oasis:names:tc:opendocument:xmlns:table:1.0")
    protected String contentValidationName;
    @XmlAttribute(name = "formula", namespace = "urn:oasis:names:tc:opendocument:xmlns:table:1.0")
    protected String formula;
    @XmlAttribute(name = "value", namespace = "urn:oasis:names:tc:opendocument:xmlns:office:1.0")
    protected Double value;
    @XmlAttribute(name = "currency", namespace = "urn:oasis:names:tc:opendocument:xmlns:office:1.0")
    protected String currency;
    @XmlAttribute(name = "date-value", namespace = "urn:oasis:names:tc:opendocument:xmlns:office:1.0")
    protected String dateValue;
    @XmlAttribute(name = "time-value", namespace = "urn:oasis:names:tc:opendocument:xmlns:office:1.0")
    protected Duration timeValue;
    @XmlAttribute(name = "boolean-value", namespace = "urn:oasis:names:tc:opendocument:xmlns:office:1.0")
    protected Boolean booleanValue;
    @XmlAttribute(name = "string-value", namespace = "urn:oasis:names:tc:opendocument:xmlns:office:1.0")
    protected String stringValue;
    @XmlAttribute(name = "protect", namespace = "urn:oasis:names:tc:opendocument:xmlns:table:1.0")
    protected Boolean protect;
    @XmlAttribute(name = "protected", namespace = "urn:oasis:names:tc:opendocument:xmlns:table:1.0")
    protected Boolean _protected;
    @XmlAttribute(name = "id", namespace = "http://www.w3.org/XML/1998/namespace")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    protected String id;
    @XmlAttribute(name = "about", namespace = "http://www.w3.org/1999/xhtml")
    protected String about;
    @XmlAttribute(name = "property", namespace = "http://www.w3.org/1999/xhtml")
    protected List<String> property;
    @XmlAttribute(name = "datatype", namespace = "http://www.w3.org/1999/xhtml")
    protected String datatype;
    @XmlAttribute(name = "content", namespace = "http://www.w3.org/1999/xhtml")
    protected String xhtmlContent;
    @XmlAttribute(name = "value-type", namespace = "urn:oasis:names:tc:opendocument:xmlns:office:1.0", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String valueType;

    /**
     * Gets the value of the numberColumnsRepeated property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumberColumnsRepeated() {
        return numberColumnsRepeated;
    }

    /**
     * Sets the value of the numberColumnsRepeated property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumberColumnsRepeated(BigInteger value) {
        this.numberColumnsRepeated = value;
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
     * Gets the value of the contentValidationName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContentValidationName() {
        return contentValidationName;
    }

    /**
     * Sets the value of the contentValidationName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContentValidationName(String value) {
        this.contentValidationName = value;
    }

    /**
     * Gets the value of the formula property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFormula() {
        return formula;
    }

    /**
     * Sets the value of the formula property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFormula(String value) {
        this.formula = value;
    }

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setValue(Double value) {
        this.value = value;
    }

    /**
     * Gets the value of the currency property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrency() {
        return currency;
    }

    /**
     * Sets the value of the currency property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrency(String value) {
        this.currency = value;
    }

    /**
     * Gets the value of the dateValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDateValue() {
        return dateValue;
    }

    /**
     * Sets the value of the dateValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDateValue(String value) {
        this.dateValue = value;
    }

    /**
     * Gets the value of the timeValue property.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getTimeValue() {
        return timeValue;
    }

    /**
     * Sets the value of the timeValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setTimeValue(Duration value) {
        this.timeValue = value;
    }

    /**
     * Gets the value of the booleanValue property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getBooleanValue() {
        return booleanValue;
    }

    /**
     * Sets the value of the booleanValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBooleanValue(Boolean value) {
        this.booleanValue = value;
    }

    /**
     * Gets the value of the stringValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStringValue() {
        return stringValue;
    }

    /**
     * Sets the value of the stringValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStringValue(String value) {
        this.stringValue = value;
    }

    /**
     * Gets the value of the protect property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getProtect() {
        return protect;
    }

    /**
     * Sets the value of the protect property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setProtect(Boolean value) {
        this.protect = value;
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
     * Gets the value of the about property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAbout() {
        return about;
    }

    /**
     * Sets the value of the about property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAbout(String value) {
        this.about = value;
    }

    /**
     * Gets the value of the property property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the property property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProperty().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getProperty() {
        if (property == null) {
            property = new ArrayList<String>();
        }
        return this.property;
    }

    /**
     * Gets the value of the datatype property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDatatype() {
        return datatype;
    }

    /**
     * Sets the value of the datatype property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDatatype(String value) {
        this.datatype = value;
    }

    /**
     * Gets the value of the xhtmlContent property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXhtmlContent() {
        return xhtmlContent;
    }

    /**
     * Sets the value of the xhtmlContent property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXhtmlContent(String value) {
        this.xhtmlContent = value;
    }

    /**
     * Gets the value of the valueType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValueType() {
        return valueType;
    }

    /**
     * Sets the value of the valueType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValueType(String value) {
        this.valueType = value;
    }

}
