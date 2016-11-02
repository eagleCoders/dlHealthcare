/**
 * 
 */
package healthcare.api.client.hl7.segment;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import healthcare.api.client.hl7.HL7SegmentInterface;
import healthcare.api.client.hl7.type.HL7MSHSegmentTypes;

/**
 * @author anees-ur-rehman
 *
 */
public class MSHSegmentFormatter implements HL7SegmentInterface {
	
	static String fileURL = Thread.currentThread().getContextClassLoader().getResource("META-INF/velocity/msh.vm").getFile();

	private static Map<HL7MSHSegmentTypes, String> mshSegmentMap;
	
	private static List<HL7MSHSegmentTypes> requiredElements;
	
	static{
		requiredElements = new ArrayList<HL7MSHSegmentTypes>();
		requiredElements.add(HL7MSHSegmentTypes.MESSAGE_TYPE);
		requiredElements.add(HL7MSHSegmentTypes.MESSAGE_CONTROL_ID);
		requiredElements.add(HL7MSHSegmentTypes.PROCESSING_ID);
		requiredElements.add(HL7MSHSegmentTypes.HL7_VERSION);
		
		
		// Adding the values for the required msh values
		
		mshSegmentMap = new HashMap<HL7MSHSegmentTypes, String>();
		
		//Adding the segment values to the map
		mshSegmentMap.put(HL7MSHSegmentTypes.SENDING_APPLICATION_TYPE, "");
		mshSegmentMap.put(HL7MSHSegmentTypes.SENDING_FACILITY, "");
		mshSegmentMap.put(HL7MSHSegmentTypes.RECIEVING_APPLICATION, "");
		mshSegmentMap.put(HL7MSHSegmentTypes.RECIEVING_FACILITY, "");
		mshSegmentMap.put(HL7MSHSegmentTypes.DATA_TIME_OF_MSG, "");
		mshSegmentMap.put(HL7MSHSegmentTypes.SECURITY, "");
		mshSegmentMap.put(HL7MSHSegmentTypes.MESSAGE_TYPE, "");
		mshSegmentMap.put(HL7MSHSegmentTypes.MESSAGE_CONTROL_ID, "");
		mshSegmentMap.put(HL7MSHSegmentTypes.PROCESSING_ID, "");
		mshSegmentMap.put(HL7MSHSegmentTypes.HL7_VERSION, "");
		mshSegmentMap.put(HL7MSHSegmentTypes.SEQUENCE_NUMBER, "");
		mshSegmentMap.put(HL7MSHSegmentTypes.CONTINUATION_POINTER, "");
		mshSegmentMap.put(HL7MSHSegmentTypes.ACCEPT_ACKNOWLEDGEMENT_TYPE, "");
		mshSegmentMap.put(HL7MSHSegmentTypes.APPLICATION_ACKNOWLEDGEMENT_TYPE, "");
		mshSegmentMap.put(HL7MSHSegmentTypes.COUNTRY_CODE, "");
		mshSegmentMap.put(HL7MSHSegmentTypes.CHARACTER_SET, "");
		mshSegmentMap.put(HL7MSHSegmentTypes.PRINICPAL_LANGUAGE_OF_MESSAGE, "");
		mshSegmentMap.put(HL7MSHSegmentTypes.ALTERNATE_CHARACTER_SET_HANDLING_SCHEME, "");

		
	}
	
	public MSHSegmentFormatter(){
	}

	public String getHL7Segment() {
		// TODO Auto-generated method stub
		return null;
	}

	public void createHl7Segment() {
		// TODO Auto-generated method stub
		System.out.println(fileURL); 
		
	}
	
	public static void main(String [] args){
		System.out.println("File URL :: "+fileURL);
	}

}
