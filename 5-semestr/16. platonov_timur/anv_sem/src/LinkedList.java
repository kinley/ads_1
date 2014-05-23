public class LinkedList {
    private String key;
    private int value;
    private LinkedList next;
    private LinkedList head;

    public LinkedList() {
        this.next = null;
        this.head = null;
    }

    public void add(String key, int value) {
        LinkedList tmp = new LinkedList();
        tmp.key = key;
        tmp.value = value;
        tmp.next = head;
        head = tmp;
    }

    public int getValue(String key) {
        LinkedList tmp = head;
        while (tmp != null) {
                if (tmp.key.equals(key)) {
                return tmp.value;
            }
            else {
                tmp = tmp.next;
            }
        }

        return 0; // element doesn't exist
    }

    public boolean exist(String key) {
        LinkedList tmp = head;
        while (tmp != null) {
            if (tmp.key.equals(key)) {
                return true;
            }
            tmp = tmp.next;
        }
        return false;
    }

    public void setValue(String key, int value) {
        LinkedList tmp = head;
        while (tmp != null) {
            if (tmp.key.equals(key)) {
                tmp.value = value;
                return;
            }
            tmp = tmp.next;
        }
    }
}