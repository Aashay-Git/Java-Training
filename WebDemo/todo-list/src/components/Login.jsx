import React, { useState } from 'react'
import { Navigate } from 'react-router-dom'
// import './userform.css';
const Login = () => {
    const user1 = {
        name: "ram",
        username:"ram",
        password:"123"
    }
    const user2 = {
        name: "ram",
        username:"ram",
        password:"1235"
    }
    const user3 = {
        name: "ram",
        username:"ram",
        password:"1234"
    }
    const user4 = {
        name: "ram",
        username:"ram",
        password:"123"
    }
    let arr = [user1,user2,user3,user4];

    const [form , formdata] = useState({
        username : "",
        password : ""
    });
    const[out , setout] = useState(null);
    const[islogged , setlogged] = useState("aqua");
    let res = ()=>{
        const islog = arr.some((user)=>
            user.username == form.username && user.password == form.password
        )
        if(islog){
            setout(true);
            setlogged("green");
            // <Navigate to="/to-do" />
            window.location.href = "/to-do";

        }
        else{
            setout(false);
            setlogged("red");
        }

    }
  return (
    <div className='main'>
        <div className='container' style={{backgroundColor:`${islogged}`}}>
        <input className='input' type="text"  onChange={(e)=>formdata({...form,username:e.target.value})}/>
        <input className='input' type="password" onChange={(e)=>formdata({...form,password:e.target.value})}/>
        <button onClick={res}>submit</button>
        </div>
        {out && <h1>Logined successfully</h1>}
        {out==false && <h1>"Invalid creds"</h1>}
      
    </div>
  )
}

export default Login