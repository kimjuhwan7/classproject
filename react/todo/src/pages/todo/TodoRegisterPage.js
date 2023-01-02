import React, {useState} from 'react';
import Ex1 from "../../components/ex/Ex1";
import PageLayout from "../../layout/PageLayout";
import {Dialog, DialogTitle, Grid, Paper} from "@mui/material";
import TodoRegisterComponent from "../../components/todo/TodoRegisterComponent";
import {useNavigate} from "react-router-dom";
import Typography from "@mui/material/Typography";


function TodoListPage(props) {

    const [msg, setMsg] = useState(null);
    const navigate = useNavigate();

    const setResult = (result) => {
        setMsg(result)
    }
    const closeAndMove = () => {
        setMsg((null))

        navigate("/todo/list")
    }


    return (
        <PageLayout title={'Todo List Page'}>
            <Grid item xs={12} md={12} lg={12}>
                <Paper sx={{p: 2, display: 'flex', flexDirection: 'column'}}>
                    <h1>Todo List Page</h1>
                    <Ex1/>
                    <TodoRegisterComponent setResult={setResult}></TodoRegisterComponent>
                </Paper>
            </Grid>
            <Dialog open={msg !== null}
                    onClose={closeAndMove} aria-labelledby="alert-dialog-title"
                    aria-describedby="alert-dialog-description"
                    id="alert-dialog-title">
                <DialogTitle>등록 결과</DialogTitle>
                {msg ? <Typography variant={'h4'}>{msg.id} 할일 등록 성공</Typography> : <></>}


            </Dialog>
        </PageLayout>
    );
}

export default TodoListPage;