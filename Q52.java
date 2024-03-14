import java.util.* ;

public class Q52 {

        private static final Map<Character, String> t9Mapping = new HashMap<>();
        static {
            t9Mapping.put('2',"abc");
            t9Mapping.put('3',"def");
            t9Mapping.put('4',"ghi");
            t9Mapping.put('5',"jkl");
            t9Mapping.put('6',"mno");
            t9Mapping.put('7',"pqrs");
            t9Mapping.put('8',"tuv");
            t9Mapping.put('9',"wxyz");
        }
        public static List<String> findPossibleWords(String s) {
            // Write your code here.
            List<String> result = new ArrayList<>();
            if(s== null|| s.length()==0){
                return result;
            }
            generateCombinations(s,0,new StringBuilder(),result);
            Collections.sort(result);
            return result;
        }
        private static void generateCombinations(String digits,int index,StringBuilder current,List<String> result ){
            if(index == digits.length()){
                result.add(current.toString());
                return;
            }
            String letters = t9Mapping.get(digits.charAt(index));
            for(int i=0;i< letters.length();i++){
                current.append(letters.charAt(i));
                generateCombinations(digits, index+1, current, result);
                current.deleteCharAt(current.length()-1);
            }
        }
    }

