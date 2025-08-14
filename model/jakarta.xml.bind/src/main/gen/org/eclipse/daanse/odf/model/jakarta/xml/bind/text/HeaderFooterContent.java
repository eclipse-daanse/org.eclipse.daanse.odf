
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
import org.eclipse.daanse.odf.model.jakarta.xml.bind.style.Footer;
import org.eclipse.daanse.odf.model.jakarta.xml.bind.style.FooterFirst;
import org.eclipse.daanse.odf.model.jakarta.xml.bind.style.FooterLeft;
import org.eclipse.daanse.odf.model.jakarta.xml.bind.style.Header;
import org.eclipse.daanse.odf.model.jakarta.xml.bind.style.HeaderFirst;
import org.eclipse.daanse.odf.model.jakarta.xml.bind.style.HeaderLeft;
import org.eclipse.daanse.odf.model.jakarta.xml.bind.table.Table;


/**
 * <p>Java class for header-footer-content complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="header-footer-content"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;sequence&gt;
 *           &lt;group ref="{urn:oasis:names:tc:opendocument:xmlns:text:1.0}text-tracked-changes"/&gt;
 *           &lt;group ref="{urn:oasis:names:tc:opendocument:xmlns:text:1.0}text-decls"/&gt;
 *           &lt;choice maxOccurs="unbounded" minOccurs="0"&gt;
 *             &lt;element ref="{urn:oasis:names:tc:opendocument:xmlns:text:1.0}h"/&gt;
 *             &lt;element ref="{urn:oasis:names:tc:opendocument:xmlns:text:1.0}p"/&gt;
 *             &lt;element ref="{urn:oasis:names:tc:opendocument:xmlns:text:1.0}list"/&gt;
 *             &lt;element ref="{urn:oasis:names:tc:opendocument:xmlns:table:1.0}table"/&gt;
 *             &lt;element ref="{urn:oasis:names:tc:opendocument:xmlns:text:1.0}section"/&gt;
 *             &lt;element ref="{urn:oasis:names:tc:opendocument:xmlns:text:1.0}table-of-content"/&gt;
 *             &lt;element ref="{urn:oasis:names:tc:opendocument:xmlns:text:1.0}illustration-index"/&gt;
 *             &lt;element ref="{urn:oasis:names:tc:opendocument:xmlns:text:1.0}table-index"/&gt;
 *             &lt;element ref="{urn:oasis:names:tc:opendocument:xmlns:text:1.0}object-index"/&gt;
 *             &lt;element ref="{urn:oasis:names:tc:opendocument:xmlns:text:1.0}user-index"/&gt;
 *             &lt;element ref="{urn:oasis:names:tc:opendocument:xmlns:text:1.0}alphabetical-index"/&gt;
 *             &lt;element ref="{urn:oasis:names:tc:opendocument:xmlns:text:1.0}bibliography"/&gt;
 *             &lt;element ref="{urn:oasis:names:tc:opendocument:xmlns:text:1.0}index-title"/&gt;
 *             &lt;element ref="{urn:oasis:names:tc:opendocument:xmlns:text:1.0}change-marks"/&gt;
 *           &lt;/choice&gt;
 *         &lt;/sequence&gt;
 *         &lt;sequence&gt;
 *           &lt;element ref="{urn:oasis:names:tc:opendocument:xmlns:style:1.0}region-left" minOccurs="0"/&gt;
 *           &lt;element ref="{urn:oasis:names:tc:opendocument:xmlns:style:1.0}region-center" minOccurs="0"/&gt;
 *           &lt;element ref="{urn:oasis:names:tc:opendocument:xmlns:style:1.0}region-right" minOccurs="0"/&gt;
 *         &lt;/sequence&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "header-footer-content", propOrder = {
    "trackedChanges",
    "variableDecls",
    "sequenceDecls",
    "userFieldDecls",
    "ddeConnectionDecls",
    "alphabeticalIndexAutoMarkFile",
    "hOrPOrList",
    "regionLeft",
    "regionCenter",
    "regionRight"
})
@XmlSeeAlso({
    FooterFirst.class,
    FooterLeft.class,
    Footer.class,
    HeaderFirst.class,
    HeaderLeft.class,
    Header.class
})
public class HeaderFooterContent {

    @XmlElement(name = "tracked-changes")
    protected TrackedChanges trackedChanges;
    @XmlElement(name = "variable-decls")
    protected VariableDecls variableDecls;
    @XmlElement(name = "sequence-decls")
    protected SequenceDecls sequenceDecls;
    @XmlElement(name = "user-field-decls")
    protected UserFieldDecls userFieldDecls;
    @XmlElement(name = "dde-connection-decls")
    protected DdeConnectionDecls ddeConnectionDecls;
    @XmlElement(name = "alphabetical-index-auto-mark-file")
    protected AlphabeticalIndexAutoMarkFile alphabeticalIndexAutoMarkFile;
    @XmlElementRefs({
        @XmlElementRef(name = "h", namespace = "urn:oasis:names:tc:opendocument:xmlns:text:1.0", type = H.class, required = false),
        @XmlElementRef(name = "p", namespace = "urn:oasis:names:tc:opendocument:xmlns:text:1.0", type = P.class, required = false),
        @XmlElementRef(name = "list", namespace = "urn:oasis:names:tc:opendocument:xmlns:text:1.0", type = org.eclipse.daanse.odf.model.jakarta.xml.bind.text.List.class, required = false),
        @XmlElementRef(name = "table", namespace = "urn:oasis:names:tc:opendocument:xmlns:table:1.0", type = Table.class, required = false),
        @XmlElementRef(name = "section", namespace = "urn:oasis:names:tc:opendocument:xmlns:text:1.0", type = Section.class, required = false),
        @XmlElementRef(name = "table-of-content", namespace = "urn:oasis:names:tc:opendocument:xmlns:text:1.0", type = TableOfContent.class, required = false),
        @XmlElementRef(name = "illustration-index", namespace = "urn:oasis:names:tc:opendocument:xmlns:text:1.0", type = IllustrationIndex.class, required = false),
        @XmlElementRef(name = "table-index", namespace = "urn:oasis:names:tc:opendocument:xmlns:text:1.0", type = TableIndex.class, required = false),
        @XmlElementRef(name = "object-index", namespace = "urn:oasis:names:tc:opendocument:xmlns:text:1.0", type = ObjectIndex.class, required = false),
        @XmlElementRef(name = "user-index", namespace = "urn:oasis:names:tc:opendocument:xmlns:text:1.0", type = UserIndex.class, required = false),
        @XmlElementRef(name = "alphabetical-index", namespace = "urn:oasis:names:tc:opendocument:xmlns:text:1.0", type = AlphabeticalIndex.class, required = false),
        @XmlElementRef(name = "bibliography", namespace = "urn:oasis:names:tc:opendocument:xmlns:text:1.0", type = Bibliography.class, required = false),
        @XmlElementRef(name = "index-title", namespace = "urn:oasis:names:tc:opendocument:xmlns:text:1.0", type = IndexTitle.class, required = false),
        @XmlElementRef(name = "change-marks", namespace = "urn:oasis:names:tc:opendocument:xmlns:text:1.0", type = JAXBElement.class, required = false)
    })
    protected java.util.List<Object> hOrPOrList;
    @XmlElement(name = "region-left", namespace = "urn:oasis:names:tc:opendocument:xmlns:style:1.0")
    protected RegionContent regionLeft;
    @XmlElement(name = "region-center", namespace = "urn:oasis:names:tc:opendocument:xmlns:style:1.0")
    protected RegionContent regionCenter;
    @XmlElement(name = "region-right", namespace = "urn:oasis:names:tc:opendocument:xmlns:style:1.0")
    protected RegionContent regionRight;

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
     * Gets the value of the hOrPOrList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the hOrPOrList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHOrPOrList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link H }
     * {@link P }
     * {@link org.eclipse.daanse.odf.model.jakarta.xml.bind.text.List }
     * {@link Table }
     * {@link Section }
     * {@link TableOfContent }
     * {@link IllustrationIndex }
     * {@link TableIndex }
     * {@link ObjectIndex }
     * {@link UserIndex }
     * {@link AlphabeticalIndex }
     * {@link Bibliography }
     * {@link IndexTitle }
     * {@link JAXBElement }{@code <}{@link ChangeMarks }{@code >}
     * {@link JAXBElement }{@code <}{@link ChangeMarks }{@code >}
     * {@link JAXBElement }{@code <}{@link ChangeMarks }{@code >}
     * {@link JAXBElement }{@code <}{@link ChangeMarks }{@code >}
     * 
     * 
     */
    public java.util.List<Object> getHOrPOrList() {
        if (hOrPOrList == null) {
            hOrPOrList = new ArrayList<Object>();
        }
        return this.hOrPOrList;
    }

    /**
     * Gets the value of the regionLeft property.
     * 
     * @return
     *     possible object is
     *     {@link RegionContent }
     *     
     */
    public RegionContent getRegionLeft() {
        return regionLeft;
    }

    /**
     * Sets the value of the regionLeft property.
     * 
     * @param value
     *     allowed object is
     *     {@link RegionContent }
     *     
     */
    public void setRegionLeft(RegionContent value) {
        this.regionLeft = value;
    }

    /**
     * Gets the value of the regionCenter property.
     * 
     * @return
     *     possible object is
     *     {@link RegionContent }
     *     
     */
    public RegionContent getRegionCenter() {
        return regionCenter;
    }

    /**
     * Sets the value of the regionCenter property.
     * 
     * @param value
     *     allowed object is
     *     {@link RegionContent }
     *     
     */
    public void setRegionCenter(RegionContent value) {
        this.regionCenter = value;
    }

    /**
     * Gets the value of the regionRight property.
     * 
     * @return
     *     possible object is
     *     {@link RegionContent }
     *     
     */
    public RegionContent getRegionRight() {
        return regionRight;
    }

    /**
     * Sets the value of the regionRight property.
     * 
     * @param value
     *     allowed object is
     *     {@link RegionContent }
     *     
     */
    public void setRegionRight(RegionContent value) {
        this.regionRight = value;
    }

}
