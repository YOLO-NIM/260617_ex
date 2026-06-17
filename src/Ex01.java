public class Ex01 {
    // 진입점
    public static void main(String[] args){
        // sout
        System.out.println("Hello World!");

        // (키워드) (타입) 식별자
        int day = 17; // int 정수 타입
        System.out.println(day);
        System.out.println("day = " + day); // sorty
        // 표준 출력 -> print, println, printf -> println.
        System.out.print("그냥 프린트는요");
        System.out.print("보시면 아시겠지만 줄 바꿈은 안해줌\n");
        System.out.print("앞엔 줄바꿈이 되지만");
        System.out.print("뒤에는 안됩니다");
        System.out.println("C 계열의 표기법을 존중하면서도");
        System.out.println("기본적인 편의를 챙긴 설계");

        //문자, 문자열
        char c = 'A'; // '', char / Character
        char c2 = '한';
        System.out.println(c);
        System.out.println(c2);
        // 2바이트의 단일 문자(아스키코드 + UTF8) => 대응되는 숫자코드(값)가 존재
        String s = "ABC";   // 복합 문자를 표현할 때는 "문자열"을 사용
        String s2 = "한글";
        System.out.println(s);
        System.out.println(s2);
        String cs = 'A' + "";
        System.out.println(cs);
        System.out.println("c = " + (c + 0));
        System.out.println("cs = " + (cs + 0));
    }
}
