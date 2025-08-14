
package org.eclipse.daanse.odf.model.jakarta.xml.bind.text;

import java.util.ArrayList;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlElementRefs;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;
import org.eclipse.daanse.odf.model.jakarta.xml.bind.dr3d.Scene;
import org.eclipse.daanse.odf.model.jakarta.xml.bind.draw.A;
import org.eclipse.daanse.odf.model.jakarta.xml.bind.draw.Caption;
import org.eclipse.daanse.odf.model.jakarta.xml.bind.draw.Circle;
import org.eclipse.daanse.odf.model.jakarta.xml.bind.draw.Connector;
import org.eclipse.daanse.odf.model.jakarta.xml.bind.draw.Control;
import org.eclipse.daanse.odf.model.jakarta.xml.bind.draw.CustomShape;
import org.eclipse.daanse.odf.model.jakarta.xml.bind.draw.Ellipse;
import org.eclipse.daanse.odf.model.jakarta.xml.bind.draw.Frame;
import org.eclipse.daanse.odf.model.jakarta.xml.bind.draw.G;
import org.eclipse.daanse.odf.model.jakarta.xml.bind.draw.Line;
import org.eclipse.daanse.odf.model.jakarta.xml.bind.draw.Measure;
import org.eclipse.daanse.odf.model.jakarta.xml.bind.draw.PageThumbnail;
import org.eclipse.daanse.odf.model.jakarta.xml.bind.draw.Path;
import org.eclipse.daanse.odf.model.jakarta.xml.bind.draw.Polygon;
import org.eclipse.daanse.odf.model.jakarta.xml.bind.draw.Polyline;
import org.eclipse.daanse.odf.model.jakarta.xml.bind.draw.Rect;
import org.eclipse.daanse.odf.model.jakarta.xml.bind.draw.RegularPolygon;
import org.eclipse.daanse.odf.model.jakarta.xml.bind.office.Annotation;
import org.eclipse.daanse.odf.model.jakarta.xml.bind.table.CellRangeSource;
import org.eclipse.daanse.odf.model.jakarta.xml.bind.table.CoveredTableCell;
import org.eclipse.daanse.odf.model.jakarta.xml.bind.table.Detective;
import org.eclipse.daanse.odf.model.jakarta.xml.bind.table.Table;
import org.eclipse.daanse.odf.model.jakarta.xml.bind.table.TableCell;


/**
 * <p>Java class for table-table-cell-content complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="table-table-cell-content"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:oasis:names:tc:opendocument:xmlns:table:1.0}cell-range-source" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:tc:opendocument:xmlns:office:1.0}annotation" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:tc:opendocument:xmlns:table:1.0}detective" minOccurs="0"/&gt;
 *         &lt;group ref="{urn:oasis:names:tc:opendocument:xmlns:text:1.0}text-content" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "table-table-cell-content", propOrder = {
    "cellRangeSource",
    "annotation",
    "detective",
    "textContent"
})
@XmlSeeAlso({
    CoveredTableCell.class,
    TableCell.class
})
public class TableTableCellContent {

    @XmlElement(name = "cell-range-source", namespace = "urn:oasis:names:tc:opendocument:xmlns:table:1.0")
    protected CellRangeSource cellRangeSource;
    @XmlElement(namespace = "urn:oasis:names:tc:opendocument:xmlns:office:1.0")
    protected Annotation annotation;
    @XmlElement(namespace = "urn:oasis:names:tc:opendocument:xmlns:table:1.0")
    protected Detective detective;
    @XmlElementRefs({
        @XmlElementRef(name = "h", namespace = "urn:oasis:names:tc:opendocument:xmlns:text:1.0", type = H.class, required = false),
        @XmlElementRef(name = "p", namespace = "urn:oasis:names:tc:opendocument:xmlns:text:1.0", type = P.class, required = false),
        @XmlElementRef(name = "list", namespace = "urn:oasis:names:tc:opendocument:xmlns:text:1.0", type = org.eclipse.daanse.odf.model.jakarta.xml.bind.text.List.class, required = false),
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
    protected java.util.List<Object> textContent;

    /**
     * Gets the value of the cellRangeSource property.
     * 
     * @return
     *     possible object is
     *     {@link CellRangeSource }
     *     
     */
    public CellRangeSource getCellRangeSource() {
        return cellRangeSource;
    }

    /**
     * Sets the value of the cellRangeSource property.
     * 
     * @param value
     *     allowed object is
     *     {@link CellRangeSource }
     *     
     */
    public void setCellRangeSource(CellRangeSource value) {
        this.cellRangeSource = value;
    }

    /**
     * Gets the value of the annotation property.
     * 
     * @return
     *     possible object is
     *     {@link Annotation }
     *     
     */
    public Annotation getAnnotation() {
        return annotation;
    }

    /**
     * Sets the value of the annotation property.
     * 
     * @param value
     *     allowed object is
     *     {@link Annotation }
     *     
     */
    public void setAnnotation(Annotation value) {
        this.annotation = value;
    }

    /**
     * Gets the value of the detective property.
     * 
     * @return
     *     possible object is
     *     {@link Detective }
     *     
     */
    public Detective getDetective() {
        return detective;
    }

    /**
     * Sets the value of the detective property.
     * 
     * @param value
     *     allowed object is
     *     {@link Detective }
     *     
     */
    public void setDetective(Detective value) {
        this.detective = value;
    }

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
     * {@link org.eclipse.daanse.odf.model.jakarta.xml.bind.text.List }
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
    public java.util.List<Object> getTextContent() {
        if (textContent == null) {
            textContent = new ArrayList<Object>();
        }
        return this.textContent;
    }

}
