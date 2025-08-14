
package org.eclipse.daanse.odf.xml.chart;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlID;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.eclipse.daanse.odf.xml.dr3d.Light;
import org.eclipse.daanse.odf.xml.text.Boolean;


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
 *         &lt;element ref="{urn:oasis:names:tc:opendocument:xmlns:chart:1.0}coordinate-region" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:tc:opendocument:xmlns:dr3d:1.0}light" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:tc:opendocument:xmlns:chart:1.0}axis" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:tc:opendocument:xmlns:chart:1.0}series" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:tc:opendocument:xmlns:chart:1.0}stock-gain-marker" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:tc:opendocument:xmlns:chart:1.0}stock-loss-marker" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:tc:opendocument:xmlns:chart:1.0}stock-range-line" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:tc:opendocument:xmlns:chart:1.0}wall" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:tc:opendocument:xmlns:chart:1.0}floor" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attGroup ref="{urn:oasis:names:tc:opendocument:xmlns:text:1.0}chart-plot-area-attlist"/&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "coordinateRegion",
    "light",
    "axis",
    "series",
    "stockGainMarker",
    "stockLossMarker",
    "stockRangeLine",
    "wall",
    "floor"
})
@XmlRootElement(name = "plot-area")
public class PlotArea {

    @XmlElement(name = "coordinate-region")
    protected CoordinateRegion coordinateRegion;
    @XmlElement(namespace = "urn:oasis:names:tc:opendocument:xmlns:dr3d:1.0")
    protected List<Light> light;
    protected List<Axis> axis;
    protected List<Series> series;
    @XmlElement(name = "stock-gain-marker")
    protected StockGainMarker stockGainMarker;
    @XmlElement(name = "stock-loss-marker")
    protected StockLossMarker stockLossMarker;
    @XmlElement(name = "stock-range-line")
    protected StockRangeLine stockRangeLine;
    protected Wall wall;
    protected Floor floor;
    @XmlAttribute(name = "style-name", namespace = "urn:oasis:names:tc:opendocument:xmlns:chart:1.0")
    protected String styleName;
    @XmlAttribute(name = "data-source-has-labels", namespace = "urn:oasis:names:tc:opendocument:xmlns:chart:1.0")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String dataSourceHasLabels;
    @XmlAttribute(name = "id", namespace = "http://www.w3.org/XML/1998/namespace")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    protected String id;
    @XmlAttribute(name = "transform", namespace = "urn:oasis:names:tc:opendocument:xmlns:dr3d:1.0")
    protected String transform;
    @XmlAttribute(name = "height", namespace = "urn:oasis:names:tc:opendocument:xmlns:svg-compatible:1.0", required = true)
    protected String height;
    @XmlAttribute(name = "width", namespace = "urn:oasis:names:tc:opendocument:xmlns:svg-compatible:1.0", required = true)
    protected String width;
    @XmlAttribute(name = "vrp", namespace = "urn:oasis:names:tc:opendocument:xmlns:dr3d:1.0")
    protected String vrp;
    @XmlAttribute(name = "vpn", namespace = "urn:oasis:names:tc:opendocument:xmlns:dr3d:1.0")
    protected String vpn;
    @XmlAttribute(name = "vup", namespace = "urn:oasis:names:tc:opendocument:xmlns:dr3d:1.0")
    protected String vup;
    @XmlAttribute(name = "projection", namespace = "urn:oasis:names:tc:opendocument:xmlns:dr3d:1.0")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String projection;
    @XmlAttribute(name = "distance", namespace = "urn:oasis:names:tc:opendocument:xmlns:dr3d:1.0")
    protected String distance;
    @XmlAttribute(name = "focal-length", namespace = "urn:oasis:names:tc:opendocument:xmlns:dr3d:1.0")
    protected String focalLength;
    @XmlAttribute(name = "shadow-slant", namespace = "urn:oasis:names:tc:opendocument:xmlns:dr3d:1.0")
    protected String shadowSlant;
    @XmlAttribute(name = "shade-mode", namespace = "urn:oasis:names:tc:opendocument:xmlns:dr3d:1.0")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String shadeMode;
    @XmlAttribute(name = "ambient-color", namespace = "urn:oasis:names:tc:opendocument:xmlns:dr3d:1.0")
    protected String ambientColor;
    @XmlAttribute(name = "lighting-mode", namespace = "urn:oasis:names:tc:opendocument:xmlns:dr3d:1.0", required = true)
    protected Boolean lightingMode;
    @XmlAttribute(name = "cell-range-address", namespace = "urn:oasis:names:tc:opendocument:xmlns:table:1.0", required = true)
    protected String cellRangeAddress;
    @XmlAttribute(name = "y", namespace = "urn:oasis:names:tc:opendocument:xmlns:svg-compatible:1.0", required = true)
    protected String y;
    @XmlAttribute(name = "x", namespace = "urn:oasis:names:tc:opendocument:xmlns:svg-compatible:1.0", required = true)
    protected String x;

