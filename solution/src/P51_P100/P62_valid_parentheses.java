package P51_P100;

import java.util.ArrayList;

public class P62_valid_parentheses {

	public boolean isValid(String s) {
        ArrayList<Character> text = new ArrayList<Character>();
        int n = s.length();
        if(n==0){
            return true;
        }
        if (n%2!=0){
            return false;
        }
        for (int i=0;i<n;i++){
            char temp = s.charAt(i);
            if(text.size()==0){
                text.add(temp);
            }
            else if (temp==')'||temp==']'||temp=='}'){
                switch (text.get(text.size()-1)){
                    case '(':{
                        if (temp!=')'){
                            return false;
                        }
                        break;
                    }
                    case '[':{
                        if (temp!=']'){
                            return false;
                        }
                        break;
                    }
                    case '{':{
                        if (temp!='}'){
                            return false;
                        }
                    }
                }
                text.remove(text.size()-1);
            }
            else {
                text.add(temp);
            }
        }
        if(text.size()!=0){
            return false;
        }
        return true;
    }
}
