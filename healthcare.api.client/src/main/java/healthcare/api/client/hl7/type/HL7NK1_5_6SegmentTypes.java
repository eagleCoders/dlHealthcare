/**
 * 
 */
package healthcare.api.client.hl7.type;

/**
 * @author anees-ur-rehman
 *
 */
public enum HL7NK1_5_6SegmentTypes {
	
	PHONE_NUMBER("XTN.1");
	
	private String value;
	
	private HL7NK1_5_6SegmentTypes(String value){
		this.value = value;
	}
	
	public String getValue(){
		return this.value;
	}
}
