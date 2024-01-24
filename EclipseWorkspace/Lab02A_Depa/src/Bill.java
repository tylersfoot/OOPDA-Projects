
public class Bill {
	private int value;
	private String series;
	
	public Bill(int value, String series) {
		super();
		this.value = value;
		this.series = series;
	}

	public int getValue() {
		return value;
	}

	public String getSeries() {
		return series;
	}
	
	@Override
	public String toString() {
		return "Bill [value=" + value + ", series=" + series + "]";
	}

}
