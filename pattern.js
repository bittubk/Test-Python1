for(let i=0; i<5; i++){
    for(let j=5; j>i; j--)
    process.stdout.write(" ");
    for(let k=0; k<=i+i; k++)
    process.stdout.write("*");

    console.log(" ");
}