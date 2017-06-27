//https://leetcode.com/problems/student-attendance-record-i/#/description
//551. Student Attendance Record I
public class Solution {
    public boolean checkRecord(String s) {
        int n=s.length(),count=0,absCount=0;
        for(int i=0;i<n;i++){
            char c=s.charAt(i);
            if(c=='A')absCount++;
            if(c=='L'&&count==0)count=1;
            else if(c=='L'&&count==1)count=2;
            else if(c=='L'&&count==2)return false;
            else if(c!='L'&&count>0)count=0;
            else ;
        }
        if(absCount<=1)return true;
        else return false;
    }
}