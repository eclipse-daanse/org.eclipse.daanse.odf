
package org.eclipse.daanse.odf.xml.manifest;

import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.eclipse.daanse.odf.xml.manifest package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.eclipse.daanse.odf.xml.manifest
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Manifest }
     * 
     */
    public Manifest createManifest() {
        return new Manifest();
    }

    /**
     * Create an instance of {@link FileEntry }
     * 
     */
    public FileEntry createFileEntry() {
        return new FileEntry();
    }

    /**
     * Create an instance of {@link EncryptionData }
     * 
     */
    public EncryptionData createEncryptionData() {
        return new EncryptionData();
    }

    /**
     * Create an instance of {@link Algorithm }
     * 
     */
    public Algorithm createAlgorithm() {
        return new Algorithm();
    }

    /**
     * Create an instance of {@link StartKeyGeneration }
     * 
     */
    public StartKeyGeneration createStartKeyGeneration() {
        return new StartKeyGeneration();
    }

    /**
     * Create an instance of {@link KeyDerivation }
     * 
     */
    public KeyDerivation createKeyDerivation() {
        return new KeyDerivation();
    }

}
