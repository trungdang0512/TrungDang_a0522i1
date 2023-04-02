function findFibonacci(number: number): number {
    return Math.round((Math.pow((1 + Math.sqrt(5)),number) - Math.pow(( 1 - Math.sqrt(5)), number))
        / (Math.pow(2,number) * Math.sqrt(5)));
}

function sumFibonacci(number: number): number {
    let sum: number =0;
    for (let i=0; i <= number; i++){
        sum += findFibonacci(i);
    }
    return sum;
}



console.log("Tổng của dãy Fibonacci 6 số là: "  + sumFibonacci(6));