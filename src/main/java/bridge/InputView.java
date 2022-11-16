package bridge;

/**
 * 사용자로부터 입력을 받는 역할을 한다.
 */
public class InputView {

    /**
     * 다리의 길이를 입력받는다.
     */
    public int readBridgeSize() {
        return 0;
    }

    /**
     * 사용자가 이동할 칸을 입력받는다.
     */
    public String readMoving() {
        return null;
    }

    /**
     * 사용자가 게임을 다시 시도할지 종료할지 여부를 입력받는다.
     */
    public String readGameCommand() {
        return null;
    }

    private void validateCommand (String command) {
        if (command.equals("R") || command.equals("Q")) {
            throw new IllegalArgumentException();
        }
    }

    private void validateMoving (String moving) {
        if (moving.equals("U") || moving.equals("D")) {
            throw new IllegalArgumentException();
        }
    }

    private void validateBridgeSize (String bridgeSize) {
        isRealNumber(bridgeSize);
        checkbridgeSizeNumberRange(bridgeSize);
    }

    private void isRealNumber (String bridgeSize) {
        for (char element: bridgeSize.toCharArray()) {
            if (element < 48 || element > 57) {
                throw new IllegalArgumentException();
            }
        }
    }

    private void checkbridgeSizeNumberRange (String bridgeSize) {
        int bridgeSizeNumber = Integer.parseInt(bridgeSize);
        if (bridgeSizeNumber < 3 || bridgeSizeNumber > 20) {
            throw new IllegalArgumentException();
        }
    }
}
