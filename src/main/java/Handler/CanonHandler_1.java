package Handler;

import java.util.Objects;

public class CanonHandler_1 extends Handler {

    private final String canonPrinter = "이미지 1 matrix";

    @Override
    public boolean isCheck(String matrix) {
        return Objects.equals(matrix, canonPrinter);
    }

    @Override
    public void handle() {
        System.out.println("Handler1 프로세스 실행!");
    }
}
