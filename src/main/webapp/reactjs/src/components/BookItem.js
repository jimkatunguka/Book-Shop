import React, { Component } from 'react';


class BookItem extends Component {



    render() {
        const{isbn, title, author,price} = this.props.book
        return (
            <div >
                <p>

                    {title}

                </p>
            </div>
        )
    }
}

export default BookItem;
