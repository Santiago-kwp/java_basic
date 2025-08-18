package java_advanced_01.day15.collection.treeEx.bst;

// 노드 클래스 만들기
public class NodeMgmt {
    Node head = null; // 시작 노드의 주소값

    public class Node {
        Node left, right; // 노드 형 참조변수 left, right branch
        int value;        // 노드에 포함될 데이터 값
        public Node(int value) {
            this.value = value;
            this.left = null;
            this.right = null;
        }
    }

    public boolean insertNode(int data) {
        // CASE 1 : 노드가 하나도 없을 때
        if (head == null) {
            this.head = new Node(data);
        }
        // CASE 2 : 노드가 하나 이상 들어가 있을 때
            // CASE 2-1 : 현재 노드와 값을 비교했을 때 왼쪽에 Node가 들어가야 할 때

            // CASE 2-2 : 현재 노드와 값을 비교했을 때 오른쪽에 Node가 들어가야 할 때
        else {
            Node findNode = this.head;

            while (findNode != null) {

                if (findNode.value > data) {
                    if (findNode.left == null) {
                        findNode.left = new Node(data);
                        break;
                    } else {
                        findNode = findNode.left;
                    }
                }
                else {
                    if (findNode.right == null) {
                        findNode.right = new Node(data);
                        break;
                    } else {
                        findNode = findNode.right;
                    }
                }
            }
        }
        return true;
    }

    public void printNodes() {
        // 중위 순회 기준
        inOrderTraversal(head);
        System.out.println();
    }
    private void inOrderTraversal(Node node) {
        if (node == null) { return; }
        // 1. 왼쪽 자식 순회
        inOrderTraversal(node.left);

        // 2. 현재 노드값 출력
        System.out.print(node.value + " ");

        // 3. 오른쪽 자식 순회
        inOrderTraversal(node.right);
    }

    public static void main(String[] args) {
        NodeMgmt nm = new NodeMgmt();
        nm.insertNode(89);
        nm.insertNode(76);
        nm.insertNode(25);
        nm.insertNode(40);

        nm.printNodes();


    }


}
