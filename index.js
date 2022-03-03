const form = document.getElementsByTagName("form")[0];
/**
 * @type {HTMLInputElement}
 */
 const inputCodigo = document.getElementById("codigo");
/**
 * @type {HTMLInputElement}
 */
const inputNombre = document.getElementById("nombre");
/**
 * @type {HTMLInputElement}
 */
const inputCantidad = document.getElementById("cantidad");
/**
 * @type {HTMLInputElement}
 */
const inputPrecio = document.getElementById("precio");
/**
 * @type {HTMLInputElement}
 */
const inputCategoria = document.getElementById("categoria");
const tbody = document.getElementsByTagName("tbody")[0];
const cantidadTotalElement = document.getElementById("cantidad-total");
const precioTotalElement = document.getElementById("precio-total");
const granTotalElement = document.getElementById("gran-total");

let indice = 0;
let cantidadTotal = 0;
let precioTotal = 0;
let granTotal = 0;
let currentRow;

form.addEventListener("submit", onSubmit);

/**
 * 
 * @param {Event} event 
 */
function onSubmit(event)
{
    event.preventDefault();

    const data = new FormData(form);
    const values = Array.from(data.entries()); // No funciono ni asi ni solo con data como parametro

    const [frmCodigo, frmNombre, frmCantidad, frmPrecio, frmCategoria] = values;
    
    let codigo = frmCodigo[1];
    const nombre = frmNombre[1];
    const cantidad = frmCantidad[1];
    const precio = frmPrecio[1];
    const categoria = frmCategoria[1];
    const total = cantidad * precio;
    cantidadTotal += parseInt(cantidad);
    precioTotal += parseFloat(precio);
    granTotal += parseFloat(total);

    let tr;

    if(!codigo){
        indice++;
        codigo = indice;
        tr = document.createElement("tr");
        tbody.appendChild(tr);
    }
    else{
        tr = currentRow;
    }

    tbody.appendChild(tr);
    tr.dataset.categoria = categoria;
    
    tr.innerHTML = `
        <td>${codigo}</td>
        <td>${nombre}</td>
        <td>${cantidad}</td>
        <td>${precio}</td>
        <td>${total}</td>
        <td>
            <div class="btn-group">
                <a title="Editar" href="#" onclick = "onEdit(event)" class="btn btn-sm btn-outline-secondary">
                    <i class="bi bi-pencil-square"></i>
                </a> 
                <a title="Eliminar" href="#" onclick = "onDelete(event)" class="btn btn-sm btn-outline-danger>
                    <i class="bi bi-trash"></i>
                </a>
            </div>
        </td>
    `;

    cantidadTotalElement.innerText = cantidadTotal;
    precioTotalElement.innerText = precioTotal;
    granTotalElement.innerText = granTotal;


    form.reset();

    console.log(cantidadTotal);
    console.log(precioTotal);
    console.log(granTotal);
}
/**
 * 
 * @param {Event} event 
 */
function onEdit (event){
    event.preventDefault();
    /**
     * @type {HTMLAnchorElement}
     */
    const anchor = event.currentTarget;
    const tr = anchor.parentElement.parentElement.parentElement;
    const celdas = tr.getElementsByTagName("td");
    const [tdCodigo, tdNombre, tdCantidad, tdPrecio] = celdas;

    inputCodigo.value = tdCodigo.innerText;
    inputNombre.value = tdNombre.innerText;
    inputCantidad.value = tdCantidad.innerText;
    inputPrecio.value = tdPrecio.innerText;
    inputCategoria.value = tr.dataset.categoria;

    currentRow = tr;
}

/**
 * 
 * @param {Event} event 
 */
function onDelete (event)
{
    event.preventDefault();
      /**
     * @type {HTMLAnchorElement}
     */
       const anchor = event.currentTarget;
       const tr = anchor.parentElement.parentElement.parentElement;
       tbody.removeChild(tr);
       
}