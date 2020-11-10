package homework0;

/**
 * A simple object that has a volume.
 */
public class Ball {
	private double getVolume;

    /**
     * @requires volume > 0
     * @modifies this
     * @effects Creates and initializes new Ball object with the specified
     *  		volume.
     */

    public Ball(double volume) {
		setVolume(volume);
    }


	/**
	 * @requires volume > 0
	 * @modifies this
	 * @effects Sets the volume of the Ball.
	 */
	public void setVolume(double volume) {
		if(volume>0) this.getVolume = volume;
		else return;
		
	}


    /**
     * @return the volume of the Ball.
     */
    public double getVolume() {
		return this.getVolume;
    }
}