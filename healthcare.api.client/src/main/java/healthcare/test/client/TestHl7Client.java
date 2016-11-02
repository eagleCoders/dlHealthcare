/**
 * 
 */
package healthcare.test.client;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;

/**
 * @author anees-ur-rehman
 *
 */
public class TestHl7Client {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			String url = "http://0.0.0.0:9595/dahix";
			//String url = "http://10.1.23.27:9595/TPCEGLInterface";
			//String url = "http://localhost:9595/TPCEGLInterface";
			HttpClient client = HttpClientBuilder.create().build();
			HttpPost post = new HttpPost(url);		
			HttpEntity entity = new StringEntity(getInboundHL7Message());
			//HttpEntity entity = new StringEntity(MessageUtil.getHL723ReqMessage());
			post.setEntity(entity);		
			HttpResponse response = client.execute(post);
			String result = EntityUtils.toString(response.getEntity());
			System.out.println(result);
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	
	public static String getInboundHL7Message() throws Exception {
		StringBuffer msgBuffer = new StringBuffer();
		msgBuffer.append("MSH|^~\\&|TPCOHCIS|21-05060035-KP|eGL Engine|JPA|20150521154149|1003350|RQA^I08^RQA_I08|21-05060035KP20150521154149|P|2.5|||AL\r");
		msgBuffer.append("PRD|RP|Medical Officer|Klinik Pergigian Mantin^TPM^^^KL^WP^55100||^^^^^^^^^^^06-7581242\r");
		msgBuffer.append("PID|||901020075331^^^^2||^Mohamad Hakimi bin Kamaruddin|||L|||&No 1^^Bukit Aman^WP Kuala Lumpur|||||^1||||||||||||Malaysia\r");
		msgBuffer.append("IN1|1|eGL|JPA\r");
		msgBuffer.append("PR1|1|ICD|01|Medical Services|20150521154149\r");
		return msgBuffer.toString();
	}
	
	
	public static String getInboundADTA01Message() throws Exception {
		StringBuffer msgBuffer = new StringBuffer();
		msgBuffer.append("MSH|^~\\&|TPCOHCIS|21-05060035-KP|eGL Engine|JPA|20150521154149|1003350|ADT^A01^ADT^A01|21-05060035KP20150521154149|P|2.5|||AL\r");
		msgBuffer.append("PID|||901020075331^^^^2||^Mohamad Hakimi bin Kamaruddin|||L|||&No 1^^Bukit Aman^WP Kuala Lumpur|||||^1||||||||||||Malaysia\r");
		msgBuffer.append("IN1|1|eGL|JPA\r");
		return msgBuffer.toString();
		
	}

}
