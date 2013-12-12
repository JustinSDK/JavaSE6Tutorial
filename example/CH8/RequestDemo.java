public class RequestDemo {
    public static void main(String[] args) {
        for(int i = 0; i < 10; i++) {
            int n = (int) (Math.random() * 10) % 2;
            switch (n) {
                case 0:
                    doRequest(
                         new HelloRequest("良葛格"));
                    break;
                case 1:
                    doRequest(new WelcomeRequest("Wiki 網站"));
            }
        }
    }
 
    public static void doRequest(IRequest request) {
        request.execute();
    }
}