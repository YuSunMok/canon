package Handler;

import checkpointprocessor.CheckPointProcessor;
import checkpointprocessor.checkpointprocess3029C005AA.CheckPointProcessor_3029C005AA_1;
import checkpointprocessor.checkpointprocess3029C005AA.CheckPointProcessor_3029C005AA_2;
import checkpointprocessor.checkpointprocess3029C005AA.CheckPointProcessor_3029C005AA_3;

import java.util.Objects;

public class CanonHandler_3029C004AA extends Handler {

    private final String canonPrinter = "3029C004AA";

    @Override
    public boolean isCheck(String matrix) {
        return Objects.equals(matrix, canonPrinter);
    }

    @Override
    public void handle() {
        System.out.println("Handler1 프로세스 실행!");

        super.checkPointProcessQueue.add(new CheckPointProcessor_3029C005AA_1());
        super.checkPointProcessQueue.add(new CheckPointProcessor_3029C005AA_2());
        super.checkPointProcessQueue.add(new CheckPointProcessor_3029C005AA_3());

        super.checkPointProcessQueue.forEach(CheckPointProcessor::process);
    }
}
