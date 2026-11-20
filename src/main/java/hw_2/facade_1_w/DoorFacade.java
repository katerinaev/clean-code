package hw_2.facade_1_w;

public class DoorFacade {
    private final DoorOpen doorOpen;
    private final DoorClose doorClose;
    private final DoorLock doorLock;

    public DoorFacade(DoorOpen doorOpen, DoorClose doorClose, DoorLock doorLock) {
        this.doorOpen = doorOpen;
        this.doorClose = doorClose;
        this.doorLock = doorLock;
    }

    public void openDoor() {
        doorOpen.open();
    }

    public void closeDoor() {
        doorClose.close();
    }

    public void lockDoor() {
        doorLock.lock();
    }
}
