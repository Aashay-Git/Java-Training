// console.log("Hello world")
// console.log(x)

// var x = 10



// function sum(a, b){
//     return a + b;
// }
// console.log("Enter sum(a,b): ") 


// var x = 10
// var v = (x = "Unknown", y = 8) =>{
//     console.log("name: ", x, "y: ", y)
// }

// v()
// v("testing")
// v("Testing2", x)
// console.log(v)

let arr = [1,2,3,4,5,6,7,8,9]

function sumOdds(arr){
    let sum = 0
    for(i = 0; i < arr.length; i++){
        if(arr[i] % 2 != 0){
            sum += arr[i];
        }
    }
    console.log("sum: ", sum)
}


var s = (arr) => {
let sum = 0
    for(i = 0; i < arr.length; i++){
        if(arr[i] % 2 != 0){
            sum += arr[i];
        }
    }
    console.log("sumOdd: ", sum)
}

sumOdds(arr)
s(arr)