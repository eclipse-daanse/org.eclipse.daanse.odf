
package org.eclipse.daanse.odf.xml.text;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;


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
 *         &lt;element ref="{urn:oasis:names:tc:opendocument:xmlns:text:1.0}sequence-decl" maxOccurs="unbounded" minOccurs="0"/&gt;
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
    "sequenceDecl"
})
@XmlRootElement(name = "sequence-decls")
public class SequenceDecls {

    @XmlElement(name = "sequence-decl")
    protected List<SequenceDecl> sequenceDecl;

    /**
     * Gets the value of the sequenceDecl property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the sequenceDecl property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSequenceDecl().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SequenceDecl }
     * 
     * 
     */
    public List<SequenceDecl> getSequenceDecl() {
        if (sequenceDecl == null) {
            sequenceDecl = new ArrayList<SequenceDecl>();
        }
        return this.sequenceDecl;
    }

}
