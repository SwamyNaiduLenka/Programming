class Node[T](var data: T, var prev: Option[Node[T]] = None, var next: Option[Node[T]] = None)

class DoublyLinkedList[T] {
  var head: Option[Node[T]] = None
  var tail: Option[Node[T]] = None

  def append(data: T): Unit = {
    val newNode = new Node(data)
    if (head.isEmpty) {
      head = Some(newNode)
      tail = Some(newNode)
    } else {
      newNode.prev = tail
      tail.get.next = Some(newNode)
      tail = Some(newNode)
    }
  }

  def display(): Unit = {
    var current = head
    while (current.isDefined) {
      print(current.get.data + " <-> ")
      current = current.get.next
    }
    println("null")
  }

  def delete(data: T): Unit = {
    head = deleteNode(head, data)
  }

  private def deleteNode(node: Option[Node[T]], data: T): Option[Node[T]] = {
    if (node.isEmpty) {
      return None
    }

    if (node.get.data == data) {
      if (node.get.prev.isDefined) {
        node.get.prev.get.next = node.get.next
      } else {
        head = node.get.next
      }

      if (node.get.next.isDefined) {
        node.get.next.get.prev = node.get.prev
      } else {
        tail = node.get.prev
      }
    } else {
      deleteNode(node.get.next, data)
    }

    node
  }

  def insertAfter(prevData: T, newData: T): Unit = {
    head = insertAfterNode(head, prevData, newData)
  }

  private def insertAfterNode(node: Option[Node[T]], prevData: T, newData: T): Option[Node[T]] = {
    if (node.isEmpty) {
      return None
    }

    if (node.get.data == prevData) {
      val newNode = new Node(newData)
      newNode.prev = Some(node.get)
      newNode.next = node.get.next
      node.get.next = Some(newNode)

      if (newNode.next.isDefined) {
        newNode.next.get.prev = Some(newNode)
      } else {
        tail = Some(newNode)
      }
    } else {
      insertAfterNode(node.get.next, prevData, newData)
    }

    node
  }
}

object DoubleLinkLists {
  def main(args: Array[String]): Unit = {
    val doublyLinkedList = new DoublyLinkedList[Int]

    doublyLinkedList.append(1)
    doublyLinkedList.append(2)
    doublyLinkedList.append(3)

    println("Doubly Linked List:")
    doublyLinkedList.display()

    doublyLinkedList.delete(2)
    println("\nDoubly Linked List after deleting 2:")
    doublyLinkedList.display()

    doublyLinkedList.insertAfter(1, 4)
    println("\nDoubly Linked List after inserting 4 after 1:")
    doublyLinkedList.display()
  }
}