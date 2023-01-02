import logo from './logo.svg';
import './App.css';
import Ex1 from "./components/ex/Ex1";
import SamplePage from "./pages/SamplePage";
import {AbcRounded} from "@mui/icons-material";
import {RouterProvider} from "react-router-dom";
import routers from "./routers";

function App() {
    return (<>
            <RouterProvider router={routers}/>
        </>);
}

export default App;
