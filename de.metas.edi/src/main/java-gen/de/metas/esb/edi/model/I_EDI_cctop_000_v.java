package de.metas.esb.edi.model;


/** Generated Interface for EDI_cctop_000_v
 *  @author Adempiere (generated) 
 */
@SuppressWarnings("javadoc")
public interface I_EDI_cctop_000_v 
{

    /** TableName=EDI_cctop_000_v */
    public static final String Table_Name = "EDI_cctop_000_v";

    /** AD_Table_ID=540464 */
//    public static final int Table_ID = org.compiere.model.MTable.getTable_ID(Table_Name);

//    org.compiere.util.KeyNamePair Model = new org.compiere.util.KeyNamePair(Table_ID, Table_Name);

    /** AccessLevel = 3 - Client - Org
     */
//    java.math.BigDecimal accessLevel = java.math.BigDecimal.valueOf(3);

    /** Load Meta Data */

	/**
	 * Get Mandant.
	 * Mandant für diese Installation.
	 *
	 * <br>Type: TableDir
	 * <br>Mandatory: true
	 * <br>Virtual Column: false
	 */
	public int getAD_Client_ID();

	public org.compiere.model.I_AD_Client getAD_Client();

    /** Column definition for AD_Client_ID */
    public static final org.adempiere.model.ModelColumn<I_EDI_cctop_000_v, org.compiere.model.I_AD_Client> COLUMN_AD_Client_ID = new org.adempiere.model.ModelColumn<I_EDI_cctop_000_v, org.compiere.model.I_AD_Client>(I_EDI_cctop_000_v.class, "AD_Client_ID", org.compiere.model.I_AD_Client.class);
    /** Column name AD_Client_ID */
    public static final String COLUMNNAME_AD_Client_ID = "AD_Client_ID";

	/**
	 * Set Organisation.
	 * Organisatorische Einheit des Mandanten
	 *
	 * <br>Type: TableDir
	 * <br>Mandatory: true
	 * <br>Virtual Column: false
	 */
	public void setAD_Org_ID (int AD_Org_ID);

	/**
	 * Get Organisation.
	 * Organisatorische Einheit des Mandanten
	 *
	 * <br>Type: TableDir
	 * <br>Mandatory: true
	 * <br>Virtual Column: false
	 */
	public int getAD_Org_ID();

	public org.compiere.model.I_AD_Org getAD_Org();

	public void setAD_Org(org.compiere.model.I_AD_Org AD_Org);

    /** Column definition for AD_Org_ID */
    public static final org.adempiere.model.ModelColumn<I_EDI_cctop_000_v, org.compiere.model.I_AD_Org> COLUMN_AD_Org_ID = new org.adempiere.model.ModelColumn<I_EDI_cctop_000_v, org.compiere.model.I_AD_Org>(I_EDI_cctop_000_v.class, "AD_Org_ID", org.compiere.model.I_AD_Org.class);
    /** Column name AD_Org_ID */
    public static final String COLUMNNAME_AD_Org_ID = "AD_Org_ID";

	/**
	 * Set Rechnung.
	 * Invoice Identifier
	 *
	 * <br>Type: Search
	 * <br>Mandatory: false
	 * <br>Virtual Column: false
	 */
	public void setC_Invoice_ID (int C_Invoice_ID);

	/**
	 * Get Rechnung.
	 * Invoice Identifier
	 *
	 * <br>Type: Search
	 * <br>Mandatory: false
	 * <br>Virtual Column: false
	 */
	public int getC_Invoice_ID();

	public org.compiere.model.I_C_Invoice getC_Invoice();

	public void setC_Invoice(org.compiere.model.I_C_Invoice C_Invoice);

    /** Column definition for C_Invoice_ID */
    public static final org.adempiere.model.ModelColumn<I_EDI_cctop_000_v, org.compiere.model.I_C_Invoice> COLUMN_C_Invoice_ID = new org.adempiere.model.ModelColumn<I_EDI_cctop_000_v, org.compiere.model.I_C_Invoice>(I_EDI_cctop_000_v.class, "C_Invoice_ID", org.compiere.model.I_C_Invoice.class);
    /** Column name C_Invoice_ID */
    public static final String COLUMNNAME_C_Invoice_ID = "C_Invoice_ID";

	/**
	 * Get Erstellt.
	 * Datum, an dem dieser Eintrag erstellt wurde
	 *
	 * <br>Type: DateTime
	 * <br>Mandatory: true
	 * <br>Virtual Column: false
	 */
	public java.sql.Timestamp getCreated();

    /** Column definition for Created */
    public static final org.adempiere.model.ModelColumn<I_EDI_cctop_000_v, Object> COLUMN_Created = new org.adempiere.model.ModelColumn<I_EDI_cctop_000_v, Object>(I_EDI_cctop_000_v.class, "Created", null);
    /** Column name Created */
    public static final String COLUMNNAME_Created = "Created";

	/**
	 * Get Erstellt durch.
	 * Nutzer, der diesen Eintrag erstellt hat
	 *
	 * <br>Type: Table
	 * <br>Mandatory: true
	 * <br>Virtual Column: false
	 */
	public int getCreatedBy();

    /** Column definition for CreatedBy */
    public static final org.adempiere.model.ModelColumn<I_EDI_cctop_000_v, org.compiere.model.I_AD_User> COLUMN_CreatedBy = new org.adempiere.model.ModelColumn<I_EDI_cctop_000_v, org.compiere.model.I_AD_User>(I_EDI_cctop_000_v.class, "CreatedBy", org.compiere.model.I_AD_User.class);
    /** Column name CreatedBy */
    public static final String COLUMNNAME_CreatedBy = "CreatedBy";

