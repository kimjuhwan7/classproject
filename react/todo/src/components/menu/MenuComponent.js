import React from 'react';
import {List, ListItemButton, ListItemText} from "@mui/material";
import ListItemIcon from '@mui/material/ListItemIcon';
import DashboardIcon from '@mui/icons-material/Dashboard';
import {useNavigate} from "react-router-dom";


function MenuComponent(props) {

    const menuArr = [
        {icon: <DashboardIcon/>, text: "Home", path: "/"},
        {icon: <DashboardIcon/>, text: "About", path: "/about"},
        {icon: <DashboardIcon/>, text: "ToDo", path: "/todo"},
        {icon: <DashboardIcon/>, text: "회원가입"},
    ]
    const navigate = useNavigate();
    const movePage = (path) => {

        console.log("movePage =>", path)
        if (path) {
            navigate(path)
        }
    }
    return (
        <List>
            {menuArr.map((menu, index) => {

                return (
                    <ListItemButton key={index}>
                        <ListItemIcon>{menu.icon}</ListItemIcon>
                        <ListItemText primary={menu.text} onClick={() => movePage(menu.path)}/>
                    </ListItemButton>
                )
            })}
        </List>


    );
}

export default MenuComponent;