
package org.eclipse.daanse.odf.model.jakarta.xml.bind.office;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlElements;
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
 *       &lt;choice maxOccurs="unbounded" minOccurs="0"&gt;
 *         &lt;element ref="{urn:oasis:names:tc:opendocument:xmlns:script:1.0}event-listener"/&gt;
 *         &lt;element ref="{urn:oasis:names:tc:opendocument:xmlns:presentation:1.0}event-listener"/&gt;
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
    "eventListenerOrEventListener"
})
@XmlRootElement(name = "event-listeners")
public class EventListeners {

    @XmlElements({
        @XmlElement(name = "event-listener", namespace = "urn:oasis:names:tc:opendocument:xmlns:script:1.0", type = org.eclipse.daanse.odf.model.jakarta.xml.bind.script.EventListener.class),
        @XmlElement(name = "event-listener", namespace = "urn:oasis:names:tc:opendocument:xmlns:presentation:1.0", type = org.eclipse.daanse.odf.model.jakarta.xml.bind.presentation.EventListener.class)
    })
    protected List<Object> eventListenerOrEventListener;

    /**
     * Gets the value of the eventListenerOrEventListener property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the eventListenerOrEventListener property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEventListenerOrEventListener().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link org.eclipse.daanse.odf.model.jakarta.xml.bind.script.EventListener }
     * {@link org.eclipse.daanse.odf.model.jakarta.xml.bind.presentation.EventListener }
     * 
     * 
     */
    public List<Object> getEventListenerOrEventListener() {
        if (eventListenerOrEventListener == null) {
            eventListenerOrEventListener = new ArrayList<Object>();
        }
        return this.eventListenerOrEventListener;
    }

}
