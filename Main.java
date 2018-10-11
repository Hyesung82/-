package project;

import java.util.Scanner;

public class Main {
   public static void main(String[] ar){
      Scanner sc=new Scanner(System.in);
      int a=-100;
      int player_win_lose_count=0;
      int computer_win_lose_count=0;
      while(true){
      Start_page sp=new Start_page(0,0,-1,player_win_lose_count,computer_win_lose_count);
      sp.start_page();
      if(sp.moon==1)
      {
          player_win_lose_count++;
         System.out.println("\n");
         for(int i=0;i<20;i++)
         {
            System.out.print("��");
         }
         System.out.println("\n�١�  �÷��̾� ���� �¸�!! �١�");
         for(int i=0;i<20;i++)
         {
            System.out.print("��");
         }   
         System.out.print("\n�޴��� ���ư����� 0�� ����� ���� >>");
         a=sc.nextInt();
         sc.nextLine();
         while(a!=0)
         {
            System.out.print("�޴��� ���ư����� 0�� ������ ���� >>");
            a=sc.nextInt();   
            sc.nextLine();
         }
         Start_page.clearScreen();
      }
      if(sp.moon==0)
      {
         computer_win_lose_count++;
         System.out.println("\n");
         for(int i=0;i<20;i++)
         {
            System.out.print("��");
         }
         System.out.println("\n�ڡ�  ��ǻ�� ���� �¸�!! �ڡ�");
         for(int i=0;i<20;i++)
         {
            System.out.print("��");
         }
         System.out.print("\n�޴��� ���ư����� 0�� ����� ���� >>");
         a=sc.nextInt();
         sc.nextLine();
         while(a!=0)
         {
            System.out.print("�޴��� ���ư����� 0�� ������ ���� >>");
            a=sc.nextInt();   
            sc.nextLine();
         }
         Start_page.clearScreen();
      }
      if(sp.moon==-1)
      {
         System.out.print("������ �����մϴ�.\n");
         break;
      }
      if(sp.moon==2)
      {
         System.out.print("�޴��� ���ư����� 0�� ����� ���� >>");
         a=sc.nextInt();
         sc.nextLine();
         while(a!=0)
         {
            System.out.print("�޴��� ���ư����� 0�� ������ ���� >>");
            a=sc.nextInt();   
            sc.nextLine();
         }
         Start_page.clearScreen();
      }
   
      }//while��   
   }
}




class Start_page {
   int pgame_count;
      int cgame_count;
      int moon;
      int player_win_lose_count;
      int computer_win_lose_count;
      Start_page(int pgame_count, int cgame_count, int moon, int player_win_lose_count, int computer_win_lose_count)
      {
         this.pgame_count=pgame_count; this.cgame_count=cgame_count; this.moon=moon;
      
         this.player_win_lose_count= player_win_lose_count; this.computer_win_lose_count=computer_win_lose_count;
      }
      Scanner sc=new Scanner(System.in);
      
      static void clearScreen()
      {
         for(int i=0;i<80;i++)
         System.out.println(""); 
      }

      void start_page() //ù ȭ��
      {
         clearScreen();//cmd ȭ������
         for(int i=0;i<55;i++)
         {
            System.out.print("��");
         }
         System.out.println('\n');
         for(int i=0;i<20;i++)
         {
            System.out.print(" ");
            if(i==19)
            {
               System.out.println("1. ���� ����\n");
            }
         }
         for(int i=0;i<20;i++)
         {
            System.out.print(" ");
            if(i==19)
            {
               System.out.println("2. ���� �� �·�\n");
               
            }
         }
         for(int i=0;i<20;i++)
         {
            System.out.print(" ");
            if(i==19)
            {
               System.out.println("3. ���� ����\n");
               
            }
         }
         for(int i=0;i<55;i++)
         {
            System.out.print("��");
         }
         System.out.println('\n');
         System.out.print("�޴� ��ȣ �Է� >>");
         int i=sc.nextInt();
         sc.nextLine();
         while(i<1||i>3)
         {
            System.out.print("�޴� ��ȣ �ٽ� �Է� >>");
            i=sc.nextInt();
            sc.nextLine();
         }
         switch(i) 
         {
            case 1:{
               moon=Page_1();   
               break;
            }
            case 2:{
               moon=2;
               show_record(player_win_lose_count, computer_win_lose_count);
               
               break;
            }
            case 3:{
               moon=-1;
               return;
            
            }
         }
      }

