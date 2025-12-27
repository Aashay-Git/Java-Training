// let n = document.getElementById("num")

function evenOdd(num) {
    // num = e.target.value
    // let n = document.getElementById("num")
    num = n.value
    if (num % 2 != 0) {
        console.log("Odd")
    } else {
        console.log("Even")
    }
}

function checkAge(age) {
    age = n.value
    if (age >= 19) {
        console.log("Eligible to vote")
    } else {
        console.log("NOT Eligible to vote")
    }
}

function findGreater(a, b) {
    if (a > b) {
        console.log(a, " a is greater")
    } else if (b > a) {
        console.log(b, " b is greater")
    } else {
        console.log("Both are equal")
    }
}

function checkPassFail(marks) {
    marks = n.value
    if (marks >= 40) {
        console.log("Pass")
    } else {
        console.log("Fail")
    }
}

function checkTemp(temp) {
    temp = n.value
    if (temp > 30) {
        console.log("HOT")
    } else if (temp > 20) {
        console.log("Normal")
    } else {
        console.log("COLD")
    }
}


// Loop
function printNumbers(n) {
    for (let i = 1; i <= n; i++) {
        console.log(i)
    }
}

function table(num) {
    for (let i = 1; i <= 10; i++) {
        console.log(num * i)
    }
    // return 10;
}

let sumOfN = (n) => {
    sum = 0
    for (i = 1; i <= n; i++) {
        sum += i
    }
    return sum
}

function countDown(n) {
    for (n; n > 0; n--) {
        console.log(n)
    }
}

function printEven(n) {
    for (i = 0; i <= n; i += 2) {
        console.log(i)
    }
}


// loop + if else

function countEvenOdd(n) {
    let countOdd = 0
    let countEven = 0

    for (i = 1; i <= n; i++) {
        if (i % 2 == 0) {
            countEven++
        } else {
            countOdd++
        }
    }
    console.log("Even: ", countEven)
    console.log("Odd: ", countOdd)
}

function findLargest(arr) {
    let l = 0
    for (i of arr) {
        l = i > l ? i : l
    }
    console.log(l)
}

function reverseNum(num) {
    temp = 0
    m = 1
    newNum = 0
    count = 0
    while (num > 0 && m == 1) {
        count++
        temp = num % 10
        // console.log("temp: ", temp)
        num -= temp
        newNum += temp
        newNum *= 10
        // m *= 10
        num /= 10;
        if (count > 1000) {
            m = 0
        }
    }
    console.log(newNum / 10)

}

const data = {
    user1: { name: 'Name1', age: 12, id: 1 },
    user2: { name: 'Name2', age: 21, id: 2 },
    user3: { name: 'Name3', age: 33, id: 3 }
}

// for (o of Object.keys(data)) {
//     console.log(data[o].name)
// }

// for (o in data) {
//     console.log(data[o].age)
// }

// for (o in data) {
//     console.log(data[o].name, data[o].age)
// }

// for (o in data) {
//     console.log(o)
// }

// Object.keys(data).forEach(function (a) {
//     console.log(a)
// })

// Object.keys(data).forEach(temp => {
//     console.log(temp)
// })

// var maptest = Object.keys(data).map(temp => {
//     console.log(temp)
//     return temp
// })

// console.log(maptest)

// var maptest2 = Object.keys(data).map(function (){
//     return [1,2,[12,34],false]
// })
// console.log(maptest2)

// var q1 = Object.keys(data).map(obj => data[obj])
// console.log(q1)

// var q1 = Object.keys(data).map(obj => data[obj].name)
// console.log(q1)

// var q1 = Object.keys(data).map(obj => data[obj].age)
// console.log(q1)

// var q1 = Object.keys(data).map(obj => [data[obj].id, data[obj].name])
// console.log(q1)

// var q1 = Object.keys(data).map(obj => data[obj].name.toUpperCase())
// console.log(q1)

// // console.log("test".toUpperCase())

// var q1 = Object.keys(data).map(obj => data[obj].age+=5)
// console.log(q1)

// console.log(data)

// var q1 = Object.keys(data).map(obj => [data[obj].name, data[obj].isAdult = data[obj].age >= 18])
// console.log(q1)

// // var q1 = Object.keys(data).map(obj => data[obj].5)
// // console.log(q1)

// var q1 = Object.keys(data).map(obj => data[obj].name + " (" + data[obj].age + ")")
// console.log(q1)

// var q1 = Object.keys(data).map(obj => data[obj].city = "Nag")
// console.log(data)

// // delete data.user1.city
// // console.log(data)


// let test = "test"
// console.log(test.slice(0,1).toUpperCase() + test.slice(1,))

// test.replace('t', 'K')
// console.log(test)

// var q2 = Object.values(data).map(obj => obj.isAdult == true ? console.log("can vote") : "")

// var q1 = Object.keys(data).filter(obj => data[obj].age == 38)
// console.log(q1)

// var q1 = Object.keys(data).some(obj => data[obj].age == 38)
// console.log(q1)

// var q1 = Object.keys(data).find(obj => data[obj].age >= 18)
// console.log(q1)




const data2 = {
    details: { name: 'Name1', age: 12, id: 1 },
    address: { city: "Nagpur", zipcode: 440011 },
    contact: { email: "tempmail@gmail.com", phone: 123456 }
}

for(key in data2){
    let str = key + " -> "
    for(subkey in data2[key]){
        // console.log(data2[key][subkey])
        str += subkey + " -> " + data2[key][subkey] + "\n\t"
    }
    console.log(str)
}


