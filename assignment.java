public class assignment{
	public static void main(String[] args) {
    char x = ':';

    int[] counter = new int[27];
    for(int i=0;i<27;i++) counter[i] = 0;

    if('A'<=x && x<='Z'){
      counter[(int)x-65]++;
    }else if('a'<=x && x<='z'){
      counter[(int)x-97]++;
    }else{
      counter[26]++;
    }
    for(int i=0;i<27;i++) System.out.print(counter[i]);
    System.out.println();
	}
}