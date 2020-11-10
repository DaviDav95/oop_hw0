package homework0;
import java.util.ArrayList;


/**
 * A container that can be used to contain Balls. A given Ball may only
 * appear in a BallContainer once. Each container has a size, and can only contain balls up to the size of the container.
 */
public class BallContainer {
    private static final int EMPTY = 0;
    private double containerSize;
    private double  containerCurrentVolume;
    private ArrayList<Ball> myBallsList;
            /**
             * @requires   res containerSize > 0
             * @effects Creates a new BallContainer with the size of containerSize.
             */
    public BallContainer(double containerSize) {
        if(containerSize>0) {
            this.containerSize = containerSize;
            this.containerCurrentVolume = EMPTY;
            this.myBallsList = new ArrayList<Ball>();
        }
    }


    /**
     * @modifies this
     * @effects Adds ball to the container.
     * @return true if ball was successfully added to the container,
     * 		   i.e. ball is not already in the container and if adding ball does not cause 
	 *		   the total volume of the balls in the container to exceed the size of	the container;
	 * 		   false otherwise.
     */
    public boolean add(Ball ball) { //todo: check size overflow
		if(!contains(ball)) {
	        containerCurrentVolume += ball.getVolume(); //todo check if ball is null
	        myBallsList.add(ball); //todo: check if didnt succeed
	        return true;
        }
		else return false;
    }



    /**
     * @modifies this
     * @effects Removes ball from the container.
     * @return true if ball was successfully removed from the container,
     * 		   i.e. ball is actually in the container; false otherwise.
     */
    public boolean remove(Ball ball) {
        if(contains(ball)) {
            containerCurrentVolume -= ball.getVolume();
            myBallsList.remove(ball); //todo: check if didnt succeed
            return true;
        }
        else return false;
    }


    /**
     * @return the volume of the contents of the container, i.e. the
     * 		   total volume of all Balls in the container.
     */
    public double getVolume() {
        return containerCurrentVolume;
    }
	
	/**
     * @return the size of the container.
     */
    public double getContainerSize() {
        return containerSize;
    }

    /**
     * @return the number of Balls in the container.
     */
    public int size() {
		return myBallsList.size();
    }

    /**
     * @modifies this
     * @effects Empties the container, i.e., removes all its contents.
     */
    public void clear() {
		myBallsList.clear();
		containerCurrentVolume=EMPTY;
    }

    /**
     * @return true if this container contains ball; false, otherwise.
     */
    public boolean contains(Ball ball) {
		return myBallsList.contains(ball);
    }
}
