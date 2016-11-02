/**
 * 
 */
package healthcare.api.client.hl7.type;

/**
 * @author anees-ur-rehman
 *
 */
public enum HL7PID13_14SegmentTypes {
	COMPLETE_PHONE("XTN.1");
	
	private String value;
	
	private HL7PID13_14SegmentTypes(String value){
		this.value = value;
	}
	
	public String getValue(){
		return this.value;
	}
}
