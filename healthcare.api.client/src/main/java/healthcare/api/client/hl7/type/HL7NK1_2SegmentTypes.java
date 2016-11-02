/**
 * 
 */
package healthcare.api.client.hl7.type;

/**
 * @author anees-ur-rehman
 *
 */
public enum HL7NK1_2SegmentTypes {
	
	FAMILY_NAME("XPN.1"), GIVEN_NAME("XPN.2");
	
	private String value;
	
	private HL7NK1_2SegmentTypes(String value){
		this.value = value;
	}
	
	public String getValue(){
		return this.value;
	}

}