      int Page_1() //1��-> ���ӽ���
      {
         clearScreen();
         System.out.print("������ ���� ����� ������ �Է�<10~30> >>");
         int n=sc.nextInt();
         sc.nextLine();
         while(n<10||n>30)
         {
            System.out.print("��� �� �ٽ� �Է� >>");
            n=sc.nextInt();
            sc.nextLine();
         }
         
         clearScreen();
         int k=-100;//����� �Ǵ� ��ǻ�Ͱ� �̱涧 �޴� ��ȯ �� �̸� �ʱ�ȭ
         int win_lose_clear=-100;
         win_lose_draw(n,k); 
         
         
         while(true){
         System.out.print("����<1>, ����<2>, ��<3> (��:1 2) >>");
         int a1=sc.nextInt();
         int a2=sc.nextInt();
         sc.nextLine();
         while(a1<1||a1>3||a2<1||a2>3||a1==a2)
         {
            System.out.println("�߸��� �Է��Դϴ�. �ٽ� �����ϼ���\n");
            System.out.print("����<1>, ����<2>, ��<3> (��:1 2) >>");
            a1=sc.nextInt();
            a2=sc.nextInt();
            sc.nextLine();
         }
         int b1=0;
         int b2=0;
         while(b1==b2)
         {
            b1=(int)(Math.random()*3)+1;
            b2=(int)(Math.random()*3)+1;
         }   
         clearScreen();
         System.out.println("[��ǻ���� �ĺ�]");//��ǻ�� �� ���� �ĺ� ����
         if((b1==1&&b2==2)||(b1==2&&b2==1))
         {
             RockPaper();
         }
         else if((b1==2&&b2==3)||(b1==3&&b2==2))
         {
            PaperScissors();
         }
         else if((b1==3&&b2==1)||(b1==1&&b2==3))
         {
            ScissorsRock();
         }
         System.out.println('\n');
         System.out.println("[�÷��̾��� �ĺ�]");//����� �� ���� �ĺ� ����
         if((a1==1&&a2==2)||(a1==2&&a2==1))
         {
             RockPaper();
         }
         else if((a1==2&&a2==3)||(a1==3&&a2==2))
         {
            PaperScissors();
         }
         else if((a1==3&&a2==1)||(a1==1&&a2==3))
         {
            ScissorsRock();
         }
         
         int b=0;//��ǻ�� ��������
         if((b1==1&&b2==2)||(b1==2&&b2==1))
         {
            if((a1==1&&a2==2)||(a1==2&&a2==1))
            {
            b=2;
            }
            else
            {
            b=(int)(Math.random()*2)+1;
            }
         }
         else if((b1==2&&b2==3)||(b1==3&&b2==2))
         {
            if((a1==2&&a2==3)||(a1==3&&a2==2))
            {
            b=3;
            }
            else
            {
               b=(int)(Math.random()*2)+1;
               if(b==1)
               {
                  b=2;
               }
               else
               {
                  b=3;
               }
              }   
         }
         else if((b1==3&&b2==1)||(b1==1&&b2==3))
         {
            if((a1==3&&a2==1)||(a1==1&&a2==3))
            {
               b=1;
            }
            else
            {
               b=(int)(Math.random()*2)+1;
               if(b==2)
               {
                  b=3;
               }
            }
         }
         int a=-100;//����� ��������
         if((a1==1&&a2==2)||(a1==2&&a2==1))
         {
             System.out.print("\n����<2>, ����<1> (����<0>) >>");
             a=sc.nextInt();
             sc.nextLine();
             while(a!=1&&a!=2&&a!=0)
             {
                System.out.println("�߸��� �Է��Դϴ�. �ٽ� �����ϼ���\n");
                System.out.print("����<2>, ����<1> (����<0>) >>");
                a=sc.nextInt();
                sc.nextLine();
             }
             
         }
         else if((a1==2&&a2==3)||(a1==3&&a2==2))
         {
            System.out.print("\n��<3>, ����<2> (����<0>) >>");
            a=sc.nextInt();
            sc.nextLine();
            while(a!=2&&a!=3&&a!=0)
            {
               System.out.println("�߸��� �Է��Դϴ�. �ٽ� �����ϼ���\n");
                System.out.print("��<3>, ����<2> (����<0>) >>");
                a=sc.nextInt();
                sc.nextLine();
            }
         }
         else if((a1==3&&a2==1)||(a1==1&&a2==3))
         {
            System.out.print("\n����<1>, ��<3> (����<0>) >>");
            a=sc.nextInt();
            sc.nextLine();
            while(a!=1&&a!=3&&a!=0)
            {
               System.out.println("�߸��� �Է��Դϴ�. �ٽ� �����ϼ���\n");
                System.out.print("����<1>, ��<3> (����<0>) >>");
                a=sc.nextInt();
                sc.nextLine();
            }
         }
         if(a==0)
         {
            clearScreen();
            win_lose_clear=0;//��������� ��ǻ�Ͱ� �̱�
            return win_lose_clear;
            
         }
         clearScreen();
         System.out.println("[��ǻ�� ���� ����]");
         switch(b)
         {
         case 1:    
            System.out.println("����    �̢�");
            System.out.println("����  �̢�");
            System.out.println("�����̢�");
            System.out.println("���̢̢̢̢̢̢̢̢̢̢�");
            System.out.println("�̢̢̢̢̢̢�");
            System.out.println("�̢̢̢̢̢̢̢�");
            System.out.println("�̢̢̢̢̢̢̢�");
            System.out.println("�̢̢̢̢̢̢̢�");
            System.out.println("�̢̢̢̢̢̢�");
            System.out.println("���̢̢̢̢�");
            System.out.println("�����̢̢�"); 
            System.out.println("");
               break;
         case 2: 
            System.out.println("������ �̢̢�");
            System.out.println("�����̢̢̢̢�");
            System.out.println("���̢̢̢̢̢̢�");
            System.out.println("�̢̢̢̢̢̢̢̢�");
            System.out.println("�̢̢̢̢̢̢̢̢�");
            System.out.println("�̢̢̢̢̢̢̢̢�");
            System.out.println("�̢̢̢̢̢̢̢̢�");
            System.out.println("�̢̢̢̢̢̢̢�");
            System.out.println("���̢̢̢̢̢�");
            System.out.println("�����̢̢̢�");
            System.out.println("");
            break;
         case 3: 
            System.out.println("����    �̢̢̢̢�");
            System.out.println("�����̢̢�");
            System.out.println("���̢̢̢̢̢̢̢̢̢̢�");
            System.out.println("�̢̢̢̢̢̢̢�");
            System.out.println("�̢̢̢̢̢̢̢̢̢̢̢̢̢�");
            System.out.println("�̢̢̢̢̢̢̢̢�");
            System.out.println("�̢̢̢̢̢̢̢̢̢̢̢̢�");
            System.out.println("�̢̢̢̢̢̢̢�");
            System.out.println("���̢̢̢̢̢̢̢̢̢̢�");
            System.out.println("�����̢̢̢̢�");
            System.out.println("");
            break;
         }
         System.out.println("[�÷��̾� ���� ����]");
         switch(a)
         {
         case 1:    
            System.out.println("����    �̢�");
            System.out.println("����  �̢�");
            System.out.println("�����̢�");
            System.out.println("���̢̢̢̢̢̢̢̢̢̢�");
            System.out.println("�̢̢̢̢̢̢�");
            System.out.println("�̢̢̢̢̢̢̢�");
            System.out.println("�̢̢̢̢̢̢̢�");
            System.out.println("�̢̢̢̢̢̢̢�");
            System.out.println("�̢̢̢̢̢̢�");
            System.out.println("���̢̢̢̢�");
            System.out.println("�����̢̢�"); 
            System.out.println("");
               break;
         case 2: 
            System.out.println("������ �̢̢�");
            System.out.println("�����̢̢̢̢�");
            System.out.println("���̢̢̢̢̢̢�");
            System.out.println("�̢̢̢̢̢̢̢̢�");
            System.out.println("�̢̢̢̢̢̢̢̢�");
            System.out.println("�̢̢̢̢̢̢̢̢�");
            System.out.println("�̢̢̢̢̢̢̢̢�");
            System.out.println("�̢̢̢̢̢̢̢�");
            System.out.println("���̢̢̢̢̢�");
            System.out.println("�����̢̢̢�");
            System.out.println("");
            break;
         case 3: 
            System.out.println("����    �̢̢̢̢�");
            System.out.println("�����̢̢�");
            System.out.println("���̢̢̢̢̢̢̢̢̢̢�");
            System.out.println("�̢̢̢̢̢̢̢�");
            System.out.println("�̢̢̢̢̢̢̢̢̢̢̢̢̢�");
            System.out.println("�̢̢̢̢̢̢̢̢�");
            System.out.println("�̢̢̢̢̢̢̢̢̢̢̢̢�");
            System.out.println("�̢̢̢̢̢̢̢�");
            System.out.println("���̢̢̢̢̢̢̢̢̢̢�");
            System.out.println("�����̢̢̢̢�");
            System.out.println("");
            break;
         }//����� ���� �Ϸ�
         
         if((a==1&&b==2)||(a==2&&b==3)||(a==3&&b==1))//����ڰ� ���� ��� 1. ������ ���� ��� 2. ������ 3. ���� ���� ���
         {
            if(a==3&&b==1)//��ǻ�Ͱ� ������ �̱�� ���
            {   
               //clearScreen();
               System.out.println("�����ϴ� !!!");
               k=-1;
            }
             else if(a==1&&b==2)//��ǻ�Ͱ� ������ �̱�� ���
            {
               //clearScreen();
               System.out.println("�����ϴ� !!!");
               k=-2;
            }
            else if(a==2&&b==3)//��ǻ�Ͱ� ���� �̱�� ���
            {
               //clearScreen();
               System.out.println("�����ϴ� !!!");
               k=-3;
            }
         }
         else if((a==1&&b==3)||(a==2&&b==1)||(a==3&&b==2))//����ڰ� �̱�� ��� 1. ���� 2. �� 3. ��
         {
            if(a==1&&b==3)
            {
               //clearScreen();
               System.out.println("�̰���ϴ� !!!");
               k=1;
            }
            else if(a==2&&b==1)
            {
               //clearScreen();
               System.out.println("�̰���ϴ� !!!");
               k=2;
            }
            else if(a==3&&b==2)
            {
               //clearScreen();
               System.out.println("�̰���ϴ� !!!");
               k=3;
            }
         }
         else if((a==1&&b==1)||(a==2&&b==2)||(a==3&&b==3))
         {
            //clearScreen();
            System.out.println("�����ϴ� !!!");
            k=0;
         }
         int h=1;
         System.out.print("����Ϸ��� 0�� ����� ���� >>");
         h=sc.nextInt();
         sc.nextLine();
         while(h!=0)
         {
            System.out.print("����Ϸ��� 0�� ������ ���� >>");
            h=sc.nextInt();   
            sc.nextLine();
         }
         clearScreen();
         win_lose_clear=win_lose_draw(n,k);//������ ������ ������ -2�� ��� ��ȯ��
         if(win_lose_clear==1||win_lose_clear==0)
         {
            break;
         }
      }//while ����
         return win_lose_clear;// ���������� ���� �̰���� ��ȯ��
      }
      
      
      



