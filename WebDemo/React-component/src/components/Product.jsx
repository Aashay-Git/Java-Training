import './Card.css'
import { useState } from 'react'
import reactLogo from '../assets/react.svg'

function Product({ Products, children }) {
    const RenderCard = () => (
        Products.map((product, index) => (
            <div className='card' key={index}>
                {/* <img src={reactLogo}/> */}
                <img src={product.img}/>
                <h1>{product.name}</h1>
                <h3>{product.price}</h3>
                <h3>{product.rating}</h3>
            </div>
        ))
    )


    return (
        <div className='cardHolder'>
            <RenderCard />
        </div>
    )
}

export default Product