package hw_2.facade_1_w;

public class DoorFacade {
    private DoorOpen doorOpen;
    private DoorClose doorClose;
    private DoorLock doorLock;

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
