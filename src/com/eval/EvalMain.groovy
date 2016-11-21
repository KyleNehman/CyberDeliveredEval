package com.eval
/*
 * The main class and REST controller for the evaluation project
 */

@RestController
@RequestMapping("/")
class EvalMain {

    @RequestMapping(method = RequestMethod.POST)
    public ResponseEntity<OutputObj> update(@RequestBody InputObj obj){

        // defines a new OutputObj to return
        def returnVal = new OutputObj()

        // old data members from input obj
        def userUUID = obj.getUserUUID()
        def taskUUID = obj.getTaskUUID()
        def postXORStr = obj.xorString()

        // and setting the returnVal obj
        returnVal.setUserUUID(userUUID)
        returnVal.setTaskUUID(taskUUID)
        returnVal.setBase64Str(postXORStr)

        return new ResponseEntity<OutputObj>(returnVal, HttpStatus.OK)
    }
}
