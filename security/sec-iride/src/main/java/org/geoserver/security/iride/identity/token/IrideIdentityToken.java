package org.geoserver.security.iride.identity.token;

/**
 * <code>IRIDE</code> Digital Identity tokens.<p>
 * For each token the following bits of information are given:
 * <ul>
 *   <li>its position in an <code>IRIDE</code> Digital Identity string representation</li>
 *   <li>the name of the corresponding property in an <code>IRIDE</code> Digital Identity object</li>
 *   <li>a simple description</li>
 * </ul>
 *
 * @author "Simone Cornacchia - seancrow76@gmail.com, simone.cornacchia@consulenti.csi.it (CSI:71740)"
 */
public enum IrideIdentityToken {

    /**
     * 'Codice Fiscale' <code>IRIDE</code> Digital Identity 1st token.
     */
    CODICE_FISCALE(0, "codFiscale", "Codice Fiscale"),

    /**
     * 'Nome' <code>IRIDE</code> Digital Identity 2nd token.
     */
    NOME(1, "nome", "Nome"),

    /**
     * 'Cognome' <code>IRIDE</code> Digital Identity 3rd token.
     */
    COGNOME(2, "cognome", "Cognome"),

    /**
     * 'IdProvider' <code>IRIDE</code> Digital Identity 4th token.
     */
    ID_PROVIDER(3, "idProvider", "IdProvider"),

    /**
     * 'Timestamp' <code>IRIDE</code> Digital Identity 5th token.
     */
    TIMESTAMP(4, "timestamp", "Timestamp"),

    /**
     * 'Livello Autenticazione' <code>IRIDE</code> Digital Identity 6th token.
     */
    LIVELLO_AUTENTICAZIONE(5, "livelloAutenticazione", "Livello Autenticazione"),

    /**
     * 'MAC' <code>IRIDE</code> Digital Identity 7th token.
     */
    MAC(6, "mac", "MAC"),
    ;

    /**
     * <code>IRIDE</code> Digital Identity token position.
     */
    private int position;

    /**
     * <code>IRIDE</code> Digital Identity token name.
     */
    private String property;

    /**
     * <code>IRIDE</code> Digital Identity token description.
     */
    private String description;

    /**
     * Constructor.
     *
     * @param position <code>IRIDE</code> Digital Identity token position
     * @param property <code>IRIDE</code> Digital Identity token name
     * @param description <code>IRIDE</code> Digital Identity token description
     */
    private IrideIdentityToken(int position, String property, String description) {
        this.position    = position;
        this.property    = property;
        this.description = description;
    }

    /**
     * Returns the <code>IRIDE</code> Digital Identity token position.
     *
     * @return the <code>IRIDE</code> Digital Identity token position
     */
    public int getPosition() {
        return this.position;
    }

    /**
     * Returns the <code>IRIDE</code> Digital Identity token name.
     *
     * @return the <code>IRIDE</code> Digital Identity token name
     */
    public String getName() {
        return this.property;
    }

    /**
     * Returns <code>IRIDE</code> Digital Identity token description.
     *
     * @return the <code>IRIDE</code> Digital Identity token description
     */
    public String getDescription() {
        return this.description;
    }

    /*
     * (non-Javadoc)
     * @see java.lang.Enum#toString()
     */
    @Override
    public String toString() {
        return String.format("'%s' token, at position %d, for property %s", this.description, this.position, this.property);
    }

}
