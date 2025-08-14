
package org.eclipse.daanse.odf.xml.form;

import java.util.ArrayList;
import java.util.List;
import javax.xml.namespace.QName;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlElementRefs;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.eclipse.daanse.odf.xml.office.EventListeners;
import org.eclipse.daanse.odf.xml.text.Boolean;
import org.eclipse.daanse.odf.xml.text.Navigation;
import org.eclipse.daanse.odf.xml.text.TabCycles;


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
 *         &lt;element ref="{urn:oasis:names:tc:opendocument:xmlns:form:1.0}properties" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:tc:opendocument:xmlns:office:1.0}event-listeners" minOccurs="0"/&gt;
 *         &lt;choice maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;element ref="{urn:oasis:names:tc:opendocument:xmlns:text:1.0}controls"/&gt;
 *           &lt;element ref="{urn:oasis:names:tc:opendocument:xmlns:form:1.0}form"/&gt;
 *         &lt;/choice&gt;
 *         &lt;element ref="{urn:oasis:names:tc:opendocument:xmlns:form:1.0}connection-resource" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attGroup ref="{urn:oasis:names:tc:opendocument:xmlns:text:1.0}common-form-control-attlist"/&gt;
 *       &lt;attGroup ref="{urn:oasis:names:tc:opendocument:xmlns:text:1.0}form-form-attlist"/&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "properties",
    "eventListeners",
    "controlsOrForm",
    "connectionResource"
})
@XmlRootElement(name = "form")
public class Form {

