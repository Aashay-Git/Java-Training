import { useState } from 'react'
import reactLogo from './assets/react.svg'
import viteLogo from '/vite.svg'
import './App.css'
import Todoapp from './components/Todoapp'
import Login from './components/Login'
import { RouterProvider } from 'react-router-dom'
import router from './routes/index.jsx'

// function App() {
//   const [count, setCount] = useState(0)

//   return (
//     <>
//       <Todoapp/>
//       <br/>
//       <hr/>
//       <br/>
//       <Login />
//     </>
//   )
// }

const App = () => {
  return <RouterProvider router={router}></RouterProvider>
}

export default App
