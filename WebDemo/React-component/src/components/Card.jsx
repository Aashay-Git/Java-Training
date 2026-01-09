import './Card.css'
import { useState } from 'react'

function Card({users, children }) {
    const [textProp, setTextProp] = useState({
        fontSize1: 0,
        fontColor1: ""
    })
   

    const RenderCard = () => (
        <div className='cardHolder'>
            {
                users.map((user, index) => (
                    <div className='card' key={index}>
                        <h1>
                            Name: {user.details.name}
                        </h1>
                        <h6>
                            {children}
                        </h6>
                        <p>
                            {user.details.status?"Online":"Offline"}
                        </p>
                        <h3>
                            { user.details.showAge && <span>Age: {user.details.age}</span>}                      

                            <span className="line">|</span> ID: {user.details.id}
                        </h3>
                        <h3>
                            City: {user.address.city} | Zipcode: {user.address.zipcode}
                        </h3>
                        <h3>
                            email: {user.contact.email} | Phone: {user.contact.phone}
                        </h3>
                        <hr></hr>
                        <hr></hr>
                        {
                            (user.message.txt == ""? <p style={{fontSize: `${textProp.fontSize1}px`, color: `${textProp?.fontColor1}`}}>No message</p> : <p>{user.message.txt}</p>)
                        }

                        <label>Text Size</label>
                        <input type='number' name='fontSize1' value={textProp.fontSize1} onChange={(e) => setTextProp({...textProp, [e.target.name]: e.target.value})}/>

                        <label>Font Color</label>
                        <input type='text' name='fontColor1' value={textProp.fontColor1} onChange={(e) => setTextProp({...textProp, [e.target.name]: e.target.value})}/>
                    </div>
                )

                )}
        </div>
    )


    return (
        <RenderCard />
    )
}

export default Card