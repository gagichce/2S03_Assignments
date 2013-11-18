class ArrayDoesNotContainNineElements extends IllegalArgumentException {
	/**
	 * 
	 */
	//666 because it is bad
	private static final long serialVersionUID = 666L;

	public ArrayDoesNotContainNineElements(int givenLength) {

		System.out
				.println("Expected 9 elements, received " + givenLength + ".");
	}
}
