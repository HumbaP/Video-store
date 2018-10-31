

public abstract class Movie
{
	
	public static final int REGULAR =22, NEW_RELEASE=12,CHILDRENS=3;
	
	private String title;

	public Movie(String title) {
		this.title 		= title;
	}
		
	public String getTitle () {
		return title;
	}

  public abstract double determineAmount(int daysRented);

  public abstract int determineFrequentRenterPoints(int daysRented);

protected abstract int getPriceCode();
}