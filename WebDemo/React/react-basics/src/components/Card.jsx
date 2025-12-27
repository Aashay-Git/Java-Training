function Card({value}) {
    const user1 = {
        details: { name: 'John', age: 22, id: 1 },
        address: { city: "Nagpur", zipcode: 442201 },
        contact: { email: "tempmail@gmail.com", phone: 123456 }
    }

    const user2 = {
        details: { name: 'Joseph', age: 33, id: 2 },
        address: { city: "Mumbai", zipcode: 445511 },
        contact: { email: "mail@gmail.com", phone: 765432 }
    }

    const users = [user1, user2, user1, user2, user1, user2]

    const RenderCard = () => (
        users.map((user, index) => (
                    <div className='card' key={index}>
                        <h1>
                            Name: {user.details.name}
                        </h1>
                        <h6>
                            {value}
                        </h6>
                        <hr></hr>
                        <h3>
                            Age: {user.details.age} <span className="line">|</span> ID: {user.details.id}
                        </h3>
                        <h3>
                            City: {user.address.city} | Zipcode: {user.address.zipcode}
                        </h3>
                        <h3>
                            email: {user.contact.email} | Phone: {user.contact.phone}
                        </h3>
                    </div>
            )

        )
    )


    return (
        <RenderCard />
    )
}

export default Card