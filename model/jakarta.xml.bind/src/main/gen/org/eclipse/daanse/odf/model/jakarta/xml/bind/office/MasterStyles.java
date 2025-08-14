
package org.eclipse.daanse.odf.model.jakarta.xml.bind.office;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlElements;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;
import org.eclipse.daanse.odf.model.jakarta.xml.bind.draw.LayerSet;
import org.eclipse.daanse.odf.model.jakarta.xml.bind.style.HandoutMaster;
import org.eclipse.daanse.odf.model.jakarta.xml.bind.style.MasterPage;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice maxOccurs="unbounded" minOccurs="0"&gt;
 *         &lt;element ref="{urn:oasis:names:tc:opendocument:xmlns:style:1.0}master-page"/&gt;
 *         &lt;element ref="{urn:oasis:names:tc:opendocument:xmlns:style:1.0}handout-master"/&gt;
 *         &lt;element ref="{urn:oasis:names:tc:opendocument:xmlns:drawing:1.0}layer-set"/&gt;
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
    "masterPageOrHandoutMasterOrLayerSet"
})
@XmlRootElement(name = "master-styles")
public class MasterStyles {

    @XmlElements({
        @XmlElement(name = "master-page", namespace = "urn:oasis:names:tc:opendocument:xmlns:style:1.0", type = MasterPage.class),
        @XmlElement(name = "handout-master", namespace = "urn:oasis:names:tc:opendocument:xmlns:style:1.0", type = HandoutMaster.class),
        @XmlElement(name = "layer-set", namespace = "urn:oasis:names:tc:opendocument:xmlns:drawing:1.0", type = LayerSet.class)
    })
    protected List<Object> masterPageOrHandoutMasterOrLayerSet;

    /**
     * Gets the value of the masterPageOrHandoutMasterOrLayerSet property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the masterPageOrHandoutMasterOrLayerSet property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMasterPageOrHandoutMasterOrLayerSet().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MasterPage }
     * {@link HandoutMaster }
     * {@link LayerSet }
     * 
     * 
     */
    public List<Object> getMasterPageOrHandoutMasterOrLayerSet() {
        if (masterPageOrHandoutMasterOrLayerSet == null) {
            masterPageOrHandoutMasterOrLayerSet = new ArrayList<Object>();
        }
        return this.masterPageOrHandoutMasterOrLayerSet;
    }

}
