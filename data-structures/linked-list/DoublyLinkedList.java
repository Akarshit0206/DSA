import java.util.NoSuchElementException;
import java.util.Objects;

public class DoublyLinkedList<T> {
  private Node head;
  private Node tail;
  private int size;

  public DoublyLinkedList() {
    size = 0;
  }

  public void addFirst(T val) {
    Node node = new Node(val);
    node.next = head;

    if (head != null)
      head.prev = node;
    head = node;
    if (tail == null)
      tail = head;
    size++;
  }

  public void addLast(T val) {
    if (size == 0) {
      addFirst(val);
      return;
    }
    Node node = new Node(val);
    tail.next = node;
    node.prev = tail;
    tail = node;
    size++;
  }

  public void addAt(int index, T val) {
    if (index < 0 || index > size)
      throw new IndexOutOfBoundsException("Invalid Index!!");
    if (index == 0) {
      addFirst(val);
      return;
    }
    if (index == size) {
      addLast(val);
      return;
    }
    Node node = get(index);
    Node previous = node.prev;
    Node createdNode = new Node(val, previous, node);
    node.prev = createdNode;
    previous.next = createdNode;
    size++;
  }

  public T removeFirst() {
    if (head == null)
      throw new NoSuchElementException();
    T removed = head.val;
    if (head == tail) {
      head = null;
      tail = null;
      size--;
      return removed;
    }
    head = head.next;
    head.prev = null;
    size--;
    return removed;
  }

  public T removeLast() {
    if (size <= 1)
      return removeFirst();
    T removed = tail.val;
    tail.prev = null;
    tail = tail.prev;
    tail.next = null;
    size--;
    return removed;
  }

  public T removeAt(int index) {
    if (index < 0 || index >= size)
      throw new IndexOutOfBoundsException("Invalid Index!!!");
    if (index == 0)
      return removeFirst();
    if (index == size - 1)
      return removeLast();
    Node toDelete = get(index);
    T removed = toDelete.val;
    Node previous = toDelete.prev;
    Node ahead = toDelete.next;
    previous.next = ahead;
    ahead.prev = previous;
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

  public boolean contains(T val) {
    return find(val) == null;
  }

  public int size() {
    return size;
  }

  public boolean isEmpty() {
    return size == 0;
  }

  public void clear() {
    head = null;
    tail = null;
    size = 0;
  }

  public Node get(int index) {
    if (index < 0 || index >= size)
      throw new IndexOutOfBoundsException("Invalid Index!!");
    if (index < size / 2) {
      Node node = head;
      for (int i = 0; i < index; i++)
        node = node.next;
      return node;
    } else {
      Node node = tail;
      for (int i = size - 1; i >= 0; i--) {
        node = node.prev;
      }
      return node;
    }
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

  public void displayReversed() {
    if (size == 0)
      System.out.println("List is Empty!!");

    System.out.print("[ ");
    Node temp = tail;
    while (temp != null) {
      System.out.print(temp.val);
      temp = temp.prev;
      if (temp != null) {
        System.out.print("<-");
      }
    }
    System.out.println("]");

  }

  private class Node {
    Node next;
    Node prev;
    T val;

    Node(T val) {
      this.val = val;
    }

    Node(T val, Node prev, Node next) {
      this.val = val;
      this.next = next;
      this.prev = prev;
    }
  }

}
