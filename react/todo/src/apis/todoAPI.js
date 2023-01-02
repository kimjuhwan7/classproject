import axios from "axios";

// todo 등록
export const postTodo = async (todo) => {
    // todo => {title : '', writer : '', complete : false}
    const res = await axios.post('http://localhost/todos', todo)
    return res.data;
}


// Todo List
export const getTodoList = async (id) => {
    const res = await axios.get(`http://localhost:80/todos`)
    return res.data
}

export const getTodo = async (id) => {
    const res = await axios.get(`http://localhost:80/todos/${id}`)
    return res.data
}

export const deleteTodo = async (id) => {
    const res = await axios.delete(`http://localhost:80/todos/${id}`)
    return res.data
}
export const putTodo = async (todo)=>{
    const res = await axios.put(`http://localhost:80/todos/${todo.id}`)
}