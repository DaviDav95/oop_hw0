package homework0;
import java.util.ArrayList;
/**
 * A container that can be used to contain Balls. A given homework0.Ball may only
 * appear in a homework0.BallContainer once. Each container has a size, and can only contain balls up to the size of the container.
 */
public class BallContainer2 {
    private double containerSize;
    private double  containerCurrentVolume;
    private ArrayList<homework0.Ball> myBallsList;
    private final int EMPTY = 0;
    /**
     * @requires containerSize > 0
     * @effects Creates a new homework0.BallContainer with the size of containerSize.
     */
    public BallContainer2(double containerSize) {
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
    public boolean add(Ball ball) {
        if((!contains(ball))&&(this.getVolume()+ball.getVolume()<=this.getContainerSize())) {
            try {
                myBallsList.add(ball);
            }
            catch(ClassCastException  e){
                System.out.println("The class of the specified element prevents it from being added to this list");
                return false;
            }
            catch (NullPointerException e){
                System.out.println("Can not add NULL");
                return false;
            }
            catch (IllegalArgumentException  e){
                System.out.println("You try to add illegal argument");
                return false;
            }
            containerCurrentVolume += ball.getVolume();
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
            try{
                myBallsList.remove(ball);
            }
            catch (NullPointerException e){
                System.out.println("Can not remove NULL element");
                return false;
            }
            containerCurrentVolume -= ball.getVolume();
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
