import React from 'react';
import Ex1 from "../components/ex/Ex1";
import PageLayout from "../layout/PageLayout";
import {Grid, Paper} from "@mui/material";

function MainPage(props) {
    return (
        <PageLayout title={'Main Page'}>
            <Grid item xs={12} md={12} lg={12}>
                <Paper sx={{p: 2, display: 'flex', flexDirection: 'column'}}>
                    <h1>Main Page</h1>
                    <Ex1/>
                </Paper>
            </Grid>
        </PageLayout>
    );
}

export default MainPage;