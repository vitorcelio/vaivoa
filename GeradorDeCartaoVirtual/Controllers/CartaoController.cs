using System.Collections.Generic;
using System.Threading.Tasks;
using Microsoft.AspNetCore.Mvc;
using GeradorDeCartaoVirtual.PastaAcesso.Models;
using GeradorDeCartaoVirtual.PastaAcesso.Services;

namespace GeradorDeCartaoVirtual.Controllers
{
    [Route("/api/[controller]")]
    public class CartaoController : Controller
    {
       private readonly  ICartaoService _cartaoservice;

       public CartaoController(ICartaoService cartaoservice){
           _cartaoservice = cartaoservice;
       }

       [HttpGet]

       public async Task<IEnumerable<Cartao>> GetAllAsync(){
           var cartao = await _cartaoservice.ListAsync();
           return cartao;
       }
    }
}