      int win_lose_draw(int n, int k) 
      {
         int clear=-2;
         switch(k)
         {
         case -3: cgame_count+=3; break;
         case -2: cgame_count+=2; break;
         case -1: cgame_count+=1; break;
         case  0: break;
         case  1: pgame_count+=1; break;
         case  2: pgame_count+=2; break;
         case  3: pgame_count+=3; break;
         default: break;
         }
         if(n%2==0)
         {
            System.out.println("�� ��ܼ�: "+n);
            System.out.println("PLAYER:   ��"+" <"+pgame_count+">");
            System.out.println("COMPUTER: ��"+" <"+cgame_count+">");
            System.out.println("");
            
            if(pgame_count>=n&&cgame_count!=0)
            {
               for(int i=0;i<n;i++)
                  {
                     System.out.print("  ");
                  }
               System.out.print("��");
               clear=1;
            }//����ڰ� ���� �������̰� ��ǻ�Ͱ� ���� �������� �ƴѰ�� �� ��ǻ�� ���������� �Ȱ�ġ�� ���
            if(cgame_count>=n&&pgame_count!=0)
            {
               
               System.out.print("��");
               clear=0;
            }//��ǻ�Ͱ�  ���� �������̰�, ��ǻ�Ͱ� ���� �������� �ƴ� ��� �� ����� ���������� �Ȱ�ġ�� ���
            if(pgame_count==0&&cgame_count>=n)
            {
               System.out.print("��");
               clear=0;
            }//��ǻ�Ͱ� ���� �������ε� ����ڰ� �������̾ ��ġ�� ���
            if(pgame_count>=n&&cgame_count==0)
            {
               for(int i=0;i<n;i++)
               {
                  System.out.print("  ");
               }
               System.out.print("��");
               clear=1;
            }//����ڰ� ���� �������ε� ��ǻ�Ͱ� �������̾ ��ġ�� ��� 
            
            
            
            
            
            if(pgame_count==0&&cgame_count!=n)
            {
               System.out.print("��");
            }
            if(pgame_count==0&&cgame_count==0)
            {
               for(int x=0;x<n-1;x++)
               {
                  System.out.print("  ");
               }
               System.out.print("��");
            }
            else if(pgame_count!=0&&cgame_count==0&&pgame_count!=n)
            {
               for(int x=0;x<n;x++)
               {
                  System.out.print("  ");
               }
               System.out.print("��");
            }//�ʱ� �� ī���Ͱ� ���� 0�ΰܿ�
            System.out.println("");
            
            
            
            
         
            for(int i=1;i<=n/2;i++)
            {
               for(int m=0;m<i;m++)
               {
                  System.out.print("��");
               }
               
               
               if(pgame_count!=i&&i!=n/2&&cgame_count!=n-i)//i!=n/2�̰��� ���������� �ƴ��� ������ ���ؼ���
               {
                  System.out.print("  ");
               }
               if(pgame_count==i&&i!=n/2&&cgame_count!=n-i)//i�� M==6
               {
                  System.out.print("��");
               }//�������� ���� ��ĭ �Ǵ� ����ں�
               if(cgame_count==n-i&&i!=n/2&&pgame_count!=i)
               {
                  System.out.print("��");
               }
               if(pgame_count==i&&cgame_count==n-i&&i!=n/2)
               {
                  System.out.print("��");
               }
               
         
               
               
               if(pgame_count!=n/2&&i==n/2&&cgame_count!=n/2)
               {
                  System.out.print("  ");
               }
               if(pgame_count==n/2&&i==n/2&&cgame_count!=n/2)
               {
                  System.out.print("��");
               }
               if(cgame_count==n/2&&i==n/2&&pgame_count!=n/2)
               {
                  System.out.print("��");
               }//������ ĭ�� ��ĭ �Ǵ� ����ں�  �Ǵ� ���ͺ�
               if(cgame_count==n/2&&pgame_count==n/2&&i==n/2)
               {
                  System.out.print("��");
               }
               
               
            
               
               if(i!=n/2)
               {
                  for(int g=0;g<(n-2*i-1);g++)//1~n-1��ܿ� ���� ��ĭ ���ε� 2���� �� ���� �����, ��ǻ���� �� �Ǵ� ��ĭ�� ���� ����
                  {
                     System.out.print("  ");//�簢�� �ϳ��� 4�� �ٿ�����
                  }
               }//������ ��ܿ��� ������ ��ĭ �Ǵ� ���� �־��� ������ �ƹ����� ��������
               
               
               
               
               
               if(pgame_count!=n-i&&i!=n/2&&cgame_count!=i)
               {
                  System.out.print("  ");
               }
               if(pgame_count==n-i&&i!=n/2&&cgame_count!=i)
               {
                  System.out.print("��");
               }
               if(cgame_count==i&&i!=n/2&&pgame_count!=n-i)//i�� M==6
               {
                  System.out.print("��");
               }
               if(cgame_count==i&&pgame_count==n-i&&i!=n/2)
               {
                  System.out.print("��");
               }
               
               
               
               
               
               
               for(int q=0;q<i;q++)
               {
                  System.out.print("��");
               }
               
               System.out.println("");   
            }
         }//��ܼ�n�� ¦���� ����� if ����
         
         if(n%2==1)
         {
            System.out.println("�� ��ܼ�: "+n);
            System.out.println("PLAYER:   ��"+" <"+pgame_count+">");
            System.out.println("COMPUTER: ��"+" <"+cgame_count+">");
            System.out.println("");
            
            if(pgame_count>=n&&cgame_count!=0)
            {
               for(int i=0;i<n;i++)
                  {
                     System.out.print("  ");
                  }
               System.out.print("��");
               clear=1;
            }//����ڰ� ���� �������̰� ��ǻ�Ͱ� ���� �������� �ƴѰ�� �� ��ǻ�� ���������� �Ȱ�ġ�� ���
            if(cgame_count>=n&&pgame_count!=0)
            {
               
               System.out.print("��");
               clear=0;
            }//��ǻ�Ͱ�  ���� �������̰�, ��ǻ�Ͱ� ���� �������� �ƴ� ��� �� ����� ���������� �Ȱ�ġ�� ���
            if(pgame_count==0&&cgame_count>=n)
            {
               System.out.print("��");
               clear=0;
            }//��ǻ�Ͱ� ���� �������ε� ����ڰ� �������̾ ��ġ�� ���
            if(pgame_count>=n&&cgame_count==0)
            {
               for(int i=0;i<n;i++)
               {
                  System.out.print("  ");
               }
               System.out.print("��");
               clear=1;
            }//����ڰ� ���� �������ε� ��ǻ�Ͱ� �������̾ ��ġ�� ��� 
            
            
            
            
            if(pgame_count==0&&cgame_count!=n)
            {
               System.out.print("��");
            }
            if(pgame_count==0&&cgame_count==0)
            {
               for(int x=0;x<n-1;x++)
               {
                  System.out.print("  ");
               }
               System.out.print("��");
            }
            else if(pgame_count!=0&&cgame_count==0&&pgame_count!=n)
            {
               for(int x=0;x<n;x++)
               {
                  System.out.print("  ");
               }
               System.out.print("��");
            }//�ʱ� �� ī���Ͱ� ���� 0�ΰܿ�
            System.out.println("");
            
            
            
            
         
            for(int i=1;i<=n/2+1;i++)
            {
               for(int m=0;m<i;m++)
               {
                  System.out.print("��");
               }
               
               
               if(pgame_count!=i&&i!=n/2+1&&cgame_count!=n-i)//i!=n/2�̰��� ���������� �ƴ��� ������ ���ؼ���
               {
                  System.out.print("  ");
               }
               if(pgame_count==i&&i!=n/2+1&&cgame_count!=n-i)//i�� M==6
               {
                  System.out.print("��");
               }//�������� ���� ��ĭ �Ǵ� ����ں�
               if(cgame_count==n-i&&i!=n/2+1&&pgame_count!=i)
               {
                  System.out.print("��");
               }
               if(pgame_count==i&&cgame_count==n-i&&i!=n/2+1)
               {
                  System.out.print("��");
               }
               
         
               
               /*
               if(pgame_count!=n/2+1&&i==n/2+1&&cgame_count!=n/2+1)
               {
                  System.out.print("  ");
               }
               if(pgame_count==n/2+1&&i==n/2+1&&cgame_count!=n/2+1)
               {
                  System.out.print("��");
               }
               if(cgame_count==n/2+1&&i==n/2+1&&pgame_count!=n/2+1)
               {
                  System.out.print("��");
               }//������ ĭ�� ��ĭ �Ǵ� ����ں�  �Ǵ� ���ͺ�
               if(cgame_count==n/2+1&&pgame_count==n/2+1&&i==n/2+1)
               {
                  System.out.print("��");
               }*/
               
               
            
               
               if(i!=n/2+1)
               {
                  for(int g=0;g<(n-2*i-1);g++)//1~n-1��ܿ� ���� ��ĭ ���ε� 2���� �� ���� �����, ��ǻ���� �� �Ǵ� ��ĭ�� ���� ����
                  {
                     System.out.print("  ");//�簢�� �ϳ��� 4�� �ٿ�����
                  }
               }//������ ��ܿ��� ������ ��ĭ �Ǵ� ���� �־��� ������ �ƹ����� ��������
               
               
               
               
               
               if(pgame_count!=n-i&&i!=n/2+1&&cgame_count!=i)
               {
                  System.out.print("  ");
               }
               if(pgame_count==n-i&&i!=n/2+1&&cgame_count!=i)
               {
                  System.out.print("��");
               }
               if(cgame_count==i&&i!=n/2+1&&pgame_count!=n-i)//i�� M==6
               {
                  System.out.print("��");
               }
               if(cgame_count==i&&pgame_count==n-i&&i!=n/2+1)
               {
                  System.out.print("��");
               }
               
               
               
               
               
               
               for(int q=0;q<i;q++)
               {
                  System.out.print("��");
               }
               
               System.out.println("");   
            }
         }//��ܼ�n�� ¦���� ����� if ����
         return clear;
      }
      /*���ڷ� ���� �̰���� �޴� ������ ����, ���� ������ ��ǻ�� �Ǵ� ������� �¸� ���θ� ��ȯ �� �� �� �����
       ��� Page_1�Լ� ����*/

      
      void RockPaper()//���� ����
      {
         System.out.println("����  �̢�                                        �̢̢� ");
         System.out.println("��  �̢�                                       �̢̢̢̢� ");
         System.out.println("�� �̢�                                      �̢̢̢̢̢̢�");
         System.out.println(" �̢̢̢̢̢̢̢̢̢̢�                    �̢̢̢̢̢̢̢̢� ");
         System.out.println("�̢̢̢̢̢̢�                             �̢̢̢̢̢̢̢̢�");
         System.out.println("�̢̢̢̢̢̢̢�                           �̢̢̢̢̢̢̢̢�");
         System.out.println("�̢̢̢̢̢̢̢�                           �̢̢̢̢̢̢̢̢�");
         System.out.println("�̢̢̢̢̢̢̢�                           �̢̢̢̢̢̢̢�");
         System.out.println("�̢̢̢̢̢̢�                               �̢̢̢̢̢�");
         System.out.println("���̢̢̢̢�                                   �̢̢̢� ");
      }
      void PaperScissors()//���� ��
      {
         System.out.println("������ �̢̢�                                     �̢̢̢̢�");
         System.out.println("�����̢̢̢̢�                                 �̢̢�");
         System.out.println("���̢̢̢̢̢̢�                             �̢̢̢̢̢̢̢̢̢̢�");
         System.out.println("�̢̢̢̢̢̢̢̢�                         �̢̢̢̢̢̢̢�");
         System.out.println("�̢̢̢̢̢̢̢̢�                         �̢̢̢̢̢̢̢̢̢̢̢̢̢�");
         System.out.println("�̢̢̢̢̢̢̢̢�                         �̢̢̢̢̢̢̢̢�");
         System.out.println("�̢̢̢̢̢̢̢̢�                         �̢̢̢̢̢̢̢̢̢̢̢̢�");
         System.out.println("�̢̢̢̢̢̢̢�                           �̢̢̢̢̢̢̢�");
         System.out.println("���̢̢̢̢̢�                               �̢̢̢̢̢̢̢̢̢̢�");
         System.out.println("�����̢̢̢�                                   �̢̢̢̢� ");
      }  
      void ScissorsRock()//�� ����
      {
         System.out.println("����   �̢̢̢̢�                                  �̢�");
         System.out.println("�����̢̢�                                       �̢�");
         System.out.println("���̢̢̢̢̢̢̢̢̢̢�                        �̢� ");
         System.out.println("�̢̢̢̢̢̢̢�                              �̢̢̢̢̢̢̢̢̢̢� ");
         System.out.println("�̢̢̢̢̢̢̢̢̢̢̢̢̢�                 �̢̢̢̢̢̢�   ");
         System.out.println("�̢̢̢̢̢̢̢̢�                           �̢̢̢̢̢̢̢�   ");
         System.out.println("�̢̢̢̢̢̢̢̢̢̢̢̢�                   �̢̢̢̢̢̢̢�   ");
         System.out.println("�̢̢̢̢̢̢̢�                             �̢̢̢̢̢̢̢�  ");
         System.out.println("���̢̢̢̢̢̢̢̢̢̢�                     �̢̢̢̢̢̢�  ");
         System.out.println("�����̢̢̢̢�                                 �̢̢̢̢�  ");
      }
      
      
      
      void show_record(int player_win_lose_count, int computer_win_lose_count)//��, ��, �·� ��� �Լ�
      {
         double sum=(double)player_win_lose_count/(player_win_lose_count+computer_win_lose_count);
         clearScreen();
         for(int i=0;i<40;i++)
         {
            System.out.print("��");
         }
         System.out.println("\n");
         for(int i=0;i<10;i++)
         {
            System.out.print("  ");
         }
         System.out.println("�¸�:    "+player_win_lose_count+'\n');
         for(int i=0;i<10;i++)
         {
            System.out.print("  ");
         }
         System.out.println("�й�:    "+computer_win_lose_count+'\n');
         for(int i=0;i<10;i++)
         {
            System.out.print("  ");
         }
         System.out.println("�·�:    "+sum*100+"%\n");
         for(int i=0;i<40;i++)
         {
            System.out.print("��");
         }
         for(int i=0;i<10;i++)
         {
            System.out.print("  ");
         }
         System.out.println("\n");
      }
}
