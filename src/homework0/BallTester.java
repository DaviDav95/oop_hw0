package homework0;
//import homework0.Ball;
//import homework0.BallContainer;

public class BallTester {
    public static void main(String[] args) {
        Ball b1 = new Ball(3.7);
        Ball b2 = new Ball(4.5);

        // this section is to checck the Ball class functionlaty
        // checking the getVolume method
        System.out.println("The value of ball 1 vol is:" + b1.getVolume());
        System.out.println("The value of ball 2 vol is:" + b2.getVolume());
        // checking the setVolume method
        b1.setVolume(b2.getVolume());
        System.out.println("now the value of ball 1 is:" + b1.getVolume());
        System.out.println("");

        // this section is to check the Ballontainer functionalty
        BallContainer container1 = new BallContainer(11.5);
        // checking the getVolume method
        System.out.println("The value of container 1 vol is:" + container1.getVolume());
        // checking the getContainerSize method
        System.out.println("The size of container 1 ContainerSize is:" + container1.getContainerSize());
        // checking the size method
        System.out.println("The size of container 1 size is:" + container1.size());
        System.out.println("");
        // checking the add method + priniting 
        container1.add(b1);
        System.out.println("Adding ball 1 to contanier 1");
        System.out.println("now the value of container 1 vol is:" + container1.getVolume());
        System.out.println("now the size of container 1 ContainerSize is:" + container1.getContainerSize());
        System.out.println("now the size of container 1 size is:" + container1.size());
        System.out.println("");
        container1.add(b2);
        System.out.println("Adding ball 2 to contanier 1");
        System.out.println("now the value of container 1 vol is:" + container1.getVolume());
        System.out.println("now the size of container 1 ContainerSize is:" + container1.getContainerSize());
        System.out.println("now the size of container 1 size is:" + container1.size());
        System.out.println("");
        // checking if we can add the same ball object wtice to the same contanier
        System.out.println("Trying to add ball 2 to contanier 1 agian");
        if (container1.add(b2) == false) {
            System.out.println("ball 2 is alredy in the container !!!");
        }
        else {
            System.out.println("Error in BallContainer.add(), adding the same object is not allowed!");
        }
        System.out.println("");
        // checking if we can add to the contanier vol more then the limit of the contanier
        Ball b3 = new Ball(12.3);
        System.out.println("The value of ball 3 vol is:" + b3.getVolume());
        System.out.println("Trying to add ball 3 to contanier 1");
        if (container1.add(b3) == false) {
            System.out.println("ball 3 can not be added, container size not big enough");
        }
        else {
            System.out.println("Error in BallContainer.add(), the total volume is exceded !");
        }
        System.out.println("");
        // checking the contains method
        if (container1.contains(b1)) {
            System.out.println("ball 1 is inside contanier 1!");
        }
        else {
            System.out.println("Error in BallContainer.contains(), ball 1 is not inside contanier 1 !");
        }

        if (container1.contains(b3)) {
            System.out.println("Error in BallContainer.contains(), ball 3 is inside contanier 1 !");
        }
        else {
            System.out.println("ball 3 is not inside contanier 1!");
        }
        System.out.println("");
        // checking the remove method
        b3.setVolume(0.5);
        System.out.println("The value of ball 3 vol is:" + b3.getVolume());
        container1.add(b3);
        System.out.println("Adding ball 3 to contanier 1");
        System.out.println("now the value of container 1 vol is:" + container1.getVolume());
        System.out.println("now the size of container 1 ContainerSize is:" + container1.getContainerSize());
        System.out.println("now the size of container 1 size is:" + container1.size());
        System.out.println("Removing ball 3 from contanier 1");
        container1.remove(b3);
        System.out.println("now the value of container 1 vol is:" + container1.getVolume());
        System.out.println("now the size of container 1 ContainerSize is:" + container1.getContainerSize());
        System.out.println("now the size of container 1 size is:" + container1.size());
        System.out.println("");
        // checking the clear method
        container1.clear();
        System.out.println("Clearing contanier 1");
        System.out.println("now the value of container 1 vol is:" + container1.getVolume());
        System.out.println("now the size of container 1 ContainerSize is:" + container1.getContainerSize());
        System.out.println("now the size of container 1 size is:" + container1.size());
     }
}
