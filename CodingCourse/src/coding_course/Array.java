/**
 * @author Makya
 */
package coding_course;

/**
 * This class creates a manual implementation of the Array Class. 
 */
public class Array {

	// Stores items of the array
	private int[] items;
	// Stores the count of items actually added to the array.
	private int count;

	// Constructor
	
	/**
	 * Constructs an Array object with the given length.
	 * @param length The length of the array.
	 */
	public Array(int length) {
		items = new int [length];
	}

	/**
	 * This method will print all items present in the array to the 
	 * command line. 
	 */
	public void print()
	{
		for(int i = 0; i < count; i++)
			System.out.println(items[i]);
	}

	/**
     * Inserts an item into the array. If the array is full, it resizes the array.
     * @param item The item to be inserted.
     */
	public void insert(int item)
	{
		// If array is full, resize it.
		if(items.length == count)
		{
			// Create new array that is twice the size
			int[] temp = new int [count * 2];
		
			// Copy existing items into new array 
			for(int i = 0; i < count; i++)
				temp[i] = items[i];
		
			// Set items to the new array
			items = temp;
		}
		// Add the new item at the end.
		items[count] = item; // Alternately items[count++] = item;
		count++;
	}

	/**
     * Removes the item at the specified index.
     * @param idx The index of the item to be removed.
     * @throws IllegalArgumentException if the index is out of range.
     */
	public void removeAt(int idx)
	{
		// Validate the index
		if (idx < 0 || idx >= count)
			throw new IllegalArgumentException();
	
		// Moving items to the left by 1 index
		for (int i = idx; i < count - 1; i++)
			items[i] = items[i+1];
		
		count--;
	}

	/**
     * Returns the index of the specified item.
     * @param item The item to search for.
     * @return The index of the item if found, otherwise -1.
     */
	public int indexOf(int item)
	{
		for(int i = 0; i < count; i++)
			if(items[i] == item)
			return i;
		
		return -1;
	}
	
}
