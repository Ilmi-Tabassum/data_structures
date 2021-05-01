package Dummy;


    public class DoublyList {
        public Node head;

        public void DoublyList(Object[] array) {
            head = new Node(null, null, null);
            Node tail = head;
            for (int i = 0; i < array.length; i++) {
                Node n = new Node(array[i], null, null);
                tail.next = n;
                n.prev = tail;
                tail = tail.next;
            }
            tail.next = head;
            head.prev = tail;
        }


        public int countNode() {
            int count = 0;
            for (Node n = head.next; n != head; n = n.next) {
                count++;
            }
            if (count == 0) {
                System.out.println("EMPTY LIST");
            }

            return count;
        }

        Node NodeAt(int idex) {
            Node tail;
            if
            (idex < 0) {
                return null;
            } else {
                int count = 0;
                for (tail = head.next; tail != head; tail = tail.next, count++) {
                    if (count == idex)
                        return tail;
                }
                return null;
            }
        }


        void insertAtLast(Object elem) {
            Node K = new Node(elem, null, null);
            for (Node n = head.next; n != head; n = n.next) {
                if (n.elem == elem) {
                    System.out.println("Element Already Exists in the array");
                    return;
                }
            }
            Node tail = NodeAt(countNode() - 1);
            K.next = head;
            K.prev = tail;
            tail.next = K;
        }


        void insert(Object elem, int idex) {

            Node temp = new Node(elem, null, null);

            if (idex == 0) {
                temp.next = head.next;
                head.next.prev = temp;
                head.next = temp;
                temp.prev = head;
            } else {
                Node preVIOUS = NodeAt(idex - 1);
                temp.next = preVIOUS.next;
                preVIOUS.next.prev = temp;
                preVIOUS.next = temp;
                temp.prev = preVIOUS;
            }
        }

        Object removal(int idx) { //This method removes the Node at the given index of the list

            Object n;
            if (idx == 0) {
                n = head.next.elem;
                head.next = head.next.next;
                head.next.prev = head;
            } else {
                Node pre = NodeAt(idx - 1);
                n = pre.next.elem;
                pre.next = pre.next.next;
                pre.next.prev = pre;
            }
            return n;
        }


        void removeKey(Object elementkey) {

            int count = 0;
            for (Node n = head.next; n != head; n = n.next) {

                if (n.elem == elementkey) {
                    count++;
                    break;

                } else {
                    count++;
                }
            }


            int key = count - 1;
            removal(key);
        }

        void printList() {
            System.out.println();
            for (Node n = head.next; n != head; n = n.next) {
                System.out.print(n.elem + ", ");
            }
        }


        public class Node {
            Object elem;
            Node next;
            Node prev;

            Node(Object E, Node n, Node p) {

                elem = E;
                next = n;
                prev = p;
            }
        }
    }


