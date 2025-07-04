import java.util.NoSuchElementException;
import java.util.Objects;

public class SinglyLinkedList<T> {
  private Node head;
  private Node tail;
  private int size = 0;

  public SinglyLinkedList() {
    size = 0;
  }

  public void addFirst(T val) {
    Node node = new Node(val);
    node.next = head;
    head = node;

    if (tail == null)
      tail = head;
    size++;
  };

  public void addLast(T val) {
    if (tail == null) {
      addFirst(val);
      return;
    }
    Node node = new Node(val);
    tail.next = node;
    tail = node;
    size++;
  }

  public void addAt(int index, T val) {
    if (index > size || index < 0)
      throw new IndexOutOfBoundsException("Invalid Index!!");
    if (index == 0) {
      addFirst(val);
      return;
    }
    if (index == size) {
      addLast(val);
      return;
    }
    Node temp = head;
    for (int i = 0; i < index - 1; i++) {
      temp = temp.next;
    }
    Node node = new Node(val, temp.next);
    temp.next = node;
    size++;
  }

  public T removeFirst() {
    if (head == null) {
      throw new NoSuchElementException("List is empty!!");
    }
    T removed = head.val;
    head = head.next;
    if (head == null) {
      tail = head;
    }
    size--;
    return removed;
  }

  public T removeLast() {
    if (size <= 1) {
      return removeFirst();
    }
    T removed = tail.val;
    Node secondLastNode = get(size - 2);
    tail = secondLastNode;
    tail.next = null;
    size--;
    return removed;
  }

  public T removeAt(int index) {
    if (index < 0 || index >= size) {
      throw new IndexOutOfBoundsException();
    }
    if (index == 0)
      return removeFirst();
    if (index == size - 1)
      return removeLast();
    Node prev = get(index - 1);
    Node toDelete = prev.next;
    T removed = toDelete.val;
    prev.next = toDelete.next;
    toDelete.next = null;
    size--;
    return removed;

  }

  public Node find(T val) {
    Node node = head;
    while (node != null) {
      if (Objects.equals(node.val, val))
        return node;
      node = node.next;
    }
    return null;
  }

  public int size() {
    return size;
  }

  public T getFirst() {

    return head.val;
  }

  public T getLast() {
    return tail.val;
  }

  public boolean contains(T val) {
    return find(val) != null;
  }

  public Node get(int index) {
    if (index >= size || index < 0)
      throw new IndexOutOfBoundsException("Invalid index!!");
    Node node = head;
    for (int i = 0; i < index; ++i) {
      node = node.next;
    }
    return node;
  }

  public void clear() {
    head = null;
    tail = null;
    size = 0;
  }

  public boolean isEmpty() {
    return size == 0;
  }

  public void display() {
    if (size == 0)
      System.out.println("List is Empty!!");
    System.out.print("[ ");
    Node temp = head;
    while (temp != null) {
      System.out.print(temp.val);
      temp = temp.next;
      if (temp != null) {
        System.out.print("->");
      }
    }
    System.out.println("]");

  }

  class Node {
    private T val;
    private Node next;

    Node(T val) {
      this.val = val;
    }

    Node(T val, Node next) {
      this.val = val;
      this.next = next;
    }
  }

}
