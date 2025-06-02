import java.util.NoSuchElementException;
import java.util.Objects;

public class SinglyLinkedList<T> {
  private Node head;
  private Node tail;
  private int size;

  SinglyLinkedList() {
    size = 0;
  }

  public void addFirst(T val) {
    Node node = new Node(val);
    node.next = head;
    head = node;

    if (tail == null) {
      tail = head;
    }
    size++;
  }

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
    if (index > size || index < 0) {
      throw new IndexOutOfBoundsException("Invalid Index !!");
    }
    if (size == index) {
      addLast(val);
      return;
    }
    if (index == 0) {
      addFirst(val);
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
      throw new NoSuchElementException("List is Empty");
    }
    T removed = head.val;
    head = head.next;
    if (head == null)
      tail = null;

    size--;
    return removed;
  }

  public T removeLast() {
    if (size <= 1)
      return removeFirst();

    T removed = tail.val;
    Node secondLastNode = get(size - 2);
    tail = secondLastNode;
    tail.next = null;
    size--;
    return removed;

  }

  public T removeAt(int index) {
    if (index < 0 || index >= size)
      throw new IndexOutOfBoundsException("Invalid index");

    if (index == 0)
      return removeFirst();

    if (index == size - 1)
      return removeLast();
    Node prev = get(index - 1);
    Node todelete = prev.next;
    T removed = todelete.val;
    prev.next = todelete.next;
    todelete.next = null;
    size--;
    return removed;

  }

  public Node find(T value) {
    Node node = head;
    while (node != null) {
      if (Objects.equals(node.val, value)) {
        return node;
      }
      node = node.next;
    }
    return null;
  }

  public int size() {
    return size;
  }

  public boolean contains(T val) {
    return find(val) != null;
  }

  public boolean isEmpty() {
    return size == 0;
  }

  public void clear() {
    head = null;
    tail = null;
    size = 0;
  }

  public T getFirst() {
    if (head == null)
      throw new NoSuchElementException("List is Empty !!!");
    return head.val;
  }

  public T getLast() {
    if (tail == null)
      throw new NoSuchElementException("List is Empty !!!");
    return tail.val;
  }

  public Node get(int index) {
    if (index < 0 || index >= size)
      throw new IndexOutOfBoundsException();
    Node node = head;
    for (int i = 0; i < index; i++) {
      node = node.next;
    }
    return node;
  }

  public void show() {
    Node temp = head;
    System.out.print("[");
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

    Node(T val, Node node) {
      this.val = val;
      this.next = node;
    }
  }

  public static void main(String[] args) {

    SinglyLinkedList<Integer> li = new SinglyLinkedList<>();

    System.out.println(li.contains(10));
    li.addLast(50);
    li.addLast(100);
    li.addFirst(600);
    li.addAt(1, 75);
    li.addAt(0, 25);
    li.addAt(5, 1000);
    li.show();
    li.removeAt(3);
    li.addLast(null);
    System.out.println(li.removeAt(0));
    System.out.println(li.find(null));
    li.show();
    li.size();

  }
}
