
/**
 * This class is an abstract definition for a coordinate  in either polar or
 * cartesian format. Based on class PointCP.
 *
 * @author Katada 
 */
public abstract class PointCP5
{
  
	/**
	 * Stores the value of cartesian x
	 */
	private double x;
	
	
	/**
	 * Stores the value of cartesian y
	 */
	private double y;
	
	/**
	 * Stores the value of polar rho
	 */
	private double rho;
	
	
	/**
	 * Stores the value of polar theta
	 */
	private double theta;
  
  
	
  //Instance methods **************************************************
 
	
	public abstract double getX();

	public abstract double getY();

	public abstract double getRho() ;

	public abstract double getTheta();
	
  /**
   * Calculates the distance in between two points using the Pythagorean
   * theorem  (C ^ 2 = A ^ 2 + B ^ 2). Not needed until E2.30.
   *
   * @param pointA The first point.
   * @param pointB The second point.
   * @return The distance between the two points.
   */
  public abstract  double getDistance(PointCP5 pointB);
  


/**
   * Rotates the specified point by the specified number of degrees.
   * Not required until E2.30
   *
   * @param point The point to rotate
   * @param rotation The number of degrees to rotate the point.
   * @return The rotated image of the original point.
   */
  public abstract PointCP5 rotatePoint(double rotation);
  /**
   * Returns information about the coordinates.
   *
   * @return A String containing information about the coordinates.
   */
  public abstract String toString();
}
