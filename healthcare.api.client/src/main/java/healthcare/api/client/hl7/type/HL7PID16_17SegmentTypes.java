/**
 * 
 */
package healthcare.api.client.hl7.type;

/**
 * @author anees-ur-rehman
 *
 */
public enum HL7PID16_17SegmentTypes {
    MARITAL("CE_0002.1"), RELIGION("CE_0006.1");
	
	private String value;
	
	private HL7PID16_17SegmentTypes(String value){
		this.value = value;
	}
	
	public String getValue(){
		return this.value;
	}
}
