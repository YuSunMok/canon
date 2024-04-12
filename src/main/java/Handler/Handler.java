package Handler;

import checkpointprocessor.CheckPointProcessor;

import java.util.LinkedList;
import java.util.Queue;

public abstract class Handler {

    Queue<CheckPointProcessor> checkPointProcessQueue = new LinkedList<CheckPointProcessor>();

    // 프린터기에 알맞은 Handler인지 확인
    public abstract boolean isCheck(String matrix);

    /**
     * 프린터기에 해당하는 로직 실행
     * 예시) 프린트1에 해당하는 사진 sequence로 검사하는 로직
     */
    public abstract void handle();
}
