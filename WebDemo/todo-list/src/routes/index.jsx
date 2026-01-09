import { createBrowserRouter, Navigate, Outlet } from "react-router-dom";
import Login from '../components/Login';
import Todo from '../components/Todoapp';

const Layout = () => {
    return (
        <div>
            <h1 style={{textAlign: "center"}}>todo app</h1>
            <Outlet />
        </div>
    )
}

const router = createBrowserRouter([
    {
        element: <Layout />,
        children: [
            { path: '/login', element: <Login /> },
            { path: '/to-do', element: <Todo /> },
            { path: '/*', element: <Navigate to="/login"/>}
        ]
    }
])

export default router