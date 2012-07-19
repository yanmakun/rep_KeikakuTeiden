package jp.ne.yanmakun;

import java.util.List;

/**
 * 時間帯
 * @author takuro
 *
 */
public class TimeZone {
	private String id; //id
	private String timeZoneName; //時間帯名
	private List<TimeZoneDetail> timeZoneDetailList; //時間帯明細

	public TimeZone(String id, String timeZoneName,
			List<TimeZoneDetail> timeZoneDetailList) {
		super();
		this.id = id;
		this.timeZoneName = timeZoneName;
		this.timeZoneDetailList = timeZoneDetailList;
	}
	/* (非 Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime
				* result
				+ ((timeZoneDetailList == null) ? 0 : timeZoneDetailList
						.hashCode());
		result = prime * result
				+ ((timeZoneName == null) ? 0 : timeZoneName.hashCode());
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
		TimeZone other = (TimeZone) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (timeZoneDetailList == null) {
			if (other.timeZoneDetailList != null)
				return false;
		} else if (!timeZoneDetailList.equals(other.timeZoneDetailList))
			return false;
		if (timeZoneName == null) {
			if (other.timeZoneName != null)
				return false;
		} else if (!timeZoneName.equals(other.timeZoneName))
			return false;
		return true;
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
	 * @return timeZoneName
	 */
	public String getTimeZoneName() {
		return timeZoneName;
	}
	/**
	 * @param timeZoneName セットする timeZoneName
	 */
	public void setTimeZoneName(String timeZoneName) {
		this.timeZoneName = timeZoneName;
	}
	/**
	 * @return timeZoneDetailList
	 */
	public List<TimeZoneDetail> getTimeZoneDetailList() {
		return timeZoneDetailList;
	}
	/**
	 * @param timeZoneDetailList セットする timeZoneDetailList
	 */
	public void setTimeZoneDetailList(List<TimeZoneDetail> timeZoneDetailList) {
		this.timeZoneDetailList = timeZoneDetailList;
	}
	/* (非 Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "TimeZone [id=" + id + ", timeZoneName=" + timeZoneName
				+ ", timeZoneDetailList=" + timeZoneDetailList + "]";
	}

}
