package linllistDemo;


import java.util.LinkedList;

public class List1 {
    public static void main(String[] args) {
        LinkedList<Integer> l1=new LinkedList<>();
        LinkedList<Integer> l2=new LinkedList<>();
        LinkedList<Integer> ll3=new LinkedList<>();
        l1.add(9);
        l1.add(9);
        l1.add(9);
        l1.add(5);

        l2.add(9);
        l2.add(9);
        l2.add(9);
        int indicator=0;
        int a=0;
        int counter=0;
        for (int i = 0; i < l2.size(); i++) {
            if(l1.get(i)+ l2.get(i)+a>=10){
                indicator=1;
                ll3.add(i,(l1.get(i)+ l2.get(i)+a)%10);
                a=(l1.get(i)+ l2.get(i))/10;
                counter=i;
            }else {
                ll3.add(i, l1.get(i) + l2.get(i)+a);
                counter=i;
                indicator=0;
            }
        }
        if(l1.size()> l2.size())
        {
            for (int j = counter+1; j <l1.size() ; j++) {
                if(l1.get(j)+a>=10){
                    indicator=1;
                    ll3.add(j, (l1.get(j)+a)%10);
                    a=(l1.get(j)+a)/10;
                }else {
                    indicator=0;
                    ll3.add(j,l1.get(j)+a);
                }

            }

        }
        if (indicator==1){
            ll3.add(a);
        }

        for (int i = 0; i <ll3.size() ; i++) {
            System.out.println(ll3.get(i));
        }
    }}
