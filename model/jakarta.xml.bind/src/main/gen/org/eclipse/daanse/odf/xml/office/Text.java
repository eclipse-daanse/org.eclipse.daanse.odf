
package org.eclipse.daanse.odf.xml.office;

import java.util.ArrayList;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlElementRefs;
import jakarta.xml.bind.annotation.XmlElements;
import jakarta.xml.bind.annotation.XmlType;
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
import org.eclipse.daanse.odf.xml.table.CalculationSettings;
import org.eclipse.daanse.odf.xml.table.Consolidation;
import org.eclipse.daanse.odf.xml.table.ContentValidations;
import org.eclipse.daanse.odf.xml.table.DataPilotTables;
import org.eclipse.daanse.odf.xml.table.DatabaseRanges;
import org.eclipse.daanse.odf.xml.table.DdeLinks;
import org.eclipse.daanse.odf.xml.table.LabelRanges;
import org.eclipse.daanse.odf.xml.table.NamedExpressions;
import org.eclipse.daanse.odf.xml.table.Table;
import org.eclipse.daanse.odf.xml.text.AlphabeticalIndex;
import org.eclipse.daanse.odf.xml.text.AlphabeticalIndexAutoMarkFile;
import org.eclipse.daanse.odf.xml.text.Bibliography;
import org.eclipse.daanse.odf.xml.text.Boolean;
import org.eclipse.daanse.odf.xml.text.ChangeMarks;
import org.eclipse.daanse.odf.xml.text.DdeConnectionDecls;
import org.eclipse.daanse.odf.xml.text.H;
import org.eclipse.daanse.odf.xml.text.IllustrationIndex;
import org.eclipse.daanse.odf.xml.text.NumberedParagraph;
import org.eclipse.daanse.odf.xml.text.ObjectIndex;
import org.eclipse.daanse.odf.xml.text.P;
import org.eclipse.daanse.odf.xml.text.PageSequence;
import org.eclipse.daanse.odf.xml.text.Section;
import org.eclipse.daanse.odf.xml.text.SequenceDecls;
import org.eclipse.daanse.odf.xml.text.SoftPageBreak;
import org.eclipse.daanse.odf.xml.text.TableIndex;
import org.eclipse.daanse.odf.xml.text.TableOfContent;
import org.eclipse.daanse.odf.xml.text.TrackedChanges;
import org.eclipse.daanse.odf.xml.text.UserFieldDecls;
import org.eclipse.daanse.odf.xml.text.UserIndex;
import org.eclipse.daanse.odf.xml.text.VariableDecls;


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
 *         &lt;group ref="{urn:oasis:names:tc:opendocument:xmlns:text:1.0}office-text-content-prelude"/&gt;
 *         &lt;group ref="{urn:oasis:names:tc:opendocument:xmlns:text:1.0}office-text-content-main"/&gt;
 *         &lt;group ref="{urn:oasis:names:tc:opendocument:xmlns:text:1.0}office-text-content-epilogue"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attGroup ref="{urn:oasis:names:tc:opendocument:xmlns:text:1.0}office-text-attlist"/&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "forms",
    "trackedChanges",
    "variableDecls",
    "sequenceDecls",
    "userFieldDecls",
    "ddeConnectionDecls",
    "alphabeticalIndexAutoMarkFile",
    "calculationSettings",
    "contentValidations",
    "labelRanges",
    "textContent",
    "pageSequence",
    "shape",
    "namedExpressions",
    "databaseRanges",
    "dataPilotTables",
    "consolidation",
    "ddeLinks"
})
public class Text {

    protected Forms forms;
    @XmlElement(name = "tracked-changes", namespace = "urn:oasis:names:tc:opendocument:xmlns:text:1.0")
    protected TrackedChanges trackedChanges;
    @XmlElement(name = "variable-decls", namespace = "urn:oasis:names:tc:opendocument:xmlns:text:1.0")
    protected VariableDecls variableDecls;
    @XmlElement(name = "sequence-decls", namespace = "urn:oasis:names:tc:opendocument:xmlns:text:1.0")
    protected SequenceDecls sequenceDecls;
    @XmlElement(name = "user-field-decls", namespace = "urn:oasis:names:tc:opendocument:xmlns:text:1.0")
    protected UserFieldDecls userFieldDecls;
    @XmlElement(name = "dde-connection-decls", namespace = "urn:oasis:names:tc:opendocument:xmlns:text:1.0")
    protected DdeConnectionDecls ddeConnectionDecls;
    @XmlElement(name = "alphabetical-index-auto-mark-file", namespace = "urn:oasis:names:tc:opendocument:xmlns:text:1.0")
    protected AlphabeticalIndexAutoMarkFile alphabeticalIndexAutoMarkFile;
    @XmlElement(name = "calculation-settings", namespace = "urn:oasis:names:tc:opendocument:xmlns:table:1.0")
    protected CalculationSettings calculationSettings;
    @XmlElement(name = "content-validations", namespace = "urn:oasis:names:tc:opendocument:xmlns:table:1.0")
    protected ContentValidations contentValidations;
    @XmlElement(name = "label-ranges", namespace = "urn:oasis:names:tc:opendocument:xmlns:table:1.0")
    protected LabelRanges labelRanges;
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
    protected java.util.List<Object> textContent;
    @XmlElement(name = "page-sequence", namespace = "urn:oasis:names:tc:opendocument:xmlns:text:1.0")
    protected PageSequence pageSequence;
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
    protected java.util.List<Object> shape;
    @XmlElement(name = "named-expressions", namespace = "urn:oasis:names:tc:opendocument:xmlns:table:1.0")
    protected NamedExpressions namedExpressions;
    @XmlElement(name = "database-ranges", namespace = "urn:oasis:names:tc:opendocument:xmlns:table:1.0")
    protected DatabaseRanges databaseRanges;
    @XmlElement(name = "data-pilot-tables", namespace = "urn:oasis:names:tc:opendocument:xmlns:table:1.0")
    protected DataPilotTables dataPilotTables;
    @XmlElement(namespace = "urn:oasis:names:tc:opendocument:xmlns:table:1.0")
    protected Consolidation consolidation;
    @XmlElement(name = "dde-links", namespace = "urn:oasis:names:tc:opendocument:xmlns:table:1.0")
    protected DdeLinks ddeLinks;
    @XmlAttribute(name = "global", namespace = "urn:oasis:names:tc:opendocument:xmlns:text:1.0")
    protected Boolean global;
    @XmlAttribute(name = "use-soft-page-breaks", namespace = "urn:oasis:names:tc:opendocument:xmlns:text:1.0")
    protected Boolean useSoftPageBreaks;

