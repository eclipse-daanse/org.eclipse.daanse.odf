
package org.eclipse.daanse.odf.model.jakarta.xml.bind.office;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import org.eclipse.daanse.odf.model.jakarta.xml.bind.table.CalculationSettings;
import org.eclipse.daanse.odf.model.jakarta.xml.bind.table.Consolidation;
import org.eclipse.daanse.odf.model.jakarta.xml.bind.table.ContentValidations;
import org.eclipse.daanse.odf.model.jakarta.xml.bind.table.DataPilotTables;
import org.eclipse.daanse.odf.model.jakarta.xml.bind.table.DatabaseRanges;
import org.eclipse.daanse.odf.model.jakarta.xml.bind.table.DdeLinks;
import org.eclipse.daanse.odf.model.jakarta.xml.bind.table.LabelRanges;
import org.eclipse.daanse.odf.model.jakarta.xml.bind.table.NamedExpressions;
import org.eclipse.daanse.odf.model.jakarta.xml.bind.table.Table;
import org.eclipse.daanse.odf.model.jakarta.xml.bind.table.TrackedChanges;
import org.eclipse.daanse.odf.model.jakarta.xml.bind.text.AlphabeticalIndexAutoMarkFile;
import org.eclipse.daanse.odf.model.jakarta.xml.bind.text.Boolean;
import org.eclipse.daanse.odf.model.jakarta.xml.bind.text.DdeConnectionDecls;
import org.eclipse.daanse.odf.model.jakarta.xml.bind.text.SequenceDecls;
import org.eclipse.daanse.odf.model.jakarta.xml.bind.text.UserFieldDecls;
import org.eclipse.daanse.odf.model.jakarta.xml.bind.text.VariableDecls;


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
 *         &lt;group ref="{urn:oasis:names:tc:opendocument:xmlns:text:1.0}office-spreadsheet-content-prelude"/&gt;
 *         &lt;group ref="{urn:oasis:names:tc:opendocument:xmlns:text:1.0}office-spreadsheet-content-main"/&gt;
 *         &lt;group ref="{urn:oasis:names:tc:opendocument:xmlns:text:1.0}office-spreadsheet-content-epilogue"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attGroup ref="{urn:oasis:names:tc:opendocument:xmlns:text:1.0}office-spreadsheet-attlist"/&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "trackedChanges",
    "variableDecls",
    "sequenceDecls",
    "userFieldDecls",
    "ddeConnectionDecls",
    "alphabeticalIndexAutoMarkFile",
    "calculationSettings",
    "contentValidations",
    "labelRanges",
    "table",
    "namedExpressions",
    "databaseRanges",
    "dataPilotTables",
    "consolidation",
    "ddeLinks"
})
public class Spreadsheet {

    @XmlElement(name = "tracked-changes", namespace = "urn:oasis:names:tc:opendocument:xmlns:table:1.0")
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
    @XmlElement(namespace = "urn:oasis:names:tc:opendocument:xmlns:table:1.0")
    protected List<Table> table;
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
    @XmlAttribute(name = "structure-protected", namespace = "urn:oasis:names:tc:opendocument:xmlns:table:1.0")
    protected Boolean structureProtected;
    @XmlAttribute(name = "protection-key", namespace = "urn:oasis:names:tc:opendocument:xmlns:table:1.0")
    protected String protectionKey;
    @XmlAttribute(name = "protection-key-digest-algorithm", namespace = "urn:oasis:names:tc:opendocument:xmlns:table:1.0")
    protected String protectionKeyDigestAlgorithm;

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
     * Gets the value of the table property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the table property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTable().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Table }
     * 
     * 
     */
    public List<Table> getTable() {
        if (table == null) {
            table = new ArrayList<Table>();
        }
        return this.table;
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
     * Gets the value of the structureProtected property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getStructureProtected() {
        return structureProtected;
    }

    /**
     * Sets the value of the structureProtected property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setStructureProtected(Boolean value) {
        this.structureProtected = value;
    }

    /**
     * Gets the value of the protectionKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProtectionKey() {
        return protectionKey;
    }

    /**
     * Sets the value of the protectionKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProtectionKey(String value) {
        this.protectionKey = value;
    }

    /**
     * Gets the value of the protectionKeyDigestAlgorithm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProtectionKeyDigestAlgorithm() {
        return protectionKeyDigestAlgorithm;
    }

    /**
     * Sets the value of the protectionKeyDigestAlgorithm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProtectionKeyDigestAlgorithm(String value) {
        this.protectionKeyDigestAlgorithm = value;
    }

}
