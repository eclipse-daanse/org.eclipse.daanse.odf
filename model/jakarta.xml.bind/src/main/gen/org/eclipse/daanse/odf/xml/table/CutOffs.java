
package org.eclipse.daanse.odf.xml.table;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlElementRefs;
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
 *       &lt;choice&gt;
 *         &lt;element ref="{urn:oasis:names:tc:opendocument:xmlns:table:1.0}movement-cut-off" maxOccurs="unbounded"/&gt;
 *         &lt;sequence&gt;
 *           &lt;element ref="{urn:oasis:names:tc:opendocument:xmlns:table:1.0}insertion-cut-off"/&gt;
 *           &lt;element ref="{urn:oasis:names:tc:opendocument:xmlns:table:1.0}movement-cut-off" maxOccurs="unbounded" minOccurs="0"/&gt;
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
@XmlType(name = "", propOrder = {
    "content"
})
@XmlRootElement(name = "cut-offs")
public class CutOffs {

    @XmlElementRefs({
        @XmlElementRef(name = "movement-cut-off", namespace = "urn:oasis:names:tc:opendocument:xmlns:table:1.0", type = MovementCutOff.class, required = false),
        @XmlElementRef(name = "insertion-cut-off", namespace = "urn:oasis:names:tc:opendocument:xmlns:table:1.0", type = InsertionCutOff.class, required = false)
    })
    protected List<Object> content;

    /**
     * Gets the rest of the content model. 
     * 
     * <p>
     * You are getting this "catch-all" property because of the following reason: 
     * The field name "MovementCutOff" is used by two different parts of a schema. See: 
     * line 305 of file:/var/home/stbischof/git/daanse/org.eclipse.daanse.odf/model/xsd/table.xsd
     * line 302 of file:/var/home/stbischof/git/daanse/org.eclipse.daanse.odf/model/xsd/table.xsd
     * <p>
     * To get rid of this property, apply a property customization to one 
     * of both of the following declarations to change their names: 
     * Gets the value of the content property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the content property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContent().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MovementCutOff }
     * {@link InsertionCutOff }
     * 
     * 
     */
    public List<Object> getContent() {
        if (content == null) {
            content = new ArrayList<Object>();
        }
        return this.content;
    }

}
