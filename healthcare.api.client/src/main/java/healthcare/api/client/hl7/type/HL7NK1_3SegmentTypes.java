/**
 * 
 */
package healthcare.api.client.hl7.type;

/**
 * @author anees-ur-rehman
 *
 */
public enum HL7NK1_3SegmentTypes {
	
	RELATION_TYPE_SPOUSE("<CE_0063.1>SPOUSE</CE_0063.1>"), RELATION_TYPE_SON("<CE_0063.1>SON</CE_0063.1>"),
	RELATION_TYPE_FATHER("<CE_0063.1>FATHER</CE_0063.1>"), RELATION_TYPE_MOTHER("<CE_0063.1>MOTHER</CE_0063.1>"),
	RELATION_TYPE_WIFE("<CE_0063.1>WIFE</CE_0063.1>"), RELATION_TYPE_OTHERS("<CE_0063.1>?</CE_0063.1>");
	
	private String value;
	
	private HL7NK1_3SegmentTypes(String value){
		this.value = value;
	}
	
	public String getValue(){
		return this.value;
	}

}
