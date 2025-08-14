
package org.eclipse.daanse.odf.xml.db;

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
 *       &lt;choice&gt;
 *         &lt;element ref="{urn:oasis:names:tc:opendocument:xmlns:database:1.0}file-based-database"/&gt;
 *         &lt;element ref="{urn:oasis:names:tc:opendocument:xmlns:database:1.0}server-database"/&gt;
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
    "fileBasedDatabase",
    "serverDatabase"
})
@XmlRootElement(name = "database-description")
public class DatabaseDescription {

    @XmlElement(name = "file-based-database")
    protected FileBasedDatabase fileBasedDatabase;
    @XmlElement(name = "server-database")
    protected ServerDatabase serverDatabase;

    /**
     * Gets the value of the fileBasedDatabase property.
     * 
     * @return
     *     possible object is
     *     {@link FileBasedDatabase }
     *     
     */
    public FileBasedDatabase getFileBasedDatabase() {
        return fileBasedDatabase;
    }

    /**
     * Sets the value of the fileBasedDatabase property.
     * 
     * @param value
     *     allowed object is
     *     {@link FileBasedDatabase }
     *     
     */
    public void setFileBasedDatabase(FileBasedDatabase value) {
        this.fileBasedDatabase = value;
    }

    /**
     * Gets the value of the serverDatabase property.
     * 
     * @return
     *     possible object is
     *     {@link ServerDatabase }
     *     
     */
    public ServerDatabase getServerDatabase() {
        return serverDatabase;
    }

    /**
     * Sets the value of the serverDatabase property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServerDatabase }
     *     
     */
    public void setServerDatabase(ServerDatabase value) {
        this.serverDatabase = value;
    }

}
