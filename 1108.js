/**
 * @param {string} address
 * @return {string}
 */
var defangIPaddr = function(address) {
    let addr = ''
    for (let i in address) {

        if (address[i] == '.') {
            console.log('1');
            addr += '[.]';
        } else {
            addr += address[i];
        }
    }
    return addr
};
console.log(defangIPaddr("1.1.1.1"));