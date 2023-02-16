import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.Socket;
import java.util.Scanner;

public class DateClient {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("클라이언트 > 날짜 서버의 IP 주소는? ");
        String serverAddress = sc.nextLine();
        try (Socket clientSocket = new Socket(serverAddress, 9000);
             BufferedReader br = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
             ) {
            String date = br.readLine();
            System.out.println(date);
        } catch (Exception e) {

        }
    }
}