    /**
     * Gets the value of the coordinateRegion property.
     * 
     * @return
     *     possible object is
     *     {@link CoordinateRegion }
     *     
     */
    public CoordinateRegion getCoordinateRegion() {
        return coordinateRegion;
    }

    /**
     * Sets the value of the coordinateRegion property.
     * 
     * @param value
     *     allowed object is
     *     {@link CoordinateRegion }
     *     
     */
    public void setCoordinateRegion(CoordinateRegion value) {
        this.coordinateRegion = value;
    }

    /**
     * Gets the value of the light property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the light property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLight().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Light }
     * 
     * 
     */
    public List<Light> getLight() {
        if (light == null) {
            light = new ArrayList<Light>();
        }
        return this.light;
    }

    /**
     * Gets the value of the axis property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the axis property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAxis().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Axis }
     * 
     * 
     */
    public List<Axis> getAxis() {
        if (axis == null) {
            axis = new ArrayList<Axis>();
        }
        return this.axis;
    }

    /**
     * Gets the value of the series property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the series property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSeries().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Series }
     * 
     * 
     */
    public List<Series> getSeries() {
        if (series == null) {
            series = new ArrayList<Series>();
        }
        return this.series;
    }

    /**
     * Gets the value of the stockGainMarker property.
     * 
     * @return
     *     possible object is
     *     {@link StockGainMarker }
     *     
     */
    public StockGainMarker getStockGainMarker() {
        return stockGainMarker;
    }

    /**
     * Sets the value of the stockGainMarker property.
     * 
     * @param value
     *     allowed object is
     *     {@link StockGainMarker }
     *     
     */
    public void setStockGainMarker(StockGainMarker value) {
        this.stockGainMarker = value;
    }

    /**
     * Gets the value of the stockLossMarker property.
     * 
     * @return
     *     possible object is
     *     {@link StockLossMarker }
     *     
     */
    public StockLossMarker getStockLossMarker() {
        return stockLossMarker;
    }

    /**
     * Sets the value of the stockLossMarker property.
     * 
     * @param value
     *     allowed object is
     *     {@link StockLossMarker }
     *     
     */
    public void setStockLossMarker(StockLossMarker value) {
        this.stockLossMarker = value;
    }

    /**
     * Gets the value of the stockRangeLine property.
     * 
     * @return
     *     possible object is
     *     {@link StockRangeLine }
     *     
     */
    public StockRangeLine getStockRangeLine() {
        return stockRangeLine;
    }

    /**
     * Sets the value of the stockRangeLine property.
     * 
     * @param value
     *     allowed object is
     *     {@link StockRangeLine }
     *     
     */
    public void setStockRangeLine(StockRangeLine value) {
        this.stockRangeLine = value;
    }

