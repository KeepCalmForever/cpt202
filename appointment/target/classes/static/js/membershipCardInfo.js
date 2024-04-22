function showMembershipCardTable() {
    fetch('getMembershipData.php')
        .then(response => response.json())
        .then(data => {
            const table = document.getElementById("membershipCardTable");
            table.innerHTML = "";

            // Create table headers
            const headers = ["Member Name", "Card ID", "Level", "Balance"];
            const headerRow = table.insertRow();
            headers.forEach(headerText => {
                const header = document.createElement("th");
                header.textContent = headerText;
                headerRow.appendChild(header);
            });

            // Populate table with member data
            data.forEach(member => {
                const row = table.insertRow();
                Object.values(member).forEach(value => {
                    const cell = row.insertCell();
                    cell.textContent = value;
                });
            });

            // Display the table
            table.style.display = "block";
        })
        .catch(error => console.error('Error:', error));
}

document.getElementById("showCardButton").addEventListener("click", showMembershipCardTable);