    /**
     * Gets the value of the forms property.
     * 
     * @return
     *     possible object is
     *     {@link Forms }
     *     
     */
    public Forms getForms() {
        return forms;
    }

    /**
     * Sets the value of the forms property.
     * 
     * @param value
     *     allowed object is
     *     {@link Forms }
     *     
     */
    public void setForms(Forms value) {
        this.forms = value;
    }

    /**
     * Gets the value of the trackedChanges property.
     * 
     * @return
     *     possible object is
     *     {@link TrackedChanges }
     *     
     */
    public TrackedChanges getTrackedChanges() {
        return trackedChanges;
    }

    /**
     * Sets the value of the trackedChanges property.
     * 
     * @param value
     *     allowed object is
     *     {@link TrackedChanges }
     *     
     */
    public void setTrackedChanges(TrackedChanges value) {
        this.trackedChanges = value;
    }

    /**
     * Gets the value of the variableDecls property.
     * 
     * @return
     *     possible object is
     *     {@link VariableDecls }
     *     
     */
    public VariableDecls getVariableDecls() {
        return variableDecls;
    }

    /**
     * Sets the value of the variableDecls property.
     * 
     * @param value
     *     allowed object is
     *     {@link VariableDecls }
     *     
     */
    public void setVariableDecls(VariableDecls value) {
        this.variableDecls = value;
    }

    /**
     * Gets the value of the sequenceDecls property.
     * 
     * @return
     *     possible object is
     *     {@link SequenceDecls }
     *     
     */
    public SequenceDecls getSequenceDecls() {
        return sequenceDecls;
    }

    /**
     * Sets the value of the sequenceDecls property.
     * 
     * @param value
     *     allowed object is
     *     {@link SequenceDecls }
     *     
     */
    public void setSequenceDecls(SequenceDecls value) {
        this.sequenceDecls = value;
    }

    /**
     * Gets the value of the userFieldDecls property.
     * 
     * @return
     *     possible object is
     *     {@link UserFieldDecls }
     *     
     */
    public UserFieldDecls getUserFieldDecls() {
        return userFieldDecls;
    }

    /**
     * Sets the value of the userFieldDecls property.
     * 
     * @param value
     *     allowed object is
     *     {@link UserFieldDecls }
     *     
     */
    public void setUserFieldDecls(UserFieldDecls value) {
        this.userFieldDecls = value;
    }

    /**
     * Gets the value of the ddeConnectionDecls property.
     * 
     * @return
     *     possible object is
     *     {@link DdeConnectionDecls }
     *     
     */
    public DdeConnectionDecls getDdeConnectionDecls() {
        return ddeConnectionDecls;
    }

    /**
     * Sets the value of the ddeConnectionDecls property.
     * 
     * @param value
     *     allowed object is
     *     {@link DdeConnectionDecls }
     *     
     */
    public void setDdeConnectionDecls(DdeConnectionDecls value) {
        this.ddeConnectionDecls = value;
    }

    /**
     * Gets the value of the alphabeticalIndexAutoMarkFile property.
     * 
     * @return
     *     possible object is
     *     {@link AlphabeticalIndexAutoMarkFile }
     *     
     */
    public AlphabeticalIndexAutoMarkFile getAlphabeticalIndexAutoMarkFile() {
        return alphabeticalIndexAutoMarkFile;
    }

    /**
     * Sets the value of the alphabeticalIndexAutoMarkFile property.
     * 
     * @param value
     *     allowed object is
     *     {@link AlphabeticalIndexAutoMarkFile }
     *     
     */
    public void setAlphabeticalIndexAutoMarkFile(AlphabeticalIndexAutoMarkFile value) {
        this.alphabeticalIndexAutoMarkFile = value;
    }

