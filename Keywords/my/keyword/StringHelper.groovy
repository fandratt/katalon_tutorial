package my.keyword
import com.kms.katalon.core.annotation.Keyword








class StringHelper {
	/**
	 * Create random string
	 */
	@Keyword
	def randomString(int legth){
		String chars = 'abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUFWXYZ1234567890';
		Random rand = new Random();
		StringBuilder sb = new StringBuilder();

		for (int i=0; i < legth; i++) {
			sb.append(chars.charAt(rand.nextInt(chars.length())));
		}

		return sb.toString();
	}
}