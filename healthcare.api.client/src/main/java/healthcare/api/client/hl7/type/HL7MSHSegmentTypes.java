/**
 * 
 */
package healthcare.api.client.hl7.type;

/**
 * @author anees-ur-rehman
 *
 */
public enum HL7MSHSegmentTypes {
	SENDING_APPLICATION_TYPE("MSH.3"), SENDING_FACILITY("MSH.4"), RECIEVING_APPLICATION("MSH.5"), RECIEVING_FACILITY("MSH.6"), 
	DATA_TIME_OF_MSG("MSH.7"), SECURITY("MSH.8"), MESSAGE_TYPE("MSH.9"), MESSAGE_CONTROL_ID("MSH.10"), PROCESSING_ID("MSH.11"),
	HL7_VERSION("MSH.12"), SEQUENCE_NUMBER("MSH.13"), CONTINUATION_POINTER("MSH.14"), ACCEPT_ACKNOWLEDGEMENT_TYPE("MSH.15"),
	APPLICATION_ACKNOWLEDGEMENT_TYPE("MSH.16"), COUNTRY_CODE("MSH.17"), CHARACTER_SET("MSH.18"), PRINICPAL_LANGUAGE_OF_MESSAGE("MSH.19"),
	ALTERNATE_CHARACTER_SET_HANDLING_SCHEME("MSH.20");

	private String value;

	private HL7MSHSegmentTypes(String value) {
		this.value = value;
	}

	public String getValue() {
		return this.value;
	}
}
