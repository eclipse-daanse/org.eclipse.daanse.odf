
package org.eclipse.daanse.odf.xml.table;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.eclipse.daanse.odf.xml.office.ChangeInfo;


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
 *         &lt;element ref="{urn:oasis:names:tc:opendocument:xmlns:table:1.0}source-range-address"/&gt;
 *         &lt;element ref="{urn:oasis:names:tc:opendocument:xmlns:table:1.0}target-range-address"/&gt;
 *         &lt;element ref="{urn:oasis:names:tc:opendocument:xmlns:office:1.0}change-info"/&gt;
 *         &lt;element ref="{urn:oasis:names:tc:opendocument:xmlns:table:1.0}dependencies" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:tc:opendocument:xmlns:table:1.0}deletions" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attGroup ref="{urn:oasis:names:tc:opendocument:xmlns:text:1.0}common-table-change-attlist"/&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "sourceRangeAddress",
    "targetRangeAddress",
    "changeInfo",
    "dependencies",
    "deletions"
})
@XmlRootElement(name = "movement")
public class Movement {

    @XmlElement(name = "source-range-address", required = true)
    protected SourceRangeAddress sourceRangeAddress;
    @XmlElement(name = "target-range-address", required = true)
    protected TargetRangeAddress targetRangeAddress;
    @XmlElement(name = "change-info", namespace = "urn:oasis:names:tc:opendocument:xmlns:office:1.0", required = true)
    protected ChangeInfo changeInfo;
    protected Dependencies dependencies;
    protected Deletions deletions;
    @XmlAttribute(name = "id", namespace = "urn:oasis:names:tc:opendocument:xmlns:table:1.0", required = true)
    protected String id;
    @XmlAttribute(name = "acceptance-state", namespace = "urn:oasis:names:tc:opendocument:xmlns:table:1.0")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String acceptanceState;
    @XmlAttribute(name = "rejecting-change-id", namespace = "urn:oasis:names:tc:opendocument:xmlns:table:1.0")
    protected String rejectingChangeId;

    /**
     * Gets the value of the sourceRangeAddress property.
     * 
     * @return
     *     possible object is
     *     {@link SourceRangeAddress }
     *     
     */
    public SourceRangeAddress getSourceRangeAddress() {
        return sourceRangeAddress;
    }

    /**
     * Sets the value of the sourceRangeAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link SourceRangeAddress }
     *     
     */
    public void setSourceRangeAddress(SourceRangeAddress value) {
        this.sourceRangeAddress = value;
    }

    /**
     * Gets the value of the targetRangeAddress property.
     * 
     * @return
     *     possible object is
     *     {@link TargetRangeAddress }
     *     
     */
    public TargetRangeAddress getTargetRangeAddress() {
        return targetRangeAddress;
    }

    /**
     * Sets the value of the targetRangeAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link TargetRangeAddress }
     *     
     */
    public void setTargetRangeAddress(TargetRangeAddress value) {
        this.targetRangeAddress = value;
    }

    /**
     * Gets the value of the changeInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ChangeInfo }
     *     
     */
    public ChangeInfo getChangeInfo() {
        return changeInfo;
    }

    /**
     * Sets the value of the changeInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChangeInfo }
     *     
     */
    public void setChangeInfo(ChangeInfo value) {
        this.changeInfo = value;
    }

    /**
     * Gets the value of the dependencies property.
     * 
     * @return
     *     possible object is
     *     {@link Dependencies }
     *     
     */
    public Dependencies getDependencies() {
        return dependencies;
    }

    /**
     * Sets the value of the dependencies property.
     * 
     * @param value
     *     allowed object is
     *     {@link Dependencies }
     *     
     */
    public void setDependencies(Dependencies value) {
        this.dependencies = value;
    }

    /**
     * Gets the value of the deletions property.
     * 
     * @return
     *     possible object is
     *     {@link Deletions }
     *     
     */
    public Deletions getDeletions() {
        return deletions;
    }

    /**
     * Sets the value of the deletions property.
     * 
     * @param value
     *     allowed object is
     *     {@link Deletions }
     *     
     */
    public void setDeletions(Deletions value) {
        this.deletions = value;
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
     * Gets the value of the acceptanceState property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcceptanceState() {
        return acceptanceState;
    }

    /**
     * Sets the value of the acceptanceState property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcceptanceState(String value) {
        this.acceptanceState = value;
    }

    /**
     * Gets the value of the rejectingChangeId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRejectingChangeId() {
        return rejectingChangeId;
    }

    /**
     * Sets the value of the rejectingChangeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRejectingChangeId(String value) {
        this.rejectingChangeId = value;
    }

}
