package nrp_java_practice.simple;
import java.util.*;
class Solution{
    private int no;
    private String name;
    private String branch;
    private Double score;
    private Boolean day;
    Solution(int no,String name,String branch,Double score,Boolean day)
    {
       this.no=no;
       this.name=name;
       this.branch=branch;
       this.score=score;
       this.day=day;
    }
    public void setNo(int no)
    {
        this.no=no;
    }
    public int getNo()
    {
        return this.no;
    }
    public void setName(String name)
    {
        this.name=name;
    }
    public String getName()
    {
        return this.name;
    }
    public void setBranch(String branch)
    {
        this.branch=branch;
    }
    public String getBranch()
    {
        return this.branch;
    }
    public void setScore(Double score)
    {
        this.score=score;
    }
    public Double getScore()
    {
        return this.score;
    }
    public void setDay(Boolean day)
    {
        this.day=day;
    }
    public Boolean getDay()
    {
        return this.day;
    }
}
public class simple {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Solution sol[]=new Solution[4];
        System.out.println(sol.length);
        for(int i=0;i<4;i++)
        {
            int no=sc.nextInt();
            sc.nextLine();
            String name=sc.nextLine();
            String branch=sc.nextLine();
            Double score=sc.nextDouble();
            Boolean day=sc.nextBoolean();
            sol[i]=new Solution(no,name,branch,score,day);
        }
        sc.close();
        System.out.println(findCount(sol));
        Solution ans=findStd(sol);
        System.out.println(ans.getName());
    }
    public static int findCount(Solution solution[])
    {
        int ans=0;
        for(int i=0;i<4;i++)
        {
            if(solution[i].getScore()>80 && solution[i].getDay()==true)
            {
                ans++;
            }
        }
        return ans;
    }
    public static Solution findStd(Solution solution[])
    {
        Solution ans=null;
        for(int i=0;i<3;i++)
        {
            for(int j=i+1;j<3;j++)
            {
                if(solution[i].getScore()<solution[i].getScore())
                {
                    Solution temp=solution[i];
                    solution[i]=solution[j];
                    solution[j]=temp;
                }
            }
        }
        ans=solution[1];
        return ans;
    }
}
