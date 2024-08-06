package snakeladderlld;

public class Jumper {
	int startPoint;
	int endPoint;
	
	public int getStartPoint() {
		return startPoint;
	}

	public void setStartPoint(int startPoint) {
		this.startPoint = startPoint;
	}

	public int getEndPoint() {
		return endPoint;
	}

	public void setEndPoint(int endPoint) {
		this.endPoint = endPoint;
	}

	public Jumper(int startPoint, int endPoint) {
		this.startPoint = startPoint;
		this.endPoint = endPoint;
	}
}
