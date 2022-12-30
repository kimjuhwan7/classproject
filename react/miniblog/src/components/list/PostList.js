import React from 'react';
import styled from "styled-components";
import PostListItem from "./PostListItem";

const Wrapper = styled.div`
    margin-top: 10px;
    display: flex;
    flex-direction: column;
    align-items: flext-start;
    justify-content: center;
    
    & > * {
        :not(:last-child) {
            margin-bottom: 16px;
        }
    }
`;

function PostList({ posts, onClickItem}) {
    return (
        <Wrapper>
            {posts.map(post => {
                return (
                    <PostListItem key={post.id} post={post} onClick={() => onClickItem(post)}/>
                )
            })}
        </Wrapper>
    );
}

export default PostList;