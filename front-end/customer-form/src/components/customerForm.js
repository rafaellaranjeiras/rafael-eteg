import React from "react";
import { useForm } from "react-hook-form";
import axios from "axios";
import "./CustomerForm.css";

const CustomerForm = () => {
  const { register, handleSubmit, reset } = useForm();

  const onSubmit = async (data) => {
    console.log("Payload enviado:", data);
    try {
      await axios.post("http://localhost:8080/customer", data);
      alert("Cliente cadastrado com sucesso!");
      reset();
    } catch (error) {
      alert("Erro ao cadastrar cliente");
      console.error(error);
    }
  };

  return (
    <div className="form-container">
      <h2>Cadastrar Cliente</h2>
      <form onSubmit={handleSubmit(onSubmit)} className="customer-form">
        <label>Nome</label>
        <input {...register("name")} placeholder="Nome" required />
        
        <label>Email</label>
        <input {...register("email")} type="email" placeholder="Email" required />
        
        <label>CPF/CNPJ</label>
        <input {...register("fiscalId")} placeholder="CPF/CNPJ" required />
        
        <label>Cor Favorita</label>
        <input {...register("colorCode")} type="color" required />
        
        <label>Notas</label>
        <textarea {...register("notes")} placeholder="Notas" />
        
        <button type="submit" className="submit-button">Cadastrar</button>
      </form>
    </div>
  );
};

export default CustomerForm;