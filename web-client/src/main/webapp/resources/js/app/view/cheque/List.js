/**
 * Created by istrakhouski on 2/11/14.
 */
Ext.define('Farm.view.cheque.List' ,{
    extend: 'Ext.grid.Panel',
    alias: 'widget.chequelist',

    title: 'All cheques',

    store: 'Cheques',

    initComponent: function() {
        this.columns = [
            {header: 'Id',  dataIndex: 'chequeId',  flex: 1},
            {header: 'Create date', dataIndex: 'createDate', flex: 1},
            {header: 'Close date',  dataIndex: 'closeDate',  flex: 1},
            {header: 'Summ', dataIndex: 'summ', flex: 1},
            {header: 'Cashier', dataIndex: 'cashier.firstName', flex: 1}
        ];

        this.callParent(arguments);
    }
});