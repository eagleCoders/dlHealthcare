/**
 * 
 */
package healthcare.api.client.hl7.type;

/**
 * @author anees-ur-rehman
 *
 */
public enum HL7PID3SegmentTypes {
	SEGMENT_ID("CX.1"), ASSIGNING_AUTHORITY("CX.4"), IDENTITY_CODE_TYPE("CX.5"), ASSIGINING_FACILITY("CX.6");
	
	
	private String value;
	
	private HL7PID3SegmentTypes(String value){
		this.value = value;
	}
	
	public String getValue(){
		return this.value;
	}
}
