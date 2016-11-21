package com.eval
/*
 * Derived InputObj class from EvalObj
 * Contains the ability to XOR the base64 string by a constant xorBy
 */

class InputObj extends EvalObj{

    private final xorBy = 0x66

    // XORs the base64Str String with xorBy
    def xorString() {
        def bytesToXor = base64Str.decodeBase64()
        def numOfBytes = bytesToXor.size()

        // set each byte to itself xor xorBy
        for (int i = 0; i < numOfBytes; i++) {
            bytesToXor[i] = bytesToXor[i] ^ xorBy;
        }

        return bytesToXor.encodeBase64().toString();
    }
}
