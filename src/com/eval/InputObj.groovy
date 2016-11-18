package com.eval
import java.lang.*;
/*
 * User input objects via formatted JSONs
 *
 */
class InputObj {

    private final xorBy = 0x66;
    private String userUUID;        // userUUID from JSON input
    private String taskUUID;        // taskUUID from JSON input
    private String base64Str;     // the byte array parsed from a base 64 binary string

    public InputObj(String userUUID, String taskUUID, String base64Str) {
        this.userUUID = userUUID;
        this.taskUUID = taskUUID;
        this.base64Str = base64Str;
    }

    public String getUserUUID() {
        return this.userUUID;
    }

    public String getTaskUUID() {
        return this.taskUUID;
    }

    public String getBase64Str() {
        return this.base64Str;
    }

    // XORs the base64Str String with 0x66
    public String xorString() {
        def bytesToXor = base64Str.decodeBase64();
        def numOfBytes = bytesToXor.size();

        // set each byte to itself xor xorBy
        for (int i = 0; i < numOfBytes; i++) {
            bytesToXor[i] = bytesToXor[i] ^ xorBy;
        }

        return bytesToXor.encodeBase64().toString();
    }
}
