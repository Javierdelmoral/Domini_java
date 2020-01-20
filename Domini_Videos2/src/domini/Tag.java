package domini;

public class Tag {

	public String tag;

	public Tag(String tag) {

		this.tag = tag;

	}
	
	public String getTag() {
		return tag;
	}

	public void setTag(String tag) {
		this.tag = tag;
	}

	@Override
	public String toString() {
		return "[tag=" + this.getTag() + "]";
	}

	
	
}
