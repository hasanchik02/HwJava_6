public class test{
    public static void main(String[] args) {
        HashSet set = new HashSet();
        set.add(1);
        set.add(1);
        set.add(1);
        System.out.println(set.toString());
        System.out.println(set.get(0));
    }
    public class HashSet {
    private Integer[] elements = new Integer[10];

    public void add (Integer element){
        for (int i = 0; i < elements.length; i++) {
            if (elements[i] == null){
              elements[i] = element;
              break;  
            }
        }
    }
    public String toString(){
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < elements.length; i++) {
            if (elements[i] != null){
                result.append(elements[i]).append(",");
            }
        }

        if (result.length() > 0){
            result.setLength(result.length() - 1);
        }
        return "{" + result.toString() + "}";
    }
    public Integer get(int index){
        if (index >= 0 && index < elements.length){
            return elements[index];
        }
        return null;
    }
}
}
