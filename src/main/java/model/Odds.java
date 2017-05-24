package model;

/**
 * Created by nma32 on 24/05/2017.
 */
public class Odds {

	private Double num;

	private Double den;

	public Odds() {}

	public Double getNum() {
		return num;
	}

	public void setNum(Double num) {
		this.num = num;
	}

	public Double getDen() {
		return den;
	}

	public void setDen(Double den) {
		this.den = den;
	}

	private String getFractionalOdds() {
		// returns fractional odds as string
		return null;
	}

	private Double getDecimalOdds() {
		// returns decimal price as double roundDown((num/den)+1, 2)
		return null;
	}

}
