import Handler.Handler;
import Handler.CanonHandler_3029C004AA;
import Handler.CanonHandler_3029C005AA;

import java.util.ArrayList;
import java.util.List;

public class HandleAssembler {

    // Handler 모두 생성
    public List<Handler> assemble() {
        List<Handler> canonHandlers = new ArrayList<>();
        canonHandlers.add(new CanonHandler_3029C004AA());
        canonHandlers.add(new CanonHandler_3029C005AA());
        return canonHandlers;
    }
}
