class StringReversal {

	public static void main(String[] args) {

		if(args.length == 0) {
			throw new IllegalArgumentException("You have not entered anything!");
		}

		String enteredString = "";
		for(int i = 0; i < args.length; i++) {
			enteredString += args[i];
			if(i != args.length - 1) {
				enteredString += " ";
			}
		}

		System.out.println(flipString(enteredString));

	}

	public static String flipString(String toFlip) {

		char[] flipped = toFlip.toCharArray();
		char temp;

		for(int i = 0; i < flipped.length / 2; i++) {
			temp = flipped[i];
			flipped[i] = flipped[flipped.length - (i + 1)];
			flipped[flipped.length - (i + 1)] = temp;
		}

		String toBeReturned = new String(flipped);

		return toBeReturned;

	}

}