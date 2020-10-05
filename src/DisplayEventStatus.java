public enum DisplayEventStatus {
	ALL_STATUS("All Statuses"), CONFIRMED("Confirmed"), PENDING("Pending"), CANCELLED("Cancelled"), COMPLETE("Complete"), ERROR("Error");
	private final String value;

	DisplayEventStatus(String v) {
		value = v;
	}

	public String value() {
		return value;
	}

	public static DisplayEventStatus fromValue(String v) {
		for (DisplayEventStatus c : DisplayEventStatus.values()) {
			if (c.value.equalsIgnoreCase(v)) {
				return c;
			}
		}
		throw new IllegalArgumentException(v);
	}
}
