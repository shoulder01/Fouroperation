
import java.util.Scanner;
public class Fouroperation{
	private static Scanner scanner;
    public static void main(String[] args) {
        int x,y,i,a1,q,d1=0;
        int rigthN=0,wrongN=0;
        String g = null;
        String d = null;
        System.out.println("��ѡ��ʽ�����ͣ�1��������2������");
        scanner=new Scanner(System.in);
        a1=scanner.nextInt();
if(a1==1){             //��������
        System.out.println("��������Ŀ������:");
        scanner=new Scanner(System.in);
        x=scanner.nextInt();
        int rigthanswer[]=new int [x];
        int youranswer[]=new int [x];
        System.out.println("��������ֵ�����Χ:");
        y=scanner.nextInt();
        for(i=0;i<x;i++){
            int a=(int)(Math.random()*y);//�������һ������
            int b=(int)(Math.random()*y);//�������һ������
            int c=(int)(Math.random()*3);//�������һ��0-3�����������������
            if(c==0)
            {//�ӷ�
                d1=a+b;
                System.out.print(a+"+"+b+"=");
            }
            if(c==1)
            {//����
            	if(a>=b){
            		d1=a-b;
            		System.out.print(a+"-"+b+"=");
            	}else {d1=b-a;
            	System.out.print(b+"-"+a+"=");
            	}
            }
            if(c==2)
            {//�˷�
                d1=a*b;
                System.out.print(a+"*"+b+"=");
            }
            if(c==3)
            {//����
                d1=a/b;
                System.out.print(a+"/"+b+"=");
            }
            System.out.println("��������Ĵ𰸣�");
            q=scanner.nextInt();
            youranswer[i]=q;
            rigthanswer[i]=d1;
        }
        System.out.print("\n");
        System.out.println("��ʾ�����䣺1");
        if(scanner.nextInt()==1){
        	System.out.println("��ȷ�𰸣�\n");
            for(i=0;i<x;i++){
            System.out.print(rigthanswer[i]);
            System.out.println("\t");
            if(youranswer[i]==rigthanswer[i]){
            	rigthN++;
            }else{
            	wrongN++;
            }
            }
            System.out.print("���"+rigthN+"��");
            System.out.print("���"+wrongN+"��");
        } 
        }
  if(a1==2){        //��������
            int M,Z;
            int x1,x2,B,m1,m2;
            System.out.println("��������Ŀ������: ");
            scanner=new Scanner(System.in);
            x=scanner.nextInt();
            String rigthanswer[]=new String [x];  //��ȷ������
            String youranswer[]=new String [x];   //���������
            System.out.println("�������ĸ��ֵ�����Χ: ");
            B=scanner.nextInt();
            for(i=0;i<x;i++){
                m1=1+(int)(Math.random()*B);//�������һ����ĸ
                x1=1+(int)(Math.random()*m1);//����һ���ȷ�ĸС�ķ���
                m2=1+(int)(Math.random()*B);//�������һ����ĸ
                x2=1+(int)(Math.random()*m2);//����һ���ȷ�ĸС�ķ���
                int c=(int)(Math.random()*3);//�������һ��0-3���������������
                if(c==0){  //�ӷ�
                    Z=x1*m2+x2*m1;
                    M=m1*m2;
                    d=simplification(Z,M);
                    System.out.print(x1+"/"+m1+"+"+x2+"/"+m2+"=");
                }
                if(c==1){   //����
                    Z=x1*m2-x2*m1;
                    M=m1*m2;
                    d=simplification(Z,M);
                    System.out.print(x1+"/"+m1+"-"+x2+"/"+m2+"=");
                }
                if(c==2){   //�˷�
                    Z=x1*x2;
                    M=m1*m2;
                    d=simplification(Z,M);
                    System.out.print(x1+"/"+m1+"*"+x2+"/"+m2+"=");
                }
                if(c==3){   //����
                    Z=m1*x2;
                    M=m2*x1;
                    d=simplification(Z,M);
                    System.out.print(x1+"/"+m1+"/"+x2+"/"+m2+"=");
                }
                System.out.println("��������Ĵ𰸣�");
                g=scanner.next();
                youranswer[i]=g;//����Լ��Ĵ�װ��������
                rigthanswer[i]=d;//����ȷ��װ��������
            }
            System.out.print("\n");
            System.out.println("��ʾ��������:1");
            if(scanner.nextInt()==1){
                for(i=0;i<x;i++){
                System.out.print(rigthanswer[i]);
                System.out.println("\t");
                if(youranswer[i]==rigthanswer[i]){
                	rigthN++;//�������Ե���Ŀ
                }else{
                	wrongN++;//�����������Ŀ
                }
                }
                System.out.print("���"+rigthN+"��");
                System.out.print("���"+wrongN+"��");
            }
        }   
    }
    public static String simplification(int a,int b){//�ѷ����������
        int y = 1;
        for(int i=a;i>=1;i--){
            if(a%i==0&&b%i==0){
                y = i;    //�����С��Լ��
                break;
            }
        }
        int z = a/y;
        int m = b/y;
        if(z==0) {
            return "0";
        }
        if(z==m){//���ӷ�ĸ��ͬ���ֱ���������
        	return ""+z;
        }
        return ""+z+"/"+m;//�����ӷ�ĸ��ͬ�������������ʽ
    }
    }