
package org.eclipse.daanse.odf.xml.presentation;

import java.util.ArrayList;
import java.util.List;
import javax.xml.datatype.Duration;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
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
 *         &lt;element ref="{urn:oasis:names:tc:opendocument:xmlns:presentation:1.0}show" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attGroup ref="{urn:oasis:names:tc:opendocument:xmlns:text:1.0}presentation-settings-attlist"/&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "show"
})
@XmlRootElement(name = "settings")
public class Settings {

    protected List<Show> show;
    @XmlAttribute(name = "start-page", namespace = "urn:oasis:names:tc:opendocument:xmlns:presentation:1.0")
    protected String startPage;
    @XmlAttribute(name = "show", namespace = "urn:oasis:names:tc:opendocument:xmlns:presentation:1.0")
    protected String showAttribute;
    @XmlAttribute(name = "full-screen", namespace = "urn:oasis:names:tc:opendocument:xmlns:presentation:1.0")
    protected Boolean fullScreen;
    @XmlAttribute(name = "endless", namespace = "urn:oasis:names:tc:opendocument:xmlns:presentation:1.0")
    protected Boolean endless;
    @XmlAttribute(name = "pause", namespace = "urn:oasis:names:tc:opendocument:xmlns:presentation:1.0")
    protected Duration pause;
    @XmlAttribute(name = "show-logo", namespace = "urn:oasis:names:tc:opendocument:xmlns:presentation:1.0")
    protected Boolean showLogo;
    @XmlAttribute(name = "force-manual", namespace = "urn:oasis:names:tc:opendocument:xmlns:presentation:1.0")
    protected Boolean forceManual;
    @XmlAttribute(name = "mouse-visible", namespace = "urn:oasis:names:tc:opendocument:xmlns:presentation:1.0")
    protected Boolean mouseVisible;
    @XmlAttribute(name = "mouse-as-pen", namespace = "urn:oasis:names:tc:opendocument:xmlns:presentation:1.0")
    protected Boolean mouseAsPen;
    @XmlAttribute(name = "start-with-navigator", namespace = "urn:oasis:names:tc:opendocument:xmlns:presentation:1.0")
    protected Boolean startWithNavigator;
    @XmlAttribute(name = "animations", namespace = "urn:oasis:names:tc:opendocument:xmlns:presentation:1.0")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String animations;
    @XmlAttribute(name = "transition-on-click", namespace = "urn:oasis:names:tc:opendocument:xmlns:presentation:1.0")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String transitionOnClick;
    @XmlAttribute(name = "stay-on-top", namespace = "urn:oasis:names:tc:opendocument:xmlns:presentation:1.0")
    protected Boolean stayOnTop;
    @XmlAttribute(name = "show-end-of-presentation-slide", namespace = "urn:oasis:names:tc:opendocument:xmlns:presentation:1.0")
    protected Boolean showEndOfPresentationSlide;

    /**
     * Gets the value of the show property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the show property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getShow().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Show }
     * 
     * 
     */
    public List<Show> getShow() {
        if (show == null) {
            show = new ArrayList<Show>();
        }
        return this.show;
    }

    /**
     * Gets the value of the startPage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStartPage() {
        return startPage;
    }

    /**
     * Sets the value of the startPage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStartPage(String value) {
        this.startPage = value;
    }

    /**
     * Gets the value of the showAttribute property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShowAttribute() {
        return showAttribute;
    }

    /**
     * Sets the value of the showAttribute property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShowAttribute(String value) {
        this.showAttribute = value;
    }

    /**
     * Gets the value of the fullScreen property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getFullScreen() {
        return fullScreen;
    }

    /**
     * Sets the value of the fullScreen property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFullScreen(Boolean value) {
        this.fullScreen = value;
    }

    /**
     * Gets the value of the endless property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getEndless() {
        return endless;
    }

    /**
     * Sets the value of the endless property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEndless(Boolean value) {
        this.endless = value;
    }

    /**
     * Gets the value of the pause property.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getPause() {
        return pause;
    }

    /**
     * Sets the value of the pause property.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setPause(Duration value) {
        this.pause = value;
    }

    /**
     * Gets the value of the showLogo property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getShowLogo() {
        return showLogo;
    }

    /**
     * Sets the value of the showLogo property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setShowLogo(Boolean value) {
        this.showLogo = value;
    }

    /**
     * Gets the value of the forceManual property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getForceManual() {
        return forceManual;
    }

    /**
     * Sets the value of the forceManual property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setForceManual(Boolean value) {
        this.forceManual = value;
    }

    /**
     * Gets the value of the mouseVisible property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getMouseVisible() {
        return mouseVisible;
    }

    /**
     * Sets the value of the mouseVisible property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMouseVisible(Boolean value) {
        this.mouseVisible = value;
    }

    /**
     * Gets the value of the mouseAsPen property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getMouseAsPen() {
        return mouseAsPen;
    }

    /**
     * Sets the value of the mouseAsPen property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMouseAsPen(Boolean value) {
        this.mouseAsPen = value;
    }

    /**
     * Gets the value of the startWithNavigator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getStartWithNavigator() {
        return startWithNavigator;
    }

    /**
     * Sets the value of the startWithNavigator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setStartWithNavigator(Boolean value) {
        this.startWithNavigator = value;
    }

    /**
     * Gets the value of the animations property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAnimations() {
        return animations;
    }

    /**
     * Sets the value of the animations property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAnimations(String value) {
        this.animations = value;
    }

    /**
     * Gets the value of the transitionOnClick property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransitionOnClick() {
        return transitionOnClick;
    }

    /**
     * Sets the value of the transitionOnClick property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransitionOnClick(String value) {
        this.transitionOnClick = value;
    }

    /**
     * Gets the value of the stayOnTop property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getStayOnTop() {
        return stayOnTop;
    }

    /**
     * Sets the value of the stayOnTop property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setStayOnTop(Boolean value) {
        this.stayOnTop = value;
    }

    /**
     * Gets the value of the showEndOfPresentationSlide property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getShowEndOfPresentationSlide() {
        return showEndOfPresentationSlide;
    }

    /**
     * Sets the value of the showEndOfPresentationSlide property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setShowEndOfPresentationSlide(Boolean value) {
        this.showEndOfPresentationSlide = value;
    }

}
