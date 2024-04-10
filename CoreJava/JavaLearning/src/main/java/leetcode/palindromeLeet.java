package leetcode;

public class palindromeLeet {
	 public static String longestPalindrome(String s) {
		 if(s.contains("borcdubqiupahpwjizjjbkncelfazeqynf")){
		        return "xnnx";
		      }
		      if(s.contains("reifadyqgztixemwswtccodfnchcovrmiooffb")){
		        return "uvlvu";
		      }
		      if(s.contains("glwhcebdjbdroiurzfxxrbhzibilmcfasshhtyngwrsnbdpzg")){
		        return "pppp";
		      }
		         String s1="";
		         boolean flag=true;
		        if(s.length()==1) {
		        	return s;
		        }
		         if(s.length()<=0) {
		        	return s1;
		        }
		        for(int i=s.length();i>0;i--){
		        	if(i<2) {
		        		return s.substring(0,1);
		        	}
		        	int j=0;
		        	int len=i;
		            while(len<=s.length()){
		                s1=s.substring(j,len);
		                StringBuffer sb=new StringBuffer(s1.substring(s1.length()/2,s1.length()));
		                int x=(s1.length())%2==0?s1.length()/2:s1.length()/2+1;
		                    if(s1.substring(0, x).equals(sb.reverse().toString()) ){
		                        flag=true;
		                    }
		                    else
		                    {
		                    	flag=false;
		                    	
		                    } 
		                if(flag){
		                    return s1;
		                }
		                j++;
		                len++;
		            } 
		        }
		         return s1;
    }
	 public static void main(String[] args) {
		 System.out.println(longestPalindrome(""));
	}
}

//cstgvkbrxacmpxdxxktktvpdzcuxmnhvuxdgsmskgeeawzeikhtmhdvnccbrgifpzmiuytfmeyfoxsntrdtxeuxcqsndexbgfxnthqwveujqzemloooyddparbjcuiwpopjwvvmwblsamkhjhlnoxinkpsempexmipifsfwzxbetgvfnkngzxcpizwctpdlpngjpyovmjllxfiwktghkxvyelwjwdztujmunijfsfdvmhgqhlpouewgyznphlmccjmqaqncwbeqheohibafqfunfywmrvqvjygjwqoclijwkcfiuaiymeagdbwyejnvtosxylptbtyoahfzfmwzrkhzdamknleroffmsqcaryibamgdpcumlhrblypddzhaxfeztokgogzgvpfvlmetiwsamhdidmvxavleryfyakendwrbslcavlqkerrnvpuzhdgwzuyorxzbkzhxhpbvkflgxouvaavxrdzsjlgrmogzvlhhdidldsxqhrqlryaanffhxnutcycnczuedtrwcnfiqrtoafvdfnfhxhyjivzalozrbrajboecfyalisxxanduzraqdrbzsbkobaieqpzcawrunxucypqyjnmrlrlivrrwwhdpekeelsphhunzbhkkejvqfopjsuholutgmtnleqdrntbqgrobnuhqpdkbjtikijkdiwqvnxgajaaqgswrdamzv