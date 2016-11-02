package my.mimos.moh.esb.integration.test.util;

/**
 * JUnit Test Utilities for HL7 Message Utilities
 * 
 * @author Karthik
 * @version 1.0.0
 */
public final class HL7MessageUtilities {

	public static String getHL7ReqMessage() throws Exception {
		StringBuffer msgBuffer = new StringBuffer();
		msgBuffer.append("MSH|^~\\&|TPCOHCIS|21-05060035KP|eGL Engine|JPA|20150521154149|1003350|RQA^I08^RQA_I08|21-05060035KP20150521154149|P|2.5|||AL\r");
		msgBuffer.append("PRD|RP|Medical Officer|Klinik Pergigian Mantin^TPM^^^KL^WP^55100||^^^^^^^^^^^06-7581242\r");
		msgBuffer.append("PID|||901020075331^^^^2||^Mohamad Hakimi bin Kamaruddin|||L|||&No 1^^Bukit Aman^WP Kuala Lumpur|||||^1||||||||||||Malaysia\r");
		msgBuffer.append("IN1|1|eGL|JPA\r");
		msgBuffer.append("PR1|1|ICD|01|Medical Services|20150521154149\r");
		return msgBuffer.toString();
	}
	
	public static String getHL7ResMessage() throws Exception {
		StringBuffer msgBuffer = new StringBuffer();
		msgBuffer.append("MSH|^~\\&|TPCOHCIS|21-05060035KP|eGL Engine|JPA|20150521154149|1003350|RPA^I08^RPA_I08|21-05060035KP20150521154149|P|2.5|||AL\r");
		msgBuffer.append("MSA|CA|21-05060035KP20150521154149\r");
		msgBuffer.append("PID|||901020075331^^^^2||^Mohamad Hakimi bin Kamaruddin\r");
		msgBuffer.append("GT1||610908055667|&&KIM JAE KYUNG||||||||CHD^CHILD\r");
		msgBuffer.append("IN1|1|JPA|JPA||||||||||||||CHD^CHILD\r");
		return msgBuffer.toString();
	}
	
	public static String getValidHL7Message() throws Exception {
		StringBuffer msgBuffer = new StringBuffer();
		msgBuffer.append("MSH|^~\\&|TPCOHCIS|21-05060035KP|eGL Engine|JPA|20150521154149|1003350|RQA^I08^RQA_I08|21-05060035KP20150521154149|P|2.5|||AL\r");
		msgBuffer.append("PRD|RP|Medical Officer|Klinik Pergigian Mantin^TPM^^^KL^WP^55100||^^^^^^^^^^^06-7581242\r");
		msgBuffer.append("PID|||901020075331^^^^2||^Mohamad Hakimi bin Kamaruddin|||L|||&No 1^^Bukit Aman^WP Kuala Lumpur|||||^1||||||||||||Malaysia\r");
		msgBuffer.append("IN1|1|eGL|JPA\r");
		msgBuffer.append("PR1|1|ICD|01|Medical Services|20150521154149\r");
		return msgBuffer.toString();
	}
	
	public static String getInValidHL7Message() throws Exception {
		StringBuffer msgBuffer = new StringBuffer();
		msgBuffer.append("dsfddfMSH|^~\\&|TPCOHCIS|21-05060035KP|eGL Engine|JPA|20150521154149|1003350|RQA^I08^RQA_I08|21-05060035KP20150521154149|P|2.5|||AL\r");
		msgBuffer.append("PRD|RP|Medical Officer|Klinik Pergigian Mantin^TPM^^^KL^WP^55100||^^^^^^^^^^^06-7581242\r");
		msgBuffer.append("PID|||901020075331^^^^2||^Mohamad Hakimi bin Kamaruddin|||L|||&No 1^^Bukit Aman^WP Kuala Lumpur|||||^1||||||||||||Malaysia\r");
		msgBuffer.append("IN1|1|eGL|JPA\r");
		msgBuffer.append("PR1|1|ICD|01|Medical Services|20150521154149\r");
		return msgBuffer.toString();
	}
	
	public static String getHL723ReqMessage() throws Exception {
		StringBuffer msgBuffer = new StringBuffer();
		msgBuffer.append("MSH|^~\\&|TPCOHCIS|21-05060035KP|eGL Engine|JPA|20150521154149|1003350|RQA^I08|21-05060035KP20150521154149|P|2.3|||AL\r");
		msgBuffer.append("PRD|RP|Medical Officer|Klinik Pergigian Mantin^TPM^^^KL^WP^55100||^^^^^^06-7581242\r");
		msgBuffer.append("PID|||901020075331^^^^2||^Mohamad Hakimi bin Kamaruddin|||L|||No 1^^Bukit Aman^WP Kuala Lumpur|||||1||||||||||||Malaysia\r");
		msgBuffer.append("IN1|1|eGL|JPA\r");
		msgBuffer.append("PR1|1|ICD|01|Medical Services|20150521154149\r");
		return msgBuffer.toString();
	}
	
	public static String getHL724ReqMessage() throws Exception {
		StringBuffer msgBuffer = new StringBuffer();
		msgBuffer.append("MSH|^~\\&|TPCOHCIS|21-05060035KP|eGL Engine|JPA|20150521154149|1003350|RQA^I08^RQA_I08|21-05060035KP20150521154149|P|2.4|||AL\r");
		msgBuffer.append("PRD|RP|Medical Officer|Klinik Pergigian Mantin^TPM^^^KL^WP^55100||^^^^^^06-7581242\r");
		msgBuffer.append("PID|||901020075331^^^^2||^Mohamad Hakimi bin Kamaruddin|||L|||&No 1^^Bukit Aman^WP Kuala Lumpur|||||^1||||||||||||Malaysia\r");
		msgBuffer.append("IN1|1|eGL|JPA\r");
		msgBuffer.append("PR1|1|ICD|01|Medical Services|20150521154149\r");
		return msgBuffer.toString();
	}
	
