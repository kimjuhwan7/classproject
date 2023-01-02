import React, {useEffect, useState} from 'react';
import {useNavigate} from "react-router-dom";
import {getTodoList} from "../../apis/todoAPI";
import {Table, TableBody, TableCell, TableHead, TableRow} from "@mui/material";

function TodoListComponent(query, moveToRead) {
    const [todos, setTodos] = useState([])
    const navigate = useNavigate()

    useEffect(() => {
        getTodoList().then(result => {
            setTodos(result)
        })
    }, [query])

    return (
        <>
            <Table sx={{minWidth: 650}} aria-label="simple table">
                <TableHead>
                    <TableRow>
                        <TableCell align="right">ID</TableCell>
                        <TableCell align="right">Title</TableCell>
                        <TableCell align="right">Writer</TableCell>
                        <TableCell align="right">Complete</TableCell>
                    </TableRow>
                </TableHead>
                <TableBody>
                    {todos?.map((row) => (
                        <TableRow key={row.id} sx={{'&:last-child td,&:last-child th': {border: 0}}}
                                  onClick={() => moveToRead(row.id)}
                        >
                            <TableCell align="right">{row.id}</TableCell>
                            <TableCell align="right">{row.title}</TableCell>
                            <TableCell align="right">{row.writer}</TableCell>
                            <TableCell align="right">{row.complete ? "완료" : "진행중"}</TableCell>
                        </TableRow>
                    ))}

                </TableBody>

            </Table>
        </>
    );
}

export default TodoListComponent;