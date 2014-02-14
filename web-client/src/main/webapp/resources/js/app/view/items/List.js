/**
 * Created by istrakhouski on 2/14/14.
 */

/**
 * Created by istrakhouski on 2/11/14.
 */
Ext.define('Farm.view.items.List' ,{
    extend: 'Ext.grid.Panel',
    alias: 'widget.itemslist',

    title: 'All items',

    store: 'Items',

    initComponent: function() {
        this.columns = [
            {header: 'Name',  dataIndex: 'name',  flex: 1},
            {header: 'Description', dataIndex: 'description', flex: 1}
        ];

        this.dockedItems = [{
            xtype: 'toolbar',
            width   : 400,
            items: [
                {
                    text: 'Insert'
                },
                {
                    xtype: 'button',
                    text : 'Change'
                },
                '->',
                {
                    xtype    : 'textfield',
                    name     : 'field1',
                    emptyText: 'enter search term'
                }
            ]
        },{
            xtype: 'pagingtoolbar',
            store: this.store,   // same store GridPanel is using
            dock: 'bottom',
            displayInfo: true
        }];

        this.callParent(arguments);
    }
});