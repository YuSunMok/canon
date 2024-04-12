package Handler;

import checkpointprocessor.CheckPointProcessor;
import checkpointprocessor.checkpointprocess3029C004AA.CheckPointProcessor_3029C004AA_1;
import checkpointprocessor.checkpointprocess3029C004AA.CheckPointProcessor_3029C004AA_2;
import checkpointprocessor.checkpointprocess3029C004AA.CheckPointProcessor_3029C004AA_3;

import java.util.Objects;

public class CanonHandler_3029C005AA extends Handler {

    private final String canonPrinter = "3029C005AA";

    @Override
    public boolean isCheck(String matrix) {
        return Objects.equals(matrix, canonPrinter);
    }

    @Override
    public void handle() {
        System.out.println("Handler2 프로세스 실행!");
        // q에 3029C005AA해당하는 process 모두 넣기
        super.checkPointProcessQueue.add(new CheckPointProcessor_3029C004AA_1());
        super.checkPointProcessQueue.add(new CheckPointProcessor_3029C004AA_2());
        super.checkPointProcessQueue.add(new CheckPointProcessor_3029C004AA_3());
        // q 루프돌며 하나씩 실행
        super.checkPointProcessQueue.forEach(CheckPointProcessor::process);
    }
}
