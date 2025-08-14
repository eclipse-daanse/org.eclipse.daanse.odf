
package org.eclipse.daanse.odf.xml.table;

import java.math.BigInteger;
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
 *         &lt;element ref="{urn:oasis:names:tc:opendocument:xmlns:office:1.0}change-info"/&gt;
 *         &lt;element ref="{urn:oasis:names:tc:opendocument:xmlns:table:1.0}dependencies" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:tc:opendocument:xmlns:table:1.0}deletions" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:tc:opendocument:xmlns:table:1.0}cut-offs" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attGroup ref="{urn:oasis:names:tc:opendocument:xmlns:text:1.0}table-deletion-attlist"/&gt;
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
    "changeInfo",
    "dependencies",
    "deletions",
    "cutOffs"
})
@XmlRootElement(name = "deletion")
public class Deletion {

    @XmlElement(name = "change-info", namespace = "urn:oasis:names:tc:opendocument:xmlns:office:1.0", required = true)
    protected ChangeInfo changeInfo;
    protected Dependencies dependencies;
    protected Deletions deletions;
    @XmlElement(name = "cut-offs")
    protected CutOffs cutOffs;
    @XmlAttribute(name = "position", namespace = "urn:oasis:names:tc:opendocument:xmlns:table:1.0", required = true)
    protected BigInteger position;
    @XmlAttribute(name = "table", namespace = "urn:oasis:names:tc:opendocument:xmlns:table:1.0")
    protected BigInteger table;
    @XmlAttribute(name = "multi-deletion-spanned", namespace = "urn:oasis:names:tc:opendocument:xmlns:table:1.0")
    protected BigInteger multiDeletionSpanned;
    @XmlAttribute(name = "type", namespace = "urn:oasis:names:tc:opendocument:xmlns:table:1.0", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String type;
    @XmlAttribute(name = "id", namespace = "urn:oasis:names:tc:opendocument:xmlns:table:1.0", required = true)
    protected String id;
    @XmlAttribute(name = "acceptance-state", namespace = "urn:oasis:names:tc:opendocument:xmlns:table:1.0")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String acceptanceState;
    @XmlAttribute(name = "rejecting-change-id", namespace = "urn:oasis:names:tc:opendocument:xmlns:table:1.0")
    protected String rejectingChangeId;

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
     * Gets the value of the cutOffs property.
     * 
     * @return
     *     possible object is
     *     {@link CutOffs }
     *     
     */
    public CutOffs getCutOffs() {
        return cutOffs;
    }

    /**
     * Sets the value of the cutOffs property.
     * 
     * @param value
     *     allowed object is
     *     {@link CutOffs }
     *     
     */
    public void setCutOffs(CutOffs value) {
        this.cutOffs = value;
    }

    /**
     * Gets the value of the position property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPosition() {
        return position;
    }

    /**
     * Sets the value of the position property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPosition(BigInteger value) {
        this.position = value;
    }

    /**
     * Gets the value of the table property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTable() {
        return table;
    }

    /**
     * Sets the value of the table property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTable(BigInteger value) {
        this.table = value;
    }

    /**
     * Gets the value of the multiDeletionSpanned property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMultiDeletionSpanned() {
        return multiDeletionSpanned;
    }

    /**
     * Sets the value of the multiDeletionSpanned property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMultiDeletionSpanned(BigInteger value) {
        this.multiDeletionSpanned = value;
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
