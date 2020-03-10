import React, { Component } from 'react';
import BookItem from './BookItem';


class Books extends Component{
    render() {

        return this.props.books.map((book)=>(
            <BookItem key = {book.id} book={book} />
        ));
    }
}

export default Books;