public class Counter {
	private int cnt = 0;

	public int getNewID() {
		return cnt++;
	}

	public String getNewStringID() {
		String s = String.valueOf(cnt);
		cnt++;
		return s;
	}
	
	public String getNewVarID() {
		return "t" + getNewStringID();
	}
	
	public String getNewLabelID() {
		return "L" + getNewStringID();
	}
}
