
package org.eclipse.daanse.odf.xml.draw;

import java.util.ArrayList;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlElementRefs;
import jakarta.xml.bind.annotation.XmlID;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.eclipse.daanse.odf.xml.dr3d.Scene;
import org.eclipse.daanse.odf.xml.table.Table;
import org.eclipse.daanse.odf.xml.text.AlphabeticalIndex;
import org.eclipse.daanse.odf.xml.text.Bibliography;
import org.eclipse.daanse.odf.xml.text.ChangeMarks;
import org.eclipse.daanse.odf.xml.text.H;
import org.eclipse.daanse.odf.xml.text.IllustrationIndex;
import org.eclipse.daanse.odf.xml.text.NumberedParagraph;
import org.eclipse.daanse.odf.xml.text.ObjectIndex;
import org.eclipse.daanse.odf.xml.text.P;
import org.eclipse.daanse.odf.xml.text.Section;
import org.eclipse.daanse.odf.xml.text.SoftPageBreak;
import org.eclipse.daanse.odf.xml.text.TableIndex;
import org.eclipse.daanse.odf.xml.text.TableOfContent;
import org.eclipse.daanse.odf.xml.text.UserIndex;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;group ref="{urn:oasis:names:tc:opendocument:xmlns:text:1.0}text-content" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;attGroup ref="{urn:oasis:names:tc:opendocument:xmlns:text:1.0}draw-text-box-attlist"/&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "textContent"
})
@XmlRootElement(name = "text-box")
public class TextBox {

    @XmlElementRefs({
        @XmlElementRef(name = "h", namespace = "urn:oasis:names:tc:opendocument:xmlns:text:1.0", type = H.class, required = false),
        @XmlElementRef(name = "p", namespace = "urn:oasis:names:tc:opendocument:xmlns:text:1.0", type = P.class, required = false),
        @XmlElementRef(name = "list", namespace = "urn:oasis:names:tc:opendocument:xmlns:text:1.0", type = org.eclipse.daanse.odf.xml.text.List.class, required = false),
        @XmlElementRef(name = "numbered-paragraph", namespace = "urn:oasis:names:tc:opendocument:xmlns:text:1.0", type = NumberedParagraph.class, required = false),
        @XmlElementRef(name = "table", namespace = "urn:oasis:names:tc:opendocument:xmlns:table:1.0", type = Table.class, required = false),
        @XmlElementRef(name = "section", namespace = "urn:oasis:names:tc:opendocument:xmlns:text:1.0", type = Section.class, required = false),
        @XmlElementRef(name = "soft-page-break", namespace = "urn:oasis:names:tc:opendocument:xmlns:text:1.0", type = SoftPageBreak.class, required = false),
        @XmlElementRef(name = "table-of-content", namespace = "urn:oasis:names:tc:opendocument:xmlns:text:1.0", type = TableOfContent.class, required = false),
        @XmlElementRef(name = "illustration-index", namespace = "urn:oasis:names:tc:opendocument:xmlns:text:1.0", type = IllustrationIndex.class, required = false),
        @XmlElementRef(name = "table-index", namespace = "urn:oasis:names:tc:opendocument:xmlns:text:1.0", type = TableIndex.class, required = false),
        @XmlElementRef(name = "object-index", namespace = "urn:oasis:names:tc:opendocument:xmlns:text:1.0", type = ObjectIndex.class, required = false),
        @XmlElementRef(name = "user-index", namespace = "urn:oasis:names:tc:opendocument:xmlns:text:1.0", type = UserIndex.class, required = false),
        @XmlElementRef(name = "alphabetical-index", namespace = "urn:oasis:names:tc:opendocument:xmlns:text:1.0", type = AlphabeticalIndex.class, required = false),
        @XmlElementRef(name = "bibliography", namespace = "urn:oasis:names:tc:opendocument:xmlns:text:1.0", type = Bibliography.class, required = false),
        @XmlElementRef(name = "rect", namespace = "urn:oasis:names:tc:opendocument:xmlns:drawing:1.0", type = Rect.class, required = false),
        @XmlElementRef(name = "line", namespace = "urn:oasis:names:tc:opendocument:xmlns:drawing:1.0", type = Line.class, required = false),
        @XmlElementRef(name = "polyline", namespace = "urn:oasis:names:tc:opendocument:xmlns:drawing:1.0", type = Polyline.class, required = false),
        @XmlElementRef(name = "polygon", namespace = "urn:oasis:names:tc:opendocument:xmlns:drawing:1.0", type = Polygon.class, required = false),
        @XmlElementRef(name = "regular-polygon", namespace = "urn:oasis:names:tc:opendocument:xmlns:drawing:1.0", type = RegularPolygon.class, required = false),
        @XmlElementRef(name = "path", namespace = "urn:oasis:names:tc:opendocument:xmlns:drawing:1.0", type = Path.class, required = false),
        @XmlElementRef(name = "circle", namespace = "urn:oasis:names:tc:opendocument:xmlns:drawing:1.0", type = Circle.class, required = false),
        @XmlElementRef(name = "ellipse", namespace = "urn:oasis:names:tc:opendocument:xmlns:drawing:1.0", type = Ellipse.class, required = false),
        @XmlElementRef(name = "g", namespace = "urn:oasis:names:tc:opendocument:xmlns:drawing:1.0", type = G.class, required = false),
        @XmlElementRef(name = "page-thumbnail", namespace = "urn:oasis:names:tc:opendocument:xmlns:drawing:1.0", type = PageThumbnail.class, required = false),
        @XmlElementRef(name = "frame", namespace = "urn:oasis:names:tc:opendocument:xmlns:drawing:1.0", type = Frame.class, required = false),
        @XmlElementRef(name = "measure", namespace = "urn:oasis:names:tc:opendocument:xmlns:drawing:1.0", type = Measure.class, required = false),
        @XmlElementRef(name = "caption", namespace = "urn:oasis:names:tc:opendocument:xmlns:drawing:1.0", type = Caption.class, required = false),
        @XmlElementRef(name = "connector", namespace = "urn:oasis:names:tc:opendocument:xmlns:drawing:1.0", type = Connector.class, required = false),
        @XmlElementRef(name = "control", namespace = "urn:oasis:names:tc:opendocument:xmlns:drawing:1.0", type = Control.class, required = false),
        @XmlElementRef(name = "scene", namespace = "urn:oasis:names:tc:opendocument:xmlns:dr3d:1.0", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "custom-shape", namespace = "urn:oasis:names:tc:opendocument:xmlns:drawing:1.0", type = CustomShape.class, required = false),
        @XmlElementRef(name = "a", namespace = "urn:oasis:names:tc:opendocument:xmlns:drawing:1.0", type = A.class, required = false),
        @XmlElementRef(name = "change-marks", namespace = "urn:oasis:names:tc:opendocument:xmlns:text:1.0", type = JAXBElement.class, required = false)
    })
    protected java.util.List<java.lang.Object> textContent;
    @XmlAttribute(name = "chain-next-name", namespace = "urn:oasis:names:tc:opendocument:xmlns:drawing:1.0")
    protected String chainNextName;
    @XmlAttribute(name = "corner-radius", namespace = "urn:oasis:names:tc:opendocument:xmlns:drawing:1.0")
    protected String cornerRadius;
    @XmlAttribute(name = "min-width", namespace = "urn:oasis:names:tc:opendocument:xmlns:xsl-fo-compatible:1.0")
    protected String minWidth;
    @XmlAttribute(name = "max-height", namespace = "urn:oasis:names:tc:opendocument:xmlns:xsl-fo-compatible:1.0")
    protected String maxHeight;
    @XmlAttribute(name = "max-width", namespace = "urn:oasis:names:tc:opendocument:xmlns:xsl-fo-compatible:1.0")
    protected String maxWidth;
    @XmlAttribute(name = "id", namespace = "http://www.w3.org/XML/1998/namespace")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    protected String xmlId;
    @XmlAttribute(name = "id", namespace = "urn:oasis:names:tc:opendocument:xmlns:text:1.0")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String textId;
    @XmlAttribute(name = "min-height", namespace = "urn:oasis:names:tc:opendocument:xmlns:xsl-fo-compatible:1.0", required = true)
    protected String minHeight;

