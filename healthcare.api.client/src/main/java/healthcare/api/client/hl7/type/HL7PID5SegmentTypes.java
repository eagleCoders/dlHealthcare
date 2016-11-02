/**
 * 
 */
package healthcare.api.client.hl7.type;

/**
 * @author anees-ur-rehman
 *
 */
public enum HL7PID5SegmentTypes {
	FAMILY_NAME("XPN.1"), GIVEN_NAME("XPN.2"), MIDDILE_NAME("XPN.3"), SUFFIX("XPN.4"), PREFIX("XPN.5"), DEGREE("XPN.6");
	
	private String value;
	
	private HL7PID5SegmentTypes(String value){
		this.value = value;
	}
	
	public String getValue(){
		return this.value;
	}
}
