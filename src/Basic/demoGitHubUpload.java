package Basic;

public class demoGitHubUpload {
    public static void main(String[] args) {
        System.out.println("Hello World on GitHub");
        for ( int i = 1; i< 5; i++){
            System.out.print("*?");
            for (int a = 1; a<6-i; a++) {
                System.out.print("@");
                for (int b = 1; b < 5-a;b++){
                    System.out.print("*");
                    for (int c=1; c<5+1; c++);
                }
                System.out.println(" ");
            }
        }
    }


}
