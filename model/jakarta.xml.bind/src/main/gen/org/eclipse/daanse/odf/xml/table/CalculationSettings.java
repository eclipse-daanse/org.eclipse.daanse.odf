
package org.eclipse.daanse.odf.xml.table;

import java.math.BigInteger;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;
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
 *         &lt;element ref="{urn:oasis:names:tc:opendocument:xmlns:table:1.0}null-date" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:tc:opendocument:xmlns:table:1.0}iteration" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attGroup ref="{urn:oasis:names:tc:opendocument:xmlns:text:1.0}table-calculation-setting-attlist"/&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "nullDate",
    "iteration"
})
@XmlRootElement(name = "calculation-settings")
public class CalculationSettings {

    @XmlElement(name = "null-date")
    protected NullDate nullDate;
    protected Iteration iteration;
    @XmlAttribute(name = "precision-as-shown", namespace = "urn:oasis:names:tc:opendocument:xmlns:table:1.0")
    protected Boolean precisionAsShown;
    @XmlAttribute(name = "search-criteria-must-apply-to-whole-cell", namespace = "urn:oasis:names:tc:opendocument:xmlns:table:1.0")
    protected Boolean searchCriteriaMustApplyToWholeCell;
    @XmlAttribute(name = "automatic-find-labels", namespace = "urn:oasis:names:tc:opendocument:xmlns:table:1.0")
    protected Boolean automaticFindLabels;
    @XmlAttribute(name = "use-regular-expressions", namespace = "urn:oasis:names:tc:opendocument:xmlns:table:1.0")
    protected Boolean useRegularExpressions;
    @XmlAttribute(name = "use-wildcards", namespace = "urn:oasis:names:tc:opendocument:xmlns:table:1.0")
    protected Boolean useWildcards;
    @XmlAttribute(name = "null-year", namespace = "urn:oasis:names:tc:opendocument:xmlns:table:1.0")
    protected BigInteger nullYear;
    @XmlAttribute(name = "case-sensitive", namespace = "urn:oasis:names:tc:opendocument:xmlns:table:1.0", required = true)
    protected Boolean caseSensitive;

    /**
     * Gets the value of the nullDate property.
     * 
     * @return
     *     possible object is
     *     {@link NullDate }
     *     
     */
    public NullDate getNullDate() {
        return nullDate;
    }

    /**
     * Sets the value of the nullDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link NullDate }
     *     
     */
    public void setNullDate(NullDate value) {
        this.nullDate = value;
    }

    /**
     * Gets the value of the iteration property.
     * 
     * @return
     *     possible object is
     *     {@link Iteration }
     *     
     */
    public Iteration getIteration() {
        return iteration;
    }

    /**
     * Sets the value of the iteration property.
     * 
     * @param value
     *     allowed object is
     *     {@link Iteration }
     *     
     */
    public void setIteration(Iteration value) {
        this.iteration = value;
    }

    /**
     * Gets the value of the precisionAsShown property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getPrecisionAsShown() {
        return precisionAsShown;
    }

    /**
     * Sets the value of the precisionAsShown property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPrecisionAsShown(Boolean value) {
        this.precisionAsShown = value;
    }

    /**
     * Gets the value of the searchCriteriaMustApplyToWholeCell property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getSearchCriteriaMustApplyToWholeCell() {
        return searchCriteriaMustApplyToWholeCell;
    }

    /**
     * Sets the value of the searchCriteriaMustApplyToWholeCell property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSearchCriteriaMustApplyToWholeCell(Boolean value) {
        this.searchCriteriaMustApplyToWholeCell = value;
    }

    /**
     * Gets the value of the automaticFindLabels property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getAutomaticFindLabels() {
        return automaticFindLabels;
    }

    /**
     * Sets the value of the automaticFindLabels property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAutomaticFindLabels(Boolean value) {
        this.automaticFindLabels = value;
    }

    /**
     * Gets the value of the useRegularExpressions property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getUseRegularExpressions() {
        return useRegularExpressions;
    }

    /**
     * Sets the value of the useRegularExpressions property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUseRegularExpressions(Boolean value) {
        this.useRegularExpressions = value;
    }

    /**
     * Gets the value of the useWildcards property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getUseWildcards() {
        return useWildcards;
    }

    /**
     * Sets the value of the useWildcards property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUseWildcards(Boolean value) {
        this.useWildcards = value;
    }

    /**
     * Gets the value of the nullYear property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNullYear() {
        return nullYear;
    }

    /**
     * Sets the value of the nullYear property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNullYear(BigInteger value) {
        this.nullYear = value;
    }

    /**
     * Gets the value of the caseSensitive property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getCaseSensitive() {
        return caseSensitive;
    }

    /**
     * Sets the value of the caseSensitive property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCaseSensitive(Boolean value) {
        this.caseSensitive = value;
    }

}
