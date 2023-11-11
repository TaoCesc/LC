class MyLinkedList {

    int size;
    ListNode head;


    public MyLinkedList() {
        size = 0;
        head = new ListNode(0);
    }

    public int get(int index) {
        if(index >= size || index < 0){
            return -1;
        }
        ListNode curr = head;
        for (int i = 0; i <= index; i++) {
            curr = curr.next;
        }
        return curr.val;
    }

    public void addAtHead(int val) {
        addAtIndex(0, val);
    }

    public void addAtTail(int val) {
        addAtIndex(size, val);
    }

    public void addAtIndex(int index, int val) {
        if(index > size){
            return;
        }
        if(index < 0){
            index = 0;
        }
        size++;
        ListNode pre = head;
        for (int i = 0; i < index; i++) {
            pre = pre.next;
        }
        ListNode add = new ListNode(val);
        add.next = pre.next;
        pre.next = add;
    }

    public void deleteAtIndex(int index) {
        if(index < 0 || index >= size){
            return;
        }
        size--;
        if(index == 0){
            head = head.next;
            return;
        }
        ListNode pre = head;
        for (int i = 0; i < index; i++) {
            pre = pre.next;
        }
        pre.next = pre.next.next;
    }
}


