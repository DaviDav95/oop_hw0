package homework0;

public class BallClassTest {
    public static void main(String[] args) {
        
        Ball footBall = new Ball(4.2);
        Ball baseBall = new Ball(2.0);
        Ball basketBall = new Ball(13.3);
        BallContainer myBallsContainer = new BallContainer(13.5);

        /** A section to checck the Ball class functionlaty
        */
         // check the getVolume method
        System.out.println("The value of the foot ball volume is:" + footBall.getVolume());
        System.out.println("The value of the base ball volume is:" + baseBall.getVolume());
        // check the setVolume method
        footBall.setVolume(baseBall.getVolume());
        System.out.println("now the value of the foot ball is:" + footBall.getVolume());
        System.out.println("");

        /** A section to check the Ballontainer functionalty
        **/

        // check the getVolume method
        System.out.println("The value of the container volume is:" + myBallsContainer.getVolume());
        // check the getContainerSize method
        System.out.println("The size of the container ContainerSize is:" + myBallsContainer.getContainerSize());
        // check the size method
        System.out.println("The size of container size is:" + myBallsContainer.size());
        System.out.println("");

        // check the add method + print
        myBallsContainer.add(footBall);
        System.out.println("Adding Foot ball to contanier");
        System.out.println("now the value of container volume is:" + myBallsContainer.getVolume());
        System.out.println("now the size of container ContainerSize is:" + myBallsContainer.getContainerSize());
        System.out.println("now the size of container size is:" + myBallsContainer.size());
        System.out.println("");
        myBallsContainer.add(baseBall);
        System.out.println("Adding Base ball to contanier");
        System.out.println("now the value of container volume is:" + myBallsContainer.getVolume());
        System.out.println("now the size of container ContainerSize is:" + myBallsContainer.getContainerSize());
        System.out.println("now the size of container size is:" + myBallsContainer.size());
        System.out.println("");
        // checking if we can add the same ball object wtice to the same contanier
        System.out.println("Trying to add Base ball to contanier again");
        if (myBallsContainer.add(baseBall) == false) {
            System.out.println("Base ball is alredy in the container !!!");
        }
        else {
            System.out.println("Error: try to add the same object is not allowed!");
        }
        System.out.println("");
        // checking if we can add to the contanier volume more then the limit of the contanier
        System.out.println("The value of Basket ball volume is:" + basketBall.getVolume());
        System.out.println("Trying to add Basket ball to contanier");
        if (myBallsContainer.add(basketBall) == false) {
            System.out.println("Basket ball can not be added, container size not big enough");
        }
        else {
            System.out.println("Error: the total volume is overflow!");
        }
        System.out.println("");
        // checking the contains method
        if (myBallsContainer.contains(footBall)) {
            System.out.println("The foot ball is inside contanier!");
        }
        else {
            System.out.println("Error: the foot ball is not inside contanier!");
        }

        if (myBallsContainer.contains(basketBall)) {
            System.out.println("Error: The basket ball is inside contanier!");
        }
        else {
            System.out.println("The Basket ball is not inside contanier!");
        }
        System.out.println("");

        // checking the remove method
        basketBall.setVolume(1.1);
        System.out.println("The value of Basket ball volume is:" + basketBall.getVolume());
        myBallsContainer.add(basketBall);
        System.out.println("Adding Basket ball to contanier");
        System.out.println("now the value of container volume is:" + myBallsContainer.getVolume());
        System.out.println("now the size of container ContainerSize is:" + myBallsContainer.getContainerSize());
        System.out.println("now the size of container size is:" + myBallsContainer.size());
        System.out.println("Removing Basket ball from contanier");
        myBallsContainer.remove(basketBall);
        System.out.println("now the value of container volume is:" + myBallsContainer.getVolume());
        System.out.println("now the size of container ContainerSize is:" + myBallsContainer.getContainerSize());
        System.out.println("now the size of container size is:" + myBallsContainer.size());
        System.out.println("");

        // checking the clear method
        myBallsContainer.clear();
        System.out.println("Clearing contanier");
        System.out.println("now the value of container volume is:" + myBallsContainer.getVolume());
        System.out.println("now the size of container ContainerSize is:" + myBallsContainer.getContainerSize());
        System.out.println("now the size of container size is:" + myBallsContainer.size());
    }
}
