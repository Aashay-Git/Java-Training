import { useState } from 'react'
import reactLogo from './assets/react.svg'  
import viteLogo from '/vite.svg'
import './App.css'
import Hello from './components/Hello'
import Welcome from './components/Welcome'
import Header from './components/Header'
import Footer from './components/Footer'
import Greeting from './components/Greeting'
import Card from './components/Card'
import Form from './components/Form'
import Button from './components/Button'
import Product from './components/Product'

function App() {
  let n = "tempName"

  const user1 = {
        details: { name: 'John', age: 22, id: 1, status: true, showAge: true },
        address: { city: "Nagpur", zipcode: 442201 },
        contact: { email: "tempmail@gmail.com", phone: 123456 },
        message: { txt: ""}
    }

    const user2 = {
        details: { name: 'Joseph', age: 33, id: 2, status: false, showAge: true },
        address: { city: "Mumbai", zipcode: 445511 },
        contact: { email: "mail@gmail.com", phone: 765432 },
        message: { txt: "This has msg"}
    }

    const user3 = {
        details: { name: 'Joe', age: 33, id: 2, status: false, showAge: false },
        address: { city: "Mumbai", zipcode: 445511 },
        contact: { email: "mail@gmail.com", phone: 765432 },
        message: { txt: "Has msg"}
    }

    const users = [user1, user2, user3]


    const product1 = {
      name: "prod1",
      price: 1234,
      rating: 4,
      img: "imageVSCode1.png"
    }
    const product2 = {
      name: "prod2",
      price: 12,
      rating: 5,
      img: "image2.png"
    }
    const product3 = {
      name: "prod3",
      price: 34,
      rating: 3,
      img: "image3.png"
    }

    const products = [product1, product2, product3]


  return (
    <>
    <Header/>
      <Hello/>
      <Welcome/>

      <Product Products={products}/>

      <Greeting name={"John2"} name2={"John4"}>
        <Button text={`click ${n}`}></Button>

        {/* <h2>testheading</h2> */}

        <Button></Button>
      </Greeting>
      <Card users={users}>
        <Button text={"Button text"}></Button>
      </Card>
      <Form/>
      <Footer/>
    </>
  )
}

export default App
