package top.putop.mi.db.model;

public class MiMessage {

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column mi_message.id
	 * @mbg.generated  Wed May 02 11:47:06 AWST 2018
	 */
	private Integer id;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column mi_message.mi_name
	 * @mbg.generated  Wed May 02 11:47:06 AWST 2018
	 */
	private String miName;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column mi_message.mi_des
	 * @mbg.generated  Wed May 02 11:47:06 AWST 2018
	 */
	private String miDes;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column mi_message.mi_url
	 * @mbg.generated  Wed May 02 11:47:06 AWST 2018
	 */
	private String miUrl;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column mi_message.mi_type
	 * @mbg.generated  Wed May 02 11:47:06 AWST 2018
	 */
	private String miType;

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column mi_message.id
	 * @return  the value of mi_message.id
	 * @mbg.generated  Wed May 02 11:47:06 AWST 2018
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column mi_message.id
	 * @param id  the value for mi_message.id
	 * @mbg.generated  Wed May 02 11:47:06 AWST 2018
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column mi_message.mi_name
	 * @return  the value of mi_message.mi_name
	 * @mbg.generated  Wed May 02 11:47:06 AWST 2018
	 */
	public String getMiName() {
		return miName;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column mi_message.mi_name
	 * @param miName  the value for mi_message.mi_name
	 * @mbg.generated  Wed May 02 11:47:06 AWST 2018
	 */
	public void setMiName(String miName) {
		this.miName = miName;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column mi_message.mi_des
	 * @return  the value of mi_message.mi_des
	 * @mbg.generated  Wed May 02 11:47:06 AWST 2018
	 */
	public String getMiDes() {
		return miDes;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column mi_message.mi_des
	 * @param miDes  the value for mi_message.mi_des
	 * @mbg.generated  Wed May 02 11:47:06 AWST 2018
	 */
	public void setMiDes(String miDes) {
		this.miDes = miDes;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column mi_message.mi_url
	 * @return  the value of mi_message.mi_url
	 * @mbg.generated  Wed May 02 11:47:06 AWST 2018
	 */
	public String getMiUrl() {
		return miUrl;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column mi_message.mi_url
	 * @param miUrl  the value for mi_message.mi_url
	 * @mbg.generated  Wed May 02 11:47:06 AWST 2018
	 */
	public void setMiUrl(String miUrl) {
		this.miUrl = miUrl;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column mi_message.mi_type
	 * @return  the value of mi_message.mi_type
	 * @mbg.generated  Wed May 02 11:47:06 AWST 2018
	 */
	public String getMiType() {
		return miType;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column mi_message.mi_type
	 * @param miType  the value for mi_message.mi_type
	 * @mbg.generated  Wed May 02 11:47:06 AWST 2018
	 */
	public void setMiType(String miType) {
		this.miType = miType;
	}
}