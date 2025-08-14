package java_advanced_01.day15.collection.linkedListEx;

public class SingleLinkedListEx<T> {
    public Node<T> head = null; // 인스턴스 변수 head 선언

    public class Node<T> { // 이너 클래스
        T data; // 인스턴스 변수로 data를 가짐
        Node<T> next = null; // 포인터
        public Node(T data) {
            this.data = data;
        }
    }

    // tail에 대한 별도의 참조(포인터)를 가지고 있지 않으므로,
    // 리스트의 끝에 새로운 원소를 추가하기 위해서는 리스트의 맨 처음 노드(head)부터 시작해서
    // next 노드를 따라가며 마지막 노드까지 순회해야 합니다.

    public void addNode(T data){
        if(head == null) {
            head = new Node<T>(data); // 데이터가 하나도 없으면 새로 받은 데이터로 head를 새로 생성함.
        } else {
            Node<T> node = this.head;
            while(node.next != null) { // 다음 노드가 없을 때까지 next 노드를 찾자. 시간복잡도는 O(n)
                node = node.next;
            }
            node.next = new Node<>(data); // 더이상 다음 노드가 없다면 새로운 노드를 다음 노드로 연결
        }
    }

    public void addNodeInside(T data, T isData) { // T isData 뒤에 T data 를 넣기!
        // 데이터가 없으면
        if (head == null) {
            addNode(data);
            return;
        }
        Node<T> node = this.head;
        while(node != null) {
            if (isData.equals(node.data)) { // T isData와 현재 노드의 데이터가 같으면 뒤에 넣고 연결하기
                Node<T> oldNode = node.next;
                node.next = new Node<>(data);
                node.next.next = oldNode;
                return;
            }
            node = node.next;
        }
    }

    /*
    public void addNodeInside(T data, int index) { ///  1, 2, 3 addNodeInside(5,1) 1,5,2,3
        if (index == 0) { // 0 인 경우 기존의 head를 교체해야됨.
            Node<T> newNode = new Node<T>(data);
            newNode.next = this.head;
            this.head = newNode;
            return; // 메소드 종료
        }
        // 그 외 index가 1 이상인 경우
        int nodeIdx = 1; // -1부터 하면 if 문을 뺄수도 있나? 고민해보자 => 안될 것 같다. 헤드를 교체하는 로직은 꼭 필요하기 때문에..
        Node<T> node = this.head;
        while(node.next != null && nodeIdx < index) {
            node = node.next;
            nodeIdx++;
        }

        Node<T> oldNode = node.next;
        node.next = new Node<>(data); // 새로운 노드를 다음 노드로
        node.next.next = oldNode;     // 기존 다음 노드를 새로운 노드의 다음으로 연결
    }

     */

    public Node<T> search(T data){
        // 노드가 아무 것도 없는 경우
        if (head == null) {
            return null;
        }
        Node<T> node = this.head;
        while(node != null) {
            if(data.equals(node.data)){
                return node;
            }
            node = node.next;
        }
        // 못 찾은 경우
        return null;
    }

    public boolean deleteNode(T isData){
        // 노드가 아무 것도 없는 경우
        if (head == null) {
            return false;
        }
        // 헤드가 지우려는 데이터인 경우
        Node<T> node = this.head;
        if(isData.equals(node.data)){
            head = head.next;
            return true;
        }
        while(node.next != null) {
            if (isData.equals(node.next.data)) { // 지우려는 객체가 있으면 해당 객체와의 관계를 끊어야 된다.
                node.next = node.next.next;
                return true;
            }
            node = node.next;
        }
        return false;
    }


    public void printAll() {
        if (head != null) {
            Node<T> node = this.head;
            System.out.print(node.data+ " ");
            while(node.next != null) {
                node = node.next;
                System.out.print(node.data+ " ");
            }
            System.out.println();
        } else {
            System.out.println("데이터가 없습니다.");
        }
    }

    public static void main(String[] args) {
        SingleLinkedListEx<Integer> myLinkedList = new SingleLinkedListEx<>();
        myLinkedList.addNode(1);
        myLinkedList.addNode(2);
        myLinkedList.addNode(3);
        myLinkedList.addNode(4);
        myLinkedList.addNode(6);

        System.out.println(myLinkedList.head.data);           // 1
        System.out.println(myLinkedList.head.next.data);      // 2
        System.out.println(myLinkedList.head.next.next.data); // 3

        myLinkedList.printAll();

        myLinkedList.addNodeInside(5, 2);
        myLinkedList.printAll();

        System.out.println(myLinkedList.search(6));

        myLinkedList.deleteNode(1);
        myLinkedList.deleteNode(2);
        myLinkedList.deleteNode(4);
        myLinkedList.printAll();

    }

}