    /**
     * Gets the value of the textContent property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the textContent property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTextContent().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link H }
     * {@link P }
     * {@link org.eclipse.daanse.odf.xml.text.List }
     * {@link NumberedParagraph }
     * {@link Table }
     * {@link Section }
     * {@link SoftPageBreak }
     * {@link TableOfContent }
     * {@link IllustrationIndex }
     * {@link TableIndex }
     * {@link ObjectIndex }
     * {@link UserIndex }
     * {@link AlphabeticalIndex }
     * {@link Bibliography }
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
     * {@link JAXBElement }{@code <}{@link Scene }{@code >}
     * {@link CustomShape }
     * {@link A }
     * {@link JAXBElement }{@code <}{@link ChangeMarks }{@code >}
     * {@link JAXBElement }{@code <}{@link ChangeMarks }{@code >}
     * {@link JAXBElement }{@code <}{@link ChangeMarks }{@code >}
     * {@link JAXBElement }{@code <}{@link ChangeMarks }{@code >}
     * 
     * 
     */
    public java.util.List<java.lang.Object> getTextContent() {
        if (textContent == null) {
            textContent = new ArrayList<java.lang.Object>();
        }
        return this.textContent;
    }

    /**
     * Gets the value of the chainNextName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChainNextName() {
        return chainNextName;
    }

    /**
     * Sets the value of the chainNextName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChainNextName(String value) {
        this.chainNextName = value;
    }

    /**
     * Gets the value of the cornerRadius property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCornerRadius() {
        return cornerRadius;
    }

    /**
     * Sets the value of the cornerRadius property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCornerRadius(String value) {
        this.cornerRadius = value;
    }

    /**
     * Gets the value of the minWidth property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMinWidth() {
        return minWidth;
    }

    /**
     * Sets the value of the minWidth property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMinWidth(String value) {
        this.minWidth = value;
    }

    /**
     * Gets the value of the maxHeight property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaxHeight() {
        return maxHeight;
    }

    /**
     * Sets the value of the maxHeight property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaxHeight(String value) {
        this.maxHeight = value;
    }

    /**
     * Gets the value of the maxWidth property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaxWidth() {
        return maxWidth;
    }

    /**
     * Sets the value of the maxWidth property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaxWidth(String value) {
        this.maxWidth = value;
    }

    /**
     * Gets the value of the xmlId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXmlId() {
        return xmlId;
    }

    /**
     * Sets the value of the xmlId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXmlId(String value) {
        this.xmlId = value;
    }

    /**
     * Gets the value of the textId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTextId() {
        return textId;
    }

    /**
     * Sets the value of the textId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTextId(String value) {
        this.textId = value;
    }

    /**
     * Gets the value of the minHeight property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMinHeight() {
        return minHeight;
    }

    /**
     * Sets the value of the minHeight property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMinHeight(String value) {
        this.minHeight = value;
    }

}