    /**
     * Gets the value of the calculationSettings property.
     * 
     * @return
     *     possible object is
     *     {@link CalculationSettings }
     *     
     */
    public CalculationSettings getCalculationSettings() {
        return calculationSettings;
    }

    /**
     * Sets the value of the calculationSettings property.
     * 
     * @param value
     *     allowed object is
     *     {@link CalculationSettings }
     *     
     */
    public void setCalculationSettings(CalculationSettings value) {
        this.calculationSettings = value;
    }

    /**
     * Gets the value of the contentValidations property.
     * 
     * @return
     *     possible object is
     *     {@link ContentValidations }
     *     
     */
    public ContentValidations getContentValidations() {
        return contentValidations;
    }

    /**
     * Sets the value of the contentValidations property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContentValidations }
     *     
     */
    public void setContentValidations(ContentValidations value) {
        this.contentValidations = value;
    }

    /**
     * Gets the value of the labelRanges property.
     * 
     * @return
     *     possible object is
     *     {@link LabelRanges }
     *     
     */
    public LabelRanges getLabelRanges() {
        return labelRanges;
    }

    /**
     * Sets the value of the labelRanges property.
     * 
     * @param value
     *     allowed object is
     *     {@link LabelRanges }
     *     
     */
    public void setLabelRanges(LabelRanges value) {
        this.labelRanges = value;
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
    public java.util.List<Object> getTextContent() {
        if (textContent == null) {
            textContent = new ArrayList<Object>();
        }
        return this.textContent;
    }

    /**
     * Gets the value of the pageSequence property.
     * 
     * @return
     *     possible object is
     *     {@link PageSequence }
     *     
     */
    public PageSequence getPageSequence() {
        return pageSequence;
    }

    /**
     * Sets the value of the pageSequence property.
     * 
     * @param value
     *     allowed object is
     *     {@link PageSequence }
     *     
     */
    public void setPageSequence(PageSequence value) {
        this.pageSequence = value;
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
    public java.util.List<Object> getShape() {
        if (shape == null) {
            shape = new ArrayList<Object>();
        }
        return this.shape;
    }

    /**
     * Gets the value of the namedExpressions property.
     * 
     * @return
     *     possible object is
     *     {@link NamedExpressions }
     *     
     */
    public NamedExpressions getNamedExpressions() {
        return namedExpressions;
    }

    /**
     * Sets the value of the namedExpressions property.
     * 
     * @param value
     *     allowed object is
     *     {@link NamedExpressions }
     *     
     */
    public void setNamedExpressions(NamedExpressions value) {
        this.namedExpressions = value;
    }

    /**
     * Gets the value of the databaseRanges property.
     * 
     * @return
     *     possible object is
     *     {@link DatabaseRanges }
     *     
     */
    public DatabaseRanges getDatabaseRanges() {
        return databaseRanges;
    }

    /**
     * Sets the value of the databaseRanges property.
     * 
     * @param value
     *     allowed object is
     *     {@link DatabaseRanges }
     *     
     */
    public void setDatabaseRanges(DatabaseRanges value) {
        this.databaseRanges = value;
    }

    /**
     * Gets the value of the dataPilotTables property.
     * 
     * @return
     *     possible object is
     *     {@link DataPilotTables }
     *     
     */
    public DataPilotTables getDataPilotTables() {
        return dataPilotTables;
    }

    /**
     * Sets the value of the dataPilotTables property.
     * 
     * @param value
     *     allowed object is
     *     {@link DataPilotTables }
     *     
     */
    public void setDataPilotTables(DataPilotTables value) {
        this.dataPilotTables = value;
    }

    /**
     * Gets the value of the consolidation property.
     * 
     * @return
     *     possible object is
     *     {@link Consolidation }
     *     
     */
    public Consolidation getConsolidation() {
        return consolidation;
    }

    /**
     * Sets the value of the consolidation property.
     * 
     * @param value
     *     allowed object is
     *     {@link Consolidation }
     *     
     */
    public void setConsolidation(Consolidation value) {
        this.consolidation = value;
    }

    /**
     * Gets the value of the ddeLinks property.
     * 
     * @return
     *     possible object is
     *     {@link DdeLinks }
     *     
     */
    public DdeLinks getDdeLinks() {
        return ddeLinks;
    }

    /**
     * Sets the value of the ddeLinks property.
     * 
     * @param value
     *     allowed object is
     *     {@link DdeLinks }
     *     
     */
    public void setDdeLinks(DdeLinks value) {
        this.ddeLinks = value;
    }

    /**
     * Gets the value of the global property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getGlobal() {
        return global;
    }

    /**
     * Sets the value of the global property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setGlobal(Boolean value) {
        this.global = value;
    }

    /**
     * Gets the value of the useSoftPageBreaks property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getUseSoftPageBreaks() {
        return useSoftPageBreaks;
    }

    /**
     * Sets the value of the useSoftPageBreaks property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUseSoftPageBreaks(Boolean value) {
        this.useSoftPageBreaks = value;
    }

}
