import { useEffect, useState } from 'react';
import { fetchProducts } from '../api';
import Footer from '../Footer';
import OrderLocation from './OrderLocation';
import ProductsList from './PoductsList';
import StepsHeader from './StepsHeader';
import './styles.css';
import { OrderLocationdata, Product } from './types';
function Orders(){

    const [products, setProducts] = useState<Product[]>([])
    const [orderLocation,setOrderLocation] = useState<OrderLocationdata>();
   
    useEffect(() =>{
        fetchProducts()
        .then(response => setProducts(response.data))
        .catch(error => console.log(error))
    },[])

    return(
        <div className="orders-container">
            <StepsHeader/>
            <ProductsList products={products}/>
            <OrderLocation onChangeLocation={location=> setOrderLocation(location)}/>
            <Footer/>
        </div>
    )
}

export default Orders;