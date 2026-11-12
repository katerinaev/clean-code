package hw_2.facade_1_w;
/**
 * Facade for Door Control (Open, Close, Lock)
 * Description
 * Our system includes several operations for controlling a door:
 * Opening the door.
 * Closing the door.
 * Locking the door.
 * Each operation is implemented in its own class. The task is to create a facade that
 * consolidates these operations and provides a simple interface for interacting with the door.
 */
public class Main {
    public static void main(String[] args) {
        DoorOpen doorOpen = new DoorOpen();
        DoorClose doorClose = new DoorClose();
        DoorLock doorLock = new DoorLock();

        DoorFacade doorFacade =new DoorFacade(doorOpen,doorClose,doorLock);
        doorFacade.openDoor();
        doorFacade.closeDoor();
        doorFacade.lockDoor();
    }
}
