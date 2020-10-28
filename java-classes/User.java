import java.util.Random;

/**
  describe this class
*/
public class User
{
    // declare private instance vars
    private Restaurant favRestaurant;
    private FoodReview lastReview;
    private int reviewCount;
    private double reviewScoreTotal;
    
    // add more
    private String name;
    private String resturantName;

    /**
      describe this constructor
    */
    public User()
    {
        // assign default values
        reviewCount = 0;
        reviewScoreTotal = 0;
        name = "none";
        resturantName = "none";
    }

    // accessors and mutators here

    /**
      Sets the name of the returant being reviewed
      @param _resturantName the name of the resturant being reviewed
    */
    public void setResturantName(String _resturantName){
      resturantName = _resturantName;
    }
  
    /**
      returns the resturant name
      @return resturantName the name of the resturant
    */
    public String getResturantName(){
      return resturantName;
    }
  
    /**
      describe each method
    */
    public double getAverageReview()
    {
      // needs completed
      return 0.0;
    }

    /**
      describe each method
    */
    public void setFavRestaurant(Restaurant _restaurant)
    {
      restaurant = _restaurant;
    }
  
    /**
      setName(String _name)
      Sets the user's name to a string.
      @param _name the name of the user
    */
    public void setName(String _name)
    {
      name = _name;
    }
    
    /**
      getName()
      Accesses the name of the user.
      @return the name of the user
    */
    public String getName()
    {
      return name;
    }
  
    

}
