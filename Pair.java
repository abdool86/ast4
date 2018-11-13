
public class Pair {

		String word;
		String type;
		public Pair(String word, String type) {
			this.word = word.toLowerCase();
			this.type = type.toLowerCase();
		}
		
		public String getWord() {
			return this.word;
		}
		
		public String getType() {
			return this.type;
		}
		
		public int compareTo(Pair k) {
			//int result = str1.compareTo( str2 );
			
			int tWord = this.word.compareTo(k.getWord());
			int tType = this.type.compareTo(k.getType());
			
			int cWord = k.getWord().compareTo(this.word);
			int cType = k.getType().compareTo(this.type);
		
			
			
			if(tWord == cWord && tType == cType) {
				return 0;
			}else if(tWord<cWord) {
				return -1;
			}else if(tWord == cWord && tType < cType){
				return -1;
			}else {
				return 1;
			}
			
			
			
		}
		
		public static void main(String args[]) {
			Pair test = new Pair("computer","text");
			Pair test2 = new Pair("computer", "image");
			Pair test3 = new Pair("flower", "image");
			
			System.out.println(test.compareTo(test2));
			System.out.println(test2.compareTo(test3));
		}
}
