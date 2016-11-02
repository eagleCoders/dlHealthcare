/**
 * 
 */
package healthcare.api.client.hl7.type;

/**
 * @author anees-ur-rehman
 *
 */
public enum HL7NK1SegmentTypes {

	NXT_TO_KIN_ID("NK1.1"), NAME_LIST("NK1.2"), RELATION_TYPE_LIST("NK1.3"), NXT_TO_KID_ADDRESS_LIST("NK1.4"), PERSONAL_PHONE_NUMBER_LIST("NK1.5"),
	BUSINESS_PHONE_NUMBER_LIST("NK1.6");
	
	private String value;
	
	private HL7NK1SegmentTypes(String value){
		this.value = value;
	}
	
	public String getValue(){
		return this.value;
	}
}
