#include "example.h"
#include <jsi/jsi.h>

using namespace facebook::jsi;
using namespace std;

namespace example {
	void install(Runtime & jsiRuntime){
	    auto helloWorld = Function::createFromHostFunction(jsiRuntime, PropNameID::forAscii(jsiRuntime, "helloWorld"), 0, [](Runtime & runtime,
	            const Value &thisValue,
	                const Value *arguments, size_t count) -> Value {
	        string helloWorld = "helloWorld";
            return Value(runtime, String::createFromUtf8(runtime, helloWorld));
	    });
	    jsiRuntime.global().setProperty(jsiRuntime, "helloWorld", move(helloWorld));
	}
}
