<template>
  <div class="frame-page h-panel">
    <div class="h-panel-bar">
      <span class="h-panel-title">书籍列表{{ msg }}{{ name }}</span>
    </div>
    <div class="h-panel-body">
      <Table :loading="loading" :datas="datas">
        <TableItem title="序号">
          <template slot-scope="{ index }">{{ index + 1 }} </template>
        </TableItem>
        <TableItem :width="200" prop="id" title="书籍ID"></TableItem>
        <TableItem :width="200" prop="name" title="书籍名"></TableItem>
        <TableItem :width="200" prop="creator" title="创建者"></TableItem>
        <TableItem :width="200" prop="createTime" title="创建时间"></TableItem>
      </Table>
    </div>
    <div>
      <button @click="search()">123</button>
    </div>
  </div>
</template>

<script>
import myMixin from 'js/common/basicCrud';

export default {
  mixins: [myMixin],
  data() {
    return {
      msg: '123'
    };
  },
  mounted() {
    console.log(this.$data);
  }
};
</script>