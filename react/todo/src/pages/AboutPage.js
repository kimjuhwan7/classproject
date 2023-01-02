import React from 'react';
import Ex1 from "../components/ex/Ex1";
import PageLayout from "../layout/PageLayout";
import {Grid, Paper} from "@mui/material";

function AboutPage(props) {
    return (
        <PageLayout title={'About Page'}>
            <Grid item xs={12} md={12} lg={12}>
                <Paper sx={{p: 2, display: 'flex', flexDirection: 'column'}}>
                    <h1>About Page</h1>
                    <Ex1/>
                </Paper>
            </Grid>
        </PageLayout>
    );
}

export default AboutPage;