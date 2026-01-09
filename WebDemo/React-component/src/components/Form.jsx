import React from 'react'
import { useState } from 'react'

function Form() {
    const [name, setName] = useState("")
    const [submitName, setSubmitName] = useState("")
    // var name = ""
    // var submitName = ""

    const passName = () => {
        setSubmitName(name) 
        // submitName = name
    }

    return (
        <div>
            <input type='text' value={name} onChange={(e) => setName(e.target.value)} />
            {/* <input type='text' onChange={(e) => name = e.target.value} /> */}
            <button onClick={passName}>Submit</button>
            {/* <button onClick={passName}>Submit</button> */}

            <h1>{submitName}</h1>
        </div>
    )
}

export default Form