	/**
	 * Set EDI_cctop_000_v.
	 *
	 * <br>Type: ID
	 * <br>Mandatory: false
	 * <br>Virtual Column: false
	 */
	public void setEDI_cctop_000_v_ID (int EDI_cctop_000_v_ID);

	/**
	 * Get EDI_cctop_000_v.
	 *
	 * <br>Type: ID
	 * <br>Mandatory: false
	 * <br>Virtual Column: false
	 */
	public int getEDI_cctop_000_v_ID();

    /** Column definition for EDI_cctop_000_v_ID */
    public static final org.adempiere.model.ModelColumn<I_EDI_cctop_000_v, Object> COLUMN_EDI_cctop_000_v_ID = new org.adempiere.model.ModelColumn<I_EDI_cctop_000_v, Object>(I_EDI_cctop_000_v.class, "EDI_cctop_000_v_ID", null);
    /** Column name EDI_cctop_000_v_ID */
    public static final String COLUMNNAME_EDI_cctop_000_v_ID = "EDI_cctop_000_v_ID";

	/**
	 * Set Empfänger-GLN.
	 * EDI-GLN des Empfängers
	 *
	 * <br>Type: String
	 * <br>Mandatory: false
	 * <br>Virtual Column: false
	 */
	public void setEdiReceiverIdentification (java.lang.String EdiReceiverIdentification);

	/**
	 * Get Empfänger-GLN.
	 * EDI-GLN des Empfängers
	 *
	 * <br>Type: String
	 * <br>Mandatory: false
	 * <br>Virtual Column: false
	 */
	public java.lang.String getEdiReceiverIdentification();

    /** Column definition for EdiReceiverIdentification */
    public static final org.adempiere.model.ModelColumn<I_EDI_cctop_000_v, Object> COLUMN_EdiReceiverIdentification = new org.adempiere.model.ModelColumn<I_EDI_cctop_000_v, Object>(I_EDI_cctop_000_v.class, "EdiReceiverIdentification", null);
    /** Column name EdiReceiverIdentification */
    public static final String COLUMNNAME_EdiReceiverIdentification = "EdiReceiverIdentification";

	/**
	 * Set Absender-GLN.
	 * EDI-GLN des Absenders
	 *
	 * <br>Type: String
	 * <br>Mandatory: false
	 * <br>Virtual Column: false
	 */
	public void setEdiSenderIdentification (java.lang.String EdiSenderIdentification);

	/**
	 * Get Absender-GLN.
	 * EDI-GLN des Absenders
	 *
	 * <br>Type: String
	 * <br>Mandatory: false
	 * <br>Virtual Column: false
	 */
	public java.lang.String getEdiSenderIdentification();

    /** Column definition for EdiSenderIdentification */
    public static final org.adempiere.model.ModelColumn<I_EDI_cctop_000_v, Object> COLUMN_EdiSenderIdentification = new org.adempiere.model.ModelColumn<I_EDI_cctop_000_v, Object>(I_EDI_cctop_000_v.class, "EdiSenderIdentification", null);
    /** Column name EdiSenderIdentification */
    public static final String COLUMNNAME_EdiSenderIdentification = "EdiSenderIdentification";

	/**
	 * Set Aktiv.
	 * Der Eintrag ist im System aktiv
	 *
	 * <br>Type: YesNo
	 * <br>Mandatory: true
	 * <br>Virtual Column: false
	 */
	public void setIsActive (boolean IsActive);

	/**
	 * Get Aktiv.
	 * Der Eintrag ist im System aktiv
	 *
	 * <br>Type: YesNo
	 * <br>Mandatory: true
	 * <br>Virtual Column: false
	 */
	public boolean isActive();

    /** Column definition for IsActive */
    public static final org.adempiere.model.ModelColumn<I_EDI_cctop_000_v, Object> COLUMN_IsActive = new org.adempiere.model.ModelColumn<I_EDI_cctop_000_v, Object>(I_EDI_cctop_000_v.class, "IsActive", null);
    /** Column name IsActive */
    public static final String COLUMNNAME_IsActive = "IsActive";

	/**
	 * Get Aktualisiert.
	 * Datum, an dem dieser Eintrag aktualisiert wurde
	 *
	 * <br>Type: DateTime
	 * <br>Mandatory: true
	 * <br>Virtual Column: false
	 */
	public java.sql.Timestamp getUpdated();

    /** Column definition for Updated */
    public static final org.adempiere.model.ModelColumn<I_EDI_cctop_000_v, Object> COLUMN_Updated = new org.adempiere.model.ModelColumn<I_EDI_cctop_000_v, Object>(I_EDI_cctop_000_v.class, "Updated", null);
    /** Column name Updated */
    public static final String COLUMNNAME_Updated = "Updated";

	/**
	 * Get Aktualisiert durch.
	 * Nutzer, der diesen Eintrag aktualisiert hat
	 *
	 * <br>Type: Table
	 * <br>Mandatory: true
	 * <br>Virtual Column: false
	 */
	public int getUpdatedBy();

    /** Column definition for UpdatedBy */
    public static final org.adempiere.model.ModelColumn<I_EDI_cctop_000_v, org.compiere.model.I_AD_User> COLUMN_UpdatedBy = new org.adempiere.model.ModelColumn<I_EDI_cctop_000_v, org.compiere.model.I_AD_User>(I_EDI_cctop_000_v.class, "UpdatedBy", org.compiere.model.I_AD_User.class);
    /** Column name UpdatedBy */
    public static final String COLUMNNAME_UpdatedBy = "UpdatedBy";
}
