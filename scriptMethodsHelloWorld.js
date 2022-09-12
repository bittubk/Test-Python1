let text = "HelloO World";
let txt = "Hey User Welcome To The Programming World";

// search
console.log(text.search("World"));

// replace with string
console.log(text.replace("Hello", "Hi"));

// replace with RegExp
console.log(text.replace (/world/i, "India"));

// global match
console.log(text.match (/o/ig));

// multiline match
console.log(txt.match (/gr/m));