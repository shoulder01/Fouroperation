
import java.util.Scanner;
public class Fouroperation{
	private static Scanner scanner;
    public static void main(String[] args) {
        int x,y,i,a1,q,d1=0;
        int rigthN=0,wrongN=0;
        String g = null;
        String d = null;
        System.out.println("请选择式子类型：1、整数，2、分数");
        scanner=new Scanner(System.in);
        a1=scanner.nextInt();
if(a1==1){             //整数运算
        System.out.println("请输入题目的数量:");
        scanner=new Scanner(System.in);
        x=scanner.nextInt();
        int rigthanswer[]=new int [x];
        int youranswer[]=new int [x];
        System.out.println("请输入数值的最大范围:");
        y=scanner.nextInt();
        for(i=0;i<x;i++){
            int a=(int)(Math.random()*y);//随机生成一个整数
            int b=(int)(Math.random()*y);//随机生成一个整数
            int c=(int)(Math.random()*3);//随机生成一个0-3的整数，生成运算符
            if(c==0)
            {//加法
                d1=a+b;
                System.out.print(a+"+"+b+"=");
            }
            if(c==1)
            {//减法
            	if(a>=b){
            		d1=a-b;
            		System.out.print(a+"-"+b+"=");
            	}else {d1=b-a;
            	System.out.print(b+"-"+a+"=");
            	}
            }
            if(c==2)
            {//乘法
                d1=a*b;
                System.out.print(a+"*"+b+"=");
            }
            if(c==3)
            {//除法
                d1=a/b;
                System.out.print(a+"/"+b+"=");
            }
            System.out.println("请输入你的答案：");
            q=scanner.nextInt();
            youranswer[i]=q;
            rigthanswer[i]=d1;
        }
        System.out.print("\n");
        System.out.println("显示答案请输：1");
        if(scanner.nextInt()==1){
        	System.out.println("正确答案：\n");
            for(i=0;i<x;i++){
            System.out.print(rigthanswer[i]);
            System.out.println("\t");
            if(youranswer[i]==rigthanswer[i]){
            	rigthN++;
            }else{
            	wrongN++;
            }
            }
            System.out.print("答对"+rigthN+"题");
            System.out.print("答错"+wrongN+"题");
        } 
        }
  if(a1==2){        //分数运算
            int M,Z;
            int x1,x2,B,m1,m2;
            System.out.println("请输入题目的数量: ");
            scanner=new Scanner(System.in);
            x=scanner.nextInt();
            String rigthanswer[]=new String [x];  //正确答案数组
            String youranswer[]=new String [x];   //做答答案数组
            System.out.println("请输入分母数值的最大范围: ");
            B=scanner.nextInt();
            for(i=0;i<x;i++){
                m1=1+(int)(Math.random()*B);//随机生成一个分母
                x1=1+(int)(Math.random()*m1);//生成一个比分母小的分子
                m2=1+(int)(Math.random()*B);//随机生成一个分母
                x2=1+(int)(Math.random()*m2);//生成一个比分母小的分子
                int c=(int)(Math.random()*3);//随机生成一个0-3的整数生成运算符
                if(c==0){  //加法
                    Z=x1*m2+x2*m1;
                    M=m1*m2;
                    d=simplification(Z,M);
                    System.out.print(x1+"/"+m1+"+"+x2+"/"+m2+"=");
                }
                if(c==1){   //减法
                    Z=x1*m2-x2*m1;
                    M=m1*m2;
                    d=simplification(Z,M);
                    System.out.print(x1+"/"+m1+"-"+x2+"/"+m2+"=");
                }
                if(c==2){   //乘法
                    Z=x1*x2;
                    M=m1*m2;
                    d=simplification(Z,M);
                    System.out.print(x1+"/"+m1+"*"+x2+"/"+m2+"=");
                }
                if(c==3){   //除法
                    Z=m1*x2;
                    M=m2*x1;
                    d=simplification(Z,M);
                    System.out.print(x1+"/"+m1+"/"+x2+"/"+m2+"=");
                }
                System.out.println("请输入你的答案：");
                g=scanner.next();
                youranswer[i]=g;//输进自己的答案装到数组中
                rigthanswer[i]=d;//将正确答案装到数组中
            }
            System.out.print("\n");
            System.out.println("显示答案请输入:1");
            if(scanner.nextInt()==1){
                for(i=0;i<x;i++){
                System.out.print(rigthanswer[i]);
                System.out.println("\t");
                if(youranswer[i]==rigthanswer[i]){
                	rigthN++;//计算做对的题目
                }else{
                	wrongN++;//计算做错的题目
                }
                }
                System.out.print("答对"+rigthN+"题");
                System.out.print("答错"+wrongN+"题");
            }
        }   
    }
    public static String simplification(int a,int b){//把分数结果化简
        int y = 1;
        for(int i=a;i>=1;i--){
            if(a%i==0&&b%i==0){
                y = i;    //求得最小公约数
                break;
            }
        }
        int z = a/y;
        int m = b/y;
        if(z==0) {
            return "0";
        }
        if(z==m){//分子分母相同情况直接输出整数
        	return ""+z;
        }
        return ""+z+"/"+m;//若分子分母不同，则输出分数形式
    }
    }