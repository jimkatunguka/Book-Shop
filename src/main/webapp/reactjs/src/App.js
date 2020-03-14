import React, { Component } from 'react';

import Books from './components/Books';

//import uuid from 'uuid';
import axios from 'axios';

import './App.css';

class App extends Component{
  state = {
    books: []
  }

  componentDidMount(){
     let headers = {
         'Content-Type':'application/json'
     }
    axios.get('http://localhost:8080/books',{headers:headers})
        .then(res => this.setState({books:res.data}));
  }


  render() {
    //console.log(this.state.todos);

    return (

          <div className = "container">
            <div className="App">
                    <Books books={this.state.books} />
            </div>
          </div>
    );
  }
}
export default App;
