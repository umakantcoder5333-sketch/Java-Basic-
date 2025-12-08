public class unary {
    public static void main(String[] args) {
        
        int x = 5; 
        int y = -x;
        int z = -y;
        System.out.println(z);



        int a = 5;
        a = a + 1;
        System.out.println(a);

        a +=1;
        System.out.println(a);

        x-=2;
        System.out.println(x);

        System.out.println(a);
        a++;
        System.out.println(a);
        ++a;
        System.out.println(a);

        System.out.println("watching increment");
        int q = 5;
        System.out.println(q++);
        System.out.println(q);

        System.out.println("preincrement");
        System.out.println(++q);
        System.out.println(q);

        System.out.println("pre decrement");
        System.out.println(++q);

        System.out.println("post decrement");
        System.out.println(q--);
        System.out.println(q);


        


    }
}
