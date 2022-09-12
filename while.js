let array1 = [1,2,3,4,5];
let sum = i = 0;

while (i<array1.length){
    sum += array1[i];
    i++;
}
array1.map(value => process.stdout.write(`${value} `));

console.log(`\nSum of the array elements: ${sum}`);