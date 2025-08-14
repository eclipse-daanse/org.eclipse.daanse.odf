
package org.eclipse.daanse.odf.xml.db;

import javax.xml.namespace.QName;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;
import org.eclipse.daanse.odf.xml.text.DbTableDefinitions;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.eclipse.daanse.odf.xml.db package. 
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

    private final static QName _TableFilterPattern_QNAME = new QName("urn:oasis:names:tc:opendocument:xmlns:database:1.0", "table-filter-pattern");
    private final static QName _TableType_QNAME = new QName("urn:oasis:names:tc:opendocument:xmlns:database:1.0", "table-type");
    private final static QName _DataSourceSettingValue_QNAME = new QName("urn:oasis:names:tc:opendocument:xmlns:database:1.0", "data-source-setting-value");
    private final static QName _SchemaDefinition_QNAME = new QName("urn:oasis:names:tc:opendocument:xmlns:database:1.0", "schema-definition");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.eclipse.daanse.odf.xml.db
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ApplicationConnectionSettings }
     * 
     */
    public ApplicationConnectionSettings createApplicationConnectionSettings() {
        return new ApplicationConnectionSettings();
    }

    /**
     * Create an instance of {@link TableFilter }
     * 
     */
    public TableFilter createTableFilter() {
        return new TableFilter();
    }

    /**
     * Create an instance of {@link TableIncludeFilter }
     * 
     */
    public TableIncludeFilter createTableIncludeFilter() {
        return new TableIncludeFilter();
    }

    /**
     * Create an instance of {@link TableExcludeFilter }
     * 
     */
    public TableExcludeFilter createTableExcludeFilter() {
        return new TableExcludeFilter();
    }

    /**
     * Create an instance of {@link TableTypeFilter }
     * 
     */
    public TableTypeFilter createTableTypeFilter() {
        return new TableTypeFilter();
    }

    /**
     * Create an instance of {@link DataSourceSettings }
     * 
     */
    public DataSourceSettings createDataSourceSettings() {
        return new DataSourceSettings();
    }

    /**
     * Create an instance of {@link DataSourceSetting }
     * 
     */
    public DataSourceSetting createDataSourceSetting() {
        return new DataSourceSetting();
    }

    /**
     * Create an instance of {@link AutoIncrement }
     * 
     */
    public AutoIncrement createAutoIncrement() {
        return new AutoIncrement();
    }

    /**
     * Create an instance of {@link CharacterSet }
     * 
     */
    public CharacterSet createCharacterSet() {
        return new CharacterSet();
    }

    /**
     * Create an instance of {@link Column }
     * 
     */
    public Column createColumn() {
        return new Column();
    }

    /**
     * Create an instance of {@link ColumnDefinition }
     * 
     */
    public ColumnDefinition createColumnDefinition() {
        return new ColumnDefinition();
    }

    /**
     * Create an instance of {@link ColumnDefinitions }
     * 
     */
    public ColumnDefinitions createColumnDefinitions() {
        return new ColumnDefinitions();
    }

    /**
     * Create an instance of {@link Columns }
     * 
     */
    public Columns createColumns() {
        return new Columns();
    }

    /**
     * Create an instance of {@link Component }
     * 
     */
    public Component createComponent() {
        return new Component();
    }

    /**
     * Create an instance of {@link ComponentCollection }
     * 
     */
    public ComponentCollection createComponentCollection() {
        return new ComponentCollection();
    }

    /**
     * Create an instance of {@link ConnectionData }
     * 
     */
    public ConnectionData createConnectionData() {
        return new ConnectionData();
    }

    /**
     * Create an instance of {@link DatabaseDescription }
     * 
     */
    public DatabaseDescription createDatabaseDescription() {
        return new DatabaseDescription();
    }

    /**
     * Create an instance of {@link FileBasedDatabase }
     * 
     */
    public FileBasedDatabase createFileBasedDatabase() {
        return new FileBasedDatabase();
    }

    /**
     * Create an instance of {@link ServerDatabase }
     * 
     */
    public ServerDatabase createServerDatabase() {
        return new ServerDatabase();
    }

    /**
     * Create an instance of {@link ConnectionResource }
     * 
     */
    public ConnectionResource createConnectionResource() {
        return new ConnectionResource();
    }

    /**
     * Create an instance of {@link Login }
     * 
     */
    public Login createLogin() {
        return new Login();
    }

    /**
     * Create an instance of {@link DataSource }
     * 
     */
    public DataSource createDataSource() {
        return new DataSource();
    }

    /**
     * Create an instance of {@link DriverSettings }
     * 
     */
    public DriverSettings createDriverSettings() {
        return new DriverSettings();
    }

    /**
     * Create an instance of {@link Delimiter }
     * 
     */
    public Delimiter createDelimiter() {
        return new Delimiter();
    }

    /**
     * Create an instance of {@link TableSettings }
     * 
     */
    public TableSettings createTableSettings() {
        return new TableSettings();
    }

    /**
     * Create an instance of {@link TableSetting }
     * 
     */
    public TableSetting createTableSetting() {
        return new TableSetting();
    }

    /**
     * Create an instance of {@link FilterStatement }
     * 
     */
    public FilterStatement createFilterStatement() {
        return new FilterStatement();
    }

    /**
     * Create an instance of {@link Forms }
     * 
     */
    public Forms createForms() {
        return new Forms();
    }

    /**
     * Create an instance of {@link Index }
     * 
     */
    public Index createIndex() {
        return new Index();
    }

    /**
     * Create an instance of {@link IndexColumns }
     * 
     */
    public IndexColumns createIndexColumns() {
        return new IndexColumns();
    }

    /**
     * Create an instance of {@link IndexColumn }
     * 
     */
    public IndexColumn createIndexColumn() {
        return new IndexColumn();
    }

    /**
     * Create an instance of {@link Indices }
     * 
     */
    public Indices createIndices() {
        return new Indices();
    }

    /**
     * Create an instance of {@link Key }
     * 
     */
    public Key createKey() {
        return new Key();
    }

    /**
     * Create an instance of {@link KeyColumns }
     * 
     */
    public KeyColumns createKeyColumns() {
        return new KeyColumns();
    }

    /**
     * Create an instance of {@link KeyColumn }
     * 
     */
    public KeyColumn createKeyColumn() {
        return new KeyColumn();
    }

    /**
     * Create an instance of {@link Keys }
     * 
     */
    public Keys createKeys() {
        return new Keys();
    }

    /**
     * Create an instance of {@link OrderStatement }
     * 
     */
    public OrderStatement createOrderStatement() {
        return new OrderStatement();
    }

    /**
     * Create an instance of {@link Queries }
     * 
     */
    public Queries createQueries() {
        return new Queries();
    }

    /**
     * Create an instance of {@link Query }
     * 
     */
    public Query createQuery() {
        return new Query();
    }

    /**
     * Create an instance of {@link UpdateTable }
     * 
     */
    public UpdateTable createUpdateTable() {
        return new UpdateTable();
    }

    /**
     * Create an instance of {@link QueryCollection }
     * 
     */
    public QueryCollection createQueryCollection() {
        return new QueryCollection();
    }

    /**
     * Create an instance of {@link Reports }
     * 
     */
    public Reports createReports() {
        return new Reports();
    }

    /**
     * Create an instance of {@link TableDefinition }
     * 
     */
    public TableDefinition createTableDefinition() {
        return new TableDefinition();
    }

    /**
     * Create an instance of {@link TableDefinitions }
     * 
     */
    public TableDefinitions createTableDefinitions() {
        return new TableDefinitions();
    }

    /**
     * Create an instance of {@link TableRepresentation }
     * 
     */
    public TableRepresentation createTableRepresentation() {
        return new TableRepresentation();
    }

    /**
     * Create an instance of {@link TableRepresentations }
     * 
     */
    public TableRepresentations createTableRepresentations() {
        return new TableRepresentations();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:tc:opendocument:xmlns:database:1.0", name = "table-filter-pattern")
    public JAXBElement<String> createTableFilterPattern(String value) {
        return new JAXBElement<String>(_TableFilterPattern_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:tc:opendocument:xmlns:database:1.0", name = "table-type")
    public JAXBElement<String> createTableType(String value) {
        return new JAXBElement<String>(_TableType_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:tc:opendocument:xmlns:database:1.0", name = "data-source-setting-value")
    public JAXBElement<String> createDataSourceSettingValue(String value) {
        return new JAXBElement<String>(_DataSourceSettingValue_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DbTableDefinitions }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DbTableDefinitions }{@code >}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:tc:opendocument:xmlns:database:1.0", name = "schema-definition")
    public JAXBElement<DbTableDefinitions> createSchemaDefinition(DbTableDefinitions value) {
        return new JAXBElement<DbTableDefinitions>(_SchemaDefinition_QNAME, DbTableDefinitions.class, null, value);
    }

}
