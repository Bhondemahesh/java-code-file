package practics;

public class Pract {
	private int StudId;
	private String StudName;
	private Double StudFee;
	private int Studnum;
	public Pract(int studId, String studName, Double studFee, int studnum) {
		super();
		StudId = studId;
		StudName = studName;
		StudFee = studFee;
		Studnum = studnum;
	}
	public int getStudId() {
		return StudId;
	}
	public void setStudId(int studId) {
		StudId = studId;
	}
	public String getStudName() {
		return StudName;
	}
	public void setStudName(String studName) {
		StudName = studName;
	}
	public Double getStudFee() {
		return StudFee;
	}
	public void setStudFee(Double studFee) {
		StudFee = studFee;
	}
	public int getStudnum() {
		return Studnum;
	}
	public void setStudnum(int studnum) {
		Studnum = studnum;
	}



}