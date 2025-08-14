
package org.eclipse.daanse.odf.xml.text;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlElements;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;
import org.eclipse.daanse.odf.xml.config.ConfigItem;
import org.eclipse.daanse.odf.xml.config.ConfigItemMapEntry;
import org.eclipse.daanse.odf.xml.config.ConfigItemMapIndexed;
import org.eclipse.daanse.odf.xml.config.ConfigItemMapNamed;
import org.eclipse.daanse.odf.xml.config.ConfigItemSet;


/**
 * <p>Java class for config-items complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="config-items"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice maxOccurs="unbounded"&gt;
 *         &lt;element ref="{urn:oasis:names:tc:opendocument:xmlns:config:1.0}config-item"/&gt;
 *         &lt;element ref="{urn:oasis:names:tc:opendocument:xmlns:config:1.0}config-item-set"/&gt;
 *         &lt;element ref="{urn:oasis:names:tc:opendocument:xmlns:config:1.0}config-item-map-named"/&gt;
 *         &lt;element ref="{urn:oasis:names:tc:opendocument:xmlns:config:1.0}config-item-map-indexed"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "config-items", propOrder = {
    "configItemOrConfigItemSetOrConfigItemMapNamed"
})
@XmlSeeAlso({
    ConfigItemSet.class,
    ConfigItemMapEntry.class
})
public class ConfigItems {

    @XmlElements({
        @XmlElement(name = "config-item", namespace = "urn:oasis:names:tc:opendocument:xmlns:config:1.0", type = ConfigItem.class),
        @XmlElement(name = "config-item-set", namespace = "urn:oasis:names:tc:opendocument:xmlns:config:1.0", type = ConfigItemSet.class),
        @XmlElement(name = "config-item-map-named", namespace = "urn:oasis:names:tc:opendocument:xmlns:config:1.0", type = ConfigItemMapNamed.class),
        @XmlElement(name = "config-item-map-indexed", namespace = "urn:oasis:names:tc:opendocument:xmlns:config:1.0", type = ConfigItemMapIndexed.class)
    })
    protected List<Object> configItemOrConfigItemSetOrConfigItemMapNamed;

    /**
     * Gets the value of the configItemOrConfigItemSetOrConfigItemMapNamed property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the configItemOrConfigItemSetOrConfigItemMapNamed property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getConfigItemOrConfigItemSetOrConfigItemMapNamed().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ConfigItem }
     * {@link ConfigItemSet }
     * {@link ConfigItemMapNamed }
     * {@link ConfigItemMapIndexed }
     * 
     * 
     */
    public List<Object> getConfigItemOrConfigItemSetOrConfigItemMapNamed() {
        if (configItemOrConfigItemSetOrConfigItemMapNamed == null) {
            configItemOrConfigItemSetOrConfigItemMapNamed = new ArrayList<Object>();
        }
        return this.configItemOrConfigItemSetOrConfigItemMapNamed;
    }

}
