
// add pageTitle
const pageTitle = 'My Shopping List';

// add groceries
const groceries = [{
  item: 'tootepaste'
},
{
  item: 'pork'
},
{
  item: 'beef'
},
{
  item: 'goetta'
},
{
  item: 'ham'
},
{
  item: 'bacon'
},
{
  item: 'sausage'
},
{
  item: 'hamburgers'
},
{
  item: 'steak'
},
{
  item: 'apples'
},
]

/**
 * This function will get a reference to the title and set its text to the value
 * of the pageTitle variable that was set above.
 */
function setPageTitle() {
   const title = document.getElementById('title');
  title.innerText = pageTitle;
}

/**
 * This function will loop over the array of groceries that was set above and add them to the DOM.
 */
function displayGroceries() {
const storeStuff = document.getElementById('groceries')
groceries.forEach( food => {
const container = document.createElement('groceries')
  container.setAttribute('id','groceries')
  addItem(container,food.item)

  storeStuff.insertAdjacentElement('beforeend', container)

} )



}
function addItem(parent, item){
  const itemList = document.createElement('li')
  const listItem =itemList.innerText = item
  parent.appendChild(itemList)
}
/**
 * This function will be called when the button is clicked. You will need to get a reference
 * to every list item and add the class completed to each one
 */
function markCompleted() {
  const items = document.querySelectorAll('li');
  items.forEach((item) => {
    item.setAttribute('class', 'completed');
  } );
  
  

  
}

setPageTitle();

displayGroceries();

// Don't worry too much about what is going on here, we will cover this when we discuss events.
document.addEventListener('DOMContentLoaded', () => {
  // When the DOM Content has loaded attach a click listener to the button
  const button = document.querySelector('.btn');
  button.addEventListener('click', markCompleted);
});
