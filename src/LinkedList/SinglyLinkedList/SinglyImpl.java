package LinkedList.SinglyLinkedList;

public class SinglyImpl {
    private Node<String> head;

    public SinglyImpl(Node<String> head){
        this.head = head;
    }

    public void addToEnd(Node<String> newNode){
        Node<String> current = head;
        while(current.next != null){
            current = current.next;
        }
        current.next = newNode;
    }
    public void addToHead(Node<String> newNode){
        Node<String> current = head;
        head = newNode;
        head.next = current;
    }

    public void printList(){
        Node<String> current = head;
        while(current != null){
            System.out.print(current.data);
            System.out.print("-->");
            current = current.next;
        }
        System.out.println("null");
    }

    public void addToMiddle(Node<String> newNode, int position){
        int counter = 1;
        Node<String> current = head;

        while(counter != position-1 && current.next != null){
            current = current.next;
            counter++;
        }
        Node<String> temp = current.next;
        current.next = newNode;
        newNode.next = temp;

    }

}
class mainMethod{
    public static void main(String[] args) {
        Node<String> nodeOne = new Node<>("John");
        SinglyImpl list = new SinglyImpl(nodeOne);
        list.addToEnd(new Node<>("Tope"));
        list.addToEnd(new Node<>("Tayo"));
        list.printList();
        list.addToHead(new Node<>("Kelvin"));
        list.printList();
        list.addToMiddle(new Node<>("Dimeji"), 2);
        list.printList();

    }
}
