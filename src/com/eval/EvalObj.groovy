package com.eval
/*
 * A Base EvalObj to be derived by InputObj and OutputObj
 * Contains getters and setters for each of its private members
 */

class EvalObj {
    private userUUID        // userUUID from JSON input
    private taskUUID        // taskUUID from JSON input
    private base64Str       // A base 64 string,

    def setUserUUID(uuid) {
        this.userUUID = uuid
    }

    def setTaskUUID(uuid) {
        this.taskUUID = uuid
    }

    def setBase64Str(str) {
        this.base64Str = str
    }

    def getUserUUID() {
        return this.userUUID
    }

    def getTaskUUID() {
        return this.taskUUID
    }

    def getBase64Str() {
        return this.base64Str
    }
}
