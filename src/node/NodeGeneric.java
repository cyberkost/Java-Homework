package node;

public class NodeGeneric<T extends Comparable<T>> {
    private T value;
    private NodeGeneric<T> left;
    private NodeGeneric<T> right;

    public T getValue() {
        return value;
    }

    private boolean isNodeExists(NodeGeneric<T> node) {
        return node == null || node.value == null;
    }

    public void createNode(NodeGeneric<T> node, T value) {
        node.left = new NodeGeneric<T>();
        node.right = new NodeGeneric<T>();
        node.value = value;
    }

    public void insert(NodeGeneric<T> node, T value) {
        if (isNodeExists(node))
            createNode(node, value);
        else if (value.compareTo(node.value) < 0) {
            insert(node.left, value);
        } else
            insert(node.right, value);
    }

    private NodeGeneric<T> search(NodeGeneric<T> node, T value) {
        if (isNodeExists(node)) {
            return null;
        }
        if (value.compareTo(node.value) == 0) {
            return node;
        }
        if (value.compareTo(node.value) < 0) {
            return search(node.left, value);
        }
        return search(node.right, value);
    }

    public NodeGeneric<T> getMin(NodeGeneric<T> node) {
        if (isNodeExists(node)) return null;
        if (isNodeExists(node.left)) return node;
        return getMin(node.left);
    }

    public NodeGeneric<T> getMax(NodeGeneric<T> node) {
        if (isNodeExists(node)) return null;
        if (isNodeExists(node.right)) return node;
        return getMax(node.right);
    }

    public void inOrderTraversal(NodeGeneric<T> node) {
        if (isNodeExists(node)) return;
        inOrderTraversal(node.left);
        System.out.print(node.value + "->");
        inOrderTraversal(node.right);
    }

    public void postOrderTraversal(NodeGeneric<T> node) {
        if (isNodeExists(node)) {
            return;
        }
        postOrderTraversal(node.left);
        postOrderTraversal(node.right);
        System.out.print(node.value + "->");
    }

    public void directOrderTraversal(NodeGeneric<T> node) {
        if (isNodeExists(node)) {
            return;
        }
        System.out.print(node.value + "->");
        directOrderTraversal(node.left);
        directOrderTraversal(node.right);
    }

    private void moveNode(NodeGeneric<T> toNode, NodeGeneric<T> fromNode) {
        toNode.value = fromNode.value;
        toNode.left = fromNode.left;
        toNode.right = fromNode.right;
    }

    private int getChildrenCount(NodeGeneric<T> node) {
        int count = 0;
        if (!isNodeExists(node.left)) {
            count += 1;
        }
        if (!isNodeExists(node.right)) {
            count += 1;
        }
        return count;
    }

    public boolean remove(NodeGeneric<T> root, T value) {
        NodeGeneric<T> nodeToDelete = search(root, value);
        if (isNodeExists(nodeToDelete)) {
            return false;
        }
        int childrenCount = getChildrenCount(nodeToDelete);
        if (childrenCount < 2) {
            removeNodeWithOneOrChildWithoutChildren(nodeToDelete);
        } else {
            NodeGeneric<T> minNode = getMin(nodeToDelete.right);
            assert minNode != null;
            nodeToDelete.value = minNode.value;
            removeNodeWithOneOrChildWithoutChildren(minNode);
        }
        return true;
    }

    private void removeNodeWithOneOrChildWithoutChildren(NodeGeneric<T> nodeToDelete) {
        NodeGeneric<T> childOrNull = getChildOrNull(nodeToDelete);
        moveNode(nodeToDelete, childOrNull);
    }

    private NodeGeneric<T> getChildOrNull(NodeGeneric<T> node) {
        return isNodeExists(node.left) ? node.right : node.left;
    }
}
