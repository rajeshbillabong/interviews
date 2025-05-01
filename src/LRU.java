import java.util.HashMap;

public class LRU {
    
    private int cap;
    private HashMap<Integer, Node> cache;
    private Node left;
    private Node right;
    

    public LRU(int capacity) {
        this.cap = capacity;
        this.cache = new HashMap<>();
        this.left = new Node(0, 0);
        this.right = new Node(0, 0);
        this.left.next = this.right;
        this.right.prev = this.left;
    }

    
    
    public int get(int key) {
        if (cache.containsKey(key)) {
            Node node = cache.get(key);
            remove(node);
            insert(node);
            return node.val;
        }
        return -1;
    }
    
    

    public void put(int key, int value) {
        if (cache.containsKey(key)) {
            remove(cache.get(key));
        }
        Node newNode = new Node(key, value);
        cache.put(key, newNode);
        insert(newNode);

        if (cache.size() > cap) {
            Node lru = this.left.next;
            remove(lru);
            cache.remove(lru.key);
        }
    }
    
    
    
    private void remove(Node node) {
        Node prev = node.prev;
        Node nxt = node.next;
        prev.next = nxt;
        nxt.prev = prev;
    }

    private void insert(Node node) {
        Node prev = this.right.prev;
        prev.next = node;
        node.prev = prev;
        node.next = this.right;
        this.right.prev = node;
    }
    
    
    
    public static void main(String[] args) {
    	System.out.println("start ...");
    	LRU lru = new LRU(10);
    	System.out.println("created LRU ...");
    	    	
    	lru.put(9, 9);
    	lru.put(3, 3);
    	lru.put(5, 5);
    	lru.put(7, 7);
    	lru.get(9);
    	lru.get(5);
    	System.out.println("LRU:"+lru);

    	
    }
    
    
    

	@Override
	public String toString() {
		return "LRU [cap=" + cap + ", cache=" + cache	 + ", left=" + left.key+"|"+left.val + ", right=" + right.key+"|"+ right.val + "]";
	}
	
	public class Node {
		
	    int key;
	    int val;
	    Node prev;
	    Node next;

	    public Node(int key, int val) {
	        this.key = key;
	        this.val = val;
	        this.prev = null;
	        this.next = null;
	    }

	 
	}

    
}