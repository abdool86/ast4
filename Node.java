public class Node {

    Record data; 
    Node left, right;
    Node parent;
  
    public Node(Record key) 
    { 
        this.data = key; 
        this.parent = null;
        this.left = null;
        this.right = null; 
    }
    
    public Node(Node parent, Record data) {
    	this.parent = parent;
    	this.data = data;
    	this.left = null;
    	this.right = null;
    }
    
    public Record getData() {
    	return this.data;
    }
    
    public void setData(Record data) {
    	this.data = data;
    }
    
    public Node getLeft() {
    	return this.left;
    }
    
    public Node getRight() {
    	return this.right;
    }
    
    public void setParent(Node parent) {
    	this.parent = parent;
    }
    
    public void setLeft(Node left) {
    	this.left = left;
    	
    }
    
    public void setRight(Node right) {
    	this.right = right;
    }
    
    /*
    public boolean isLeaf() {
    	if(left == null && right == null) {
    		return true;
    	}else {
    		return false;
    	}
    }
    */
    
    public static void main(String args[]) {
    	Record t = new Record(new Pair("abdool86", "stuff"), "music"); 
    	Node test = new Node(t);
    	
    	System.out.println(test.getLeft());
    	Record y = new Record(new Pair("roro", "shows"), "stuff");
    	test.setLeft(new Node(y));
    	
    	test.getLeft();
    	
    }

}
