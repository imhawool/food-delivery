<template>

    <v-data-table
        :headers="headers"
        :items="주문정보"
        :items-per-page="5"
        class="elevation-1"
    ></v-data-table>

</template>

<script>
    const axios = require('axios').default;

    export default {
        name: '주문정보View',
        props: {
            value: Object,
            editMode: Boolean,
            isNew: Boolean
        },
        data: () => ({
            headers: [
                { text: "id", value: "id" },
                { text: "status", value: "status" },
            ],
            주문정보 : [],
        }),
          async created() {
            var temp = await axios.get(axios.fixUrl('/주문정보'))

            temp.data._embedded.주문정보.map(obj => obj.id=obj._links.self.href.split("/")[obj._links.self.href.split("/").length - 1])

            this.주문정보 = temp.data._embedded.주문정보;
        },
        methods: {
        }
    }
</script>

