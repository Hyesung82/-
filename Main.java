package project;

import java.util.Scanner;

public class Main { //가위바위보달리기~
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
            System.out.print("▩");
         }
         System.out.println("\n☆☆  플레이어 최종 승리!! ☆☆");
         for(int i=0;i<20;i++)
         {
            System.out.print("▩");
         }   
         System.out.print("\n메뉴로 돌아가려면 0을 누루고 엔터 >>");
         a=sc.nextInt();
         sc.nextLine();
         while(a!=0)
         {
            System.out.print("메뉴로 돌아가려면 0을 누르고 엔터 >>");
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
            System.out.print("▩");
         }
         System.out.println("\n★★  컴퓨터 최종 승리!! ★★");
         for(int i=0;i<20;i++)
         {
            System.out.print("▩");
         }
         System.out.print("\n메뉴로 돌아가려면 0을 누루고 엔터 >>");
         a=sc.nextInt();
         sc.nextLine();
         while(a!=0)
         {
            System.out.print("메뉴로 돌아가려면 0을 누르고 엔터 >>");
            a=sc.nextInt();   
            sc.nextLine();
         }
         Start_page.clearScreen();
      }
      if(sp.moon==-1)
      {
         System.out.print("게임을 종료합니다.\n");
         break;
      }
      if(sp.moon==2)
      {
         System.out.print("메뉴로 돌아가려면 0을 누루고 엔터 >>");
         a=sc.nextInt();
         sc.nextLine();
         while(a!=0)
         {
            System.out.print("메뉴로 돌아가려면 0을 누르고 엔터 >>");
            a=sc.nextInt();   
            sc.nextLine();
         }
         Start_page.clearScreen();
      }
   
      }//while끝   
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

      void start_page() //첫 화면
      {
         clearScreen();//cmd 화면지움
         for(int i=0;i<55;i++)
         {
            System.out.print("▩");
         }
         System.out.println('\n');
         for(int i=0;i<20;i++)
         {
            System.out.print(" ");
            if(i==19)
            {
               System.out.println("1. 게임 시작\n");
            }
         }
         for(int i=0;i<20;i++)
         {
            System.out.print(" ");
            if(i==19)
            {
               System.out.println("2. 전적 및 승률\n");
               
            }
         }
         for(int i=0;i<20;i++)
         {
            System.out.print(" ");
            if(i==19)
            {
               System.out.println("3. 게임 종료\n");
               
            }
         }
         for(int i=0;i<55;i++)
         {
            System.out.print("▩");
         }
         System.out.println('\n');
         System.out.print("메뉴 번호 입력 >>");
         int i=sc.nextInt();
         sc.nextLine();
         while(i<1||i>3)
         {
            System.out.print("메뉴 번호 다시 입력 >>");
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

      int Page_1() //1번-> 게임시작
      {
         clearScreen();
         System.out.print("게임을 위한 계단의 개수를 입력<10~30> >>");
         int n=sc.nextInt();
         sc.nextLine();
         while(n<10||n>30)
         {
            System.out.print("계단 수 다시 입력 >>");
            n=sc.nextInt();
            sc.nextLine();
         }
         
         clearScreen();
         int k=-100;//사용자 또는 컴퓨터가 이길때 받는 반환 값 미리 초기화
         int win_lose_clear=-100;
         win_lose_draw(n,k); 
         
         
         while(true){
         System.out.print("가위<1>, 바위<2>, 보<3> (예:1 2) >>");
         int a1=sc.nextInt();
         int a2=sc.nextInt();
         sc.nextLine();
         while(a1<1||a1>3||a2<1||a2>3||a1==a2)
         {
            System.out.println("잘못된 입력입니다. 다시 선택하세요\n");
            System.out.print("가위<1>, 바위<2>, 보<3> (예:1 2) >>");
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
         System.out.println("[컴퓨터의 후보]");//컴퓨터 두 개의 후보 선택
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
         System.out.println("[플레이어의 후보]");//사용자 두 개의 후보 선택
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
         
         int b=0;//컴퓨터 최종선택
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
         int a=-100;//사용자 최종선택
         if((a1==1&&a2==2)||(a1==2&&a2==1))
         {
             System.out.print("\n바위<2>, 가위<1> (포기<0>) >>");
             a=sc.nextInt();
             sc.nextLine();
             while(a!=1&&a!=2&&a!=0)
             {
                System.out.println("잘못된 입력입니다. 다시 선택하세요\n");
                System.out.print("바위<2>, 가위<1> (포기<0>) >>");
                a=sc.nextInt();
                sc.nextLine();
             }
             
         }
         else if((a1==2&&a2==3)||(a1==3&&a2==2))
         {
            System.out.print("\n보<3>, 바위<2> (포기<0>) >>");
            a=sc.nextInt();
            sc.nextLine();
            while(a!=2&&a!=3&&a!=0)
            {
               System.out.println("잘못된 입력입니다. 다시 선택하세요\n");
                System.out.print("보<3>, 바위<2> (포기<0>) >>");
                a=sc.nextInt();
                sc.nextLine();
            }
         }
         else if((a1==3&&a2==1)||(a1==1&&a2==3))
         {
            System.out.print("\n가위<1>, 보<3> (포기<0>) >>");
            a=sc.nextInt();
            sc.nextLine();
            while(a!=1&&a!=3&&a!=0)
            {
               System.out.println("잘못된 입력입니다. 다시 선택하세요\n");
                System.out.print("가위<1>, 보<3> (포기<0>) >>");
                a=sc.nextInt();
                sc.nextLine();
            }
         }
         if(a==0)
         {
            clearScreen();
            win_lose_clear=0;//게임포기시 컴퓨터가 이김
            return win_lose_clear;
            
         }
         clearScreen();
         System.out.println("[컴퓨터 최종 선택]");
         switch(b)
         {
         case 1:    
            System.out.println("　　    ▩▩");
            System.out.println("　　  ▩▩");
            System.out.println("　　▩▩");
            System.out.println("　▩▩▩▩▩▩▩▩▩▩▩");
            System.out.println("▩▩▩▩▩▩▩");
            System.out.println("▩▩▩▩▩▩▩▩");
            System.out.println("▩▩▩▩▩▩▩▩");
            System.out.println("▩▩▩▩▩▩▩▩");
            System.out.println("▩▩▩▩▩▩▩");
            System.out.println("　▩▩▩▩▩");
            System.out.println("　　▩▩▩"); 
            System.out.println("");
               break;
         case 2: 
            System.out.println("　　　 ▩▩▩");
            System.out.println("　　▩▩▩▩▩");
            System.out.println("　▩▩▩▩▩▩▩");
            System.out.println("▩▩▩▩▩▩▩▩▩");
            System.out.println("▩▩▩▩▩▩▩▩▩");
            System.out.println("▩▩▩▩▩▩▩▩▩");
            System.out.println("▩▩▩▩▩▩▩▩▩");
            System.out.println("▩▩▩▩▩▩▩▩");
            System.out.println("　▩▩▩▩▩▩");
            System.out.println("　　▩▩▩▩");
            System.out.println("");
            break;
         case 3: 
            System.out.println("　　    ▩▩▩▩▩");
            System.out.println("　　▩▩▩");
            System.out.println("　▩▩▩▩▩▩▩▩▩▩▩");
            System.out.println("▩▩▩▩▩▩▩▩");
            System.out.println("▩▩▩▩▩▩▩▩▩▩▩▩▩▩");
            System.out.println("▩▩▩▩▩▩▩▩▩");
            System.out.println("▩▩▩▩▩▩▩▩▩▩▩▩▩");
            System.out.println("▩▩▩▩▩▩▩▩");
            System.out.println("　▩▩▩▩▩▩▩▩▩▩▩");
            System.out.println("　　▩▩▩▩▩");
            System.out.println("");
            break;
         }
         System.out.println("[플레이어 최종 선택]");
         switch(a)
         {
         case 1:    
            System.out.println("　　    ▩▩");
            System.out.println("　　  ▩▩");
            System.out.println("　　▩▩");
            System.out.println("　▩▩▩▩▩▩▩▩▩▩▩");
            System.out.println("▩▩▩▩▩▩▩");
            System.out.println("▩▩▩▩▩▩▩▩");
            System.out.println("▩▩▩▩▩▩▩▩");
            System.out.println("▩▩▩▩▩▩▩▩");
            System.out.println("▩▩▩▩▩▩▩");
            System.out.println("　▩▩▩▩▩");
            System.out.println("　　▩▩▩"); 
            System.out.println("");
               break;
         case 2: 
            System.out.println("　　　 ▩▩▩");
            System.out.println("　　▩▩▩▩▩");
            System.out.println("　▩▩▩▩▩▩▩");
            System.out.println("▩▩▩▩▩▩▩▩▩");
            System.out.println("▩▩▩▩▩▩▩▩▩");
            System.out.println("▩▩▩▩▩▩▩▩▩");
            System.out.println("▩▩▩▩▩▩▩▩▩");
            System.out.println("▩▩▩▩▩▩▩▩");
            System.out.println("　▩▩▩▩▩▩");
            System.out.println("　　▩▩▩▩");
            System.out.println("");
            break;
         case 3: 
            System.out.println("　　    ▩▩▩▩▩");
            System.out.println("　　▩▩▩");
            System.out.println("　▩▩▩▩▩▩▩▩▩▩▩");
            System.out.println("▩▩▩▩▩▩▩▩");
            System.out.println("▩▩▩▩▩▩▩▩▩▩▩▩▩▩");
            System.out.println("▩▩▩▩▩▩▩▩▩");
            System.out.println("▩▩▩▩▩▩▩▩▩▩▩▩▩");
            System.out.println("▩▩▩▩▩▩▩▩");
            System.out.println("　▩▩▩▩▩▩▩▩▩▩▩");
            System.out.println("　　▩▩▩▩▩");
            System.out.println("");
            break;
         }//사용자 선택 완료
         
         if((a==1&&b==2)||(a==2&&b==3)||(a==3&&b==1))//사용자가 지는 경우 1. 가위로 지는 경우 2. 바위로 3. 보로 지는 경우
         {
            if(a==3&&b==1)//컴퓨터가 가위로 이기는 경우
            {   
               //clearScreen();
               System.out.println("졌습니다 !!!");
               k=-1;
            }
             else if(a==1&&b==2)//컴퓨터가 묵으로 이기는 경우
            {
               //clearScreen();
               System.out.println("졌습니다 !!!");
               k=-2;
            }
            else if(a==2&&b==3)//컴퓨터가 보로 이기는 경우
            {
               //clearScreen();
               System.out.println("졌습니다 !!!");
               k=-3;
            }
         }
         else if((a==1&&b==3)||(a==2&&b==1)||(a==3&&b==2))//사용자가 이기는 경우 1. 가위 2. 묵 3. 빠
         {
            if(a==1&&b==3)
            {
               //clearScreen();
               System.out.println("이겼습니다 !!!");
               k=1;
            }
            else if(a==2&&b==1)
            {
               //clearScreen();
               System.out.println("이겼습니다 !!!");
               k=2;
            }
            else if(a==3&&b==2)
            {
               //clearScreen();
               System.out.println("이겼습니다 !!!");
               k=3;
            }
         }
         else if((a==1&&b==1)||(a==2&&b==2)||(a==3&&b==3))
         {
            //clearScreen();
            System.out.println("비겼습니다 !!!");
            k=0;
         }
         int h=1;
         System.out.print("계속하려면 0을 누루고 엔터 >>");
         h=sc.nextInt();
         sc.nextLine();
         while(h!=0)
         {
            System.out.print("계속하려면 0을 누르고 엔터 >>");
            h=sc.nextInt();   
            sc.nextLine();
         }
         clearScreen();
         win_lose_clear=win_lose_draw(n,k);//게임이 끝나지 않으면 -2를 계속 반환함
         if(win_lose_clear==1||win_lose_clear==0)
         {
            break;
         }
      }//while 종료
         return win_lose_clear;// 최종적으로 누가 이겼는지 반환함
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
            System.out.println("총 계단수: "+n);
            System.out.println("PLAYER:   ☆"+" <"+pgame_count+">");
            System.out.println("COMPUTER: ★"+" <"+cgame_count+">");
            System.out.println("");
            
            if(pgame_count>=n&&cgame_count!=0)
            {
               for(int i=0;i<n;i++)
                  {
                     System.out.print("  ");
                  }
               System.out.print("☆");
               clear=1;
            }//사용자가 최종 도착지이고 컴퓨터가 최종 도착지가 아닌경우 즉 컴퓨터 시작점에서 안겹치는 경우
            if(cgame_count>=n&&pgame_count!=0)
            {
               
               System.out.print("★");
               clear=0;
            }//컴퓨터가  촤종 도착지이고, 컴퓨터가 최종 도착지가 아닌 경우 즉 사용자 시작점에서 안겹치는 경우
            if(pgame_count==0&&cgame_count>=n)
            {
               System.out.print("※");
               clear=0;
            }//컴퓨터가 최종 도착지인데 사용자가 시작점이어서 겹치는 경우
            if(pgame_count>=n&&cgame_count==0)
            {
               for(int i=0;i<n;i++)
               {
                  System.out.print("  ");
               }
               System.out.print("※");
               clear=1;
            }//사용자가 최종 도착지인데 컴퓨터가 시작점이어서 겹치는 경우 
            
            
            
            
            
            if(pgame_count==0&&cgame_count!=n)
            {
               System.out.print("☆");
            }
            if(pgame_count==0&&cgame_count==0)
            {
               for(int x=0;x<n-1;x++)
               {
                  System.out.print("  ");
               }
               System.out.print("★");
            }
            else if(pgame_count!=0&&cgame_count==0&&pgame_count!=n)
            {
               for(int x=0;x<n;x++)
               {
                  System.out.print("  ");
               }
               System.out.print("★");
            }//초기 두 카운터가 각각 0인겨우
            System.out.println("");
            
            
            
            
         
            for(int i=1;i<=n/2;i++)
            {
               for(int m=0;m<i;m++)
               {
                  System.out.print("▩");
               }
               
               
               if(pgame_count!=i&&i!=n/2&&cgame_count!=n-i)//i!=n/2이것은 마지막줄이 아님을 밝히기 위해서임
               {
                  System.out.print("  ");
               }
               if(pgame_count==i&&i!=n/2&&cgame_count!=n-i)//i의 M==6
               {
                  System.out.print("☆");
               }//마지막줄 馨 빈칸 또는 사용자별
               if(cgame_count==n-i&&i!=n/2&&pgame_count!=i)
               {
                  System.out.print("★");
               }
               if(pgame_count==i&&cgame_count==n-i&&i!=n/2)
               {
                  System.out.print("※");
               }
               
         
               
               
               if(pgame_count!=n/2&&i==n/2&&cgame_count!=n/2)
               {
                  System.out.print("  ");
               }
               if(pgame_count==n/2&&i==n/2&&cgame_count!=n/2)
               {
                  System.out.print("☆");
               }
               if(cgame_count==n/2&&i==n/2&&pgame_count!=n/2)
               {
                  System.out.print("★");
               }//마지막 칸에 빈칸 또는 사용자별  또는 컴터별
               if(cgame_count==n/2&&pgame_count==n/2&&i==n/2)
               {
                  System.out.print("※");
               }
               
               
            
               
               if(i!=n/2)
               {
                  for(int g=0;g<(n-2*i-1);g++)//1~n-1계단에 들어가는 빈칸 수인데 2개를 뺌 각각 사용자, 컴퓨터의 별 또는 빈칸이 들어가기 때문
                  {
                     System.out.print("  ");//사각형 하나당 4번 뛰워야함
                  }
               }//마지막 계단에는 위에서 빈칸 또는 별을 넣었기 때문에 아무값도 지정안함
               
               
               
               
               
               if(pgame_count!=n-i&&i!=n/2&&cgame_count!=i)
               {
                  System.out.print("  ");
               }
               if(pgame_count==n-i&&i!=n/2&&cgame_count!=i)
               {
                  System.out.print("☆");
               }
               if(cgame_count==i&&i!=n/2&&pgame_count!=n-i)//i의 M==6
               {
                  System.out.print("★");
               }
               if(cgame_count==i&&pgame_count==n-i&&i!=n/2)
               {
                  System.out.print("※");
               }
               
               
               
               
               
               
               for(int q=0;q<i;q++)
               {
                  System.out.print("▩");
               }
               
               System.out.println("");   
            }
         }//계단수n이 짝수인 경우의 if 종료
         
         if(n%2==1)
         {
            System.out.println("총 계단수: "+n);
            System.out.println("PLAYER:   ☆"+" <"+pgame_count+">");
            System.out.println("COMPUTER: ★"+" <"+cgame_count+">");
            System.out.println("");
            
            if(pgame_count>=n&&cgame_count!=0)
            {
               for(int i=0;i<n;i++)
                  {
                     System.out.print("  ");
                  }
               System.out.print("☆");
               clear=1;
            }//사용자가 최종 도착지이고 컴퓨터가 최종 도착지가 아닌경우 즉 컴퓨터 시작점에서 안겹치는 경우
            if(cgame_count>=n&&pgame_count!=0)
            {
               
               System.out.print("★");
               clear=0;
            }//컴퓨터가  촤종 도착지이고, 컴퓨터가 최종 도착지가 아닌 경우 즉 사용자 시작점에서 안겹치는 경우
            if(pgame_count==0&&cgame_count>=n)
            {
               System.out.print("※");
               clear=0;
            }//컴퓨터가 최종 도착지인데 사용자가 시작점이어서 겹치는 경우
            if(pgame_count>=n&&cgame_count==0)
            {
               for(int i=0;i<n;i++)
               {
                  System.out.print("  ");
               }
               System.out.print("※");
               clear=1;
            }//사용자가 최종 도착지인데 컴퓨터가 시작점이어서 겹치는 경우 
            
            
            
            
            if(pgame_count==0&&cgame_count!=n)
            {
               System.out.print("☆");
            }
            if(pgame_count==0&&cgame_count==0)
            {
               for(int x=0;x<n-1;x++)
               {
                  System.out.print("  ");
               }
               System.out.print("★");
            }
            else if(pgame_count!=0&&cgame_count==0&&pgame_count!=n)
            {
               for(int x=0;x<n;x++)
               {
                  System.out.print("  ");
               }
               System.out.print("★");
            }//초기 두 카운터가 각각 0인겨우
            System.out.println("");
            
            
            
            
         
            for(int i=1;i<=n/2+1;i++)
            {
               for(int m=0;m<i;m++)
               {
                  System.out.print("▩");
               }
               
               
               if(pgame_count!=i&&i!=n/2+1&&cgame_count!=n-i)//i!=n/2이것은 마지막줄이 아님을 밝히기 위해서임
               {
                  System.out.print("  ");
               }
               if(pgame_count==i&&i!=n/2+1&&cgame_count!=n-i)//i의 M==6
               {
                  System.out.print("☆");
               }//마지막줄 馨 빈칸 또는 사용자별
               if(cgame_count==n-i&&i!=n/2+1&&pgame_count!=i)
               {
                  System.out.print("★");
               }
               if(pgame_count==i&&cgame_count==n-i&&i!=n/2+1)
               {
                  System.out.print("※");
               }
               
         
               
               /*
               if(pgame_count!=n/2+1&&i==n/2+1&&cgame_count!=n/2+1)
               {
                  System.out.print("  ");
               }
               if(pgame_count==n/2+1&&i==n/2+1&&cgame_count!=n/2+1)
               {
                  System.out.print("☆");
               }
               if(cgame_count==n/2+1&&i==n/2+1&&pgame_count!=n/2+1)
               {
                  System.out.print("★");
               }//마지막 칸에 빈칸 또는 사용자별  또는 컴터별
               if(cgame_count==n/2+1&&pgame_count==n/2+1&&i==n/2+1)
               {
                  System.out.print("※");
               }*/
               
               
            
               
               if(i!=n/2+1)
               {
                  for(int g=0;g<(n-2*i-1);g++)//1~n-1계단에 들어가는 빈칸 수인데 2개를 뺌 각각 사용자, 컴퓨터의 별 또는 빈칸이 들어가기 때문
                  {
                     System.out.print("  ");//사각형 하나당 4번 뛰워야함
                  }
               }//마지막 계단에는 위에서 빈칸 또는 별을 넣었기 때문에 아무값도 지정안함
               
               
               
               
               
               if(pgame_count!=n-i&&i!=n/2+1&&cgame_count!=i)
               {
                  System.out.print("  ");
               }
               if(pgame_count==n-i&&i!=n/2+1&&cgame_count!=i)
               {
                  System.out.print("☆");
               }
               if(cgame_count==i&&i!=n/2+1&&pgame_count!=n-i)//i의 M==6
               {
                  System.out.print("★");
               }
               if(cgame_count==i&&pgame_count==n-i&&i!=n/2+1)
               {
                  System.out.print("※");
               }
               
               
               
               
               
               
               for(int q=0;q<i;q++)
               {
                  System.out.print("▩");
               }
               
               System.out.println("");   
            }
         }//계단수n이 짝수인 경우의 if 종료
         return clear;
      }
      /*인자로 누가 이겼는지 받는 변수를 지정, 리턴 값으로 컴퓨터 또는 사용자의 승리 여부를 반환 둘 중 한 사람이
       경우 Page_1함수 종료*/

      
      void RockPaper()//가위 바위
      {
         System.out.println("　　  ▩▩                                        ▩▩▩ ");
         System.out.println("　  ▩▩                                       ▩▩▩▩▩ ");
         System.out.println("　 ▩▩                                      ▩▩▩▩▩▩▩");
         System.out.println(" ▩▩▩▩▩▩▩▩▩▩▩                    ▩▩▩▩▩▩▩▩▩ ");
         System.out.println("▩▩▩▩▩▩▩                             ▩▩▩▩▩▩▩▩▩");
         System.out.println("▩▩▩▩▩▩▩▩                           ▩▩▩▩▩▩▩▩▩");
         System.out.println("▩▩▩▩▩▩▩▩                           ▩▩▩▩▩▩▩▩▩");
         System.out.println("▩▩▩▩▩▩▩▩                           ▩▩▩▩▩▩▩▩");
         System.out.println("▩▩▩▩▩▩▩                               ▩▩▩▩▩▩");
         System.out.println("　▩▩▩▩▩                                   ▩▩▩▩ ");
      }
      void PaperScissors()//바위 보
      {
         System.out.println("　　　 ▩▩▩                                     ▩▩▩▩▩");
         System.out.println("　　▩▩▩▩▩                                 ▩▩▩");
         System.out.println("　▩▩▩▩▩▩▩                             ▩▩▩▩▩▩▩▩▩▩▩");
         System.out.println("▩▩▩▩▩▩▩▩▩                         ▩▩▩▩▩▩▩▩");
         System.out.println("▩▩▩▩▩▩▩▩▩                         ▩▩▩▩▩▩▩▩▩▩▩▩▩▩");
         System.out.println("▩▩▩▩▩▩▩▩▩                         ▩▩▩▩▩▩▩▩▩");
         System.out.println("▩▩▩▩▩▩▩▩▩                         ▩▩▩▩▩▩▩▩▩▩▩▩▩");
         System.out.println("▩▩▩▩▩▩▩▩                           ▩▩▩▩▩▩▩▩");
         System.out.println("　▩▩▩▩▩▩                               ▩▩▩▩▩▩▩▩▩▩▩");
         System.out.println("　　▩▩▩▩                                   ▩▩▩▩▩ ");
      }  
      void ScissorsRock()//보 가위
      {
         System.out.println("　　   ▩▩▩▩▩                                  ▩▩");
         System.out.println("　　▩▩▩                                       ▩▩");
         System.out.println("　▩▩▩▩▩▩▩▩▩▩▩                        ▩▩ ");
         System.out.println("▩▩▩▩▩▩▩▩                              ▩▩▩▩▩▩▩▩▩▩▩ ");
         System.out.println("▩▩▩▩▩▩▩▩▩▩▩▩▩▩                 ▩▩▩▩▩▩▩   ");
         System.out.println("▩▩▩▩▩▩▩▩▩                           ▩▩▩▩▩▩▩▩   ");
         System.out.println("▩▩▩▩▩▩▩▩▩▩▩▩▩                   ▩▩▩▩▩▩▩▩   ");
         System.out.println("▩▩▩▩▩▩▩▩                             ▩▩▩▩▩▩▩▩  ");
         System.out.println("　▩▩▩▩▩▩▩▩▩▩▩                     ▩▩▩▩▩▩▩  ");
         System.out.println("　　▩▩▩▩▩                                 ▩▩▩▩▩  ");
      }
      
      
      
      void show_record(int player_win_lose_count, int computer_win_lose_count)//승, 패, 승률 계산 함수
      {
         double sum=(double)player_win_lose_count/(player_win_lose_count+computer_win_lose_count);
         clearScreen();
         for(int i=0;i<40;i++)
         {
            System.out.print("▩");
         }
         System.out.println("\n");
         for(int i=0;i<10;i++)
         {
            System.out.print("  ");
         }
         System.out.println("승리:    "+player_win_lose_count+'\n');
         for(int i=0;i<10;i++)
         {
            System.out.print("  ");
         }
         System.out.println("패배:    "+computer_win_lose_count+'\n');
         for(int i=0;i<10;i++)
         {
            System.out.print("  ");
         }
         System.out.println("승률:    "+sum*100+"%\n");
         for(int i=0;i<40;i++)
         {
            System.out.print("▩");
         }
         for(int i=0;i<10;i++)
         {
            System.out.print("  ");
         }
         System.out.println("\n");
      }
}
