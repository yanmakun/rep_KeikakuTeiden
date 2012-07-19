package jp.ne.yanmakun;

/**
 * 時間帯の明細
 * @author takuro
 *
 */
public class TimeZoneDetail {
	private String id;
	private String housingName; //物件名
	private String subGroupName; //サブグループ名
	private String urgentContact; //緊急連絡先
	private String chargeName; //担当者名
	private String remarks; //備考

	/**
	 * コンストラクタ
	 * @param id
	 * @param housingName
	 * @param subGroupName
	 * @param urgentContact
	 * @param chargeName
	 * @param remarks
	 */
	public TimeZoneDetail(String id, String housingName, String subGroupName,
			String urgentContact, String chargeName, String remarks) {
		super();
		this.id = id;
		this.housingName = housingName;
		this.subGroupName = subGroupName;
		this.urgentContact = urgentContact;
		this.chargeName = chargeName;
		this.remarks = remarks;
	}

	/**
	 * @return id
	 */
	public String getId() {
		return id;
	}
	/**
	 * @param id セットする id
	 */
	public void setId(String id) {
		this.id = id;
	}
	/**
	 * @return housingName
	 */
	public String getHousingName() {
		return housingName;
	}
	/**
	 * @param housingName セットする housingName
	 */
	public void setHousingName(String housingName) {
		this.housingName = housingName;
	}
	/**
	 * @return subGroupName
	 */
	public String getSubGroupName() {
		return subGroupName;
	}
	/**
	 * @param subGroupName セットする subGroupName
	 */
	public void setSubGroupName(String subGroupName) {
		this.subGroupName = subGroupName;
	}
	/**
	 * @return urgentContact
	 */
	public String getUrgentContact() {
		return urgentContact;
	}
	/**
	 * @param urgentContact セットする urgentContact
	 */
	public void setUrgentContact(String urgentContact) {
		this.urgentContact = urgentContact;
	}
	/**
	 * @return chargeName
	 */
	public String getChargeName() {
		return chargeName;
	}
	/**
	 * @param chargeName セットする chargeName
	 */
	public void setChargeName(String chargeName) {
		this.chargeName = chargeName;
	}
	/**
	 * @return remarks
	 */
	public String getRemarks() {
		return remarks;
	}
	/**
	 * @param remarks セットする remarks
	 */
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	/* (非 Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((chargeName == null) ? 0 : chargeName.hashCode());
		result = prime * result
				+ ((housingName == null) ? 0 : housingName.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((remarks == null) ? 0 : remarks.hashCode());
		result = prime * result
				+ ((subGroupName == null) ? 0 : subGroupName.hashCode());
		result = prime * result
				+ ((urgentContact == null) ? 0 : urgentContact.hashCode());
		return result;
	}

	/* (非 Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		TimeZoneDetail other = (TimeZoneDetail) obj;
		if (chargeName == null) {
			if (other.chargeName != null)
				return false;
		} else if (!chargeName.equals(other.chargeName))
			return false;
		if (housingName == null) {
			if (other.housingName != null)
				return false;
		} else if (!housingName.equals(other.housingName))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (remarks == null) {
			if (other.remarks != null)
				return false;
		} else if (!remarks.equals(other.remarks))
			return false;
		if (subGroupName == null) {
			if (other.subGroupName != null)
				return false;
		} else if (!subGroupName.equals(other.subGroupName))
			return false;
		if (urgentContact == null) {
			if (other.urgentContact != null)
				return false;
		} else if (!urgentContact.equals(other.urgentContact))
			return false;
		return true;
	}

	/* (非 Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "TimeZoneDetail [id=" + id + ", housingName=" + housingName
				+ ", subGroupName=" + subGroupName + ", urgentContact="
				+ urgentContact + ", chargeName=" + chargeName + ", remarks="
				+ remarks + "]";
	}
}
