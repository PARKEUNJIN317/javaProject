package exam.finalalgoex;

public class BinarySearchTreeStorage<E> extends BinarySearchTree<E> {

	public int updateStock(Object o, int num) {
		return updateUsingComparable(o, num);
	}
	
	private int updateUsingComparable(Object o, int num) {
		
		@SuppressWarnings("unchecked")
		Comparable<? super E> value = (Comparable<? super E>) o;
		Node<E> node = super.getRoot();
		
		while (node != null) {
			int res = value.compareTo(node.value);
			if (res < 0) {
				node = node.left;
			} else if (res > 0) {
				node = node.right;
			} else {
				
				Product prd = (Product) node.value;
				int result = prd.getProduct(num);

				if (result == -1) {
					
					return -1;
				}

			
				node.value = (E) prd;
				return result;
			}
		}

		return -2; 
	}
}
