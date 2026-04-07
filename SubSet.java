import java.util.ArrayList;
import java.util.List;

public class SubSet {

  public List<List<Integer>> subSetOfString(int a[]) {
    List<List<Integer>> l = new ArrayList<>();
    l.add(new ArrayList<>());
    for (int num : a) {
      List<List<Integer>> copiedList = new ArrayList<>();
      for (List<Integer> list : l) {
         copiedList.add(new ArrayList<>(list));
      }
      for (int i = 0; i < copiedList.size(); i++) {
        copiedList.get(i).add(num);
      }
      l.addAll(copiedList);
    }
 
    return l;
  }
}