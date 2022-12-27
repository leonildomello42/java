package chess;

import java.io.Serial;

public class ChessException extends RuntimeException{

    @Serial
    private static final long serialVersionUID = 6492993152489147354L;

    public  ChessException(String msg){
        super(msg);
    }
}
