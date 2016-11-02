/**
 * 
 */
package healthcare.api.client.hl7.type;

/**
 * @author anees-ur-rehman
 *
 */
public enum HL7PID11SegmentTypes {
	
	STREET("XAD.1"), CITY("XAD.3"), STATE_PROVINCE("XAD.4"), ZIP_POSTAL_CODE("XAD.5"), COUNTRY("XAD.6");
	
	private String value;
	
	private HL7PID11SegmentTypes(String value){
		this.value = value;
	}
	
	public String getValue(){
		return this.value;
	}

}
