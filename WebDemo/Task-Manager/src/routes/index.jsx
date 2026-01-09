import { createBrowserRouter } from "react-router-dom";
import Layout from "./Layout";
import TaskItem from "../components/TaskItem";


const router = createBrowserRouter([
    {
        element: <Layout />,
        children: [
            {path:'/', element: <TaskItem />}
        ]
    }
])

export default router