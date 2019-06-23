(window.webpackJsonp=window.webpackJsonp||[]).push([[0],{15:function(e,t,a){e.exports=a.p+"static/media/no_picture.6428f3d9.png"},23:function(e,t,a){e.exports=a.p+"static/media/no_img.30e52bcb.svg"},26:function(e,t,a){e.exports=a(60)},32:function(e,t,a){},55:function(e,t,a){},60:function(e,t,a){"use strict";a.r(t);var n=a(0),l=a.n(n),o=a(22),r=a.n(o),c=(a(32),a(3)),s=a(4),i=a(6),m=a(5),u=a(7),p=(a(34),a(63)),d=a(65),h=a(61),f=a(2),g=a.n(f),E=function(e){return l.a.createElement("tr",null,l.a.createElement("th",{scope:"row"},e.index),l.a.createElement("td",null,e.title),l.a.createElement("td",null,e.category),l.a.createElement("td",null,e.size),l.a.createElement("td",null,l.a.createElement("img",{height:"150px",width:"200px",src:e.logo,alt:e.title})),l.a.createElement("td",{className:"d-flex justify-content-between"},e.children))},b=function(e){return l.a.createElement("button",{type:"button",onClick:e.action,className:"btn "+e.type},e.title)},v=a(11),N=function(e){function t(e){var a;return Object(c.a)(this,t),(a=Object(i.a)(this,Object(m.a)(t).call(this,e))).handleChange=function(e){a.setState(Object(v.a)({},e.target.name,e.target.value))},a.handleSubmit=function(e){e.preventDefault(),g.a.post("http://localhost:8081/kodas-java/api/studios",a.state).then(function(e){console.log(a.props.history),a.props.history.go("/")}).catch(function(e){return console.log(e)})},a.state={title:"",logo:"",category:"",size:0},a}return Object(u.a)(t,e),Object(s.a)(t,[{key:"render",value:function(){var e=this;return l.a.createElement("div",{className:"panel panel-default my-3"},l.a.createElement("div",{className:"panel-heading"},"Create new Record Studio"),l.a.createElement("div",{className:"panel-body"},l.a.createElement("form",{className:"form-inline",onSubmit:function(t){return e.handleSubmit(t)}},l.a.createElement("div",{className:"form-group mb-2"},l.a.createElement("input",{type:"text",placeholder:"Title",className:"form-control",name:"title",onChange:this.handleChange,required:!0})),l.a.createElement("div",{className:"form-group mb-2"},l.a.createElement("input",{type:"text",placeholder:"Logo",className:"form-control",name:"logo",onChange:this.handleChange,required:!0})),l.a.createElement("div",{className:"form-group mb-2"},l.a.createElement("select",{required:!0,id:"inlineFormCustomSelect",placeholder:"Category",className:"form-control",name:"category",onChange:this.handleChange},l.a.createElement("option",{defaultValue:!0,disabled:!0},"Category..."),l.a.createElement("option",{value:"National"},"National"),l.a.createElement("option",{value:"Home"},"Home"),l.a.createElement("option",{value:"Live"},"Live"))),l.a.createElement("div",{className:"form-group mb-2"},l.a.createElement("input",{type:"number",step:"0.01",placeholder:"Size",className:"form-control",name:"size",onChange:this.handleChange,required:!0})),l.a.createElement("div",{className:"form-group mb-2"},l.a.createElement("button",{className:"btn btn-success",type:"submit"},"Save")))))}}]),t}(n.Component),y=a(23),C=a.n(y),k=function(e){function t(e){var a;return Object(c.a)(this,t),(a=Object(i.a)(this,Object(m.a)(t).call(this,e))).getAllData=function(){g.a.get("http://localhost:8081/kodas-java/api/studios").then(function(e){console.log(e.data),a.setState({studios:e.data})}).catch(function(e){console.log(e)})},a.onDeleteClickHandler=function(e){g.a.delete("http://localhost:8081/kodas-java/api/studios/"+e).then(function(e){console.log(e),a.getAllData()}).catch(function(e){console.log(e)})},a.onDetailsClickHandler=function(e){a.props.history.push("/studios/"+e)},a.showAllData=function(){return a.state.studios.map(function(e,t){var n;switch(n="null"===e.logo||null===e.log?C.a:e.logo,e.category){case 0:"National";break;case 1:"Home";break;case 2:"Live"}return l.a.createElement(E,Object.assign({key:e.title,index:t+1,title:e.title,category:e.category,size:e.size,logo:n},a.props),l.a.createElement(b,{title:"Details",action:function(){return a.onDetailsClickHandler(e.title)},type:"btn-success"}),l.a.createElement(b,{title:"Delete",action:function(){return a.onDeleteClickHandler(e.title)},type:"btn-warning"}))})},a.state={studios:[]},a}return Object(u.a)(t,e),Object(s.a)(t,[{key:"componentDidMount",value:function(){this.getAllData()}},{key:"render",value:function(){return l.a.createElement("div",{className:"container"},l.a.createElement("div",{className:"row"},l.a.createElement(N,this.props)),l.a.createElement("div",{className:"row"},l.a.createElement("table",{className:"table table-striped table-dark"},l.a.createElement("thead",null,l.a.createElement("tr",null,l.a.createElement("th",{scope:"col"},"#"),l.a.createElement("th",{scope:"col"},"Title"),l.a.createElement("th",{scope:"col"},"Category"),l.a.createElement("th",{scope:"col"},"Size"),l.a.createElement("th",{scope:"col"},"Picture"),l.a.createElement("th",{scope:"col"},"Actions"))),l.a.createElement("tbody",null,this.showAllData()))))}}]),t}(n.Component),j=a(64),w=(a(55),function(){return l.a.createElement("div",{className:"navigation"},l.a.createElement("ul",{className:"navigation_ul"},l.a.createElement("li",null,l.a.createElement(j.a,{to:"/"},l.a.createElement("div",null,"Car Brands"))),l.a.createElement("li",null,l.a.createElement(j.a,{to:"/performers"},l.a.createElement("div",null,"Car Dealers")))))}),O=function(e){return l.a.createElement("tr",null,l.a.createElement("th",{scope:"row"},e.index),l.a.createElement("td",null,e.title),l.a.createElement("td",null,e.firstName),l.a.createElement("td",null,e.lastName),l.a.createElement("td",null,e.genre),l.a.createElement("td",null,e.country),l.a.createElement("td",null,e.dob),l.a.createElement("td",null,l.a.createElement("img",{height:"150px",width:"200px",src:e.picture,alt:e.title})),l.a.createElement("td",{className:"d-flex justify-content-between"},e.children))},D=function(e){return l.a.createElement("div",null,l.a.createElement("div",{className:"card text-white bg-dark mb-3",style:{width:"18rem"}},l.a.createElement("img",{className:"card-img-top",src:e.logo,alt:e.title}),l.a.createElement("div",{className:"card-body"},l.a.createElement("h5",{className:"card-title"},e.title),l.a.createElement("p",{className:"card-text"},e.category),l.a.createElement("p",{className:"card-text"},e.size),l.a.createElement("div",{className:"d-flex justify-content-between"},e.children))))},x=a(15),S=a.n(x),A=function(e){function t(e){var a;return Object(c.a)(this,t),(a=Object(i.a)(this,Object(m.a)(t).call(this,e))).getAllPerformers=function(){g.a.get("http://localhost:8081/kodas-java/api/studios/"+a.props.match.params.title+"/all-performers").then(function(e){console.log(e.data),a.setState({performers:e.data})}).catch(function(e){console.log(e)})},a.onClickGoBackHandler=function(){a.props.history.goBack()},a.onClickUpdateHandler=function(){a.props.history.push("/studios/update/"+a.props.match.params.title)},a.onDeleteClickHandler=function(e){g.a.delete("http://localhost:8081/kodas-java/api/studios/"+a.state.service.title+"/"+e).then(function(e){console.log(e),a.getAllPerformers()}).catch(function(e){console.log(e)})},a.showAllData=function(){return a.state.performers.map(function(e,t){var n;return n="null"===e.picture||null===e.picture?S.a:e.picture,l.a.createElement(O,Object.assign({key:e.title,index:t+1,title:e.title,firstName:e.firstName,lastName:e.lastName,genre:e.genre,country:e.country,dob:e.dob,picture:n},a.props),l.a.createElement(b,{title:"Delete",action:function(){return a.onDeleteClickHandler(e.title)},type:"btn-warning"}))})},a.state={studio:"",performers:[]},a}return Object(u.a)(t,e),Object(s.a)(t,[{key:"componentDidMount",value:function(){var e=this;g.a.get("http://localhost:8081/kodas-java/api/studios/"+this.props.match.params.title).then(function(t){console.log(t.data),e.setState({studio:t.data})}).catch(function(e){console.log(e)}),this.getAllPerformers()}},{key:"render",value:function(){var e,t;switch(e="null"===this.state.studio.logo||null===this.state.studio.logo?S.a:this.state.studio.logo,this.state.studio.category){case 0:t="National";break;case 1:t="Home";break;case 2:t="Live"}return l.a.createElement("div",{className:"container my-3"},l.a.createElement("div",{className:"row d-flex justify-content-center"},l.a.createElement(D,{title:this.state.studio.title,category:t,size:this.state.studio.size,logo:e},l.a.createElement(b,{title:"Go Back",type:"btn-warning",action:this.onClickGoBackHandler}),l.a.createElement(b,{title:"Update",type:"btn-warning",action:this.onClickUpdateHandler}))),l.a.createElement("div",null,l.a.createElement("table",{className:"table table-striped table-dark"},l.a.createElement("thead",null,l.a.createElement("tr",null,l.a.createElement("th",{scope:"col"},"#"),l.a.createElement("th",{scope:"col"},"Title"),l.a.createElement("th",{scope:"col"},"First name"),l.a.createElement("th",{scope:"col"},"Last name"),l.a.createElement("th",{scope:"col"},"Genre"),l.a.createElement("th",{scope:"col"},"Country"),l.a.createElement("th",{scope:"col"},"DOB"),l.a.createElement("th",{scope:"col"},"Picture"),l.a.createElement("th",{scope:"col"},"Actions"))),l.a.createElement("tbody",null,this.showAllData()))))}}]),t}(n.Component),H=function(e){function t(e){var a;return Object(c.a)(this,t),(a=Object(i.a)(this,Object(m.a)(t).call(this,e))).handleChange=function(e){a.setState(Object(v.a)({},e.target.name,e.target.value))},a.handleSubmit=function(e){e.preventDefault(),console.log(a.state),g.a.post("http://localhost:8081/kodas-java/api/performers",a.state).then(function(e){console.log(a.props.history),a.props.history.go("/performers")}).catch(function(e){return console.log(e)})},a.state={title:"",firstName:"",lastName:"",genre:"",country:"",dob:new Date,picture:""},a}return Object(u.a)(t,e),Object(s.a)(t,[{key:"render",value:function(){var e=this;return l.a.createElement("div",{className:"panel panel-default my-3"},l.a.createElement("div",{className:"panel-heading"},"Create new performer"),l.a.createElement("div",{className:"panel-body"},l.a.createElement("form",{className:"form-inline",onSubmit:function(t){return e.handleSubmit(t)}},l.a.createElement("div",{className:"form-group mb-2"},l.a.createElement("input",{type:"text",placeholder:"Title",className:"form-control",name:"title",onChange:this.handleChange,required:!0})),l.a.createElement("div",{className:"form-group mb-2"},l.a.createElement("input",{type:"text",placeholder:"First Name",className:"form-control",name:"firstName",onChange:this.handleChange,required:!0})),l.a.createElement("div",{className:"form-group mb-2"},l.a.createElement("input",{type:"text",placeholder:"Last Name",className:"form-control",name:"lastName",onChange:this.handleChange,required:!0})),l.a.createElement("div",{className:"form-group mb-2"},l.a.createElement("input",{type:"text",placeholder:"Genre",className:"form-control",name:"genre",onChange:this.handleChange,required:!0})),l.a.createElement("div",{className:"form-group mb-2"},l.a.createElement("input",{type:"text",placeholder:"Country",className:"form-control",name:"country",onChange:this.handleChange,required:!0})),l.a.createElement("div",{className:"form-group mb-2"},l.a.createElement("input",{type:"text",placeholder:"Picture",className:"form-control",name:"picture",onChange:this.handleChange})),l.a.createElement("div",{className:"form-group mb-2"},l.a.createElement("input",{type:"date",placeholder:"DOB",className:"form-control",name:"dob",onChange:this.handleChange})),l.a.createElement("div",{className:"form-group mb-2"},l.a.createElement("button",{className:"btn btn-success",type:"submit"},"Save")))))}}]),t}(n.Component),B=function(e){function t(e){var a;return Object(c.a)(this,t),(a=Object(i.a)(this,Object(m.a)(t).call(this,e))).getAllData=function(){g.a.get("http://localhost:8081/kodas-java/api/performers").then(function(e){a.setState({performers:e.data})}).catch(function(e){console.log(e)})},a.onDeleteClickHandler=function(e){console.log(e),g.a.delete("http://localhost:8081/kodas-java/api/performers/"+e).then(function(t){console.log("Deleting: "+e),a.getAllData()}).catch(function(e){console.log(e)})},a.showAllData=function(){return a.state.performers.map(function(e,t){return l.a.createElement(O,Object.assign({key:e.title,index:t+1,title:e.title,firstName:e.firstName,lastName:e.lastName,genre:e.genre,country:e.country,dob:e.dob,picture:e.picture},a.props),l.a.createElement(b,{title:"Delete",action:function(){return a.onDeleteClickHandler(e.title)},type:"btn-warning"}))})},a.componentDidMount=function(){a.getAllData()},a.state={performers:[]},a}return Object(u.a)(t,e),Object(s.a)(t,[{key:"render",value:function(){return l.a.createElement("div",{className:"container"},l.a.createElement("div",{className:"row my-3"},l.a.createElement(H,this.props)),l.a.createElement("div",{className:"row"},l.a.createElement("table",{className:"table table-striped table-dark"},l.a.createElement("thead",null,l.a.createElement("tr",null,l.a.createElement("th",{scope:"col"},"#"),l.a.createElement("th",{scope:"col"},"Title"),l.a.createElement("th",{scope:"col"},"First name"),l.a.createElement("th",{scope:"col"},"Last name"),l.a.createElement("th",{scope:"col"},"Genre"),l.a.createElement("th",{scope:"col"},"Country"),l.a.createElement("th",{scope:"col"},"DOB"),l.a.createElement("th",{scope:"col"},"Picture"),l.a.createElement("th",{scope:"col"},"Actions"))),l.a.createElement("tbody",null,this.showAllData()))))}}]),t}(n.Component),z=function(e){function t(e){var a;return Object(c.a)(this,t),(a=Object(i.a)(this,Object(m.a)(t).call(this,e))).componentDidMount=function(){g.a.get("http://localhost:8081/kodas-java/api/studios/"+a.props.match.params.title).then(function(e){console.log(e.data),a.setState(e.data)}).catch(function(e){return console.log(e)}),g.a.get("http://localhost:8081/kodas-java/api/performers").then(function(e){return a.setState({performers:e.data})}).catch()},a.handleChange=function(e){a.setState(Object(v.a)({},e.target.name,e.target.value))},a.handleSubmit=function(e){e.preventDefault(),g.a.put("http://localhost:8081/kodas-java/api/studios/"+a.props.match.params.title,a.state).then(function(e){a.props.history.goBack()}).catch(function(e){return console.log(e)})},a.goBack=function(){a.props.history.goBack()},a.availablePerformance=function(){return a.state.performers.map(function(e){return l.a.createElement("option",{key:e.title,value:e.title},e.title)})},a.onClickAddPerformer=function(){g.a.put("http://localhost:8081/kodas-java/api/studios/"+a.props.match.params.title+"/"+a.state.performer).then(function(e){return console.log(e)}).catch(function(e){return console.log(e)})},a.state={title:"",logo:"",category:"Home",size:0,performers:[],performer:""},a}return Object(u.a)(t,e),Object(s.a)(t,[{key:"render",value:function(){var e=this;return l.a.createElement("div",{className:"panel panel-default my-3"},l.a.createElement("div",{className:"panel-heading"},"Update Service"),l.a.createElement("div",{className:"panel-body"},l.a.createElement("form",{className:"form-inline",onSubmit:function(t){return e.handleSubmit(t)}},l.a.createElement("div",{className:"form-group mb-2"},l.a.createElement("input",{disabled:!0,type:"text",placeholder:"Title",className:"form-control",name:"title",value:this.state.title,onChange:this.handleChange,required:!0})),l.a.createElement("div",{className:"form-group mb-2"},l.a.createElement("input",{type:"text",placeholder:"Logo",className:"form-control",name:"logo",value:this.state.logo,onChange:this.handleChange,required:!0})),l.a.createElement("div",{className:"form-group mb-2"},l.a.createElement("select",{required:!0,id:"inlineFormCustomSelect",placeholder:"Category",className:"form-control",name:"category",value:this.state.category,onChange:this.handleChange},l.a.createElement("option",{defaultValue:!0,disabled:!0},"Category..."),l.a.createElement("option",{value:"National"},"National"),l.a.createElement("option",{value:"Home"},"Home"),l.a.createElement("option",{value:"Live"},"Live"))),l.a.createElement("div",{className:"form-group mb-2"},l.a.createElement("input",{type:"number",step:"0.01",placeholder:"Size",className:"form-control",name:"size",value:this.state.size,onChange:this.handleChange,required:!0})),l.a.createElement("div",{className:"form-group mb-2"},l.a.createElement("button",{className:"btn btn-success",type:"submit"},"Save"),l.a.createElement("button",{className:"btn btn-warning mx-3",type:"button",onClick:function(){return e.goBack()}},"Back")))),l.a.createElement("div",null,"Add Performer"),l.a.createElement("div",{className:"form-group mb-8"},l.a.createElement("select",{id:"inlineFormCustomSelect",className:"form-control",name:"performer",value:this.state.performers,onChange:this.handleChange},l.a.createElement("option",{defaultValue:!0,hidden:!0},"Choose here"),this.availablePerformance()),l.a.createElement("button",{className:"btn btn-warning",onClick:function(){return e.onClickAddPerformer()}},"Add")))}}]),t}(n.Component),q=function(){return l.a.createElement("div",null,l.a.createElement(p.a,null,l.a.createElement("div",null,l.a.createElement(w,null),l.a.createElement(d.a,null,l.a.createElement(h.a,{path:"/",exact:!0,component:k}),l.a.createElement(h.a,{path:"/studios/:title",component:A,exact:!0}),l.a.createElement(h.a,{path:"/performers",component:B,exact:!0}),l.a.createElement(h.a,{path:"/studios/update/:title",component:z,exact:!0})))))},P=function(e){function t(){return Object(c.a)(this,t),Object(i.a)(this,Object(m.a)(t).apply(this,arguments))}return Object(u.a)(t,e),Object(s.a)(t,[{key:"render",value:function(){return l.a.createElement("div",null,l.a.createElement(q,null))}}]),t}(n.Component);Boolean("localhost"===window.location.hostname||"[::1]"===window.location.hostname||window.location.hostname.match(/^127(?:\.(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)){3}$/));r.a.render(l.a.createElement(P,null),document.getElementById("root")),"serviceWorker"in navigator&&navigator.serviceWorker.ready.then(function(e){e.unregister()})}},[[26,2,1]]]);
//# sourceMappingURL=main.1ae0cab8.chunk.js.map