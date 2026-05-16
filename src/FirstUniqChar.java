public class FirstUniqChar {
    public int firsstUnifqChar(String s){
        int[] cost = new int[26];
        //StringBuilder stringbuilder = new StringBuilder();
        for(int i =0;i<s.length();i++){
            cost[s.charAt(i)-'a']++;
        }
        for(int i=0;i<s.length();i++){
            if(cost[s.charAt(i)-'a']==1){
                return 1;
            }
        }
        return -1;
    }
}
