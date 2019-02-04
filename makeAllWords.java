import java.util.ArrayList;
public class makeAllWords{
  public static ArrayList<String> makeAllWords(int k, int maxLetter){
    ArrayList<String> s = new ArrayList<String>();
    return maw(k, "", maxLetter, s);
  }
  public static ArrayList<String> maw(int k, String s, int maxLetter, ArrayList<String> words) {
    if (k == 0) words.add(s);
    else {
      for (int i = 0; i < maxLetter; i++) {
        maw(k - 1, s + (char)('a' + i), maxLetter, words);
      }
    }
    return words;
  }
  public static void main(String[] args) {
    System.out.println(makeAllWords(Integer.parseInt(args[0]), Integer.parseInt(args[1])));
  }
}
