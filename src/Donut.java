
public class Donut {
	private double height;
	private double innerRadius;
	private double outerRadius;
	
	public Donut(double height, double innerRadius, double outerRadius) {
		this.height=height;
		this.innerRadius=innerRadius;
		this.outerRadius=outerRadius;
		}
	public double getHeight() {
		return height;
	}
	public void setHeight (double height) {
		this.height=height;
	}
	public double getinnerRadius() {
		return innerRadius;
	}
	public void setinnerRadius(double innerRadius) {
		this.innerRadius=innerRadius;
	}
	public double getouterRadius() {
		return outerRadius;
	}
	public void setouterRadius(double outerRadius) {
		this.outerRadius=outerRadius;
	}
	public double calculateVolume() {
		double volume = Math.pow(Math.PI,2) * height*(outerRadius-innerRadius)*(outerRadius+innerRadius)/4;
		return volume;
	}
}
