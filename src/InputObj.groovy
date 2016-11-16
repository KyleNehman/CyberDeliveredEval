/*
 * User input objects via formatted JSONs
 *
 */
class InputObj {

    private final xorBy = 0x66;
    private String userUUID;        // userUUID from JSON input
    private String taskUUID;        // taskUUID from JSON input
    private byte[] base64Bytes;     // the byte array parsed from a base 64 binary string

    public InputObj(String userUUID, String taskUUID, String base64Str) {
        this.userUUID = userUUID;
        this.taskUUID = taskUUID;
        this.base64Bytes = binStrToByteArr(base64Str);
    }

    public String getUserUUID() {
        return this.userUUID;
    }

    public String getTaskUUID() {
        return this.taskUUID;
    }

    public byte[] getBase64Bytes() {
        return this.base64Bytes;
    }

    // XORs the base64Str String with 0x66
    public String xorString() {

        return "Method not completed";
    }

    // Converts a binary string argument to a byte array
    private byte[] binStrToByteArr(String binStr) {
        byte[] returnVal;

        int numOfBits = binStr.size();
        int numOfBytes = numOfBits / 8;  // Due to the 3byte nature of base64 strings numOfBits % 8 will always == 0

        returnVal = new byte[numOfBytes];
        for (int i = 0; i < numOfBits; i++) {
            // Using the fact that groovy initializes bytes to 0
            // And that groovy integer division is truncated...

            int byteIndex = i / 8;      // index of the byte array returnVal
            int indexInByte = i % 8;    // vs the current index of the local byte [0-7]
            int bitMultiplier = 2 ** indexInByte; // 2^index [1-2^7]

            returnVal[byteIndex] += (binStr.charAt(i) - '0') * bitMultiplier;
        }

        return returnVal;
    }
}
