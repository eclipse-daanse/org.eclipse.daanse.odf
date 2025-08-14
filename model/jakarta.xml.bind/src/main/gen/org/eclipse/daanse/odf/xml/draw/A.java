
package org.eclipse.daanse.odf.xml.draw;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlID;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.eclipse.daanse.odf.xml.dr3d.Scene;
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
 *       &lt;group ref="{urn:oasis:names:tc:opendocument:xmlns:text:1.0}shape-instance"/&gt;
 *       &lt;attGroup ref="{urn:oasis:names:tc:opendocument:xmlns:text:1.0}draw-a-attlist"/&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "rect",
    "line",
    "polyline",
    "polygon",
    "regularPolygon",
    "path",
    "circle",
    "ellipse",
    "g",
    "pageThumbnail",
    "frame",
    "measure",
    "caption",
    "connector",
    "control",
    "scene",
    "customShape"
})
@XmlRootElement(name = "a")
public class A {

    protected Rect rect;
    protected Line line;
    protected Polyline polyline;
    protected Polygon polygon;
    @XmlElement(name = "regular-polygon")
    protected RegularPolygon regularPolygon;
    protected Path path;
    protected Circle circle;
    protected Ellipse ellipse;
    protected G g;
    @XmlElement(name = "page-thumbnail")
    protected PageThumbnail pageThumbnail;
    protected Frame frame;
    protected Measure measure;
    protected Caption caption;
    protected Connector connector;
    protected Control control;
    @XmlElement(namespace = "urn:oasis:names:tc:opendocument:xmlns:dr3d:1.0")
    protected Scene scene;
    @XmlElement(name = "custom-shape")
    protected CustomShape customShape;
    @XmlAttribute(name = "type", namespace = "http://www.w3.org/1999/xlink", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String type;
    @XmlAttribute(name = "href", namespace = "http://www.w3.org/1999/xlink", required = true)
    protected String href;
    @XmlAttribute(name = "target-frame-name", namespace = "urn:oasis:names:tc:opendocument:xmlns:office:1.0")
    protected String targetFrameName;
    @XmlAttribute(name = "name", namespace = "urn:oasis:names:tc:opendocument:xmlns:office:1.0")
    protected String name;
    @XmlAttribute(name = "title", namespace = "urn:oasis:names:tc:opendocument:xmlns:office:1.0")
    protected String title;
    @XmlAttribute(name = "server-map", namespace = "urn:oasis:names:tc:opendocument:xmlns:office:1.0")
    protected Boolean serverMap;
    @XmlAttribute(name = "id", namespace = "http://www.w3.org/XML/1998/namespace")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    protected String id;
    @XmlAttribute(name = "actuate", namespace = "http://www.w3.org/1999/xlink", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String actuate;
    @XmlAttribute(name = "show", namespace = "http://www.w3.org/1999/xlink", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String show;

    /**
     * Gets the value of the rect property.
     * 
     * @return
     *     possible object is
     *     {@link Rect }
     *     
     */
    public Rect getRect() {
        return rect;
    }

    /**
     * Sets the value of the rect property.
     * 
     * @param value
     *     allowed object is
     *     {@link Rect }
     *     
     */
    public void setRect(Rect value) {
        this.rect = value;
    }

    /**
     * Gets the value of the line property.
     * 
     * @return
     *     possible object is
     *     {@link Line }
     *     
     */
    public Line getLine() {
        return line;
    }

    /**
     * Sets the value of the line property.
     * 
     * @param value
     *     allowed object is
     *     {@link Line }
     *     
     */
    public void setLine(Line value) {
        this.line = value;
    }

    /**
     * Gets the value of the polyline property.
     * 
     * @return
     *     possible object is
     *     {@link Polyline }
     *     
     */
    public Polyline getPolyline() {
        return polyline;
    }

    /**
     * Sets the value of the polyline property.
     * 
     * @param value
     *     allowed object is
     *     {@link Polyline }
     *     
     */
    public void setPolyline(Polyline value) {
        this.polyline = value;
    }

    /**
     * Gets the value of the polygon property.
     * 
     * @return
     *     possible object is
     *     {@link Polygon }
     *     
     */
    public Polygon getPolygon() {
        return polygon;
    }

    /**
     * Sets the value of the polygon property.
     * 
     * @param value
     *     allowed object is
     *     {@link Polygon }
     *     
     */
    public void setPolygon(Polygon value) {
        this.polygon = value;
    }

    /**
     * Gets the value of the regularPolygon property.
     * 
     * @return
     *     possible object is
     *     {@link RegularPolygon }
     *     
     */
    public RegularPolygon getRegularPolygon() {
        return regularPolygon;
    }

    /**
     * Sets the value of the regularPolygon property.
     * 
     * @param value
     *     allowed object is
     *     {@link RegularPolygon }
     *     
     */
    public void setRegularPolygon(RegularPolygon value) {
        this.regularPolygon = value;
    }

    /**
     * Gets the value of the path property.
     * 
     * @return
     *     possible object is
     *     {@link Path }
     *     
     */
    public Path getPath() {
        return path;
    }

    /**
     * Sets the value of the path property.
     * 
     * @param value
     *     allowed object is
     *     {@link Path }
     *     
     */
    public void setPath(Path value) {
        this.path = value;
    }

    /**
     * Gets the value of the circle property.
     * 
     * @return
     *     possible object is
     *     {@link Circle }
     *     
     */
    public Circle getCircle() {
        return circle;
    }

    /**
     * Sets the value of the circle property.
     * 
     * @param value
     *     allowed object is
     *     {@link Circle }
     *     
     */
    public void setCircle(Circle value) {
        this.circle = value;
    }

    /**
     * Gets the value of the ellipse property.
     * 
     * @return
     *     possible object is
     *     {@link Ellipse }
     *     
     */
    public Ellipse getEllipse() {
        return ellipse;
    }

    /**
     * Sets the value of the ellipse property.
     * 
     * @param value
     *     allowed object is
     *     {@link Ellipse }
     *     
     */
    public void setEllipse(Ellipse value) {
        this.ellipse = value;
    }

    /**
     * Gets the value of the g property.
     * 
     * @return
     *     possible object is
     *     {@link G }
     *     
     */
    public G getG() {
        return g;
    }

    /**
     * Sets the value of the g property.
     * 
     * @param value
     *     allowed object is
     *     {@link G }
     *     
     */
    public void setG(G value) {
        this.g = value;
    }

    /**
     * Gets the value of the pageThumbnail property.
     * 
     * @return
     *     possible object is
     *     {@link PageThumbnail }
     *     
     */
    public PageThumbnail getPageThumbnail() {
        return pageThumbnail;
    }

    /**
     * Sets the value of the pageThumbnail property.
     * 
     * @param value
     *     allowed object is
     *     {@link PageThumbnail }
     *     
     */
    public void setPageThumbnail(PageThumbnail value) {
        this.pageThumbnail = value;
    }

    /**
     * Gets the value of the frame property.
     * 
     * @return
     *     possible object is
     *     {@link Frame }
     *     
     */
    public Frame getFrame() {
        return frame;
    }

    /**
     * Sets the value of the frame property.
     * 
     * @param value
     *     allowed object is
     *     {@link Frame }
     *     
     */
    public void setFrame(Frame value) {
        this.frame = value;
    }

    /**
     * Gets the value of the measure property.
     * 
     * @return
     *     possible object is
     *     {@link Measure }
     *     
     */
    public Measure getMeasure() {
        return measure;
    }

    /**
     * Sets the value of the measure property.
     * 
     * @param value
     *     allowed object is
     *     {@link Measure }
     *     
     */
    public void setMeasure(Measure value) {
        this.measure = value;
    }

    /**
     * Gets the value of the caption property.
     * 
     * @return
     *     possible object is
     *     {@link Caption }
     *     
     */
    public Caption getCaption() {
        return caption;
    }

    /**
     * Sets the value of the caption property.
     * 
     * @param value
     *     allowed object is
     *     {@link Caption }
     *     
     */
    public void setCaption(Caption value) {
        this.caption = value;
    }

    /**
     * Gets the value of the connector property.
     * 
     * @return
     *     possible object is
     *     {@link Connector }
     *     
     */
    public Connector getConnector() {
        return connector;
    }

    /**
     * Sets the value of the connector property.
     * 
     * @param value
     *     allowed object is
     *     {@link Connector }
     *     
     */
    public void setConnector(Connector value) {
        this.connector = value;
    }

    /**
     * Gets the value of the control property.
     * 
     * @return
     *     possible object is
     *     {@link Control }
     *     
     */
    public Control getControl() {
        return control;
    }

    /**
     * Sets the value of the control property.
     * 
     * @param value
     *     allowed object is
     *     {@link Control }
     *     
     */
    public void setControl(Control value) {
        this.control = value;
    }

    /**
     * Gets the value of the scene property.
     * 
     * @return
     *     possible object is
     *     {@link Scene }
     *     
     */
    public Scene getScene() {
        return scene;
    }

    /**
     * Sets the value of the scene property.
     * 
     * @param value
     *     allowed object is
     *     {@link Scene }
     *     
     */
    public void setScene(Scene value) {
        this.scene = value;
    }

    /**
     * Gets the value of the customShape property.
     * 
     * @return
     *     possible object is
     *     {@link CustomShape }
     *     
     */
    public CustomShape getCustomShape() {
        return customShape;
    }

    /**
     * Sets the value of the customShape property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomShape }
     *     
     */
    public void setCustomShape(CustomShape value) {
        this.customShape = value;
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
     * Gets the value of the targetFrameName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTargetFrameName() {
        return targetFrameName;
    }

    /**
     * Sets the value of the targetFrameName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTargetFrameName(String value) {
        this.targetFrameName = value;
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
     * Gets the value of the title property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitle() {
        return title;
    }

    /**
     * Sets the value of the title property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitle(String value) {
        this.title = value;
    }

    /**
     * Gets the value of the serverMap property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getServerMap() {
        return serverMap;
    }

    /**
     * Sets the value of the serverMap property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setServerMap(Boolean value) {
        this.serverMap = value;
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
     * Gets the value of the actuate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActuate() {
        return actuate;
    }

    /**
     * Sets the value of the actuate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActuate(String value) {
        this.actuate = value;
    }

    /**
     * Gets the value of the show property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShow() {
        return show;
    }

    /**
     * Sets the value of the show property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShow(String value) {
        this.show = value;
    }

}
