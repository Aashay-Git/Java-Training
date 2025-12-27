import { useState } from 'react'
import reactLogo from './assets/react.svg'
import viteLogo from '/vite.svg'
import './App.css'
import Card from './components/Card'

function App() {
  const [count, setCount] = useState(0)

  let arr = ["test1", 'test99', 'test3']

  return (
    <>
      <div className='cardHolder'>
        <Card value={"Prop value"}/>        
      </div>
    </>
  )
}

export default App
