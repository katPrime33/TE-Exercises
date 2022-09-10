// add pageTitle
pageTitle = 'My Shopping List';
// add groceries
const groceries = ['Bread', 'Milk', 'Cheese', 'Ground Beef', 'Coffee', 'Chicken', 'Cat Food', 'Water', 'Cereal', 'Pasta'];
/**
 * This function will get a reference to the title and set its text to the value
 * of the pageTitle variable that was set above.
 */
function setPageTitle() {
  const pageTitle = document.getElementById('title');
  pageTitle.innerText = 'My Shopping List';
}
/**
 * This function will loop over the array of groceries that was set above and add them to the DOM.
 */
function displayGroceries() {
  const list = document.getElementById('groceries')
  groceries.forEach((aGrocery) => {
    const newLi = document.createElement('li')
    newLi.innerText = aGrocery
    list.appendChild(newLi)
  });
}

/**
 * This function will be called when the button is clicked. You will need to get a reference
 * to every list item and add the class completed to each one
 */
function markCompleted() {
  const list = document.getElementById('groceries')
  const items = Array.from(list.children)

  items.forEach((item) => {
    item.setAttribute('class', 'completed')
  });
}

setPageTitle();

displayGroceries();


// Don't worry too much about what is going on here, we will cover this when we discuss events.
document.addEventListener('DOMContentLoaded', () => {
  // When the DOM Content has loaded attach a click listener to the button
  const button = document.querySelector('.btn');
  button.addEventListener('click', markCompleted);
});
