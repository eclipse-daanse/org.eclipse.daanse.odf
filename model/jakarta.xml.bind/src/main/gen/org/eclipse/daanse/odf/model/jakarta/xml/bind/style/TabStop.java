
package org.eclipse.daanse.odf.model.jakarta.xml.bind.style;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.eclipse.daanse.odf.model.jakarta.xml.bind.text.LineStyle;
import org.eclipse.daanse.odf.model.jakarta.xml.bind.text.LineType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attGroup ref="{urn:oasis:names:tc:opendocument:xmlns:text:1.0}style-tab-stop-attlist"/&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "tab-stop")
public class TabStop {

    @XmlAttribute(name = "char", namespace = "urn:oasis:names:tc:opendocument:xmlns:style:1.0")
    protected String _char;
    @XmlAttribute(name = "leader-type", namespace = "urn:oasis:names:tc:opendocument:xmlns:style:1.0")
    protected LineType leaderType;
    @XmlAttribute(name = "leader-style", namespace = "urn:oasis:names:tc:opendocument:xmlns:style:1.0")
    protected LineStyle leaderStyle;
    @XmlAttribute(name = "leader-width", namespace = "urn:oasis:names:tc:opendocument:xmlns:style:1.0")
    protected String leaderWidth;
    @XmlAttribute(name = "leader-color", namespace = "urn:oasis:names:tc:opendocument:xmlns:style:1.0")
    protected String leaderColor;
    @XmlAttribute(name = "leader-text", namespace = "urn:oasis:names:tc:opendocument:xmlns:style:1.0")
    protected String leaderText;
    @XmlAttribute(name = "leader-text-style", namespace = "urn:oasis:names:tc:opendocument:xmlns:style:1.0")
    protected String leaderTextStyle;
    @XmlAttribute(name = "type", namespace = "urn:oasis:names:tc:opendocument:xmlns:style:1.0", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String type;
    @XmlAttribute(name = "position", namespace = "urn:oasis:names:tc:opendocument:xmlns:style:1.0", required = true)
    protected String position;

    /**
     * Gets the value of the char property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChar() {
        return _char;
    }

    /**
     * Sets the value of the char property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChar(String value) {
        this._char = value;
    }

    /**
     * Gets the value of the leaderType property.
     * 
     * @return
     *     possible object is
     *     {@link LineType }
     *     
     */
    public LineType getLeaderType() {
        return leaderType;
    }

    /**
     * Sets the value of the leaderType property.
     * 
     * @param value
     *     allowed object is
     *     {@link LineType }
     *     
     */
    public void setLeaderType(LineType value) {
        this.leaderType = value;
    }

    /**
     * Gets the value of the leaderStyle property.
     * 
     * @return
     *     possible object is
     *     {@link LineStyle }
     *     
     */
    public LineStyle getLeaderStyle() {
        return leaderStyle;
    }

    /**
     * Sets the value of the leaderStyle property.
     * 
     * @param value
     *     allowed object is
     *     {@link LineStyle }
     *     
     */
    public void setLeaderStyle(LineStyle value) {
        this.leaderStyle = value;
    }

    /**
     * Gets the value of the leaderWidth property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLeaderWidth() {
        return leaderWidth;
    }

    /**
     * Sets the value of the leaderWidth property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLeaderWidth(String value) {
        this.leaderWidth = value;
    }

    /**
     * Gets the value of the leaderColor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLeaderColor() {
        return leaderColor;
    }

    /**
     * Sets the value of the leaderColor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLeaderColor(String value) {
        this.leaderColor = value;
    }

    /**
     * Gets the value of the leaderText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLeaderText() {
        return leaderText;
    }

    /**
     * Sets the value of the leaderText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLeaderText(String value) {
        this.leaderText = value;
    }

    /**
     * Gets the value of the leaderTextStyle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLeaderTextStyle() {
        return leaderTextStyle;
    }

    /**
     * Sets the value of the leaderTextStyle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLeaderTextStyle(String value) {
        this.leaderTextStyle = value;
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
     * Gets the value of the position property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPosition() {
        return position;
    }

    /**
     * Sets the value of the position property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPosition(String value) {
        this.position = value;
    }

}
