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
    private int totalLikes;
    
    // add more

    private int age;

    private String name;


    /**
      describe this constructor
    */
    public User()
    {
        // assign default values
        reviewCount = 0;
        reviewScoreTotal = 0;
        name = "none";
        totalLikes = 0;
    }

    // accessors and mutators here

    /**
      describe each method
    */
    public int getTotalLikes(){
      return totalLikes;
    }
  
    public setTotalLikes(_totalLikes){
      totalLikes = _totalLikes;
    }
  
    public double getAverageReview()
    {
      // needs completed
      return 0.0;
    }
  
    /**
      Returns the user's age
      @return age which is the user's age
    */
    public String getAge()
    {
      return age;
    }

    /**
      describe each method
    */
    public void setFavRestaurant(Restaurant _restaurant)
    {
      restaurant = _restaurant;
    }
  
    /**
      Sets the user's age
      @param int _userName
    */
    public void setAge(int _age)
    {
      age = _age;
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
