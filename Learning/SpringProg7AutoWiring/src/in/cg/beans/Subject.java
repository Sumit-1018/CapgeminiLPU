package in.cg.beans;

public class Subject {
	private String subName;
	public void setSubName(String subName) {
		this.subName = subName;
	}
	@Override
	public String toString() {
		return "Subject [subName=" + subName + "]";
	}
}
