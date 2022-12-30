import React from 'react';
import {List, ListItemButton, ListItemText} from "@mui/material";
import ListItemIcon from '@mui/material/ListItemIcon';
import DashboardIcon from '@mui/icons-material/Dashboard';





function MenuComponent(props) {

    const menuArr = [
        {icon:<DashboardIcon/>, text:"Todo 리스트"},
        {icon:<DashboardIcon/>, text:"Todo 등록"},
        {icon:<DashboardIcon/>, text:"로그인"},
        {icon:<DashboardIcon/>, text:"회원가입"},
    ]

    return (
        <List>
            {menuArr.map((menu, index) => {

                return (
                    <ListItemButton key={index}>
                        <ListItemIcon>{menu.icon}</ListItemIcon>
                        <ListItemText primary={menu.text}/>
                    </ListItemButton>
                )
            })}
        </List>


    );
}

export default MenuComponent;