
package org.eclipse.daanse.odf.xml.text;

import java.util.ArrayList;
import java.util.List;
import javax.xml.namespace.QName;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlElements;
import jakarta.xml.bind.annotation.XmlID;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.eclipse.daanse.odf.xml.chart.Footer;
import org.eclipse.daanse.odf.xml.chart.Legend;
import org.eclipse.daanse.odf.xml.chart.PlotArea;
import org.eclipse.daanse.odf.xml.chart.Subtitle;
import org.eclipse.daanse.odf.xml.chart.Title;
import org.eclipse.daanse.odf.xml.dr3d.Scene;
import org.eclipse.daanse.odf.xml.draw.A;
import org.eclipse.daanse.odf.xml.draw.Caption;
import org.eclipse.daanse.odf.xml.draw.Circle;
import org.eclipse.daanse.odf.xml.draw.Connector;
import org.eclipse.daanse.odf.xml.draw.Control;
import org.eclipse.daanse.odf.xml.draw.CustomShape;
import org.eclipse.daanse.odf.xml.draw.Ellipse;
import org.eclipse.daanse.odf.xml.draw.Frame;
import org.eclipse.daanse.odf.xml.draw.G;
import org.eclipse.daanse.odf.xml.draw.Line;
import org.eclipse.daanse.odf.xml.draw.Measure;
import org.eclipse.daanse.odf.xml.draw.PageThumbnail;
import org.eclipse.daanse.odf.xml.draw.Path;
import org.eclipse.daanse.odf.xml.draw.Polygon;
import org.eclipse.daanse.odf.xml.draw.Polyline;
import org.eclipse.daanse.odf.xml.draw.Rect;
import org.eclipse.daanse.odf.xml.draw.RegularPolygon;
import org.eclipse.daanse.odf.xml.table.Table;


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
 *         &lt;element ref="{urn:oasis:names:tc:opendocument:xmlns:chart:1.0}title" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:tc:opendocument:xmlns:chart:1.0}subtitle" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:tc:opendocument:xmlns:chart:1.0}footer" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:tc:opendocument:xmlns:chart:1.0}legend" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:tc:opendocument:xmlns:chart:1.0}plot-area"/&gt;
 *         &lt;group ref="{urn:oasis:names:tc:opendocument:xmlns:text:1.0}shape" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:tc:opendocument:xmlns:table:1.0}table" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attGroup ref="{urn:oasis:names:tc:opendocument:xmlns:text:1.0}chart-chart-attlist"/&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "title",
    "subtitle",
    "footer",
    "legend",
    "plotArea",
    "shape",
    "table"
})
public class OfficeChartContentMain {

    @XmlElement(namespace = "urn:oasis:names:tc:opendocument:xmlns:chart:1.0")
    protected Title title;
    @XmlElement(namespace = "urn:oasis:names:tc:opendocument:xmlns:chart:1.0")
    protected Subtitle subtitle;
    @XmlElement(namespace = "urn:oasis:names:tc:opendocument:xmlns:chart:1.0")
    protected Footer footer;
    @XmlElement(namespace = "urn:oasis:names:tc:opendocument:xmlns:chart:1.0")
    protected Legend legend;
    @XmlElement(name = "plot-area", namespace = "urn:oasis:names:tc:opendocument:xmlns:chart:1.0", required = true)
    protected PlotArea plotArea;
    @XmlElements({
        @XmlElement(name = "rect", namespace = "urn:oasis:names:tc:opendocument:xmlns:drawing:1.0", type = Rect.class),
        @XmlElement(name = "line", namespace = "urn:oasis:names:tc:opendocument:xmlns:drawing:1.0", type = Line.class),
        @XmlElement(name = "polyline", namespace = "urn:oasis:names:tc:opendocument:xmlns:drawing:1.0", type = Polyline.class),
        @XmlElement(name = "polygon", namespace = "urn:oasis:names:tc:opendocument:xmlns:drawing:1.0", type = Polygon.class),
        @XmlElement(name = "regular-polygon", namespace = "urn:oasis:names:tc:opendocument:xmlns:drawing:1.0", type = RegularPolygon.class),
        @XmlElement(name = "path", namespace = "urn:oasis:names:tc:opendocument:xmlns:drawing:1.0", type = Path.class),
        @XmlElement(name = "circle", namespace = "urn:oasis:names:tc:opendocument:xmlns:drawing:1.0", type = Circle.class),
        @XmlElement(name = "ellipse", namespace = "urn:oasis:names:tc:opendocument:xmlns:drawing:1.0", type = Ellipse.class),
        @XmlElement(name = "g", namespace = "urn:oasis:names:tc:opendocument:xmlns:drawing:1.0", type = G.class),
        @XmlElement(name = "page-thumbnail", namespace = "urn:oasis:names:tc:opendocument:xmlns:drawing:1.0", type = PageThumbnail.class),
        @XmlElement(name = "frame", namespace = "urn:oasis:names:tc:opendocument:xmlns:drawing:1.0", type = Frame.class),
        @XmlElement(name = "measure", namespace = "urn:oasis:names:tc:opendocument:xmlns:drawing:1.0", type = Measure.class),
        @XmlElement(name = "caption", namespace = "urn:oasis:names:tc:opendocument:xmlns:drawing:1.0", type = Caption.class),
        @XmlElement(name = "connector", namespace = "urn:oasis:names:tc:opendocument:xmlns:drawing:1.0", type = Connector.class),
        @XmlElement(name = "control", namespace = "urn:oasis:names:tc:opendocument:xmlns:drawing:1.0", type = Control.class),
        @XmlElement(name = "scene", namespace = "urn:oasis:names:tc:opendocument:xmlns:dr3d:1.0", type = Scene.class),
        @XmlElement(name = "custom-shape", namespace = "urn:oasis:names:tc:opendocument:xmlns:drawing:1.0", type = CustomShape.class),
        @XmlElement(name = "a", namespace = "urn:oasis:names:tc:opendocument:xmlns:drawing:1.0", type = A.class)
    })
    protected List<Object> shape;
    @XmlElement(namespace = "urn:oasis:names:tc:opendocument:xmlns:table:1.0")
    protected Table table;
    @XmlAttribute(name = "column-mapping", namespace = "urn:oasis:names:tc:opendocument:xmlns:chart:1.0")
    protected String columnMapping;
    @XmlAttribute(name = "row-mapping", namespace = "urn:oasis:names:tc:opendocument:xmlns:chart:1.0")
    protected String rowMapping;
    @XmlAttribute(name = "style-name", namespace = "urn:oasis:names:tc:opendocument:xmlns:chart:1.0")
    protected String styleName;
    @XmlAttribute(name = "type", namespace = "http://www.w3.org/1999/xlink")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String type;
    @XmlAttribute(name = "href", namespace = "http://www.w3.org/1999/xlink")
    protected String href;
    @XmlAttribute(name = "id", namespace = "http://www.w3.org/XML/1998/namespace")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    protected String id;
    @XmlAttribute(name = "height", namespace = "urn:oasis:names:tc:opendocument:xmlns:svg-compatible:1.0", required = true)
    protected String height;
    @XmlAttribute(name = "width", namespace = "urn:oasis:names:tc:opendocument:xmlns:svg-compatible:1.0", required = true)
    protected String width;
    @XmlAttribute(name = "class", namespace = "urn:oasis:names:tc:opendocument:xmlns:chart:1.0", required = true)
    protected QName clazz;

