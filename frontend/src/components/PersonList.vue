
<template>
    <div>
        <table class="table">
            <thead>
            <tr>
                <th scope="col">ID</th>
                <th scope="col">Title</th>
                <th scope="col">Author</th>
            </tr>
            </thead>
            <tbody>
            <tr v-for="(book, index) in books" :key="index">
                <td>{{book.id}}</td>
                <td>{{book.title}}</td>
                <td>{{book.author}}</td>
            </tr>
            </tbody>
        </table>
    </div>
</template>

<script>
    import axios from 'axios';
    export default {
        data() {
            return {
                books: []
            }
        },
        created() {
            axios.get(`http://localhost:8080/bookLibrary/rest/book/list`)
                .then(response => {
                    this.books = response.data;
                });
        }
    }
</script>
//*[@id="content"]/div[1]/div/div/div
<style scoped>
</style>
