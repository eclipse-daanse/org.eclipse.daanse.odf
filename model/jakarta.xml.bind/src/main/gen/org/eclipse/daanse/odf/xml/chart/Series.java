
package org.eclipse.daanse.odf.xml.chart;

import java.util.ArrayList;
import java.util.List;
import javax.xml.namespace.QName;
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
 *         &lt;element ref="{urn:oasis:names:tc:opendocument:xmlns:chart:1.0}domain" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:tc:opendocument:xmlns:chart:1.0}mean-value" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:tc:opendocument:xmlns:chart:1.0}regression-curve" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:tc:opendocument:xmlns:chart:1.0}error-indicator" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:tc:opendocument:xmlns:chart:1.0}data-point" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:tc:opendocument:xmlns:chart:1.0}data-label" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attGroup ref="{urn:oasis:names:tc:opendocument:xmlns:text:1.0}chart-series-attlist"/&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "domain",
    "meanValue",
    "regressionCurve",
    "errorIndicator",
    "dataPoint",
    "dataLabel"
})
@XmlRootElement(name = "series")
public class Series {

    protected List<Domain> domain;
    @XmlElement(name = "mean-value")
    protected MeanValue meanValue;
    @XmlElement(name = "regression-curve")
    protected List<RegressionCurve> regressionCurve;
    @XmlElement(name = "error-indicator")
    protected List<ErrorIndicator> errorIndicator;
    @XmlElement(name = "data-point")
    protected List<DataPoint> dataPoint;
    @XmlElement(name = "data-label")
    protected DataLabel dataLabel;
    @XmlAttribute(name = "values-cell-range-address", namespace = "urn:oasis:names:tc:opendocument:xmlns:chart:1.0")
    protected String valuesCellRangeAddress;
    @XmlAttribute(name = "label-cell-address", namespace = "urn:oasis:names:tc:opendocument:xmlns:chart:1.0")
    protected String labelCellAddress;
    @XmlAttribute(name = "attached-axis", namespace = "urn:oasis:names:tc:opendocument:xmlns:chart:1.0")
    protected String attachedAxis;
    @XmlAttribute(name = "style-name", namespace = "urn:oasis:names:tc:opendocument:xmlns:chart:1.0")
    protected String styleName;
    @XmlAttribute(name = "id", namespace = "http://www.w3.org/XML/1998/namespace")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    protected String id;
    @XmlAttribute(name = "class", namespace = "urn:oasis:names:tc:opendocument:xmlns:chart:1.0", required = true)
    protected QName clazz;

    /**
     * Gets the value of the domain property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the domain property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDomain().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Domain }
     * 
     * 
     */
    public List<Domain> getDomain() {
        if (domain == null) {
            domain = new ArrayList<Domain>();
        }
        return this.domain;
    }

    /**
     * Gets the value of the meanValue property.
     * 
     * @return
     *     possible object is
     *     {@link MeanValue }
     *     
     */
    public MeanValue getMeanValue() {
        return meanValue;
    }

    /**
     * Sets the value of the meanValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeanValue }
     *     
     */
    public void setMeanValue(MeanValue value) {
        this.meanValue = value;
    }

    /**
     * Gets the value of the regressionCurve property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the regressionCurve property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRegressionCurve().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RegressionCurve }
     * 
     * 
     */
    public List<RegressionCurve> getRegressionCurve() {
        if (regressionCurve == null) {
            regressionCurve = new ArrayList<RegressionCurve>();
        }
        return this.regressionCurve;
    }

    /**
     * Gets the value of the errorIndicator property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the errorIndicator property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getErrorIndicator().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ErrorIndicator }
     * 
     * 
     */
    public List<ErrorIndicator> getErrorIndicator() {
        if (errorIndicator == null) {
            errorIndicator = new ArrayList<ErrorIndicator>();
        }
        return this.errorIndicator;
    }

    /**
     * Gets the value of the dataPoint property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the dataPoint property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDataPoint().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DataPoint }
     * 
     * 
     */
    public List<DataPoint> getDataPoint() {
        if (dataPoint == null) {
            dataPoint = new ArrayList<DataPoint>();
        }
        return this.dataPoint;
    }

    /**
     * Gets the value of the dataLabel property.
     * 
     * @return
     *     possible object is
     *     {@link DataLabel }
     *     
     */
    public DataLabel getDataLabel() {
        return dataLabel;
    }

    /**
     * Sets the value of the dataLabel property.
     * 
     * @param value
     *     allowed object is
     *     {@link DataLabel }
     *     
     */
    public void setDataLabel(DataLabel value) {
        this.dataLabel = value;
    }

    /**
     * Gets the value of the valuesCellRangeAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValuesCellRangeAddress() {
        return valuesCellRangeAddress;
    }

    /**
     * Sets the value of the valuesCellRangeAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValuesCellRangeAddress(String value) {
        this.valuesCellRangeAddress = value;
    }

    /**
     * Gets the value of the labelCellAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLabelCellAddress() {
        return labelCellAddress;
    }

    /**
     * Sets the value of the labelCellAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLabelCellAddress(String value) {
        this.labelCellAddress = value;
    }

    /**
     * Gets the value of the attachedAxis property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAttachedAxis() {
        return attachedAxis;
    }

    /**
     * Sets the value of the attachedAxis property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAttachedAxis(String value) {
        this.attachedAxis = value;
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
     * Gets the value of the clazz property.
     * 
     * @return
     *     possible object is
     *     {@link QName }
     *     
     */
    public QName getClazz() {
        return clazz;
    }

    /**
     * Sets the value of the clazz property.
     * 
     * @param value
     *     allowed object is
     *     {@link QName }
     *     
     */
    public void setClazz(QName value) {
        this.clazz = value;
    }

}
