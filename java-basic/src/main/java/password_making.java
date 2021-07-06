
import java.util.Scanner;

public class password_making {

  public static void main(String[] args) {
    // TODO Auto-generated method stub


    int num = 0;
    String encryption = "";
    String decryption = "";
    try {
      loop1:

        do {
          System.out.println("암호화와 복호화를 대충 만들어 보자");
          System.out.println("아래 메뉴중에 하나 눌러보세요. 메뉴에 있는 1,2,3만 누르는걸 추천");
          System.out.println("1. 암호화하기(순서상 이것 먼저 해야 함)");
          System.out.println("2. 복호화하기(암호화 실행 후 진행하세요)");
          System.out.println("3. 나가기");

          Scanner sc = new Scanner(System.in);
          num= sc.nextInt();

          if(num>3 || num <0) {
            System.out.println("역시 한국인이면 메뉴얼대로 안하는게 정석이죠^^");
            System.out.println("계속 다른것 눌러도 똑같으니 1,2,3 중에 하나 누르시는걸 추천");
            System.out.println("----------------------------------------------");
            System.out.println();

          }



          switch(num) {

            case 1: 
              System.out.println("암호화할 내용을 입력해 주세요.(숫자,영어,한글,특수문자 등등)");
              Scanner sc1 = new Scanner(System.in);
              encryption = sc1.nextLine();
              encry.encry(encryption);
              break;

            case 2:
              System.out.println("복호화할 내용을 입력해 주세요.(암호화 하고 복사한 내용 붙여넣기)");
              Scanner sc2 = new Scanner(System.in);
              decryption = sc2.nextLine();
              decry.decry(decryption);
              break;

            case 3:
              System.out.println("암호화와 복호화 약식 코딩 완료");
              break loop1;

          } // switch 종료


        }while(true);{}
    }catch(Exception e) {
      System.out.println("숫자 이외에 다른 것 입력하면 종료되게 만들었지롱~ 다시 시작해서 메뉴얼 대로 하세요^^");
    }// do 종
  } // 메인메서드 종


} // 클래스 종료 
class encry{
  static void encry(String s){

    String changeencry = "";
    for(int i = 0; i < s.length(); i++) {

      changeencry += (char)(s.charAt(i)+50);
    }
    System.out.println("입력하신 글자의 암호화된 문자는"+changeencry+ "입니다.");
    System.out.println(changeencry+ "< =암호화된 코드를 복사해두세요");
    System.out.println();

  }
}

class decry{
  static void decry(String s) {

    String changedecry = "";
    for(int i = 0; i<s.length(); i++) {
      changedecry += (char)(s.charAt(i)-50);
    }

    System.out.println("입력하신 글자의 복호화된 문자는 : '" +changedecry+ "' 입니다.");
    System.out.println();

  }
}

