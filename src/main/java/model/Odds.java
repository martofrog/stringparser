package model;

/**
 * Created by nma32 on 24/05/2017.
 */
public class Odds {

	private Double num;

	private Double den;

	private String fractPrice;

	public Odds(String fractPrice) {
		this.fractPrice = fractPrice;
	}

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

	public String getFractionalOdds() {
		// returns fractional odds as string
		return null;
	}

	public Double getDecimalOdds() {
		// Returns decimal price as double rounded down to two decimal places
		// Use any rounding method of your preference e.g. roundDownMethod(num/den + 1, 2)
		return null;
	}

}
