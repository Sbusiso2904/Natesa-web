import React from "react";
import { BrowserRouter as Router, Routes, Route, Link } from "react-router-dom";
import AuthForm from "./pages/AuthForm";
import './index.css';


function App(){
    return (
        <Router>
            <div className="min-h-screen bg-gray-300 p-6">

                {/* fixed Header + nav bar*/}
                <nav className="fixed to-0 left-0 w-full bg-gray-100 shadow-md z-50">
                    <div className="flex items-center justify-between max-w-7xl mx-auto px-6 py-4">

                        {/*Logo or Header */}
                        <h1 className="text-2xl front-bold text-gray-800">
                            Natesa Web
                        </h1>

                        {/* Navigation Links */}
                        <div className="flex space-x-6 text-lg text-blue-600">
                            <Link to="/" className="hover:by-blue-100 px-2 rounded transition duration-200">Home</Link>
                            <Link to="/authform" className="hover:bg-blue-100 py-3 py-2 rounded transition duration-200">Members Login</Link>
                            <Link to="/authform" className="hover:bg-blue-100 py-3 py-2 rounded transition duration-200">BEC Login</Link>
                            <Link to="/authform" className="hover:bg-blue-100 py-3 py-2 rounded transition duration-200">NEC Login</Link>
                        </div>
                    </div>
                </nav>

                {/* Add spacing below the fixed nav */}
                <div className="pt-24">
                {/* Your page content here */}
                </div>


                {/* Route Pages */}
                <Route path="/authform" element={<AuthForm />} />

                {/* 404 Page */}
                <Route path="*" element={<h1 className="text-center text-red-600 text-2xl">404 - Page Not Found</h1>} />

            </div>
        </Router>
    );
}

export default App;