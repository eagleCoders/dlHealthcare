/**
 * 
 */
package healthcare.api.client.hl7.type;

/**
 * @author anees-ur-rehman 
 * 		  The GT1 segment contains guarantor (e.g., the person
 *         or the organization with financial responsibility for payment of a
 *         patient account) data for patient and insurance billing applications.
 *
 */
public enum HL7GT1SegmentTypes {

	GURANTOR_SET_ID("GT1.1"), GURANTOR_NUMBER_LIST("GT1.2"), GURANTOR_NAME_LIST("GT1.3"), GURANTOR_SPOUSE_NAME_LIST("GT1.4"), GURANTOR_ADDRESS_LIST("GT1.5"),
	GURANTOR_PHONE_HOME_LIST("GT1.6"), GURANTOR_PHONE_BUSINESS_LIST("GT1.7"), GURANTOR_DATE_TIME_OF_BIRTH("GT1.8"), GURANTOR_SEX("GT1.9"), GURANTOR_TYPE("GT1.10"),
	GURANTOR_RELATIONSHIP("GT1.11"), GURANTOR_UNIQUE_ID_SSN("GT1.12"), GURANTOR_DATE_BEGIN("GT1.13"), GURANTOR_DATE_END("GT1.14"), GURANTOR_PRIORITY("GT1.15"),
	GURANTOR_EMPLOYER_NAME_LIST("GT1.16"), GURANTOR_EMPLOYER_ADDRESS_LIST("GT1.17"), GURANTOR_EMPLOYER_PHONE_LIST("GT1.18"), GURANTOR_EMPLOYEE_ID_NUMBER_LIST("GT1.19"),
	GURANTOR_EMPLOYMENT_STATUS("GT1.20"), GURANTOR_ORGANIZATION_NAME_LIST("GT1.21"), GURANTOR_BILLING_HOLD_FLAG("GT1.22"), GURANTOR_CREDIT_RATING_CODE("GT1.23"),
	GURANTOR_DEATH_DATE_TIME("GT1.24"), GURANTOR_DEATH_FLAG("GT1.25"), GURANTOR_CHARGE_ADJUSTMENT_CODE("GT1.26"), GURANTOR_HOUSEHOLD_ANNUAL_INCOME("GT1.27"),
	GURANTOR_HOUSEHOLD_SIZE("GT1.28"), GURANTOR_EMPLOYER_ID_NUMBER_LIST("GT1.29"), GURANTOR_MARITAL_STATUS_CODE("GT1.30"), GURANTOR_HIRE_EFFECTIVE_DATE("GT1.31"),
	EMPLOYMENT_STOP_DATE("GT1.32"), LIVING_DEPENDENCY("GT1.33"), AMBULATORY_STATUS_LIST("GT1.34"), CITIZENSHIP_LIST("GT1.35"), PRIMARY_LANGUAGE("GT1.36"),
	LIVING_ARRANGEMENT("GT1.37"), PUBLICITY_CODE("GT1.38"), PROTECTION_INDICATOR("GT1.39"), STUDENT_INDICATOR("GT1.40"), RELIGION("GT1.41"), MOTHERS_MAIDEN_NAME_LIST("GT1.42"),
	NATIONALITY("GT1.43"), ETHNIC_GROUP_LIST("GT1.44"), CONTACT_PERSON_NAMES_LIST("GT1.45"), CONTACT_PERSON_TELEPHON_NUMBERS_LIST("GT1.46"), CONTACT_REASON("GT1.47"),
	CONTACT_RELATIONSHIP("GT1.48"), JOB_TITLE("GT1.49"), JOB_CODE_CLASS("GT1.50"), GURANTOR_EMPLOYERS_ORGANIZATION_NAME_LIST("GT1.51"), HANDICAP("GT1.52"),
	JOB_STATUS("GT1.53"), GURANTOR_FINANCIAL_CLASS("GT1.54"), GURANTOR_RACE("GT1.55");

	private String value;

	private HL7GT1SegmentTypes(String value) {
		this.value = value;
	}

	public String getValue() {
		return this.value;
	}

}