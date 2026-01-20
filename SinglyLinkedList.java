class Node{
    int data;
    Node next;

    Node(int data){
        this.data = data;
        this.next = null;
    }
}

public class SinglyLinkedList {

    Node head;

    void addAtTail(int data){
        Node newNode = new Node(data);

        if(head == null){
            head = newNode;
        }

        else {
            Node temp=head;
            while(temp.next!=null){
                temp=temp.next;
            }
            temp.next=newNode;
        }
    }

    void display(){
        Node temp=head;

        while(temp!=null){
            System.out.print(temp.data + " -> ");
            temp=temp.next;
        }
        System.out.println("null");
    }

    void deleteNode(int key){
        Node temp =head, prev =null;

        if(temp!=null && temp.data==key){
            head=temp.next;
            return;
        }

        while(temp!=null && temp.data!=key){
            prev = temp;
            temp=temp.next;
        }

        if(temp==null) return;

        prev.next=temp.next;
    }

    public static void main(String[] args){
        SinglyLinkedList list=new SinglyLinkedList();

        list.addAtTail(10);
        list.addAtTail(20);
        list.addAtTail(30);
        list.display();

        list.deleteNode(20);
        list.display();
    }
}


