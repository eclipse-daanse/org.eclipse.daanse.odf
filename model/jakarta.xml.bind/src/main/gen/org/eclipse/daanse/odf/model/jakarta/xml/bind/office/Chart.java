
package org.eclipse.daanse.odf.model.jakarta.xml.bind.office;

import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlType;
import org.eclipse.daanse.odf.model.jakarta.xml.bind.table.CalculationSettings;
import org.eclipse.daanse.odf.model.jakarta.xml.bind.table.Consolidation;
import org.eclipse.daanse.odf.model.jakarta.xml.bind.table.ContentValidations;
import org.eclipse.daanse.odf.model.jakarta.xml.bind.table.DataPilotTables;
import org.eclipse.daanse.odf.model.jakarta.xml.bind.table.DatabaseRanges;
import org.eclipse.daanse.odf.model.jakarta.xml.bind.table.DdeLinks;
import org.eclipse.daanse.odf.model.jakarta.xml.bind.table.LabelRanges;
import org.eclipse.daanse.odf.model.jakarta.xml.bind.table.NamedExpressions;
import org.eclipse.daanse.odf.model.jakarta.xml.bind.text.AlphabeticalIndexAutoMarkFile;
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
 *         &lt;group ref="{urn:oasis:names:tc:opendocument:xmlns:text:1.0}office-chart-content-prelude"/&gt;
 *         &lt;element ref="{urn:oasis:names:tc:opendocument:xmlns:text:1.0}office-chart-content-main"/&gt;
 *         &lt;group ref="{urn:oasis:names:tc:opendocument:xmlns:text:1.0}office-chart-content-epilogue"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "variableDecls",
    "sequenceDecls",
    "userFieldDecls",
    "ddeConnectionDecls",
    "alphabeticalIndexAutoMarkFile",
    "calculationSettings",
    "contentValidations",
    "labelRanges",
    "officeChartContentMain",
    "namedExpressions",
    "databaseRanges",
    "dataPilotTables",
    "consolidation",
    "ddeLinks"
})
public class Chart {

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
    @XmlElementRef(name = "office-chart-content-main", namespace = "urn:oasis:names:tc:opendocument:xmlns:text:1.0", type = JAXBElement.class)
    protected JAXBElement<?> officeChartContentMain;
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
     * Gets the value of the officeChartContentMain property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link org.eclipse.daanse.odf.model.jakarta.xml.bind.chart.OfficeChartContentMain }{@code >}
     *     {@link JAXBElement }{@code <}{@link org.eclipse.daanse.odf.model.jakarta.xml.bind.text.OfficeChartContentMain }{@code >}
     *     
     */
    public JAXBElement<?> getOfficeChartContentMain() {
        return officeChartContentMain;
    }

    /**
     * Sets the value of the officeChartContentMain property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link org.eclipse.daanse.odf.model.jakarta.xml.bind.chart.OfficeChartContentMain }{@code >}
     *     {@link JAXBElement }{@code <}{@link org.eclipse.daanse.odf.model.jakarta.xml.bind.text.OfficeChartContentMain }{@code >}
     *     
     */
    public void setOfficeChartContentMain(JAXBElement<?> value) {
        this.officeChartContentMain = value;
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

}