    protected Properties properties;
    @XmlElement(name = "event-listeners", namespace = "urn:oasis:names:tc:opendocument:xmlns:office:1.0")
    protected EventListeners eventListeners;
    @XmlElementRefs({
        @XmlElementRef(name = "controls", namespace = "urn:oasis:names:tc:opendocument:xmlns:text:1.0", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "form", namespace = "urn:oasis:names:tc:opendocument:xmlns:form:1.0", type = Form.class, required = false)
    })
    protected List<Object> controlsOrForm;
    @XmlElement(name = "connection-resource")
    protected ConnectionResource connectionResource;
    @XmlAttribute(name = "name", namespace = "urn:oasis:names:tc:opendocument:xmlns:form:1.0")
    protected String name;
    @XmlAttribute(name = "control-implementation", namespace = "urn:oasis:names:tc:opendocument:xmlns:form:1.0")
    protected QName controlImplementation;
    @XmlAttribute(name = "type", namespace = "http://www.w3.org/1999/xlink")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String type;
    @XmlAttribute(name = "href", namespace = "http://www.w3.org/1999/xlink")
    protected String href;
    @XmlAttribute(name = "target-frame", namespace = "urn:oasis:names:tc:opendocument:xmlns:office:1.0")
    protected String targetFrame;
    @XmlAttribute(name = "method", namespace = "urn:oasis:names:tc:opendocument:xmlns:form:1.0")
    protected String method;
    @XmlAttribute(name = "enctype", namespace = "urn:oasis:names:tc:opendocument:xmlns:form:1.0")
    protected String enctype;
    @XmlAttribute(name = "allow-deletes", namespace = "urn:oasis:names:tc:opendocument:xmlns:form:1.0")
    protected Boolean allowDeletes;
    @XmlAttribute(name = "allow-inserts", namespace = "urn:oasis:names:tc:opendocument:xmlns:form:1.0")
    protected Boolean allowInserts;
    @XmlAttribute(name = "allow-updates", namespace = "urn:oasis:names:tc:opendocument:xmlns:form:1.0")
    protected Boolean allowUpdates;
    @XmlAttribute(name = "apply-filter", namespace = "urn:oasis:names:tc:opendocument:xmlns:form:1.0")
    protected Boolean applyFilter;
    @XmlAttribute(name = "command-type", namespace = "urn:oasis:names:tc:opendocument:xmlns:form:1.0")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String commandType;
    @XmlAttribute(name = "command", namespace = "urn:oasis:names:tc:opendocument:xmlns:form:1.0")
    protected String command;
    @XmlAttribute(name = "datasource", namespace = "urn:oasis:names:tc:opendocument:xmlns:form:1.0")
    protected String datasource;
    @XmlAttribute(name = "master-fields", namespace = "urn:oasis:names:tc:opendocument:xmlns:form:1.0")
    protected String masterFields;
    @XmlAttribute(name = "detail-fields", namespace = "urn:oasis:names:tc:opendocument:xmlns:form:1.0")
    protected String detailFields;
    @XmlAttribute(name = "escape-processing", namespace = "urn:oasis:names:tc:opendocument:xmlns:form:1.0")
    protected Boolean escapeProcessing;
    @XmlAttribute(name = "filter", namespace = "urn:oasis:names:tc:opendocument:xmlns:form:1.0")
    protected String filter;
    @XmlAttribute(name = "ignore-result", namespace = "urn:oasis:names:tc:opendocument:xmlns:form:1.0")
    protected Boolean ignoreResult;
    @XmlAttribute(name = "navigation-mode", namespace = "urn:oasis:names:tc:opendocument:xmlns:form:1.0")
    protected Navigation navigationMode;
    @XmlAttribute(name = "order", namespace = "urn:oasis:names:tc:opendocument:xmlns:form:1.0")
    protected String order;
    @XmlAttribute(name = "tab-cycle", namespace = "urn:oasis:names:tc:opendocument:xmlns:form:1.0")
    protected TabCycles tabCycle;
    @XmlAttribute(name = "actuate", namespace = "http://www.w3.org/1999/xlink", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String actuate;

    /**
     * Gets the value of the properties property.
     * 
     * @return
     *     possible object is
     *     {@link Properties }
     *     
     */
    public Properties getProperties() {
        return properties;
    }

    /**
     * Sets the value of the properties property.
     * 
     * @param value
     *     allowed object is
     *     {@link Properties }
     *     
     */
    public void setProperties(Properties value) {
        this.properties = value;
    }

    /**
     * Gets the value of the eventListeners property.
     * 
     * @return
     *     possible object is
     *     {@link EventListeners }
     *     
     */
    public EventListeners getEventListeners() {
        return eventListeners;
    }

    /**
     * Sets the value of the eventListeners property.
     * 
     * @param value
     *     allowed object is
     *     {@link EventListeners }
     *     
     */
    public void setEventListeners(EventListeners value) {
        this.eventListeners = value;
    }

    /**
     * Gets the value of the controlsOrForm property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the controlsOrForm property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getControlsOrForm().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link FixedText }{@code >}
     * {@link JAXBElement }{@code <}{@link Button }{@code >}
     * {@link JAXBElement }{@code <}{@link FormattedText }{@code >}
     * {@link JAXBElement }{@code <}{@link Checkbox }{@code >}
     * {@link JAXBElement }{@code <}{@link Textarea }{@code >}
     * {@link JAXBElement }{@code <}{@link Number }{@code >}
     * {@link JAXBElement }{@code <}{@link Time }{@code >}
     * {@link JAXBElement }{@code <}{@link Text }{@code >}
     * {@link JAXBElement }{@code <}{@link Listbox }{@code >}
     * {@link JAXBElement }{@code <}{@link Combobox }{@code >}
     * {@link JAXBElement }{@code <}{@link Date }{@code >}
     * {@link JAXBElement }{@code <}{@link Object }{@code >}
     * {@link JAXBElement }{@code <}{@link Password }{@code >}
     * {@link JAXBElement }{@code <}{@link Frame }{@code >}
     * {@link JAXBElement }{@code <}{@link Grid }{@code >}
     * {@link JAXBElement }{@code <}{@link Image }{@code >}
     * {@link JAXBElement }{@code <}{@link GenericControl }{@code >}
     * {@link JAXBElement }{@code <}{@link ImageFrame }{@code >}
     * {@link JAXBElement }{@code <}{@link ValueRange }{@code >}
     * {@link JAXBElement }{@code <}{@link Hidden }{@code >}
     * {@link JAXBElement }{@code <}{@link Radio }{@code >}
     * {@link JAXBElement }{@code <}{@link File }{@code >}
     * {@link JAXBElement }{@code <}{@link Object }{@code >}
     * {@link Form }
     * 
     * 
     */
    public List<Object> getControlsOrForm() {
        if (controlsOrForm == null) {
            controlsOrForm = new ArrayList<Object>();
        }
        return this.controlsOrForm;
    }

    /**
     * Gets the value of the connectionResource property.
     * 
     * @return
     *     possible object is
     *     {@link ConnectionResource }
     *     
     */
    public ConnectionResource getConnectionResource() {
        return connectionResource;
    }

    /**
     * Sets the value of the connectionResource property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConnectionResource }
     *     
     */
    public void setConnectionResource(ConnectionResource value) {
        this.connectionResource = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the controlImplementation property.
     * 
     * @return
     *     possible object is
     *     {@link QName }
     *     
     */
    public QName getControlImplementation() {
        return controlImplementation;
    }

    /**
     * Sets the value of the controlImplementation property.
     * 
     * @param value
     *     allowed object is
     *     {@link QName }
     *     
     */
    public void setControlImplementation(QName value) {
        this.controlImplementation = value;
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
     * Gets the value of the href property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHref() {
        return href;
    }

    /**
     * Sets the value of the href property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHref(String value) {
        this.href = value;
    }

    /**
     * Gets the value of the targetFrame property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTargetFrame() {
        return targetFrame;
    }

    /**
     * Sets the value of the targetFrame property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTargetFrame(String value) {
        this.targetFrame = value;
    }

    /**
     * Gets the value of the method property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMethod() {
        return method;
    }

    /**
     * Sets the value of the method property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMethod(String value) {
        this.method = value;
    }

    /**
     * Gets the value of the enctype property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEnctype() {
        return enctype;
    }

    /**
     * Sets the value of the enctype property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEnctype(String value) {
        this.enctype = value;
    }

    /**
     * Gets the value of the allowDeletes property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getAllowDeletes() {
        return allowDeletes;
    }

    /**
     * Sets the value of the allowDeletes property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAllowDeletes(Boolean value) {
        this.allowDeletes = value;
    }

    /**
     * Gets the value of the allowInserts property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getAllowInserts() {
        return allowInserts;
    }

    /**
     * Sets the value of the allowInserts property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAllowInserts(Boolean value) {
        this.allowInserts = value;
    }

    /**
     * Gets the value of the allowUpdates property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getAllowUpdates() {
        return allowUpdates;
    }

    /**
     * Sets the value of the allowUpdates property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAllowUpdates(Boolean value) {
        this.allowUpdates = value;
    }

    /**
     * Gets the value of the applyFilter property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getApplyFilter() {
        return applyFilter;
    }

    /**
     * Sets the value of the applyFilter property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setApplyFilter(Boolean value) {
        this.applyFilter = value;
    }

    /**
     * Gets the value of the commandType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCommandType() {
        return commandType;
    }

    /**
     * Sets the value of the commandType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCommandType(String value) {
        this.commandType = value;
    }

    /**
     * Gets the value of the command property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCommand() {
        return command;
    }

    /**
     * Sets the value of the command property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCommand(String value) {
        this.command = value;
    }

    /**
     * Gets the value of the datasource property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDatasource() {
        return datasource;
    }

    /**
     * Sets the value of the datasource property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDatasource(String value) {
        this.datasource = value;
    }

    /**
     * Gets the value of the masterFields property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMasterFields() {
        return masterFields;
    }

    /**
     * Sets the value of the masterFields property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMasterFields(String value) {
        this.masterFields = value;
    }

    /**
     * Gets the value of the detailFields property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDetailFields() {
        return detailFields;
    }

    /**
     * Sets the value of the detailFields property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDetailFields(String value) {
        this.detailFields = value;
    }

    /**
     * Gets the value of the escapeProcessing property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getEscapeProcessing() {
        return escapeProcessing;
    }

    /**
     * Sets the value of the escapeProcessing property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEscapeProcessing(Boolean value) {
        this.escapeProcessing = value;
    }

    /**
     * Gets the value of the filter property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFilter() {
        return filter;
    }

    /**
     * Sets the value of the filter property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFilter(String value) {
        this.filter = value;
    }

    /**
     * Gets the value of the ignoreResult property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getIgnoreResult() {
        return ignoreResult;
    }

    /**
     * Sets the value of the ignoreResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIgnoreResult(Boolean value) {
        this.ignoreResult = value;
    }

    /**
     * Gets the value of the navigationMode property.
     * 
     * @return
     *     possible object is
     *     {@link Navigation }
     *     
     */
    public Navigation getNavigationMode() {
        return navigationMode;
    }

    /**
     * Sets the value of the navigationMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link Navigation }
     *     
     */
    public void setNavigationMode(Navigation value) {
        this.navigationMode = value;
    }

    /**
     * Gets the value of the order property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrder() {
        return order;
    }

    /**
     * Sets the value of the order property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrder(String value) {
        this.order = value;
    }

    /**
     * Gets the value of the tabCycle property.
     * 
     * @return
     *     possible object is
     *     {@link TabCycles }
     *     
     */
    public TabCycles getTabCycle() {
        return tabCycle;
    }

    /**
     * Sets the value of the tabCycle property.
     * 
     * @param value
     *     allowed object is
     *     {@link TabCycles }
     *     
     */
    public void setTabCycle(TabCycles value) {
        this.tabCycle = value;
    }

    /**
     * Gets the value of the actuate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActuate() {
        return actuate;
    }

    /**
     * Sets the value of the actuate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActuate(String value) {
        this.actuate = value;
    }

}
