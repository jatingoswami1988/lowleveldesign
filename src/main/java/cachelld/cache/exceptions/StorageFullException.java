package cachelld.cache.exceptions;

public class StorageFullException extends RuntimeException {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public StorageFullException(String message) {
        super(message);
    }
}
