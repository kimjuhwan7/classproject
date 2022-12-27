import logo from './logo.svg';
import './App.css';

import Toggle from './components/Toggle';
import MyButton from './components/MyButton';
import ConfirmButton from './components/ConfirmButton';
import Greeting from './components/Greeting';
import LoginControl from './LoginControl';
import MailBox from './MailBox';
import UserStatus from './UserStatus';
import WarnningBanner from './components/WarnningBanner';
import ToolBar from './ToolBar';
import MainPage from './Mainpage';

function App() {
  return (
    <MainPage />
  )
  /*  return (
     <Notification massage="안녕하세요" />
   ) */
}

/* 
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
 */export default App;
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

