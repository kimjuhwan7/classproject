import logo from './logo.svg';
import './App.css';
import Comment from './components/Comment';


const comment = {
  user: {
    userName: '손흥민',
    imgUrl: 'https://digitalhub.fifa.com/transform/04dbfa51-b592-4ce9-975c-bfee5069cd8b/Son-Heung-min-the-attacking-asset-of-the-Korea-team'
  },
  content: '대한민국 화이팅!!!',
  replydate: '2022-12-25'
}

function App() {
  return (
    <Comment  user={comment.user} content={comment.content} replydate={comment.replydate}/>
  );
}
export default App;
/* 
<div className="App">
      <header className="App-header">
        <img src={logo} className="App-logo" alt="logo" />
        <p>
          Edit <code>src/App.js</code> and save to reload.
        </p>
        <a
          className="App-link"
          href="https://reactjs.org"
          target="_blank"
          rel="noopener noreferrer"
        >
          Learn React123567
        </a>
      </header>
    </div> 
    
    
export default App;

    */

