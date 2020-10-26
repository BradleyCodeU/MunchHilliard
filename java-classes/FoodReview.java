import java.time.LocalDate;

/**
  describe this class
*/
public class FoodReview
{
    // declare private instance vars
    private Restaurant restaurant;
    private double reviewScore;
    private String reviewTitle;
    private String reviewBody, reviewerName;
    private User user;
    private LocalDate timestamp;
    private int numUsefulLikes; // similar to Like button, but says "Useful"
    private int numFunnyLikes; // similar to Like button, but says "Funny"
    private int numCoolLikes; // similar to Like button, but says "Cool"

    /**
      describe this constructor
      @param
      @param
      @param
      @param
      @param
    */
    public FoodReview(Restaurant _restaurant, double _reviewScore, String _reviewTitle, String _reviewBody, User _user)
    {
        numUsefulLikes = 0; // defaults to 0
        numFunnyLikes = 0; // defaults to 0
        numCoolLikes = 0; // defaults to 0
        // set instance var values using parameters
        // TO DO
    }

    // accessors and mutators here
  
    public String getReviewerName(String _reviewerName){
      //Ryan Buckner
      reviewerName = _reviewerName;
      /**
       * Creates a parameter _reviewerName and sets the reviewerName variable to that parameter
       
      */
    }

    /**
      returns the date that the review was posted
      @return LocalDate object timestamp which is the date that the review was posted
    */
    public LocalDate getTimestamp()
    {
      return timestamp;
    }
}
