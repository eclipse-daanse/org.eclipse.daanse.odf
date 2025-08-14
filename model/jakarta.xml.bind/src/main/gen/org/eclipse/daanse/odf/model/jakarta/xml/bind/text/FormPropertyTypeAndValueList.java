
package org.eclipse.daanse.odf.model.jakarta.xml.bind.text;

import java.util.ArrayList;
import java.util.List;
import javax.xml.datatype.Duration;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.eclipse.daanse.odf.model.jakarta.xml.bind.form.ListProperty;


/**
 * <p>Java class for form-property-type-and-value-list complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="form-property-type-and-value-list"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice minOccurs="0"&gt;
 *         &lt;group ref="{urn:oasis:names:tc:opendocument:xmlns:form:1.0}list-value" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/choice&gt;
 *       &lt;attGroup ref="{urn:oasis:names:tc:opendocument:xmlns:office:1.0}value-type2"/&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "form-property-type-and-value-list", propOrder = {
    "listValue"
})
@XmlSeeAlso({
    ListProperty.class
})
public class FormPropertyTypeAndValueList {

    @XmlElement(name = "list-value", namespace = "urn:oasis:names:tc:opendocument:xmlns:form:1.0")
    protected List<FormPropertyTypeAndValueList.ListValue> listValue;
    @XmlAttribute(name = "value-type", namespace = "urn:oasis:names:tc:opendocument:xmlns:office:1.0", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String valueType;

    /**
     * Gets the value of the listValue property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the listValue property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getListValue().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FormPropertyTypeAndValueList.ListValue }
     * 
     * 
     */
    public List<FormPropertyTypeAndValueList.ListValue> getListValue() {
        if (listValue == null) {
            listValue = new ArrayList<FormPropertyTypeAndValueList.ListValue>();
        }
        return this.listValue;
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


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;attribute ref="{urn:oasis:names:tc:opendocument:xmlns:office:1.0}value use="required""/&gt;
     *       &lt;attribute ref="{urn:oasis:names:tc:opendocument:xmlns:office:1.0}currency"/&gt;
     *       &lt;attribute ref="{urn:oasis:names:tc:opendocument:xmlns:office:1.0}date-value use="required""/&gt;
     *       &lt;attribute ref="{urn:oasis:names:tc:opendocument:xmlns:office:1.0}time-value use="required""/&gt;
     *       &lt;attribute ref="{urn:oasis:names:tc:opendocument:xmlns:office:1.0}boolean-value use="required""/&gt;
     *       &lt;attribute ref="{urn:oasis:names:tc:opendocument:xmlns:office:1.0}string-value use="required""/&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class ListValue {

        @XmlAttribute(name = "value", namespace = "urn:oasis:names:tc:opendocument:xmlns:office:1.0", required = true)
        protected double value;
        @XmlAttribute(name = "currency", namespace = "urn:oasis:names:tc:opendocument:xmlns:office:1.0")
        protected String currency;
        @XmlAttribute(name = "date-value", namespace = "urn:oasis:names:tc:opendocument:xmlns:office:1.0", required = true)
        protected String dateValue;
        @XmlAttribute(name = "time-value", namespace = "urn:oasis:names:tc:opendocument:xmlns:office:1.0", required = true)
        protected Duration timeValue;
        @XmlAttribute(name = "boolean-value", namespace = "urn:oasis:names:tc:opendocument:xmlns:office:1.0", required = true)
        protected Boolean booleanValue;
        @XmlAttribute(name = "string-value", namespace = "urn:oasis:names:tc:opendocument:xmlns:office:1.0", required = true)
        protected String stringValue;

        /**
         * Gets the value of the value property.
         * 
         */
        public double getValue() {
            return value;
        }

        /**
         * Sets the value of the value property.
         * 
         */
        public void setValue(double value) {
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

    }

}
