export function howTime(fun) {
    var t0 = new Date();
    fun();
    var t0 = new Date();
    return console.log("Call to doSomething took " + (t1 - t0) + " milliseconds.");
}