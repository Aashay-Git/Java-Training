import React, { useEffect, useState } from 'react'

function TaskItem() {
  const [list, updateList] = useState([])

  const [item, setItem] = useState({
    id: 0,
    title: "",
    description: "",
    done: false
  })

  // useEffect(() => {
  //   console.log(list)
  // },[list])

  useEffect(() => {
    console.log(list)
  },[list])

  return (
    <>
      <div>TaskItem</div>
      <label>Enter Task: </label>
      <input type='text' value={item.title} onChange={(e) => {
        updateList([{ ...item, title: e.target.value }])
      }}>
      </input>

      <button onClick={() => {
        updateList([...list, {...item}])

      }}>
        Add Task
      </button>
    </>
  )
}

export default TaskItem