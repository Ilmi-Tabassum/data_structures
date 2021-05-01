public class MyList {
    public Node head;


    public MyList(Node h) {
        head = h;
    }
    // Ilmi Tabassum ID:17101130

    public MyList(int[] a) {
//        try {
//            int length = a.length;
//            if (length == 0) {
//                throw new IllegalArgumentException("excepted a non empty array");
//            } else {

                head = new Node(a[0], null);
                Node tail = head;

                for (int i = 1; i < a.length; i++) {
                    Node n = new Node(a[i], null);
                    tail.next = n;
                    tail = tail.next;

                }
            }
//        } catch (IllegalArgumentException e) {
//            System.out.println("---");
  //      }
 //   }


    public void showList() {

        for (Node n = head; n != null; n = n.next) {
            System.out.print(n.element + " ");
        }


        if (head == null) {
            System.out.println("empty list");
        }
    }

    public int count() {
        int count = 0;
        for (Node n = head; n != null; n = n.next) {
            count++;
        }
        return count;
    }

    public Node copyList() {
        Node Head = null;
        Node Tail = null;
        for (Node n = head; n != null; n = n.next) {
            Node newNode = new Node(n.element, null);
            if (Head == null) {
                Head = newNode;
                Tail = Head;
            } else {
                Tail.next = newNode;
                Tail = Tail.next;
            }
        }
        return Head;
    }

    public boolean isEmpty() {
        // TO DO
        boolean a;
        if (head == null) {
            a = true;
        } else {

            a = false;
        }

        return a;

    }

    public void clear() {
        for (Node n = head; n != null; n = n.next) {
            n.element = 0;

        }

    }

    public Node nodeAt(int size, int idx) {
        if (idx < 0 || idx >= count()) {
            return null;
        }

        Node n = head;
        for (int i = 0; i < idx; i++, n = n.next) {

        }
        return n;
    }


    public void insertTail(int e) {


        //create a new Node and store a data.
        if (head == null) {
            System.out.print(isEmpty() + "  ");
        } else {
            for (Node n = head; n != null; n = n.next) {
                if (n.element == e) {
                    System.out.println("already exists");
                    return;
                }


            }
        }
//            without using nodeAt
//        Node node = new Node(e, null);
//        node.element = e;
//        node.next = null;
//
//
//        Node tempNode = head;
//        while (tempNode.next != null) {
//            tempNode = tempNode.next;
//        }
//
//        //assign new node.
//        tempNode.next = node;
//    }

            int idx = count();
            Node newNode = new Node(e, null);
            Node prev = nodeAt(7,idx-1);
            prev.next = newNode;
        }


    public void insert(int e, int index) {
        if (index < 0 || index > count()) {
            System.out.println("Not possible invalid index");


        } else {
            for (Node n = head; n != null; n = n.next) {
                if (n.element == e) {
                    System.out.println("already exists");
                    return;
                }
            }

//            without using nodeAt
//            Node node = new Node(e, null);
//            node.element = e;
//            node.next = null;
//
//
//            if (head.next == null) {
//
//                System.out.println(isEmpty());
//                if (index != 0) {
//                    return;
//                } else {
//                    head = node;
//                }
//            }
//
//            if (head != null && index == 0) {
//                node.next = head;
//                head = node;
//                return;
//            }
//
//            Node current = head;
//            Node previous = null;
//
//            int i = 0;
//
//            while (i < index) {
//                previous = current;
//                current = current.next;
//
//                if (current == null) {
//                    break;
//                }
//
//                i++;
//            }
//
//            node.next = current;
//            previous.next = node;
//        }
            Node newNode = new Node(e, null);
            if (index == 0) {
                newNode.next = head;
                head = newNode;
            } else {
                Node priv = nodeAt(7, index - 1);
                newNode.next = priv.next;
                priv.next = newNode;

            }
        }
    }

    public void deleteNode(int elem) {

        Node n = head, prev = null;

        if (n != null && n.element == elem) {
            head = n.next;
            return;
        }


        while (n != null && n.element != elem) {
            prev = n;
            n = n.next;
        }


        if (n == null)
            return;

        prev.next = n.next;
        System.out.println("deleteKey  " + elem);
    }

    public void Removal5() {

        Node Head = null, last = null;
        Node temp = this.head;


        while (temp != null) {
            if (temp.element % 5== 1) {
                if (Head == null) {
                    Head = last = temp;
                } else {
                    last.next = temp;
                    last = temp;
                }
            }

            temp = temp.next;
        }

        if (Head != null) {
            this.head = Head;
        }

        if (last != null) {
            last.next = null;
        }

    }

    public int calculateSum() {
        Node node = head;
        int sum = 0;
        while (node != null) {
            sum += node.element;
            node = node.next;
        }
        return sum;
    }

    public boolean contains(int elem) {
        for (Node n = head; n != null; n = n.next) {
            if (n.element == elem)
                return true;
        }
        return false;
    }

    public Node reverseList() {
     Node reverseElement = new Node( head.element, null);

      for (Node n = head.next; n != null; n= n.next) {
         Node NewTemp = new Node(n.element, reverseElement);
        reverseElement = NewTemp;
    }
         return reverseElement;

     }

    public void printListAd() {
        Node temp = head;
        while (temp.next != null) {
            System.out.print(temp.element + "->");
            temp = temp.next;
        }
        System.out.print(temp.element +".");
    }



    public void sortList() {

        Node cur = head, index;
        int temp;
        if(head == null) {
            return;
        }
        else {
            while(cur != null) {
                index = cur.next;
                while(index != null) {

                    if(cur.element >= index.element) {
                        temp = cur.element;
                        cur.element = index.element;
                        index.element = temp;
                    }
                    index = index.next;
                }
                cur = cur.next;
            }
        }
    }

    public void rotateleft(int element) {
        for (int i = 0; i < element; i++) {
            rotateLeft();

        }
    }

           public void rotateLeft() {
               Node temp = head;
               head = head.next;
               temp.next = null;
               Node n = head;
               for (; n.next != null; n = n.next) {

               }
                   n.next = temp;

           }



   public void rotateright(int element) {
      for (int i = 0; i < element; i++) {
            rotateRight();

       }
   }

   public void rotateRight() {
       Node n = head;
       for( ; n.next.next!=null; n=n.next){

       }
       Node temp = n.next;
       n.next = null;
       temp.next = head;
       head = temp;
   }

}