	public static String getHL725ReqMessage() throws Exception {
		StringBuffer msgBuffer = new StringBuffer();
		msgBuffer.append("MSH|^~\\&|TPCOHCIS|21-05060035KP|eGL Engine|JPA|20150521154149|1003350|RQA^I08^RQA_I08|21-05060035KP20150521154149|P|2.5|||AL\r");
		msgBuffer.append("PRD|RP|Medical Officer|Klinik Pergigian Mantin^TPM^^^KL^WP^55100||^^^^^^^^^^^06-7581242\r");
		msgBuffer.append("PID|||901020075331^^^^2||^Mohamad Hakimi bin Kamaruddin|||L|||&No 1^^Bukit Aman^WP Kuala Lumpur|||||^1||||||||||||Malaysia\r");
		msgBuffer.append("IN1|1|eGL|JPA\r");
		msgBuffer.append("PR1|1|ICD|01|Medical Services|20150521154149\r");
		return msgBuffer.toString();
	}
	
	public static String getHL726ReqMessage() throws Exception {
		StringBuffer msgBuffer = new StringBuffer();
		msgBuffer.append("MSH|^~\\&|TPCOHCIS|21-05060035KP|eGL Engine|JPA|20150521154149|1003350|RQA^I08^RQA_I08|21-05060035KP20150521154149|P|2.6|||AL\r");
		msgBuffer.append("PRD|RP|Medical Officer|Klinik Pergigian Mantin^TPM^^^KL^WP^55100||^^^^^^^^^^^06-7581242\r");
		msgBuffer.append("PID|||901020075331^^^^2||^Mohamad Hakimi bin Kamaruddin|||L|||&No 1^^Bukit Aman^WP Kuala Lumpur|||||^1||||||||||||Malaysia\r");
		msgBuffer.append("IN1|1|eGL|JPA\r");
		msgBuffer.append("PR1|1|ICD|01|Medical Services|20150521154149\r");
		return msgBuffer.toString();
	}
	
	public static String getHL723ResMessage() throws Exception {
		StringBuffer msgBuffer = new StringBuffer();
		msgBuffer.append("MSH|^~\\&|TPCOHCIS|21-05060035KP|eGL Engine|JPA|20150521154149|1003350|RPA^I08|21-05060035KP20150521154149|P|2.3|||AL\r");
		msgBuffer.append("MSA|CA|21-05060035KP20150521154149\r");
		msgBuffer.append("PID|||901020075331^^^^2||^Mohamad Hakimi bin Kamaruddin\r");
		msgBuffer.append("GT1||610908055667|KIM JAE KYUNG||||||||CHILD\r");
		msgBuffer.append("IN1|1|JPA|JPA||||||||||||||CHILD\r");
		return msgBuffer.toString();
	}
	
	public static String getHL724ResMessage() throws Exception {
		StringBuffer msgBuffer = new StringBuffer();
		msgBuffer.append("MSH|^~\\&|TPCOHCIS|21-05060035KP|eGL Engine|JPA|20150521154149|1003350|RPA^I08^RPA_I08|21-05060035KP20150521154149|P|2.4|||AL\r");
		msgBuffer.append("MSA|CA|21-05060035KP20150521154149\r");
		msgBuffer.append("PID|||901020075331^^^^2||^Mohamad Hakimi bin Kamaruddin\r");
		msgBuffer.append("GT1||610908055667|&&KIM JAE KYUNG||||||||CHD^CHILD\r");
		msgBuffer.append("IN1|1|JPA|JPA||||||||||||||CHD^CHILD\r");
		return msgBuffer.toString();
	}
	
	public static String getHL725ResMessage() throws Exception {
		StringBuffer msgBuffer = new StringBuffer();
		msgBuffer.append("MSH|^~\\&|TPCOHCIS|21-05060035KP|eGL Engine|JPA|20150521154149|1003350|RPA^I08^RPA_I08|21-05060035KP20150521154149|P|2.5|||AL\r");
		msgBuffer.append("MSA|CA|21-05060035KP20150521154149\r");
		msgBuffer.append("PID|||901020075331^^^^2||^Mohamad Hakimi bin Kamaruddin\r");
		msgBuffer.append("GT1||610908055667|&&KIM JAE KYUNG||||||||CHD^CHILD\r");
		msgBuffer.append("IN1|1|JPA|JPA||||||||||||||CHD^CHILD\r");
		return msgBuffer.toString();
	}
	
	public static String getHL726ResMessage() throws Exception {
		StringBuffer msgBuffer = new StringBuffer();
		msgBuffer.append("MSH|^~\\&|TPCOHCIS|21-05060035KP|eGL Engine|JPA|20150521154149|1003350|RPA^I08^RPA_I08|21-05060035KP20150521154149|P|2.6|||AL\r");
		msgBuffer.append("MSA|CA|21-05060035KP20150521154149\r");
		msgBuffer.append("PID|||901020075331^^^^2||^Mohamad Hakimi bin Kamaruddin\r");
		msgBuffer.append("GT1||610908055667|&&KIM JAE KYUNG||||||||CHD^CHILD\r");
		msgBuffer.append("IN1|1|JPA|JPA||||||||||||||CHD^CHILD\r");
		return msgBuffer.toString();
	}
}