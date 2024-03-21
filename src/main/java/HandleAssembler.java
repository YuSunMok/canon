import Handler.Handler;
import Handler.CanonHandler_1;
import Handler.CanonHandler_2;
import Handler.CanonHandler_3;

import java.util.ArrayList;
import java.util.List;

public class HandleAssembler {

    // Handler 모두 생성
    public List<Handler> assemble() {
        List<Handler> canonHandlers = new ArrayList<>();
        canonHandlers.add(new CanonHandler_1());
        canonHandlers.add(new CanonHandler_2());
        canonHandlers.add(new CanonHandler_3());
        return canonHandlers;
    }
}
