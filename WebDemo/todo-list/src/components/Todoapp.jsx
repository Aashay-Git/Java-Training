import React, { useEffect, useState } from 'react'
import './Todoapp.css'


const Todoapp = () => {
    const [list, addlist] = useState({
        task: "",
        done: false
    });

    const [tasklist, settask] = useState([]);
    const [show, setshow] = useState(false);

    const [done, mark] = useState(false);

    useEffect(() => {
        console.log(tasklist)
    }, [tasklist])

    function add() {
        settask([...tasklist, { ...list }])


    }

    function print1() {
        console.log(tasklist)
    }

    return (
        <div>
            <label>Task</label>

            <input type="text" onChange={(e) => addlist({ ...list, task: e.target.value })} />

            <button onClick={add}>Add task</button>

            <button onClick={() => setshow(!show)}> {show ? 'Hide tasks' : 'Show tasks'} </button>

            {show && tasklist.map((value, index) => (
                <div key={index}>
                    <div className='task-div'>
                        
                        <h3>{value.task}</h3>

                        <button onClick={() => {
                            tasklist.map((value2, index2) => {
                                if(index == index2){
                                    // value2.done = true
                                    value.done?value.done = false : value.done = true
                                    console.log("first")
                                    console.log(value2.done)
                                }
                            })
                        }}>{value.done?<span>Done</span> : <span>Not Done</span>}</button>

                    </div>
                </div>
            ))}
            {
                console.log("outside")
            }
        </div>
    )
}

export default Todoapp
