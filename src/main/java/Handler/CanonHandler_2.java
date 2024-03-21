package Handler;

import java.util.Objects;

public class CanonHandler_2 extends Handler {

    private final String canonPrinter = "이미지 2 matrix";

    @Override
    public boolean isCheck(String matrix) {
        return Objects.equals(matrix, canonPrinter);
    }

    @Override
    public void handle() {
        System.out.println("Handler2 프로세스 실행!");
    }
}
