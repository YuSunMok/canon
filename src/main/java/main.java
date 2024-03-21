import Handler.Handler;

import java.util.List;
import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        // 모든 핸들러 생성
        HandleAssembler handleAssembler = new HandleAssembler();
        List<Handler> handlers = handleAssembler.assemble();

        // 입력받기 (실제로는 프린터기 이미지 받는 부분)
        Scanner sc = new Scanner(System.in);
        String image = sc.nextLine();

        // 프린터기 이미지 행렬로 변환
        ImageConverter imageConverter = new ImageConverter();
        String matrix = imageConverter.imageToMatrix(image);

        // 프린터기에 알맞은 핸들러 찾아서 그에 맞는 프로세스 진행
        for(Handler handler : handlers) {
            if(handler.isCheck(matrix)) {
                handler.handle();
            }
        }
    }
}
