package yaksha;

/* Class BSTNode */
public class BSTNode {
	BSTNode left, right;
	int data;

	/* Constructor */
	public BSTNode() {
		left = null;
		right = null;
		data = 0;
	}

	/* Constructor */
	public BSTNode(int n) {
		left = null;
		right = null;
		data = n;
	}

	/* Method to set left node */
	public void setLeft(BSTNode n) {
		left = n;
	}

	/* Method to set right node */
	public void setRight(BSTNode n) {
		right = n;
	}

	/* Method to get left node */
	public BSTNode getLeft() {
		return left;
	}

	/* Method to get right node */
	public BSTNode getRight() {
		return right;
	}

	/* Method to set data to node */
	public void setData(int d) {
		data = d;
	}

	/* Method to get data from node */
	public int getData() {
		return data;
	}
}
