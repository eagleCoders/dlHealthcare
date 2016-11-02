/**
 * 
 */
package healthcare.api.client.hl7.type;

/**
 * @author anees-ur-rehman
 *
 */
public enum HL7PIDSegmentTypes {
	
	
	PATIENT_IDENTIFIER_LIST("PID.3"), ALTERNATIVE_PATIENT_IDENTIFIER_LIST("PID.4"), PATIENT_NAME_LIST("PID.5"), DATE_OF_BIRTH("PID.7"),
	SEX("PID.8"), ADDRESS_LIST("PID.11"), PHONE_HOME("PID.13"), PHONE_WORK("PID.14"), MARITAL_STATUS_LIST("PID.16"), RELIGION_LIST("PID.17"),
	PATIENT_SSN_IC("PID.19");
	
	
	private String value;
	
	private HL7PIDSegmentTypes(String value){
		this.value = value;
	}
	
	public String getValue(){
		return this.value;
	}
}
