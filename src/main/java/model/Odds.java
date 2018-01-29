package model;

/**
 * Created by nma32 on 24/05/2017.
 */
public class Odds {

	private Double num;

	private Double den;

	private String fractPrice;

	public Odds(String s) {
		fractPrice = s;
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
		// returns decimal price as double roundDown((num/den)+1, 2)
		return null;
	}

}
