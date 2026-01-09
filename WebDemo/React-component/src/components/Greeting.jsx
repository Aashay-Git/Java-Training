import React from 'react'

function Greeting({name, name2, children}) {
  return (
    <div>
        Greetings, {name} {' '}
        Hello {name2}
        {children}
    </div>
  )
}

export default Greeting