    /**
     * Gets the value of the title property.
     * 
     * @return
     *     possible object is
     *     {@link Title }
     *     
     */
    public Title getTitle() {
        return title;
    }

    /**
     * Sets the value of the title property.
     * 
     * @param value
     *     allowed object is
     *     {@link Title }
     *     
     */
    public void setTitle(Title value) {
        this.title = value;
    }

    /**
     * Gets the value of the subtitle property.
     * 
     * @return
     *     possible object is
     *     {@link Subtitle }
     *     
     */
    public Subtitle getSubtitle() {
        return subtitle;
    }

    /**
     * Sets the value of the subtitle property.
     * 
     * @param value
     *     allowed object is
     *     {@link Subtitle }
     *     
     */
    public void setSubtitle(Subtitle value) {
        this.subtitle = value;
    }

    /**
     * Gets the value of the footer property.
     * 
     * @return
     *     possible object is
     *     {@link Footer }
     *     
     */
    public Footer getFooter() {
        return footer;
    }

    /**
     * Sets the value of the footer property.
     * 
     * @param value
     *     allowed object is
     *     {@link Footer }
     *     
     */
    public void setFooter(Footer value) {
        this.footer = value;
    }

    /**
     * Gets the value of the legend property.
     * 
     * @return
     *     possible object is
     *     {@link Legend }
     *     
     */
    public Legend getLegend() {
        return legend;
    }

    /**
     * Sets the value of the legend property.
     * 
     * @param value
     *     allowed object is
     *     {@link Legend }
     *     
     */
    public void setLegend(Legend value) {
        this.legend = value;
    }

    /**
     * Gets the value of the plotArea property.
     * 
     * @return
     *     possible object is
     *     {@link PlotArea }
     *     
     */
    public PlotArea getPlotArea() {
        return plotArea;
    }

    /**
     * Sets the value of the plotArea property.
     * 
     * @param value
     *     allowed object is
     *     {@link PlotArea }
     *     
     */
    public void setPlotArea(PlotArea value) {
        this.plotArea = value;
    }

    /**
     * Gets the value of the shape property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the shape property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getShape().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Rect }
     * {@link Line }
     * {@link Polyline }
     * {@link Polygon }
     * {@link RegularPolygon }
     * {@link Path }
     * {@link Circle }
     * {@link Ellipse }
     * {@link G }
     * {@link PageThumbnail }
     * {@link Frame }
     * {@link Measure }
     * {@link Caption }
     * {@link Connector }
     * {@link Control }
     * {@link Scene }
     * {@link CustomShape }
     * {@link A }
     * 
     * 
     */
    public List<Object> getShape() {
        if (shape == null) {
            shape = new ArrayList<Object>();
        }
        return this.shape;
    }

    /**
     * Gets the value of the table property.
     * 
     * @return
     *     possible object is
     *     {@link Table }
     *     
     */
    public Table getTable() {
        return table;
    }

    /**
     * Sets the value of the table property.
     * 
     * @param value
     *     allowed object is
     *     {@link Table }
     *     
     */
    public void setTable(Table value) {
        this.table = value;
    }

    /**
     * Gets the value of the columnMapping property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getColumnMapping() {
        return columnMapping;
    }

    /**
     * Sets the value of the columnMapping property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setColumnMapping(String value) {
        this.columnMapping = value;
    }

    /**
     * Gets the value of the rowMapping property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRowMapping() {
        return rowMapping;
    }

    /**
     * Sets the value of the rowMapping property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRowMapping(String value) {
        this.rowMapping = value;
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
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
    }

    /**
     * Gets the value of the href property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHref() {
        return href;
    }

    /**
     * Sets the value of the href property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHref(String value) {
        this.href = value;
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