    /**
     * Gets the value of the wall property.
     * 
     * @return
     *     possible object is
     *     {@link Wall }
     *     
     */
    public Wall getWall() {
        return wall;
    }

    /**
     * Sets the value of the wall property.
     * 
     * @param value
     *     allowed object is
     *     {@link Wall }
     *     
     */
    public void setWall(Wall value) {
        this.wall = value;
    }

    /**
     * Gets the value of the floor property.
     * 
     * @return
     *     possible object is
     *     {@link Floor }
     *     
     */
    public Floor getFloor() {
        return floor;
    }

    /**
     * Sets the value of the floor property.
     * 
     * @param value
     *     allowed object is
     *     {@link Floor }
     *     
     */
    public void setFloor(Floor value) {
        this.floor = value;
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
     * Gets the value of the dataSourceHasLabels property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataSourceHasLabels() {
        return dataSourceHasLabels;
    }

    /**
     * Sets the value of the dataSourceHasLabels property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataSourceHasLabels(String value) {
        this.dataSourceHasLabels = value;
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

    /**
     * Gets the value of the height property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHeight() {
        return height;
    }

    /**
     * Sets the value of the height property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHeight(String value) {
        this.height = value;
    }

    /**
     * Gets the value of the width property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWidth() {
        return width;
    }

    /**
     * Sets the value of the width property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWidth(String value) {
        this.width = value;
    }

    /**
     * Gets the value of the vrp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVrp() {
        return vrp;
    }

    /**
     * Sets the value of the vrp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVrp(String value) {
        this.vrp = value;
    }

    /**
     * Gets the value of the vpn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVpn() {
        return vpn;
    }

    /**
     * Sets the value of the vpn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVpn(String value) {
        this.vpn = value;
    }

    /**
     * Gets the value of the vup property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVup() {
        return vup;
    }

    /**
     * Sets the value of the vup property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVup(String value) {
        this.vup = value;
    }

    /**
     * Gets the value of the projection property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProjection() {
        return projection;
    }

    /**
     * Sets the value of the projection property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProjection(String value) {
        this.projection = value;
    }

    /**
     * Gets the value of the distance property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDistance() {
        return distance;
    }

    /**
     * Sets the value of the distance property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDistance(String value) {
        this.distance = value;
    }

    /**
     * Gets the value of the focalLength property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFocalLength() {
        return focalLength;
    }

    /**
     * Sets the value of the focalLength property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFocalLength(String value) {
        this.focalLength = value;
    }

    /**
     * Gets the value of the shadowSlant property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShadowSlant() {
        return shadowSlant;
    }

    /**
     * Sets the value of the shadowSlant property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShadowSlant(String value) {
        this.shadowSlant = value;
    }

    /**
     * Gets the value of the shadeMode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShadeMode() {
        return shadeMode;
    }

    /**
     * Sets the value of the shadeMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShadeMode(String value) {
        this.shadeMode = value;
    }

    /**
     * Gets the value of the ambientColor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAmbientColor() {
        return ambientColor;
    }

    /**
     * Sets the value of the ambientColor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAmbientColor(String value) {
        this.ambientColor = value;
    }

    /**
     * Gets the value of the lightingMode property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getLightingMode() {
        return lightingMode;
    }

    /**
     * Sets the value of the lightingMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLightingMode(Boolean value) {
        this.lightingMode = value;
    }

    /**
     * Gets the value of the cellRangeAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCellRangeAddress() {
        return cellRangeAddress;
    }

    /**
     * Sets the value of the cellRangeAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCellRangeAddress(String value) {
        this.cellRangeAddress = value;
    }

    /**
     * Gets the value of the y property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getY() {
        return y;
    }

    /**
     * Sets the value of the y property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setY(String value) {
        this.y = value;
    }

    /**
     * Gets the value of the x property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getX() {
        return x;
    }

    /**
     * Sets the value of the x property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setX(String value) {
        this.x = value;
    }

}
