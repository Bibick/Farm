/**
 * Created by istrakhouski on 2/14/14.
 */

Ext.define('Farm.store.Items', {
    extend: 'Ext.data.Store',
    model: 'Farm.model.Item',

    autoLoad: true,

    proxy: {
        type: 'ajax',
        api: {
            create: './item/add',
            read: './item/getAll',
            update: './item/update'
        },
        reader: {
            type: 'json',
            root: 'value',
            successProperty: 'success'
        }
    }
});