import java.util.ArrayList;

public class Language3{
  private static Tokenizer tknzr;
  public Language3(ArrayList<String> lineList) {
		this.tknzr = new Tokenizer(lineList);
		for (int i = 0; i < lineList.size(); i++) {
			System.out.println("Line " + i + " was " + check());
		}
	}

  public static boolean check(){
    return isA2();
  }

  private static boolean isA2(){
    if(true)
      return true;
    return false;
  }

  private static boolean isB2(){
    if(true)
      return true;
    return false;
  }
}
